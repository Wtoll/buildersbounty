package com.wtoll.buildersbounty.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    // TODO: Recipes, and names for these

    public static final Block WHITE_WOOL_SLAB;
    public static final Block ORANGE_WOOL_SLAB;
    public static final Block MAGENTA_WOOL_SLAB;
    public static final Block LIGHT_BLUE_WOOL_SLAB;
    public static final Block YELLOW_WOOL_SLAB;
    public static final Block LIME_WOOL_SLAB;
    public static final Block PINK_WOOL_SLAB;
    public static final Block GRAY_WOOL_SLAB;
    public static final Block LIGHT_GRAY_WOOL_SLAB;
    public static final Block CYAN_WOOL_SLAB;
    public static final Block PURPLE_WOOL_SLAB;
    public static final Block BLUE_WOOL_SLAB;
    public static final Block BROWN_WOOL_SLAB;
    public static final Block GREEN_WOOL_SLAB;
    public static final Block RED_WOOL_SLAB;
    public static final Block BLACK_WOOL_SLAB;

    // End

    public static final Block TURF;
    public static final Block NETHER_GOLD_ORE;

    public static final Block COBBLED_ANDESITE;
    public static final Block COBBLED_ANDESITE_WALL;
    public static final Block COBBLED_ANDESITE_SLAB;
    public static final Block COBBLED_ANDESITE_STAIRS;

    public static final Block COBBLED_DIORITE;
    public static final Block COBBLED_DIORITE_WALL;
    public static final Block COBBLED_DIORITE_SLAB;
    public static final Block COBBLED_DIORITE_STAIRS;

    public static final Block COBBLED_GRANITE;
    public static final Block COBBLED_GRANITE_WALL;
    public static final Block COBBLED_GRANITE_SLAB;
    public static final Block COBBLED_GRANITE_STAIRS;

    public static final Block STONE_WALL;

    public static final Block SMOOTH_STONE_WALL;
    public static final Block SMOOTH_STONE_STAIRS;

    public static final Block STONE_PILLAR_SLAB;
    public static final Block STONE_PILLAR;

    public static final Block HERRINGBONE_BRICKS;
    public static final Block HERRINGBONE_BRICK_WALL;
    public static final Block HERRINGBONE_BRICK_SLAB;
    public static final Block HERRINGBONE_BRICK_STAIRS;

    public static final Block MOSSY_HERRINGBONE_BRICKS;
    public static final Block MOSSY_HERRINGBONE_BRICK_WALL;
    public static final Block MOSSY_HERRINGBONE_BRICK_SLAB;
    public static final Block MOSSY_HERRINGBONE_BRICK_STAIRS;

    public static final Block MOSSY_BRICKS;
    public static final Block MOSSY_BRICK_WALL;
    public static final Block MOSSY_BRICK_SLAB;
    public static final Block MOSSY_BRICK_STAIRS;

    public static final Block CRACKED_STONE_BRICK_SLAB;
    public static final Block CRACKED_STONE_BRICK_WALL;
    public static final Block CRACKED_STONE_BRICK_STAIRS;

    public static final Block CHISELED_STONE_BRICK_WALL;
    public static final Block CHISELED_STONE_BRICK_SLAB;
    public static final Block CHISELED_STONE_BRICK_STAIRS;

    public static final Block MOSSY_CRACKED_STONE_BRICKS;
    public static final Block MOSSY_CRACKED_STONE_BRICK_WALL;
    public static final Block MOSSY_CRACKED_STONE_BRICK_SLAB;
    public static final Block MOSSY_CRACKED_STONE_BRICK_STAIRS;

    public static final Block MOSSY_CHISELED_STONE_BRICKS;
    public static final Block MOSSY_CHISELED_STONE_BRICK_WALL;
    public static final Block MOSSY_CHISELED_STONE_BRICK_SLAB;
    public static final Block MOSSY_CHISELED_STONE_BRICK_STAIRS;

    public static final Block CRACKED_CHISELED_STONE_BRICKS;
    public static final Block CRACKED_CHISELED_STONE_BRICK_WALL;
    public static final Block CRACKED_CHISELED_STONE_BRICK_SLAB;
    public static final Block CRACKED_CHISELED_STONE_BRICK_STAIRS;

    public static final Block MOSSY_CRACKED_CHISELED_STONE_BRICKS;
    public static final Block MOSSY_CRACKED_CHISELED_STONE_BRICK_WALL;
    public static final Block MOSSY_CRACKED_CHISELED_STONE_BRICK_SLAB;
    public static final Block MOSSY_CRACKED_CHISELED_STONE_BRICK_STAIRS;

    public static final Block SMALL_STONE_BRICKS;
    public static final Block SMALL_STONE_BRICK_WALL;
    public static final Block SMALL_STONE_BRICK_SLAB;
    public static final Block SMALL_STONE_BRICK_STAIRS;

    public static final Block CRACKED_SMALL_STONE_BRICKS;
    public static final Block CRACKED_SMALL_STONE_BRICK_WALL;
    public static final Block CRACKED_SMALL_STONE_BRICK_SLAB;
    public static final Block CRACKED_SMALL_STONE_BRICK_STAIRS;

    public static final Block MOSSY_SMALL_STONE_BRICKS;
    public static final Block MOSSY_SMALL_STONE_BRICK_WALL;
    public static final Block MOSSY_SMALL_STONE_BRICK_SLAB;
    public static final Block MOSSY_SMALL_STONE_BRICK_STAIRS;

    public static final Block MOSSY_CRACKED_SMALL_STONE_BRICKS;
    public static final Block MOSSY_CRACKED_SMALL_STONE_BRICK_WALL;
    public static final Block MOSSY_CRACKED_SMALL_STONE_BRICK_SLAB;
    public static final Block MOSSY_CRACKED_SMALL_STONE_BRICK_STAIRS;

    public static final Block WARPED_NYLIUM_COVERED_STONE_BRICKS;

    public static final Block CRIMSON_NYLIUM_COVERED_STONE_BRICKS;

    public static final Block MYCELIUM_COVERED_STONE_BRICKS;

    static {
        WHITE_WOOL_SLAB = register("white_wool_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.WHITE_WOOL).build()));
        ORANGE_WOOL_SLAB = register("orange_wool_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.ORANGE_WOOL).build()));
        MAGENTA_WOOL_SLAB = register("magenta_wool_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.MAGENTA_WOOL).build()));
        LIGHT_BLUE_WOOL_SLAB = register("light_blue_wool_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.LIGHT_BLUE_WOOL).build()));
        YELLOW_WOOL_SLAB = register("yellow_wool_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.YELLOW_WOOL).build()));
        LIME_WOOL_SLAB = register("lime_wool_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.LIME_WOOL).build()));
        PINK_WOOL_SLAB = register("pink_wool_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.PINK_WOOL).build()));
        GRAY_WOOL_SLAB = register("gray_wool_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.GRAY_WOOL).build()));
        LIGHT_GRAY_WOOL_SLAB = register("light_gray_wool_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.LIGHT_GRAY_WOOL).build()));
        CYAN_WOOL_SLAB = register("cyan_wool_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.CYAN_WOOL).build()));
        PURPLE_WOOL_SLAB = register("purple_wool_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.PURPLE_WOOL).build()));
        BLUE_WOOL_SLAB = register("blue_wool_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BLUE_WOOL).build()));
        BROWN_WOOL_SLAB = register("brown_wool_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BROWN_WOOL).build()));
        GREEN_WOOL_SLAB = register("green_wool_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.GREEN_WOOL).build()));
        RED_WOOL_SLAB = register("red_wool_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.RED_WOOL).build()));
        BLACK_WOOL_SLAB = register("black_wool_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.BLACK_WOOL).build()));

        NETHER_GOLD_ORE = register("nether_gold_ore", new OreBlock(FabricBlockSettings.copy(Blocks.NETHER_QUARTZ_ORE).build()));
        TURF = register("turf", new Block(FabricBlockSettings.copy(Blocks.GRASS_BLOCK).build()));

        COBBLED_ANDESITE = register("cobbled_andesite", new Block(FabricBlockSettings.copy(Blocks.ANDESITE).build()));
        COBBLED_ANDESITE_WALL = register("cobbled_andesite_wall", new WallBlock(FabricBlockSettings.copy(COBBLED_ANDESITE).build()));
        COBBLED_ANDESITE_SLAB = register("cobbled_andesite_slab", new SlabBlock(FabricBlockSettings.copy(COBBLED_ANDESITE).build()));
        COBBLED_ANDESITE_STAIRS = register("cobbled_andesite_stairs", new StairsBlock(COBBLED_ANDESITE.getDefaultState(), FabricBlockSettings.copy(COBBLED_ANDESITE).build()));

        COBBLED_DIORITE = register("cobbled_diorite", new Block(FabricBlockSettings.copy(Blocks.DIORITE).build()));
        COBBLED_DIORITE_WALL = register("cobbled_diorite_wall", new WallBlock(FabricBlockSettings.copy(COBBLED_DIORITE).build()));
        COBBLED_DIORITE_SLAB = register("cobbled_diorite_slab", new SlabBlock(FabricBlockSettings.copy(COBBLED_DIORITE).build()));
        COBBLED_DIORITE_STAIRS = register("cobbled_diorite_stairs", new StairsBlock(COBBLED_DIORITE.getDefaultState(), FabricBlockSettings.copy(COBBLED_DIORITE).build()));

        COBBLED_GRANITE = register("cobbled_granite", new Block(FabricBlockSettings.copy(Blocks.GRANITE).build()));
        COBBLED_GRANITE_WALL = register("cobbled_granite_wall", new WallBlock(FabricBlockSettings.copy(COBBLED_GRANITE).build()));
        COBBLED_GRANITE_SLAB = register("cobbled_granite_slab", new SlabBlock(FabricBlockSettings.copy(COBBLED_GRANITE).build()));
        COBBLED_GRANITE_STAIRS = register("cobbled_granite_stairs", new StairsBlock(COBBLED_GRANITE.getDefaultState(), FabricBlockSettings.copy(COBBLED_GRANITE).build()));

        STONE_WALL = register("stone_wall", new WallBlock(FabricBlockSettings.copy(Blocks.STONE).build()));

        SMOOTH_STONE_WALL = register("smooth_stone_wall", new WallBlock(FabricBlockSettings.copy(Blocks.SMOOTH_STONE).build()));
        SMOOTH_STONE_STAIRS = register("smooth_stone_stairs", new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), FabricBlockSettings.copy(Blocks.SMOOTH_STONE).build()));

        STONE_PILLAR_SLAB = register("stone_pillar_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.STONE).build()));
        STONE_PILLAR = register("stone_pillar", new DynamicPillar(FabricBlockSettings.copy(Blocks.STONE).build(), STONE_PILLAR_SLAB));

        HERRINGBONE_BRICKS = register("herringbone_bricks", new Block(FabricBlockSettings.copy(Blocks.BRICKS).build()));
        HERRINGBONE_BRICK_WALL = register("herringbone_brick_wall", new WallBlock(FabricBlockSettings.copy(HERRINGBONE_BRICKS).build()));
        HERRINGBONE_BRICK_SLAB = register("herringbone_brick_slab", new SlabBlock(FabricBlockSettings.copy(HERRINGBONE_BRICKS).build()));
        HERRINGBONE_BRICK_STAIRS = register("herringbone_brick_stairs", new StairsBlock(HERRINGBONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(HERRINGBONE_BRICKS).build()));

        MOSSY_HERRINGBONE_BRICKS = register("mossy_herringbone_bricks", new Block(FabricBlockSettings.copy(Blocks.BRICKS).build()));
        MOSSY_HERRINGBONE_BRICK_WALL = register("mossy_herringbone_brick_wall", new WallBlock(FabricBlockSettings.copy(MOSSY_HERRINGBONE_BRICKS).build()));
        MOSSY_HERRINGBONE_BRICK_SLAB = register("mossy_herringbone_brick_slab", new SlabBlock(FabricBlockSettings.copy(MOSSY_HERRINGBONE_BRICKS).build()));
        MOSSY_HERRINGBONE_BRICK_STAIRS = register("mossy_herringbone_brick_stairs", new StairsBlock(MOSSY_HERRINGBONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(MOSSY_HERRINGBONE_BRICKS).build()));

        MOSSY_BRICKS = register("mossy_bricks", new Block(FabricBlockSettings.copy(Blocks.BRICKS).build()));
        MOSSY_BRICK_WALL = register("mossy_brick_wall", new WallBlock(FabricBlockSettings.copy(MOSSY_BRICKS).build()));
        MOSSY_BRICK_SLAB = register("mossy_brick_slab", new SlabBlock(FabricBlockSettings.copy(MOSSY_BRICKS).build()));
        MOSSY_BRICK_STAIRS = register("mossy_brick_stairs", new StairsBlock(MOSSY_BRICKS.getDefaultState(), FabricBlockSettings.copy(MOSSY_BRICKS).build()));

        CRACKED_STONE_BRICK_SLAB = register("cracked_stone_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.CRACKED_STONE_BRICKS).build()));
        CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.CRACKED_STONE_BRICKS).build()));
        CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs", new StairsBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.CRACKED_STONE_BRICKS).build()));

        CHISELED_STONE_BRICK_WALL = register("chiseled_stone_brick_wall", new WallBlock(FabricBlockSettings.copy(Blocks.CHISELED_STONE_BRICKS).build()));
        CHISELED_STONE_BRICK_SLAB = register("chiseled_stone_brick_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.CHISELED_STONE_BRICKS).build()));
        CHISELED_STONE_BRICK_STAIRS = register("chiseled_stone_brick_stairs", new StairsBlock(Blocks.CHISELED_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.CHISELED_STONE_BRICKS).build()));

        MOSSY_CRACKED_STONE_BRICKS = register("mossy_cracked_stone_bricks", new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS).build()));
        MOSSY_CRACKED_STONE_BRICK_WALL = register("mossy_cracked_stone_brick_wall", new WallBlock(FabricBlockSettings.copy(MOSSY_CRACKED_STONE_BRICKS).build()));
        MOSSY_CRACKED_STONE_BRICK_SLAB = register("mossy_cracked_stone_brick_slab", new SlabBlock(FabricBlockSettings.copy(MOSSY_CRACKED_STONE_BRICKS).build()));
        MOSSY_CRACKED_STONE_BRICK_STAIRS = register("mossy_cracked_stone_brick_stairs", new StairsBlock(MOSSY_CRACKED_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(MOSSY_CRACKED_STONE_BRICKS).build()));

        MOSSY_CHISELED_STONE_BRICKS = register("mossy_chiseled_stone_bricks", new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS).build()));
        MOSSY_CHISELED_STONE_BRICK_WALL = register("mossy_chiseled_stone_brick_wall", new WallBlock(FabricBlockSettings.copy(MOSSY_CHISELED_STONE_BRICKS).build()));
        MOSSY_CHISELED_STONE_BRICK_SLAB = register("mossy_chiseled_stone_brick_slab", new SlabBlock(FabricBlockSettings.copy(MOSSY_CHISELED_STONE_BRICKS).build()));
        MOSSY_CHISELED_STONE_BRICK_STAIRS = register("mossy_chiseled_stone_brick_stairs", new StairsBlock(MOSSY_CHISELED_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(MOSSY_CHISELED_STONE_BRICKS).build()));

        CRACKED_CHISELED_STONE_BRICKS = register("cracked_chiseled_stone_bricks", new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS).build()));
        CRACKED_CHISELED_STONE_BRICK_WALL = register("cracked_chiseled_stone_brick_wall", new WallBlock(FabricBlockSettings.copy(CRACKED_CHISELED_STONE_BRICKS).build()));
        CRACKED_CHISELED_STONE_BRICK_SLAB = register("cracked_chiseled_stone_brick_slab", new SlabBlock(FabricBlockSettings.copy(CRACKED_CHISELED_STONE_BRICKS).build()));
        CRACKED_CHISELED_STONE_BRICK_STAIRS = register("cracked_chiseled_stone_brick_stairs", new StairsBlock(CRACKED_CHISELED_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(CRACKED_CHISELED_STONE_BRICKS).build()));

        MOSSY_CRACKED_CHISELED_STONE_BRICKS = register("mossy_cracked_chiseled_stone_bricks", new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS).build()));
        MOSSY_CRACKED_CHISELED_STONE_BRICK_WALL = register("mossy_cracked_chiseled_stone_brick_wall", new WallBlock(FabricBlockSettings.copy(MOSSY_CRACKED_CHISELED_STONE_BRICKS).build()));
        MOSSY_CRACKED_CHISELED_STONE_BRICK_SLAB = register("mossy_cracked_chiseled_stone_brick_slab", new SlabBlock(FabricBlockSettings.copy(MOSSY_CRACKED_CHISELED_STONE_BRICKS).build()));
        MOSSY_CRACKED_CHISELED_STONE_BRICK_STAIRS = register("mossy_cracked_chiseled_stone_brick_stairs", new StairsBlock(MOSSY_CRACKED_CHISELED_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(MOSSY_CRACKED_CHISELED_STONE_BRICKS).build()));

        SMALL_STONE_BRICKS = register("small_stone_bricks", new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS).build()));
        SMALL_STONE_BRICK_WALL = register("small_stone_brick_wall", new WallBlock(FabricBlockSettings.copy(SMALL_STONE_BRICKS).build()));
        SMALL_STONE_BRICK_SLAB = register("small_stone_brick_slab", new SlabBlock(FabricBlockSettings.copy(SMALL_STONE_BRICKS).build()));
        SMALL_STONE_BRICK_STAIRS = register("small_stone_brick_stairs", new StairsBlock(SMALL_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(SMALL_STONE_BRICKS).build()));

        CRACKED_SMALL_STONE_BRICKS = register("cracked_small_stone_bricks", new Block(FabricBlockSettings.copy(SMALL_STONE_BRICKS).build()));
        CRACKED_SMALL_STONE_BRICK_WALL = register("cracked_small_stone_brick_wall", new WallBlock(FabricBlockSettings.copy(CRACKED_SMALL_STONE_BRICKS).build()));
        CRACKED_SMALL_STONE_BRICK_SLAB = register("cracked_small_stone_brick_slab", new SlabBlock(FabricBlockSettings.copy(CRACKED_SMALL_STONE_BRICKS).build()));
        CRACKED_SMALL_STONE_BRICK_STAIRS = register("cracked_small_stone_brick_stairs", new StairsBlock(CRACKED_SMALL_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(CRACKED_SMALL_STONE_BRICKS).build()));

        MOSSY_SMALL_STONE_BRICKS = register("mossy_small_stone_bricks", new Block(FabricBlockSettings.copy(SMALL_STONE_BRICKS).build()));
        MOSSY_SMALL_STONE_BRICK_WALL = register("mossy_small_stone_brick_wall", new WallBlock(FabricBlockSettings.copy(MOSSY_SMALL_STONE_BRICKS).build()));
        MOSSY_SMALL_STONE_BRICK_SLAB = register("mossy_small_stone_brick_slab", new SlabBlock(FabricBlockSettings.copy(MOSSY_SMALL_STONE_BRICKS).build()));
        MOSSY_SMALL_STONE_BRICK_STAIRS = register("mossy_small_stone_brick_stairs", new StairsBlock(MOSSY_SMALL_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(MOSSY_SMALL_STONE_BRICKS).build()));

        MOSSY_CRACKED_SMALL_STONE_BRICKS = register("mossy_cracked_small_stone_bricks", new Block(FabricBlockSettings.copy(CRACKED_SMALL_STONE_BRICKS).build()));
        MOSSY_CRACKED_SMALL_STONE_BRICK_WALL = register("mossy_cracked_small_stone_brick_wall", new WallBlock(FabricBlockSettings.copy(MOSSY_CRACKED_SMALL_STONE_BRICKS).build()));
        MOSSY_CRACKED_SMALL_STONE_BRICK_SLAB = register("mossy_cracked_small_stone_brick_slab", new SlabBlock(FabricBlockSettings.copy(MOSSY_CRACKED_SMALL_STONE_BRICKS).build()));
        MOSSY_CRACKED_SMALL_STONE_BRICK_STAIRS = register("mossy_cracked_small_stone_brick_stairs", new StairsBlock(MOSSY_CRACKED_SMALL_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(MOSSY_CRACKED_SMALL_STONE_BRICKS).build()));

        WARPED_NYLIUM_COVERED_STONE_BRICKS = register("warped_nylium_covered_stone_bricks", new Block(FabricBlockSettings.copy(Blocks.MOSSY_STONE_BRICKS).build()));

        CRIMSON_NYLIUM_COVERED_STONE_BRICKS = register("crimson_nylium_covered_stone_bricks", new Block(FabricBlockSettings.copy(Blocks.MOSSY_STONE_BRICKS).build()));;

        MYCELIUM_COVERED_STONE_BRICKS = register("mycelium_covered_stone_bricks", new Block(FabricBlockSettings.copy(Blocks.MOSSY_STONE_BRICKS).build()));;

    }

    private static Block register(String id, Block block) {
        registerFiles(id, block);
        return (Block)Registry.register(Registry.BLOCK, id, block);
    }

    public static void initialize() {  }


    private static void registerFiles(String id, Block block) {

    }
}
