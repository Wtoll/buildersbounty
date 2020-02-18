package com.wtoll.buildersbounty.item;

import com.wtoll.buildersbounty.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem ;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    
    public static final Item WHITE_WOOL_SLAB;
    public static final Item ORANGE_WOOL_SLAB;
    public static final Item MAGENTA_WOOL_SLAB;
    public static final Item LIGHT_BLUE_WOOL_SLAB;
    public static final Item YELLOW_WOOL_SLAB;
    public static final Item LIME_WOOL_SLAB;
    public static final Item PINK_WOOL_SLAB;
    public static final Item GRAY_WOOL_SLAB;
    public static final Item LIGHT_GRAY_WOOL_SLAB;
    public static final Item CYAN_WOOL_SLAB;
    public static final Item PURPLE_WOOL_SLAB;
    public static final Item BLUE_WOOL_SLAB;
    public static final Item BROWN_WOOL_SLAB;
    public static final Item GREEN_WOOL_SLAB;
    public static final Item RED_WOOL_SLAB;
    public static final Item BLACK_WOOL_SLAB;

    public static final Item TURF;
    public static final Item NETHER_GOLD_ORE;

    public static final Item COBBLED_ANDESITE;
    public static final Item COBBLED_ANDESITE_WALL;
    public static final Item COBBLED_ANDESITE_SLAB;
    public static final Item COBBLED_ANDESITE_STAIRS;

    public static final Item COBBLED_DIORITE;
    public static final Item COBBLED_DIORITE_WALL;
    public static final Item COBBLED_DIORITE_SLAB;
    public static final Item COBBLED_DIORITE_STAIRS;

    public static final Item COBBLED_GRANITE;
    public static final Item COBBLED_GRANITE_WALL;
    public static final Item COBBLED_GRANITE_SLAB;
    public static final Item COBBLED_GRANITE_STAIRS;

    public static final Item STONE_WALL;

    public static final Item SMOOTH_STONE_WALL;
    public static final Item SMOOTH_STONE_STAIRS;

    public static final Item STONE_PILLAR_SLAB;
    public static final Item STONE_PILLAR;

    public static final Item HERRINGBONE_BRICKS;
    public static final Item HERRINGBONE_BRICK_WALL;
    public static final Item HERRINGBONE_BRICK_SLAB;
    public static final Item HERRINGBONE_BRICK_STAIRS;

    public static final Item MOSSY_HERRINGBONE_BRICKS;
    public static final Item MOSSY_HERRINGBONE_BRICK_WALL;
    public static final Item MOSSY_HERRINGBONE_BRICK_SLAB;
    public static final Item MOSSY_HERRINGBONE_BRICK_STAIRS;

    public static final Item MOSSY_BRICKS;
    public static final Item MOSSY_BRICK_WALL;
    public static final Item MOSSY_BRICK_SLAB;
    public static final Item MOSSY_BRICK_STAIRS;

    public static final Item CRACKED_STONE_BRICK_SLAB;
    public static final Item CRACKED_STONE_BRICK_WALL;
    public static final Item CRACKED_STONE_BRICK_STAIRS;

    public static final Item CHISELED_STONE_BRICK_WALL;
    public static final Item CHISELED_STONE_BRICK_SLAB;
    public static final Item CHISELED_STONE_BRICK_STAIRS;

    public static final Item MOSSY_CRACKED_STONE_BRICKS;
    public static final Item MOSSY_CRACKED_STONE_BRICK_WALL;
    public static final Item MOSSY_CRACKED_STONE_BRICK_SLAB;
    public static final Item MOSSY_CRACKED_STONE_BRICK_STAIRS;

    public static final Item MOSSY_CHISELED_STONE_BRICKS;
    public static final Item MOSSY_CHISELED_STONE_BRICK_WALL;
    public static final Item MOSSY_CHISELED_STONE_BRICK_SLAB;
    public static final Item MOSSY_CHISELED_STONE_BRICK_STAIRS;

    public static final Item CRACKED_CHISELED_STONE_BRICKS;
    public static final Item CRACKED_CHISELED_STONE_BRICK_WALL;
    public static final Item CRACKED_CHISELED_STONE_BRICK_SLAB;
    public static final Item CRACKED_CHISELED_STONE_BRICK_STAIRS;

    public static final Item MOSSY_CRACKED_CHISELED_STONE_BRICKS;
    public static final Item MOSSY_CRACKED_CHISELED_STONE_BRICK_WALL;
    public static final Item MOSSY_CRACKED_CHISELED_STONE_BRICK_SLAB;
    public static final Item MOSSY_CRACKED_CHISELED_STONE_BRICK_STAIRS;

    public static final Item SMALL_STONE_BRICKS;
    public static final Item SMALL_STONE_BRICK_WALL;
    public static final Item SMALL_STONE_BRICK_SLAB;
    public static final Item SMALL_STONE_BRICK_STAIRS;

    public static final Item CRACKED_SMALL_STONE_BRICKS;
    public static final Item CRACKED_SMALL_STONE_BRICK_WALL;
    public static final Item CRACKED_SMALL_STONE_BRICK_SLAB;
    public static final Item CRACKED_SMALL_STONE_BRICK_STAIRS;

    public static final Item MOSSY_SMALL_STONE_BRICKS;
    public static final Item MOSSY_SMALL_STONE_BRICK_WALL;
    public static final Item MOSSY_SMALL_STONE_BRICK_SLAB;
    public static final Item MOSSY_SMALL_STONE_BRICK_STAIRS;

    public static final Item MOSSY_CRACKED_SMALL_STONE_BRICKS;
    public static final Item MOSSY_CRACKED_SMALL_STONE_BRICK_WALL;
    public static final Item MOSSY_CRACKED_SMALL_STONE_BRICK_SLAB;
    public static final Item MOSSY_CRACKED_SMALL_STONE_BRICK_STAIRS;

    public static final Item WARPED_NYLIUM_COVERED_STONE_BRICKS;

    public static final Item CRIMSON_NYLIUM_COVERED_STONE_BRICKS;

    public static final Item MYCELIUM_COVERED_STONE_BRICKS;

    static {

        WHITE_WOOL_SLAB = register(ModBlocks.WHITE_WOOL_SLAB, ItemGroup.BUILDING_BLOCKS);
        ORANGE_WOOL_SLAB = register(ModBlocks.ORANGE_WOOL_SLAB, ItemGroup.BUILDING_BLOCKS);
        MAGENTA_WOOL_SLAB = register(ModBlocks.MAGENTA_WOOL_SLAB, ItemGroup.BUILDING_BLOCKS);
        LIGHT_BLUE_WOOL_SLAB = register(ModBlocks.LIGHT_BLUE_WOOL_SLAB, ItemGroup.BUILDING_BLOCKS);
        YELLOW_WOOL_SLAB = register(ModBlocks.YELLOW_WOOL_SLAB, ItemGroup.BUILDING_BLOCKS);
        LIME_WOOL_SLAB = register(ModBlocks.LIME_WOOL_SLAB, ItemGroup.BUILDING_BLOCKS);
        PINK_WOOL_SLAB = register(ModBlocks.PINK_WOOL_SLAB, ItemGroup.BUILDING_BLOCKS);
        GRAY_WOOL_SLAB = register(ModBlocks.GRAY_WOOL_SLAB, ItemGroup.BUILDING_BLOCKS);
        LIGHT_GRAY_WOOL_SLAB = register(ModBlocks.LIGHT_GRAY_WOOL_SLAB, ItemGroup.BUILDING_BLOCKS);
        CYAN_WOOL_SLAB = register(ModBlocks.CYAN_WOOL_SLAB, ItemGroup.BUILDING_BLOCKS);
        PURPLE_WOOL_SLAB = register(ModBlocks.PURPLE_WOOL_SLAB, ItemGroup.BUILDING_BLOCKS);
        BLUE_WOOL_SLAB = register(ModBlocks.BLUE_WOOL_SLAB, ItemGroup.BUILDING_BLOCKS);
        BROWN_WOOL_SLAB = register(ModBlocks.BROWN_WOOL_SLAB, ItemGroup.BUILDING_BLOCKS);
        GREEN_WOOL_SLAB = register(ModBlocks.GREEN_WOOL_SLAB, ItemGroup.BUILDING_BLOCKS);
        RED_WOOL_SLAB = register(ModBlocks.RED_WOOL_SLAB, ItemGroup.BUILDING_BLOCKS);
        BLACK_WOOL_SLAB = register(ModBlocks.BLACK_WOOL_SLAB, ItemGroup.BUILDING_BLOCKS);

        TURF = register(ModBlocks.TURF, ItemGroup.BUILDING_BLOCKS);
        NETHER_GOLD_ORE = register(ModBlocks.NETHER_GOLD_ORE, ItemGroup.MATERIALS);
        
        COBBLED_ANDESITE = register(ModBlocks.COBBLED_ANDESITE, ItemGroup.BUILDING_BLOCKS);
        COBBLED_ANDESITE_WALL = register(ModBlocks.COBBLED_ANDESITE_WALL, ItemGroup.BUILDING_BLOCKS);
        COBBLED_ANDESITE_SLAB = register(ModBlocks.COBBLED_ANDESITE_SLAB, ItemGroup.BUILDING_BLOCKS);
        COBBLED_ANDESITE_STAIRS = register(ModBlocks.COBBLED_ANDESITE_STAIRS, ItemGroup.BUILDING_BLOCKS);

        COBBLED_DIORITE = register(ModBlocks.COBBLED_DIORITE, ItemGroup.BUILDING_BLOCKS);
        COBBLED_DIORITE_WALL = register(ModBlocks.COBBLED_DIORITE_WALL, ItemGroup.BUILDING_BLOCKS);
        COBBLED_DIORITE_SLAB = register(ModBlocks.COBBLED_DIORITE_SLAB, ItemGroup.BUILDING_BLOCKS);
        COBBLED_DIORITE_STAIRS = register(ModBlocks.COBBLED_DIORITE_STAIRS, ItemGroup.BUILDING_BLOCKS);

        COBBLED_GRANITE = register(ModBlocks.COBBLED_GRANITE, ItemGroup.BUILDING_BLOCKS);
        COBBLED_GRANITE_WALL = register(ModBlocks.COBBLED_GRANITE_WALL, ItemGroup.BUILDING_BLOCKS);
        COBBLED_GRANITE_SLAB = register(ModBlocks.COBBLED_GRANITE_SLAB, ItemGroup.BUILDING_BLOCKS);
        COBBLED_GRANITE_STAIRS = register(ModBlocks.COBBLED_GRANITE_STAIRS, ItemGroup.BUILDING_BLOCKS);

        STONE_WALL = register(ModBlocks.STONE_WALL, ItemGroup.BUILDING_BLOCKS);

        SMOOTH_STONE_WALL = register(ModBlocks.SMOOTH_STONE_WALL, ItemGroup.BUILDING_BLOCKS);
        SMOOTH_STONE_STAIRS = register(ModBlocks.SMOOTH_STONE_STAIRS, ItemGroup.BUILDING_BLOCKS);

        STONE_PILLAR = register(ModBlocks.STONE_PILLAR, ItemGroup.BUILDING_BLOCKS);
        STONE_PILLAR_SLAB = register(ModBlocks.STONE_PILLAR_SLAB, ItemGroup.BUILDING_BLOCKS);

        HERRINGBONE_BRICKS = register(ModBlocks.HERRINGBONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
        HERRINGBONE_BRICK_WALL = register(ModBlocks.HERRINGBONE_BRICK_WALL, ItemGroup.BUILDING_BLOCKS);
        HERRINGBONE_BRICK_SLAB = register(ModBlocks.HERRINGBONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
        HERRINGBONE_BRICK_STAIRS = register(ModBlocks.HERRINGBONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);

        MOSSY_HERRINGBONE_BRICKS = register(ModBlocks.MOSSY_HERRINGBONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
        MOSSY_HERRINGBONE_BRICK_WALL = register(ModBlocks.MOSSY_HERRINGBONE_BRICK_WALL, ItemGroup.BUILDING_BLOCKS);
        MOSSY_HERRINGBONE_BRICK_SLAB = register(ModBlocks.MOSSY_HERRINGBONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
        MOSSY_HERRINGBONE_BRICK_STAIRS = register(ModBlocks.MOSSY_HERRINGBONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);

        MOSSY_BRICKS = register(ModBlocks.MOSSY_BRICKS, ItemGroup.BUILDING_BLOCKS);
        MOSSY_BRICK_WALL = register(ModBlocks.MOSSY_BRICK_WALL, ItemGroup.BUILDING_BLOCKS);
        MOSSY_BRICK_SLAB = register(ModBlocks.MOSSY_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
        MOSSY_BRICK_STAIRS = register(ModBlocks.MOSSY_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);

        CRACKED_STONE_BRICK_SLAB = register(ModBlocks.CRACKED_STONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
        CRACKED_STONE_BRICK_WALL = register(ModBlocks.CRACKED_STONE_BRICK_WALL, ItemGroup.BUILDING_BLOCKS);
        CRACKED_STONE_BRICK_STAIRS = register(ModBlocks.CRACKED_STONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);

        CHISELED_STONE_BRICK_WALL = register(ModBlocks.CHISELED_STONE_BRICK_WALL, ItemGroup.BUILDING_BLOCKS);
        CHISELED_STONE_BRICK_SLAB = register(ModBlocks.CHISELED_STONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
        CHISELED_STONE_BRICK_STAIRS = register(ModBlocks.CHISELED_STONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);

        MOSSY_CRACKED_STONE_BRICKS = register(ModBlocks.MOSSY_CRACKED_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
        MOSSY_CRACKED_STONE_BRICK_WALL = register(ModBlocks.MOSSY_CRACKED_STONE_BRICK_WALL, ItemGroup.BUILDING_BLOCKS);
        MOSSY_CRACKED_STONE_BRICK_SLAB = register(ModBlocks.MOSSY_CRACKED_STONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
        MOSSY_CRACKED_STONE_BRICK_STAIRS = register(ModBlocks.MOSSY_CRACKED_STONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);

        MOSSY_CHISELED_STONE_BRICKS = register(ModBlocks.MOSSY_CHISELED_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
        MOSSY_CHISELED_STONE_BRICK_WALL = register(ModBlocks.MOSSY_CHISELED_STONE_BRICK_WALL, ItemGroup.BUILDING_BLOCKS);
        MOSSY_CHISELED_STONE_BRICK_SLAB = register(ModBlocks.MOSSY_CHISELED_STONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
        MOSSY_CHISELED_STONE_BRICK_STAIRS = register(ModBlocks.MOSSY_CHISELED_STONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);

        CRACKED_CHISELED_STONE_BRICKS = register(ModBlocks.CRACKED_CHISELED_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
        CRACKED_CHISELED_STONE_BRICK_WALL = register(ModBlocks.CRACKED_CHISELED_STONE_BRICK_WALL, ItemGroup.BUILDING_BLOCKS);
        CRACKED_CHISELED_STONE_BRICK_SLAB = register(ModBlocks.CRACKED_CHISELED_STONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
        CRACKED_CHISELED_STONE_BRICK_STAIRS = register(ModBlocks.CRACKED_CHISELED_STONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);

        MOSSY_CRACKED_CHISELED_STONE_BRICKS = register(ModBlocks.MOSSY_CRACKED_CHISELED_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
        MOSSY_CRACKED_CHISELED_STONE_BRICK_WALL = register(ModBlocks.MOSSY_CRACKED_CHISELED_STONE_BRICK_WALL, ItemGroup.BUILDING_BLOCKS);
        MOSSY_CRACKED_CHISELED_STONE_BRICK_SLAB = register(ModBlocks.MOSSY_CRACKED_CHISELED_STONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
        MOSSY_CRACKED_CHISELED_STONE_BRICK_STAIRS = register(ModBlocks.MOSSY_CRACKED_CHISELED_STONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);

        SMALL_STONE_BRICKS = register(ModBlocks.SMALL_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
        SMALL_STONE_BRICK_WALL = register(ModBlocks.SMALL_STONE_BRICK_WALL, ItemGroup.BUILDING_BLOCKS);
        SMALL_STONE_BRICK_SLAB = register(ModBlocks.SMALL_STONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
        SMALL_STONE_BRICK_STAIRS = register(ModBlocks.SMALL_STONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);

        CRACKED_SMALL_STONE_BRICKS = register(ModBlocks.CRACKED_SMALL_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
        CRACKED_SMALL_STONE_BRICK_WALL = register(ModBlocks.CRACKED_SMALL_STONE_BRICK_WALL, ItemGroup.BUILDING_BLOCKS);
        CRACKED_SMALL_STONE_BRICK_SLAB = register(ModBlocks.CRACKED_SMALL_STONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
        CRACKED_SMALL_STONE_BRICK_STAIRS = register(ModBlocks.CRACKED_SMALL_STONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);

        MOSSY_SMALL_STONE_BRICKS = register(ModBlocks.MOSSY_SMALL_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
        MOSSY_SMALL_STONE_BRICK_WALL = register(ModBlocks.MOSSY_SMALL_STONE_BRICK_WALL, ItemGroup.BUILDING_BLOCKS);
        MOSSY_SMALL_STONE_BRICK_SLAB = register(ModBlocks.MOSSY_SMALL_STONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
        MOSSY_SMALL_STONE_BRICK_STAIRS = register(ModBlocks.MOSSY_SMALL_STONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);

        MOSSY_CRACKED_SMALL_STONE_BRICKS = register(ModBlocks.MOSSY_CRACKED_SMALL_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
        MOSSY_CRACKED_SMALL_STONE_BRICK_WALL = register(ModBlocks.MOSSY_CRACKED_SMALL_STONE_BRICK_WALL, ItemGroup.BUILDING_BLOCKS);
        MOSSY_CRACKED_SMALL_STONE_BRICK_SLAB = register(ModBlocks.MOSSY_CRACKED_SMALL_STONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
        MOSSY_CRACKED_SMALL_STONE_BRICK_STAIRS = register(ModBlocks.MOSSY_CRACKED_SMALL_STONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);

        WARPED_NYLIUM_COVERED_STONE_BRICKS = register(ModBlocks.WARPED_NYLIUM_COVERED_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);

        CRIMSON_NYLIUM_COVERED_STONE_BRICKS = register(ModBlocks.CRIMSON_NYLIUM_COVERED_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);

        MYCELIUM_COVERED_STONE_BRICKS = register(ModBlocks.MYCELIUM_COVERED_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
    }

    private static Item register(Block block) {
        return register(new BlockItem(block, new Item.Settings()));
    }

    private static Item register(Block block, ItemGroup group) {
        return register(new BlockItem(block, (new Item.Settings()).group(group)));
    }

    private static Item register(BlockItem item) {
        return register((Block)item.getBlock(), (Item)item);
    }

    protected static Item register(Block block, Item iem) {
        return register(Registry.BLOCK.getId(block), iem);
    }

    private static Item register(String id, Item item) {
        return register(new Identifier(id), item);
    }

    private static Item register(Identifier id, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return (Item)Registry.register(Registry.ITEM, id, item);
    }

    public static void initialize() {  }
}
