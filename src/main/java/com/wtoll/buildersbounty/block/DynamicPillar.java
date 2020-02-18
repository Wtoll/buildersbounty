package com.wtoll.buildersbounty.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class DynamicPillar extends PillarBlock {
    public static final BooleanProperty TOP;
    public static final BooleanProperty BOTTOM;

    public static Block SLAB_BLOCK;

    public DynamicPillar(Block.Settings settings, Block slab) {
        super(settings);
        SLAB_BLOCK = slab;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(TOP);
        builder.add(BOTTOM);
    }

    public BlockState getPlacementState(ItemPlacementContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        Direction.Axis axis = context.getSide().getAxis();
        BlockState returnState = this.getDefaultState().with(AXIS, axis);

        return calculateState(returnState, axis, world, pos);
    }

    public BlockState getStateForNeighborUpdate(BlockState blockState, Direction direction, BlockState changedState, IWorld world, BlockPos pos, BlockPos changedPos) {
        Direction.Axis axis = blockState.get(AXIS);
        BlockState returnState = blockState;

        return calculateState(returnState, axis, world, pos);
    }

    private BlockState calculateState(BlockState returnState, Direction.Axis axis, IWorld world, BlockPos pos) {
        if (axis.equals(Direction.Axis.Y)) {
            returnState = returnState.with(TOP, (world.getBlockState(pos.up()).getBlock() == this && world.getBlockState(pos.up()).get(AXIS) == axis) || (world.getBlockState(pos.up()).getBlock() == SLAB_BLOCK && (world.getBlockState(pos.up()).get(SlabBlock.TYPE) == SlabType.BOTTOM || world.getBlockState(pos.up()).get(SlabBlock.TYPE) == SlabType.DOUBLE)));
            returnState = returnState.with(BOTTOM, (world.getBlockState(pos.down()).getBlock() == this  && world.getBlockState(pos.down()).get(AXIS) == axis) || (world.getBlockState(pos.down()).getBlock() == SLAB_BLOCK && (world.getBlockState(pos.down()).get(SlabBlock.TYPE) == SlabType.TOP || world.getBlockState(pos.down()).get(SlabBlock.TYPE) == SlabType.DOUBLE)));
        } else if (axis.equals(Direction.Axis.X)) {
            returnState = returnState.with(TOP, world.getBlockState(pos.east()).getBlock() == this && world.getBlockState(pos.east()).get(AXIS) == axis);
            returnState = returnState.with(BOTTOM, world.getBlockState(pos.west()).getBlock() == this && world.getBlockState(pos.west()).get(AXIS) == axis);
        } else if (axis.equals(Direction.Axis.Z)) {
            returnState = returnState.with(TOP, world.getBlockState(pos.south()).getBlock() == this && world.getBlockState(pos.south()).get(AXIS) == axis);
            returnState = returnState.with(BOTTOM, world.getBlockState(pos.north()).getBlock() == this && world.getBlockState(pos.north()).get(AXIS) == axis);
        }

        return returnState;
    }

    static {
        TOP = BooleanProperty.of("top");
        BOTTOM = BooleanProperty.of("bottom");
    }
}
