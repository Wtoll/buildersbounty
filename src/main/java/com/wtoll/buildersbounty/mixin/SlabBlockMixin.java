package com.wtoll.buildersbounty.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.entity.EntityContext;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SlabBlock.class)
public abstract class SlabBlockMixin extends Block {
    private static final EnumProperty<Direction.Axis> AXIS;

    @Shadow
    @Final
    public static EnumProperty<SlabType> TYPE;

    @Shadow
    @Final
    public static BooleanProperty WATERLOGGED;

    public SlabBlockMixin(Settings settings) {
        super(settings);
    }

    @Inject(method = "<init>", at = @At("TAIL"), cancellable = true)
    private void constructor(Settings settings, CallbackInfo callback) {
        this.setDefaultState(this.getDefaultState().with(AXIS, Direction.Axis.Y));
    }

    @Inject(method = "appendProperties", at = @At("TAIL"))
    private void mixin$appendProperties(StateManager.Builder<Block, BlockState> builder, CallbackInfo callback) {
        builder.add(AXIS);
    }

    @Overwrite
    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, EntityContext ePos) {
        SlabType slabType = state.get(TYPE);
        Direction.Axis axis = state.get(AXIS);
        switch (slabType) {
            case DOUBLE:
                return VoxelShapes.fullCube();
            case TOP:
                switch (axis) {
                    case X:
                        return Block.createCuboidShape(8.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
                    case Y:
                        return Block.createCuboidShape(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);
                    case Z:
                        return Block.createCuboidShape(0.0D, 0.0D, 8.0D, 16.0D, 16.0D, 16.0D);
                }
            case BOTTOM:
                switch (axis) {
                    case X:
                        return Block.createCuboidShape(0.0D, 0.0D, 0.0D, 8.0D, 16.0D, 16.0D);
                    case Y:
                        return Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
                    case Z:
                        return Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 8.0D);
                }
        }
        return VoxelShapes.empty();
    }

    @Inject(method = "getPlacementState", at = @At("TAIL"), cancellable = true)
    public void getPlacementState(ItemPlacementContext context, CallbackInfoReturnable<BlockState> callback) {
        if (context.getPlayer().isSneaking()) {
            BlockPos pos = context.getBlockPos();
            BlockState state = context.getWorld().getBlockState(pos);

            if (state.getBlock() == this) {
                callback.setReturnValue(state.with(TYPE, SlabType.DOUBLE).with(WATERLOGGED, false));
            } else {
                FluidState fluidState = context.getWorld().getFluidState(pos);
                Direction direction = context.getSide();
                callback.setReturnValue(this.getDefaultState().with(AXIS, direction.getAxis()).with(TYPE, direction.getDirection() == Direction.AxisDirection.POSITIVE ? SlabType.BOTTOM : SlabType.TOP).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER));
            }
        } else {
            callback.setReturnValue(callback.getReturnValue().with(AXIS, Direction.Axis.Y));
        }
    }

    @Inject(method = "canReplace", at = @At("TAIL"), cancellable = true)
    public void canReplace(BlockState state, ItemPlacementContext context, CallbackInfoReturnable<Boolean> callback) {
        if (context.getPlayer().isSneaking()) {
            ItemStack stack = context.getStack();
            SlabType slabType = state.get(TYPE);
            Direction.Axis axis = state.get(AXIS);
            Direction direction = context.getSide();

            if (slabType != SlabType.DOUBLE && stack.getItem() == this.asItem()) {
                if (context.canReplaceExisting()) {
                    double yhalf = context.getHitPos().y - context.getBlockPos().getY();
                    double xhalf = context.getHitPos().x - context.getBlockPos().getX();
                    double zhalf = context.getHitPos().z - context.getBlockPos().getZ();
                    switch (axis) {
                        case X:
                            switch (slabType) {
                                case BOTTOM:
                                    callback.setReturnValue(direction == Direction.EAST || (xhalf > 0.5 && (direction.getAxis() == Direction.Axis.Y || direction.getAxis() == Direction.Axis.Z)));
                                case TOP:
                                    callback.setReturnValue(direction == Direction.WEST || (xhalf <= 0.5 && (direction.getAxis() == Direction.Axis.Y || direction.getAxis() == Direction.Axis.Z)));
                            }
                        case Y:
                            switch (slabType) {
                                case BOTTOM:
                                    callback.setReturnValue(direction == Direction.UP || (yhalf > 0.5 && (direction.getAxis() == Direction.Axis.X || direction.getAxis() == Direction.Axis.Z)));
                                case TOP:
                                    callback.setReturnValue(direction == Direction.DOWN || (yhalf <= 0.5 && (direction.getAxis() == Direction.Axis.X || direction.getAxis() == Direction.Axis.Z)));
                            }
                        case Z:
                            switch (slabType) {
                                case BOTTOM:
                                    callback.setReturnValue(direction == Direction.SOUTH || (zhalf > 0.5 && (direction.getAxis() == Direction.Axis.X || direction.getAxis() == Direction.Axis.Y)));
                                case TOP:
                                    callback.setReturnValue(direction == Direction.NORTH || (zhalf <= 0.5 && (direction.getAxis() == Direction.Axis.X || direction.getAxis() == Direction.Axis.Y)));
                            }
                    }

                } else {
                    callback.setReturnValue(true);
                }
            }
            callback.setReturnValue(false);
        }
    }

    static {
        AXIS = Properties.AXIS;
    }
}
