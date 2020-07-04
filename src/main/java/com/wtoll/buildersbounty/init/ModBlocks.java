package com.wtoll.buildersbounty.init;

import com.wtoll.buildersbounty.BuildersBounty;
import com.wtoll.buildersbounty.block.*;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class ModBlocks {

    public static final Map<Identifier, Block> BLOCKS = new HashMap<>();
    public static final Map<Identifier, BlockItem> BLOCK_ITEMS = new HashMap<>();

    public static Block add(String s, Block b, ItemGroup tab) {
        return add(s, b, new Item.Settings().group(tab));
    }

    public static Block add(String s, Block b, Item.Settings settings) {
        add(s, new BlockItem(b, settings));
        return add(s, b);
    }

    public static Block add(String s, Block b) {
        BLOCKS.put(BuildersBounty.id(s), b);
        return b;
    }

    public static BlockItem add(String s, BlockItem i) {
        BLOCK_ITEMS.put(BuildersBounty.id(s), i);
        return i;
    }

    public static void initialize() {
        BLOCKS.forEach((id, block) -> Registry.register(Registry.BLOCK, id, block));
        BLOCK_ITEMS.forEach((id, item) -> Registry.register(Registry.ITEM, id, item));
    }
















    // MISC
        public static final Block TURF =  add("turf", new Block(FabricBlockSettings.copy(Blocks.GRASS_BLOCK).build()), ItemGroup.BUILDING_BLOCKS);
    // WOOL
        // WHITE
            public static final Block WHITE_WOOL_SLAB = add("white_wool_slab", new SlabBlock(Blocks.WHITE_WOOL), ItemGroup.BUILDING_BLOCKS);
            public static final Block WHITE_WOOL_STAIRS = add("white_wool_stairs", new StairsBlock(Blocks.WHITE_WOOL), ItemGroup.BUILDING_BLOCKS);
        // ORANGE
            public static final Block ORANGE_WOOL_SLAB = add("orange_wool_slab", new SlabBlock(Blocks.ORANGE_WOOL), ItemGroup.BUILDING_BLOCKS);
            public static final Block ORANGE_WOOL_STAIRS = add("orange_wool_stairs", new StairsBlock(Blocks.ORANGE_WOOL), ItemGroup.BUILDING_BLOCKS);
        // MAGENTA
            public static final Block MAGENTA_WOOL_SLAB = add("magenta_wool_slab", new SlabBlock(Blocks.MAGENTA_WOOL), ItemGroup.BUILDING_BLOCKS);
            public static final Block MAGENTA_WOOL_STAIRS = add("magenta_wool_stairs", new StairsBlock(Blocks.MAGENTA_WOOL), ItemGroup.BUILDING_BLOCKS);
        // LIGHT BLUE
            public static final Block LIGHT_BLUE_WOOL_SLAB = add("light_blue_wool_slab", new SlabBlock(Blocks.LIGHT_BLUE_WOOL), ItemGroup.BUILDING_BLOCKS);
            public static final Block LIGHT_BLUE_WOOL_STAIRS = add("light_blue_wool_stairs", new StairsBlock(Blocks.LIGHT_BLUE_WOOL), ItemGroup.BUILDING_BLOCKS);
        // YELLOW
            public static final Block YELLOW_WOOL_SLAB = add("yellow_wool_slab", new SlabBlock(Blocks.YELLOW_WOOL), ItemGroup.BUILDING_BLOCKS);
            public static final Block YELLOW_WOOL_STAIRS = add("yellow_wool_stairs", new StairsBlock(Blocks.YELLOW_WOOL), ItemGroup.BUILDING_BLOCKS);
        // LIME
            public static final Block LIME_WOOL_SLAB = add("lime_wool_slab", new SlabBlock(Blocks.LIME_WOOL), ItemGroup.BUILDING_BLOCKS);
            public static final Block LIME_WOOL_STAIRS = add("lime_wool_stairs", new StairsBlock(Blocks.LIME_WOOL), ItemGroup.BUILDING_BLOCKS);
        // PINK
            public static final Block PINK_WOOL_SLAB = add("pink_wool_slab", new SlabBlock(Blocks.PINK_WOOL), ItemGroup.BUILDING_BLOCKS);
            public static final Block PINK_WOOL_STAIRS = add("pink_wool_stairs", new StairsBlock(Blocks.PINK_WOOL), ItemGroup.BUILDING_BLOCKS);
        // GRAY
            public static final Block GRAY_WOOL_SLAB = add("gray_wool_slab", new SlabBlock(Blocks.GRAY_WOOL), ItemGroup.BUILDING_BLOCKS);
            public static final Block GRAY_WOOL_STAIRS = add("gray_wool_stairs", new StairsBlock(Blocks.GRAY_WOOL), ItemGroup.BUILDING_BLOCKS);
        // LIGHT GRAY
            public static final Block LIGHT_GRAY_WOOL_SLAB = add("light_gray_wool_slab", new SlabBlock(Blocks.LIGHT_GRAY_WOOL), ItemGroup.BUILDING_BLOCKS);
            public static final Block LIGHT_GRAY_WOOL_STAIRS = add("light_gray_wool_stairs", new StairsBlock(Blocks.LIGHT_GRAY_WOOL), ItemGroup.BUILDING_BLOCKS);
        // CYAN
            public static final Block CYAN_WOOL_SLAB = add("cyan_wool_slab", new SlabBlock(Blocks.CYAN_WOOL), ItemGroup.BUILDING_BLOCKS);
            public static final Block CYAN_WOOL_STAIRS = add("cyan_wool_stairs", new StairsBlock(Blocks.CYAN_WOOL), ItemGroup.BUILDING_BLOCKS);
        // PURPLE
            public static final Block PURPLE_WOOL_SLAB = add("purple_wool_slab", new SlabBlock(Blocks.PURPLE_WOOL), ItemGroup.BUILDING_BLOCKS);
            public static final Block PURPLE_WOOL_STAIRS = add("purple_wool_stairs", new StairsBlock(Blocks.PURPLE_WOOL), ItemGroup.BUILDING_BLOCKS);
        // BLUE
            public static final Block BLUE_WOOL_SLAB = add("blue_wool_slab", new SlabBlock(Blocks.BLUE_WOOL), ItemGroup.BUILDING_BLOCKS);
            public static final Block BLUE_WOOL_STAIRS = add("blue_wool_stairs", new StairsBlock(Blocks.BLUE_WOOL), ItemGroup.BUILDING_BLOCKS);
        // BROWN
            public static final Block BROWN_WOOL_SLAB = add("brown_wool_slab", new SlabBlock(Blocks.BROWN_WOOL), ItemGroup.BUILDING_BLOCKS);
            public static final Block BROWN_WOOL_STAIRS = add("brown_wool_stairs", new StairsBlock(Blocks.BROWN_WOOL), ItemGroup.BUILDING_BLOCKS);
        // GREEN
            public static final Block GREEN_WOOL_SLAB = add("green_wool_slab", new SlabBlock(Blocks.GREEN_WOOL), ItemGroup.BUILDING_BLOCKS);
            public static final Block GREEN_WOOL_STAIRS = add("green_wool_stairs", new StairsBlock(Blocks.GREEN_WOOL), ItemGroup.BUILDING_BLOCKS);
        // RED
            public static final Block RED_WOOL_SLAB = add("red_wool_slab", new SlabBlock(Blocks.RED_WOOL), ItemGroup.BUILDING_BLOCKS);
            public static final Block RED_WOOL_STAIRS = add("red_wool_stairs", new StairsBlock(Blocks.RED_WOOL), ItemGroup.BUILDING_BLOCKS);
        // BLACK
            public static final Block BLACK_WOOL_SLAB = add("black_wool_slab", new SlabBlock(Blocks.BLACK_WOOL), ItemGroup.BUILDING_BLOCKS);
            public static final Block BLACK_WOOL_STAIRS = add("black_wool_stairs", new StairsBlock(Blocks.BLACK_WOOL), ItemGroup.BUILDING_BLOCKS);
    // ANDESITE
        // BASE
            // NORMAL
                public static final Block ANDESITE_FENCE = add("andesite_fence", new FenceBlock(Blocks.ANDESITE), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block COBBLED_ANDESITE = add("cobbled_andesite", new Block(FabricBlockSettings.copy(Blocks.ANDESITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block COBBLED_ANDESITE_WALL = add("cobbled_andesite_wall", new WallBlock(COBBLED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block COBBLED_ANDESITE_FENCE = add("cobbled_andesite_fence", new FenceBlock(COBBLED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block COBBLED_ANDESITE_SLAB = add("cobbled_andesite_slab", new SlabBlock(COBBLED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block COBBLED_ANDESITE_STAIRS = add("cobbled_andesite_stairs", new StairsBlock(COBBLED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_ANDESITE = add("mossy_andesite", new Block(FabricBlockSettings.copy(Blocks.ANDESITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_ANDESITE_WALL = add("mossy_andesite_wall", new WallBlock(MOSSY_ANDESITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_ANDESITE_FENCE = add("mossy_andesite_fence", new FenceBlock(MOSSY_ANDESITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_ANDESITE_SLAB = add("mossy_andesite_slab", new SlabBlock(MOSSY_ANDESITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_ANDESITE_STAIRS = add("mossy_andesite_stairs", new StairsBlock(MOSSY_ANDESITE), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_COBBLED_ANDESITE = add("mossy_cobbled_andesite", new Block(FabricBlockSettings.copy(Blocks.ANDESITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_COBBLED_ANDESITE_WALL = add("mossy_cobbled_andesite_wall", new WallBlock(MOSSY_COBBLED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_COBBLED_ANDESITE_FENCE = add("mossy_cobbled_andesite_fence", new FenceBlock(MOSSY_COBBLED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_COBBLED_ANDESITE_SLAB = add("mossy_cobbled_andesite_slab", new SlabBlock(MOSSY_COBBLED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_COBBLED_ANDESITE_STAIRS = add("mossy_cobbled_andesite_stairs", new StairsBlock(MOSSY_COBBLED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
        // BRICKS
            // NORMAL
                public static final Block ANDESITE_BRICKS = add("andesite_bricks", new Block(FabricBlockSettings.copy(Blocks.ANDESITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block ANDESITE_BRICK_WALL = add("andesite_brick_wall", new WallBlock(ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block ANDESITE_BRICK_FENCE = add("andesite_brick_fence", new FenceBlock(ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block ANDESITE_BRICK_SLAB = add("andesite_brick_slab", new SlabBlock(ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block ANDESITE_BRICK_STAIRS = add("andesite_brick_stairs", new StairsBlock(ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_ANDESITE_BRICKS = add("cracked_andesite_bricks", new Block(FabricBlockSettings.copy(ANDESITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_ANDESITE_BRICK_WALL = add("cracked_andesite_brick_wall", new WallBlock(CRACKED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_ANDESITE_BRICK_FENCE = add("cracked_andesite_brick_fence", new FenceBlock(CRACKED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_ANDESITE_BRICK_SLAB = add("cracked_andesite_brick_slab", new SlabBlock(CRACKED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_ANDESITE_BRICK_STAIRS = add("cracked_andesite_brick_stairs", new StairsBlock(CRACKED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_ANDESITE_BRICKS = add("mossy_andesite_bricks", new Block(FabricBlockSettings.copy(ANDESITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_ANDESITE_BRICK_WALL = add("mossy_andesite_brick_wall", new WallBlock(MOSSY_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_ANDESITE_BRICK_FENCE = add("mossy_andesite_brick_fence", new FenceBlock(MOSSY_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_ANDESITE_BRICK_SLAB = add("mossy_andesite_brick_slab", new SlabBlock(MOSSY_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_ANDESITE_BRICK_STAIRS = add("mossy_andesite_brick_stairs", new StairsBlock(MOSSY_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_ANDESITE_BRICKS = add("mossy_cracked_andesite_bricks", new Block(FabricBlockSettings.copy(ANDESITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_ANDESITE_BRICK_WALL = add("mossy_cracked_andesite_brick_wall", new WallBlock(MOSSY_CRACKED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_ANDESITE_BRICK_FENCE = add("mossy_cracked_andesite_brick_fence", new FenceBlock(MOSSY_CRACKED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_ANDESITE_BRICK_SLAB = add("mossy_cracked_andesite_brick_slab", new SlabBlock(MOSSY_CRACKED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_ANDESITE_BRICK_STAIRS = add("mossy_cracked_andesite_brick_stairs", new StairsBlock(MOSSY_CRACKED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
        // CHISELED BRICKS
            // NORMAL
                public static final Block CHISELED_ANDESITE_BRICKS = add("chiseled_andesite_bricks", new Block(FabricBlockSettings.copy(Blocks.ANDESITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CHISELED_ANDESITE_BRICK_WALL = add("chiseled_andesite_brick_wall", new WallBlock(CHISELED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CHISELED_ANDESITE_BRICK_FENCE = add("chiseled_andesite_brick_fence", new FenceBlock(CHISELED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CHISELED_ANDESITE_BRICK_SLAB = add("chiseled_andesite_brick_slab", new SlabBlock(CHISELED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CHISELED_ANDESITE_BRICK_STAIRS = add("chiseled_andesite_brick_stairs", new StairsBlock(CHISELED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_CHISELED_ANDESITE_BRICKS = add("cracked_chiseled_andesite_bricks", new Block(FabricBlockSettings.copy(ANDESITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_CHISELED_ANDESITE_BRICK_WALL = add("cracked_chiseled_andesite_brick_wall", new WallBlock(CRACKED_CHISELED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_CHISELED_ANDESITE_BRICK_FENCE = add("cracked_chiseled_andesite_brick_fence", new FenceBlock(CRACKED_CHISELED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_CHISELED_ANDESITE_BRICK_SLAB = add("cracked_chiseled_andesite_brick_slab", new SlabBlock(CRACKED_CHISELED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_CHISELED_ANDESITE_BRICK_STAIRS = add("cracked_chiseled_andesite_brick_stairs", new StairsBlock(CRACKED_CHISELED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_CHISELED_ANDESITE_BRICKS = add("mossy_chiseled_andesite_bricks", new Block(FabricBlockSettings.copy(ANDESITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CHISELED_ANDESITE_BRICK_WALL = add("mossy_chiseled_andesite_brick_wall", new WallBlock(MOSSY_CHISELED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CHISELED_ANDESITE_BRICK_FENCE = add("mossy_chiseled_andesite_brick_fence", new FenceBlock(MOSSY_CHISELED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CHISELED_ANDESITE_BRICK_SLAB = add("mossy_chiseled_andesite_brick_slab", new SlabBlock(MOSSY_CHISELED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CHISELED_ANDESITE_BRICK_STAIRS = add("mossy_chiseled_andesite_brick_stairs", new StairsBlock(MOSSY_CHISELED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_CHISELED_ANDESITE_BRICKS = add("mossy_cracked_chiseled_andesite_bricks", new Block(FabricBlockSettings.copy(ANDESITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_CHISELED_ANDESITE_BRICK_WALL = add("mossy_cracked_chiseled_andesite_brick_wall", new WallBlock(MOSSY_CRACKED_CHISELED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_CHISELED_ANDESITE_BRICK_FENCE = add("mossy_cracked_chiseled_andesite_brick_fence", new FenceBlock(MOSSY_CRACKED_CHISELED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_CHISELED_ANDESITE_BRICK_SLAB = add("mossy_cracked_chiseled_andesite_brick_slab", new SlabBlock(MOSSY_CRACKED_CHISELED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_CHISELED_ANDESITE_BRICK_STAIRS = add("mossy_cracked_chiseled_andesite_brick_stairs", new StairsBlock(MOSSY_CRACKED_CHISELED_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
        // POLISHED or SMOOTH
            // NORMAL
                public static final Block POLISHED_ANDESITE_FENCE = add("polished_andesite_fence", new FenceBlock(Blocks.POLISHED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_POLISHED_ANDESITE = add("cracked_polished_andesite", new Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_POLISHED_ANDESITE_WALL = add("cracked_polished_andesite_wall", new WallBlock(CRACKED_POLISHED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_POLISHED_ANDESITE_FENCE = add("cracked_polished_andesite_fence", new FenceBlock(CRACKED_POLISHED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_POLISHED_ANDESITE_SLAB = add("cracked_polished_andesite_slab", new SlabBlock(CRACKED_POLISHED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_POLISHED_ANDESITE_STAIRS = add("cracked_polished_andesite_stairs", new StairsBlock(CRACKED_POLISHED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_POLISHED_ANDESITE = add("mossy_polished_andesite", new Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_POLISHED_ANDESITE_WALL = add("mossy_polished_andesite_wall", new WallBlock(MOSSY_POLISHED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_POLISHED_ANDESITE_FENCE = add("mossy_polished_andesite_fence", new FenceBlock(MOSSY_POLISHED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_POLISHED_ANDESITE_SLAB = add("mossy_polished_andesite_slab", new SlabBlock(MOSSY_POLISHED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_POLISHED_ANDESITE_STAIRS = add("mossy_polished_andesite_stairs", new StairsBlock(MOSSY_POLISHED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_POLISHED_ANDESITE = add("mossy_cracked_polished_andesite", new Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_POLISHED_ANDESITE_WALL = add("mossy_cracked_polished_andesite_wall", new WallBlock(MOSSY_CRACKED_POLISHED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_POLISHED_ANDESITE_FENCE = add("mossy_cracked_polished_andesite_fence", new FenceBlock(MOSSY_CRACKED_POLISHED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_POLISHED_ANDESITE_SLAB = add("mossy_cracked_polished_andesite_slab", new SlabBlock(MOSSY_CRACKED_POLISHED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_POLISHED_ANDESITE_STAIRS = add("mossy_cracked_polished_andesite_stairs", new StairsBlock(MOSSY_CRACKED_POLISHED_ANDESITE), ItemGroup.BUILDING_BLOCKS);
        // SMALL BRICKS
            // NORMAL
                public static final Block SMALL_ANDESITE_BRICKS = add("small_andesite_bricks", new Block(FabricBlockSettings.copy(Blocks.ANDESITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block SMALL_ANDESITE_BRICK_WALL = add("small_andesite_brick_wall", new WallBlock(SMALL_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block SMALL_ANDESITE_BRICK_FENCE = add("small_andesite_brick_fence", new FenceBlock(SMALL_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block SMALL_ANDESITE_BRICK_SLAB = add("small_andesite_brick_slab", new SlabBlock(SMALL_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block SMALL_ANDESITE_BRICK_STAIRS = add("small_andesite_brick_stairs", new StairsBlock(SMALL_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_SMALL_ANDESITE_BRICKS = add("cracked_small_andesite_bricks", new Block(FabricBlockSettings.copy(ANDESITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMALL_ANDESITE_BRICK_WALL = add("cracked_small_andesite_brick_wall", new WallBlock(CRACKED_SMALL_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMALL_ANDESITE_BRICK_FENCE = add("cracked_small_andesite_brick_fence", new FenceBlock(CRACKED_SMALL_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMALL_ANDESITE_BRICK_SLAB = add("cracked_small_andesite_brick_slab", new SlabBlock(CRACKED_SMALL_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMALL_ANDESITE_BRICK_STAIRS = add("cracked_small_andesite_brick_stairs", new StairsBlock(CRACKED_SMALL_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_SMALL_ANDESITE_BRICKS = add("mossy_small_andesite_bricks", new Block(FabricBlockSettings.copy(ANDESITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMALL_ANDESITE_BRICK_WALL = add("mossy_small_andesite_brick_wall", new WallBlock(MOSSY_SMALL_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMALL_ANDESITE_BRICK_FENCE = add("mossy_small_andesite_brick_fence", new FenceBlock(MOSSY_SMALL_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMALL_ANDESITE_BRICK_SLAB = add("mossy_small_andesite_brick_slab", new SlabBlock(MOSSY_SMALL_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMALL_ANDESITE_BRICK_STAIRS = add("mossy_small_andesite_brick_stairs", new StairsBlock(MOSSY_SMALL_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_SMALL_ANDESITE_BRICKS = add("mossy_cracked_small_andesite_bricks", new Block(FabricBlockSettings.copy(ANDESITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMALL_ANDESITE_BRICK_WALL = add("mossy_cracked_small_andesite_brick_wall", new WallBlock(MOSSY_CRACKED_SMALL_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMALL_ANDESITE_BRICK_FENCE = add("mossy_cracked_small_andesite_brick_fence", new FenceBlock(MOSSY_CRACKED_SMALL_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMALL_ANDESITE_BRICK_SLAB = add("mossy_cracked_small_andesite_brick_slab", new SlabBlock(MOSSY_CRACKED_SMALL_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMALL_ANDESITE_BRICK_STAIRS = add("mossy_cracked_small_andesite_brick_stairs", new StairsBlock(MOSSY_CRACKED_SMALL_ANDESITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
        // PILLAR
            // NORMAL
                public static final Block ANDESITE_PILLAR = add("andesite_pillar", new PillarBlock(FabricBlockSettings.copy(Blocks.ANDESITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block ANDESITE_PILLAR_WALL = add("andesite_pillar_wall", new WallBlock(ANDESITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block ANDESITE_PILLAR_FENCE = add("andesite_pillar_fence", new FenceBlock(ANDESITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block ANDESITE_PILLAR_SLAB = add("andesite_pillar_slab", new SlabBlock(ANDESITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block ANDESITE_PILLAR_STAIRS = add("andesite_pillar_stairs", new StairsBlock(ANDESITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_ANDESITE_PILLAR = add("cracked_andesite_pillar", new PillarBlock(FabricBlockSettings.copy(ANDESITE_PILLAR).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_ANDESITE_PILLAR_WALL = add("cracked_andesite_pillar_wall", new WallBlock(CRACKED_ANDESITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_ANDESITE_PILLAR_FENCE = add("cracked_andesite_pillar_fence", new FenceBlock(CRACKED_ANDESITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_ANDESITE_PILLAR_SLAB = add("cracked_andesite_pillar_slab", new SlabBlock(CRACKED_ANDESITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_ANDESITE_PILLAR_STAIRS = add("cracked_andesite_pillar_stairs", new StairsBlock(CRACKED_ANDESITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_ANDESITE_PILLAR = add("mossy_andesite_pillar", new PillarBlock(FabricBlockSettings.copy(ANDESITE_PILLAR).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_ANDESITE_PILLAR_WALL = add("mossy_andesite_pillar_wall", new WallBlock(MOSSY_ANDESITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_ANDESITE_PILLAR_FENCE = add("mossy_andesite_pillar_fence", new FenceBlock(MOSSY_ANDESITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_ANDESITE_PILLAR_SLAB = add("mossy_andesite_pillar_slab", new SlabBlock(MOSSY_ANDESITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_ANDESITE_PILLAR_STAIRS = add("mossy_andesite_pillar_stairs", new StairsBlock(MOSSY_ANDESITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_ANDESITE_PILLAR = add("mossy_cracked_andesite_pillar", new PillarBlock(FabricBlockSettings.copy(ANDESITE_PILLAR).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_ANDESITE_PILLAR_WALL = add("mossy_cracked_andesite_pillar_wall", new WallBlock(MOSSY_CRACKED_ANDESITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_ANDESITE_PILLAR_FENCE = add("mossy_cracked_andesite_pillar_fence", new FenceBlock(MOSSY_CRACKED_ANDESITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_ANDESITE_PILLAR_SLAB = add("mossy_cracked_andesite_pillar_slab", new SlabBlock(MOSSY_CRACKED_ANDESITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_ANDESITE_PILLAR_STAIRS = add("mossy_cracked_andesite_pillar_stairs", new StairsBlock(MOSSY_CRACKED_ANDESITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
    // DIORITE
        // BASE
            // NORMAL
                public static final Block DIORITE_FENCE = add("diorite_fence", new FenceBlock(Blocks.DIORITE), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block COBBLED_DIORITE = add("cobbled_diorite", new Block(FabricBlockSettings.copy(Blocks.DIORITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block COBBLED_DIORITE_WALL = add("cobbled_diorite_wall", new WallBlock(COBBLED_DIORITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block COBBLED_DIORITE_FENCE = add("cobbled_diorite_fence", new FenceBlock(COBBLED_DIORITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block COBBLED_DIORITE_SLAB = add("cobbled_diorite_slab", new SlabBlock(COBBLED_DIORITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block COBBLED_DIORITE_STAIRS = add("cobbled_diorite_stairs", new StairsBlock(COBBLED_DIORITE), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_DIORITE = add("mossy_diorite", new Block(FabricBlockSettings.copy(Blocks.DIORITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_DIORITE_WALL = add("mossy_diorite_wall", new WallBlock(MOSSY_DIORITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_DIORITE_FENCE = add("mossy_diorite_fence", new FenceBlock(MOSSY_DIORITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_DIORITE_SLAB = add("mossy_diorite_slab", new SlabBlock(MOSSY_DIORITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_DIORITE_STAIRS = add("mossy_diorite_stairs", new StairsBlock(MOSSY_DIORITE), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_COBBLED_DIORITE = add("mossy_cobbled_diorite", new Block(FabricBlockSettings.copy(Blocks.DIORITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_COBBLED_DIORITE_WALL = add("mossy_cobbled_diorite_wall", new WallBlock(MOSSY_COBBLED_DIORITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_COBBLED_DIORITE_FENCE = add("mossy_cobbled_diorite_fence", new FenceBlock(MOSSY_COBBLED_DIORITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_COBBLED_DIORITE_SLAB = add("mossy_cobbled_diorite_slab", new SlabBlock(MOSSY_COBBLED_DIORITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_COBBLED_DIORITE_STAIRS = add("mossy_cobbled_diorite_stairs", new StairsBlock(MOSSY_COBBLED_DIORITE), ItemGroup.BUILDING_BLOCKS);
        // BRICKS
            // NORMAL
                public static final Block DIORITE_BRICKS = add("diorite_bricks", new Block(FabricBlockSettings.copy(Blocks.DIORITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block DIORITE_BRICK_WALL = add("diorite_brick_wall", new WallBlock(DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block DIORITE_BRICK_FENCE = add("diorite_brick_fence", new FenceBlock(DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block DIORITE_BRICK_SLAB = add("diorite_brick_slab", new SlabBlock(DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block DIORITE_BRICK_STAIRS = add("diorite_brick_stairs", new StairsBlock(DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_DIORITE_BRICKS = add("cracked_diorite_bricks", new Block(FabricBlockSettings.copy(DIORITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_DIORITE_BRICK_WALL = add("cracked_diorite_brick_wall", new WallBlock(CRACKED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_DIORITE_BRICK_FENCE = add("cracked_diorite_brick_fence", new FenceBlock(CRACKED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_DIORITE_BRICK_SLAB = add("cracked_diorite_brick_slab", new SlabBlock(CRACKED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_DIORITE_BRICK_STAIRS = add("cracked_diorite_brick_stairs", new StairsBlock(CRACKED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_DIORITE_BRICKS = add("mossy_diorite_bricks", new Block(FabricBlockSettings.copy(DIORITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_DIORITE_BRICK_WALL = add("mossy_diorite_brick_wall", new WallBlock(MOSSY_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_DIORITE_BRICK_FENCE = add("mossy_diorite_brick_fence", new FenceBlock(MOSSY_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_DIORITE_BRICK_SLAB = add("mossy_diorite_brick_slab", new SlabBlock(MOSSY_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_DIORITE_BRICK_STAIRS = add("mossy_diorite_brick_stairs", new StairsBlock(MOSSY_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_DIORITE_BRICKS = add("mossy_cracked_diorite_bricks", new Block(FabricBlockSettings.copy(DIORITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_DIORITE_BRICK_WALL = add("mossy_cracked_diorite_brick_wall", new WallBlock(MOSSY_CRACKED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_DIORITE_BRICK_FENCE = add("mossy_cracked_diorite_brick_fence", new FenceBlock(MOSSY_CRACKED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_DIORITE_BRICK_SLAB = add("mossy_cracked_diorite_brick_slab", new SlabBlock(MOSSY_CRACKED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_DIORITE_BRICK_STAIRS = add("mossy_cracked_diorite_brick_stairs", new StairsBlock(MOSSY_CRACKED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
        // CHISELED BRICKS
            // NORMAL
                public static final Block CHISELED_DIORITE_BRICKS = add("chiseled_diorite_bricks", new Block(FabricBlockSettings.copy(Blocks.DIORITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CHISELED_DIORITE_BRICK_WALL = add("chiseled_diorite_brick_wall", new WallBlock(CHISELED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CHISELED_DIORITE_BRICK_FENCE = add("chiseled_diorite_brick_fence", new FenceBlock(CHISELED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CHISELED_DIORITE_BRICK_SLAB = add("chiseled_diorite_brick_slab", new SlabBlock(CHISELED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CHISELED_DIORITE_BRICK_STAIRS = add("chiseled_diorite_brick_stairs", new StairsBlock(CHISELED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_CHISELED_DIORITE_BRICKS = add("cracked_chiseled_diorite_bricks", new Block(FabricBlockSettings.copy(DIORITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_CHISELED_DIORITE_BRICK_WALL = add("cracked_chiseled_diorite_brick_wall", new WallBlock(CRACKED_CHISELED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_CHISELED_DIORITE_BRICK_FENCE = add("cracked_chiseled_diorite_brick_fence", new FenceBlock(CRACKED_CHISELED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_CHISELED_DIORITE_BRICK_SLAB = add("cracked_chiseled_diorite_brick_slab", new SlabBlock(CRACKED_CHISELED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_CHISELED_DIORITE_BRICK_STAIRS = add("cracked_chiseled_diorite_brick_stairs", new StairsBlock(CRACKED_CHISELED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_CHISELED_DIORITE_BRICKS = add("mossy_chiseled_diorite_bricks", new Block(FabricBlockSettings.copy(DIORITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CHISELED_DIORITE_BRICK_WALL = add("mossy_chiseled_diorite_brick_wall", new WallBlock(MOSSY_CHISELED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CHISELED_DIORITE_BRICK_FENCE = add("mossy_chiseled_diorite_brick_fence", new FenceBlock(MOSSY_CHISELED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CHISELED_DIORITE_BRICK_SLAB = add("mossy_chiseled_diorite_brick_slab", new SlabBlock(MOSSY_CHISELED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CHISELED_DIORITE_BRICK_STAIRS = add("mossy_chiseled_diorite_brick_stairs", new StairsBlock(MOSSY_CHISELED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_CHISELED_DIORITE_BRICKS = add("mossy_cracked_chiseled_diorite_bricks", new Block(FabricBlockSettings.copy(DIORITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_CHISELED_DIORITE_BRICK_WALL = add("mossy_cracked_chiseled_diorite_brick_wall", new WallBlock(MOSSY_CRACKED_CHISELED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_CHISELED_DIORITE_BRICK_FENCE = add("mossy_cracked_chiseled_diorite_brick_fence", new FenceBlock(MOSSY_CRACKED_CHISELED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_CHISELED_DIORITE_BRICK_SLAB = add("mossy_cracked_chiseled_diorite_brick_slab", new SlabBlock(MOSSY_CRACKED_CHISELED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_CHISELED_DIORITE_BRICK_STAIRS = add("mossy_cracked_chiseled_diorite_brick_stairs", new StairsBlock(MOSSY_CRACKED_CHISELED_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
        // POLISHED or SMOOTH
            // NORMAL
                public static final Block POLISHED_DIORITE_FENCE = add("polished_diorite_fence", new FenceBlock(Blocks.POLISHED_DIORITE), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_POLISHED_DIORITE = add("cracked_polished_diorite", new Block(FabricBlockSettings.copy(Blocks.POLISHED_DIORITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_POLISHED_DIORITE_WALL = add("cracked_polished_diorite_wall", new WallBlock(CRACKED_POLISHED_DIORITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_POLISHED_DIORITE_FENCE = add("cracked_polished_diorite_fence", new FenceBlock(CRACKED_POLISHED_DIORITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_POLISHED_DIORITE_SLAB = add("cracked_polished_diorite_slab", new SlabBlock(CRACKED_POLISHED_DIORITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_POLISHED_DIORITE_STAIRS = add("cracked_polished_diorite_stairs", new StairsBlock(CRACKED_POLISHED_DIORITE), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_POLISHED_DIORITE = add("mossy_polished_diorite", new Block(FabricBlockSettings.copy(Blocks.POLISHED_DIORITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_POLISHED_DIORITE_WALL = add("mossy_polished_diorite_wall", new WallBlock(MOSSY_POLISHED_DIORITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_POLISHED_DIORITE_FENCE = add("mossy_polished_diorite_fence", new FenceBlock(MOSSY_POLISHED_DIORITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_POLISHED_DIORITE_SLAB = add("mossy_polished_diorite_slab", new SlabBlock(MOSSY_POLISHED_DIORITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_POLISHED_DIORITE_STAIRS = add("mossy_polished_diorite_stairs", new StairsBlock(MOSSY_POLISHED_DIORITE), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_POLISHED_DIORITE = add("mossy_cracked_polished_diorite", new Block(FabricBlockSettings.copy(Blocks.POLISHED_DIORITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_POLISHED_DIORITE_WALL = add("mossy_cracked_polished_diorite_wall", new WallBlock(MOSSY_CRACKED_POLISHED_DIORITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_POLISHED_DIORITE_FENCE = add("mossy_cracked_polished_diorite_fence", new FenceBlock(MOSSY_CRACKED_POLISHED_DIORITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_POLISHED_DIORITE_SLAB = add("mossy_cracked_polished_diorite_slab", new SlabBlock(MOSSY_CRACKED_POLISHED_DIORITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_POLISHED_DIORITE_STAIRS = add("mossy_cracked_polished_diorite_stairs", new StairsBlock(MOSSY_CRACKED_POLISHED_DIORITE), ItemGroup.BUILDING_BLOCKS);
        // SMALL BRICKS
            // NORMAL
                public static final Block SMALL_DIORITE_BRICKS = add("small_diorite_bricks", new Block(FabricBlockSettings.copy(Blocks.DIORITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block SMALL_DIORITE_BRICK_WALL = add("small_diorite_brick_wall", new WallBlock(SMALL_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block SMALL_DIORITE_BRICK_FENCE = add("small_diorite_brick_fence", new FenceBlock(SMALL_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block SMALL_DIORITE_BRICK_SLAB = add("small_diorite_brick_slab", new SlabBlock(SMALL_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block SMALL_DIORITE_BRICK_STAIRS = add("small_diorite_brick_stairs", new StairsBlock(SMALL_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_SMALL_DIORITE_BRICKS = add("cracked_small_diorite_bricks", new Block(FabricBlockSettings.copy(DIORITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMALL_DIORITE_BRICK_WALL = add("cracked_small_diorite_brick_wall", new WallBlock(CRACKED_SMALL_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMALL_DIORITE_BRICK_FENCE = add("cracked_small_diorite_brick_fence", new FenceBlock(CRACKED_SMALL_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMALL_DIORITE_BRICK_SLAB = add("cracked_small_diorite_brick_slab", new SlabBlock(CRACKED_SMALL_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMALL_DIORITE_BRICK_STAIRS = add("cracked_small_diorite_brick_stairs", new StairsBlock(CRACKED_SMALL_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_SMALL_DIORITE_BRICKS = add("mossy_small_diorite_bricks", new Block(FabricBlockSettings.copy(DIORITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMALL_DIORITE_BRICK_WALL = add("mossy_small_diorite_brick_wall", new WallBlock(MOSSY_SMALL_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMALL_DIORITE_BRICK_FENCE = add("mossy_small_diorite_brick_fence", new FenceBlock(MOSSY_SMALL_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMALL_DIORITE_BRICK_SLAB = add("mossy_small_diorite_brick_slab", new SlabBlock(MOSSY_SMALL_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMALL_DIORITE_BRICK_STAIRS = add("mossy_small_diorite_brick_stairs", new StairsBlock(MOSSY_SMALL_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_SMALL_DIORITE_BRICKS = add("mossy_cracked_small_diorite_bricks", new Block(FabricBlockSettings.copy(DIORITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMALL_DIORITE_BRICK_WALL = add("mossy_cracked_small_diorite_brick_wall", new WallBlock(MOSSY_CRACKED_SMALL_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMALL_DIORITE_BRICK_FENCE = add("mossy_cracked_small_diorite_brick_fence", new FenceBlock(MOSSY_CRACKED_SMALL_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMALL_DIORITE_BRICK_SLAB = add("mossy_cracked_small_diorite_brick_slab", new SlabBlock(MOSSY_CRACKED_SMALL_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMALL_DIORITE_BRICK_STAIRS = add("mossy_cracked_small_diorite_brick_stairs", new StairsBlock(MOSSY_CRACKED_SMALL_DIORITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
        // PILLAR
            // NORMAL
                public static final Block DIORITE_PILLAR = add("diorite_pillar", new PillarBlock(FabricBlockSettings.copy(Blocks.DIORITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block DIORITE_PILLAR_WALL = add("diorite_pillar_wall", new WallBlock(DIORITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block DIORITE_PILLAR_FENCE = add("diorite_pillar_fence", new FenceBlock(DIORITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block DIORITE_PILLAR_SLAB = add("diorite_pillar_slab", new SlabBlock(DIORITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block DIORITE_PILLAR_STAIRS = add("diorite_pillar_stairs", new StairsBlock(DIORITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_DIORITE_PILLAR = add("cracked_diorite_pillar", new PillarBlock(FabricBlockSettings.copy(DIORITE_PILLAR).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_DIORITE_PILLAR_WALL = add("cracked_diorite_pillar_wall", new WallBlock(CRACKED_DIORITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_DIORITE_PILLAR_FENCE = add("cracked_diorite_pillar_fence", new FenceBlock(CRACKED_DIORITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_DIORITE_PILLAR_SLAB = add("cracked_diorite_pillar_slab", new SlabBlock(CRACKED_DIORITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_DIORITE_PILLAR_STAIRS = add("cracked_diorite_pillar_stairs", new StairsBlock(CRACKED_DIORITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_DIORITE_PILLAR = add("mossy_diorite_pillar", new PillarBlock(FabricBlockSettings.copy(DIORITE_PILLAR).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_DIORITE_PILLAR_WALL = add("mossy_diorite_pillar_wall", new WallBlock(MOSSY_DIORITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_DIORITE_PILLAR_FENCE = add("mossy_diorite_pillar_fence", new FenceBlock(MOSSY_DIORITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_DIORITE_PILLAR_SLAB = add("mossy_diorite_pillar_slab", new SlabBlock(MOSSY_DIORITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_DIORITE_PILLAR_STAIRS = add("mossy_diorite_pillar_stairs", new StairsBlock(MOSSY_DIORITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_DIORITE_PILLAR = add("mossy_cracked_diorite_pillar", new PillarBlock(FabricBlockSettings.copy(DIORITE_PILLAR).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_DIORITE_PILLAR_WALL = add("mossy_cracked_diorite_pillar_wall", new WallBlock(MOSSY_CRACKED_DIORITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_DIORITE_PILLAR_FENCE = add("mossy_cracked_diorite_pillar_fence", new FenceBlock(MOSSY_CRACKED_DIORITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_DIORITE_PILLAR_SLAB = add("mossy_cracked_diorite_pillar_slab", new SlabBlock(MOSSY_CRACKED_DIORITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_DIORITE_PILLAR_STAIRS = add("mossy_cracked_diorite_pillar_stairs", new StairsBlock(MOSSY_CRACKED_DIORITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
    // GRANITE
        // BASE
            // NORMAL
                public static final Block GRANITE_FENCE = add("granite_fence", new FenceBlock(Blocks.GRANITE), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block COBBLED_GRANITE = add("cobbled_granite", new Block(FabricBlockSettings.copy(Blocks.GRANITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block COBBLED_GRANITE_WALL = add("cobbled_granite_wall", new WallBlock(COBBLED_GRANITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block COBBLED_GRANITE_FENCE = add("cobbled_granite_fence", new FenceBlock(COBBLED_GRANITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block COBBLED_GRANITE_SLAB = add("cobbled_granite_slab", new SlabBlock(COBBLED_GRANITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block COBBLED_GRANITE_STAIRS = add("cobbled_granite_stairs", new StairsBlock(COBBLED_GRANITE), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_GRANITE = add("mossy_granite", new Block(FabricBlockSettings.copy(Blocks.GRANITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_GRANITE_WALL = add("mossy_granite_wall", new WallBlock(MOSSY_GRANITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_GRANITE_FENCE = add("mossy_granite_fence", new FenceBlock(MOSSY_GRANITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_GRANITE_SLAB = add("mossy_granite_slab", new SlabBlock(MOSSY_GRANITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_GRANITE_STAIRS = add("mossy_granite_stairs", new StairsBlock(MOSSY_GRANITE), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_COBBLED_GRANITE = add("mossy_cobbled_granite", new Block(FabricBlockSettings.copy(Blocks.GRANITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_COBBLED_GRANITE_WALL = add("mossy_cobbled_granite_wall", new WallBlock(MOSSY_COBBLED_GRANITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_COBBLED_GRANITE_FENCE = add("mossy_cobbled_granite_fence", new FenceBlock(MOSSY_COBBLED_GRANITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_COBBLED_GRANITE_SLAB = add("mossy_cobbled_granite_slab", new SlabBlock(MOSSY_COBBLED_GRANITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_COBBLED_GRANITE_STAIRS = add("mossy_cobbled_granite_stairs", new StairsBlock(MOSSY_COBBLED_GRANITE), ItemGroup.BUILDING_BLOCKS);
        // BRICKS
            // NORMAL
                public static final Block GRANITE_BRICKS = add("granite_bricks", new Block(FabricBlockSettings.copy(Blocks.GRANITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block GRANITE_BRICK_WALL = add("granite_brick_wall", new WallBlock(GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block GRANITE_BRICK_FENCE = add("granite_brick_fence", new FenceBlock(GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block GRANITE_BRICK_SLAB = add("granite_brick_slab", new SlabBlock(GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block GRANITE_BRICK_STAIRS = add("granite_brick_stairs", new StairsBlock(GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_GRANITE_BRICKS = add("cracked_granite_bricks", new Block(FabricBlockSettings.copy(GRANITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_GRANITE_BRICK_WALL = add("cracked_granite_brick_wall", new WallBlock(CRACKED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_GRANITE_BRICK_FENCE = add("cracked_granite_brick_fence", new FenceBlock(CRACKED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_GRANITE_BRICK_SLAB = add("cracked_granite_brick_slab", new SlabBlock(CRACKED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_GRANITE_BRICK_STAIRS = add("cracked_granite_brick_stairs", new StairsBlock(CRACKED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_GRANITE_BRICKS = add("mossy_granite_bricks", new Block(FabricBlockSettings.copy(GRANITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_GRANITE_BRICK_WALL = add("mossy_granite_brick_wall", new WallBlock(MOSSY_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_GRANITE_BRICK_FENCE = add("mossy_granite_brick_fence", new FenceBlock(MOSSY_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_GRANITE_BRICK_SLAB = add("mossy_granite_brick_slab", new SlabBlock(MOSSY_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_GRANITE_BRICK_STAIRS = add("mossy_granite_brick_stairs", new StairsBlock(MOSSY_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_GRANITE_BRICKS = add("mossy_cracked_granite_bricks", new Block(FabricBlockSettings.copy(GRANITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_GRANITE_BRICK_WALL = add("mossy_cracked_granite_brick_wall", new WallBlock(MOSSY_CRACKED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_GRANITE_BRICK_FENCE = add("mossy_cracked_granite_brick_fence", new FenceBlock(MOSSY_CRACKED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_GRANITE_BRICK_SLAB = add("mossy_cracked_granite_brick_slab", new SlabBlock(MOSSY_CRACKED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_GRANITE_BRICK_STAIRS = add("mossy_cracked_granite_brick_stairs", new StairsBlock(MOSSY_CRACKED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
        // CHISELED BRICKS
            // NORMAL
                public static final Block CHISELED_GRANITE_BRICKS = add("chiseled_granite_bricks", new Block(FabricBlockSettings.copy(Blocks.GRANITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CHISELED_GRANITE_BRICK_WALL = add("chiseled_granite_brick_wall", new WallBlock(CHISELED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CHISELED_GRANITE_BRICK_FENCE = add("chiseled_granite_brick_fence", new FenceBlock(CHISELED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CHISELED_GRANITE_BRICK_SLAB = add("chiseled_granite_brick_slab", new SlabBlock(CHISELED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CHISELED_GRANITE_BRICK_STAIRS = add("chiseled_granite_brick_stairs", new StairsBlock(CHISELED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_CHISELED_GRANITE_BRICKS = add("cracked_chiseled_granite_bricks", new Block(FabricBlockSettings.copy(GRANITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_CHISELED_GRANITE_BRICK_WALL = add("cracked_chiseled_granite_brick_wall", new WallBlock(CRACKED_CHISELED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_CHISELED_GRANITE_BRICK_FENCE = add("cracked_chiseled_granite_brick_fence", new FenceBlock(CRACKED_CHISELED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_CHISELED_GRANITE_BRICK_SLAB = add("cracked_chiseled_granite_brick_slab", new SlabBlock(CRACKED_CHISELED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_CHISELED_GRANITE_BRICK_STAIRS = add("cracked_chiseled_granite_brick_stairs", new StairsBlock(CRACKED_CHISELED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_CHISELED_GRANITE_BRICKS = add("mossy_chiseled_granite_bricks", new Block(FabricBlockSettings.copy(GRANITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CHISELED_GRANITE_BRICK_WALL = add("mossy_chiseled_granite_brick_wall", new WallBlock(MOSSY_CHISELED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CHISELED_GRANITE_BRICK_FENCE = add("mossy_chiseled_granite_brick_fence", new FenceBlock(MOSSY_CHISELED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CHISELED_GRANITE_BRICK_SLAB = add("mossy_chiseled_granite_brick_slab", new SlabBlock(MOSSY_CHISELED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CHISELED_GRANITE_BRICK_STAIRS = add("mossy_chiseled_granite_brick_stairs", new StairsBlock(MOSSY_CHISELED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_CHISELED_GRANITE_BRICKS = add("mossy_cracked_chiseled_granite_bricks", new Block(FabricBlockSettings.copy(GRANITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_CHISELED_GRANITE_BRICK_WALL = add("mossy_cracked_chiseled_granite_brick_wall", new WallBlock(MOSSY_CRACKED_CHISELED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_CHISELED_GRANITE_BRICK_FENCE = add("mossy_cracked_chiseled_granite_brick_fence", new FenceBlock(MOSSY_CRACKED_CHISELED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_CHISELED_GRANITE_BRICK_SLAB = add("mossy_cracked_chiseled_granite_brick_slab", new SlabBlock(MOSSY_CRACKED_CHISELED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_CHISELED_GRANITE_BRICK_STAIRS = add("mossy_cracked_chiseled_granite_brick_stairs", new StairsBlock(MOSSY_CRACKED_CHISELED_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
        // POLISHED or SMOOTH
            // NORMAL
                public static final Block POLISHED_GRANITE_FENCE = add("polished_granite_fence", new FenceBlock(Blocks.POLISHED_GRANITE), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_POLISHED_GRANITE = add("cracked_polished_granite", new Block(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_POLISHED_GRANITE_WALL = add("cracked_polished_granite_wall", new WallBlock(CRACKED_POLISHED_GRANITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_POLISHED_GRANITE_FENCE = add("cracked_polished_granite_fence", new FenceBlock(CRACKED_POLISHED_GRANITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_POLISHED_GRANITE_SLAB = add("cracked_polished_granite_slab", new SlabBlock(CRACKED_POLISHED_GRANITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_POLISHED_GRANITE_STAIRS = add("cracked_polished_granite_stairs", new StairsBlock(CRACKED_POLISHED_GRANITE), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_POLISHED_GRANITE = add("mossy_polished_granite", new Block(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_POLISHED_GRANITE_WALL = add("mossy_polished_granite_wall", new WallBlock(MOSSY_POLISHED_GRANITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_POLISHED_GRANITE_FENCE = add("mossy_polished_granite_fence", new FenceBlock(MOSSY_POLISHED_GRANITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_POLISHED_GRANITE_SLAB = add("mossy_polished_granite_slab", new SlabBlock(MOSSY_POLISHED_GRANITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_POLISHED_GRANITE_STAIRS = add("mossy_polished_granite_stairs", new StairsBlock(MOSSY_POLISHED_GRANITE), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_POLISHED_GRANITE = add("mossy_cracked_polished_granite", new Block(FabricBlockSettings.copy(Blocks.POLISHED_GRANITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_POLISHED_GRANITE_WALL = add("mossy_cracked_polished_granite_wall", new WallBlock(MOSSY_CRACKED_POLISHED_GRANITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_POLISHED_GRANITE_FENCE = add("mossy_cracked_polished_granite_fence", new FenceBlock(MOSSY_CRACKED_POLISHED_GRANITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_POLISHED_GRANITE_SLAB = add("mossy_cracked_polished_granite_slab", new SlabBlock(MOSSY_CRACKED_POLISHED_GRANITE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_POLISHED_GRANITE_STAIRS = add("mossy_cracked_polished_granite_stairs", new StairsBlock(MOSSY_CRACKED_POLISHED_GRANITE), ItemGroup.BUILDING_BLOCKS);
        // SMALL BRICKS
            // NORMAL
                public static final Block SMALL_GRANITE_BRICKS = add("small_granite_bricks", new Block(FabricBlockSettings.copy(Blocks.GRANITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block SMALL_GRANITE_BRICK_WALL = add("small_granite_brick_wall", new WallBlock(SMALL_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block SMALL_GRANITE_BRICK_FENCE = add("small_granite_brick_fence", new FenceBlock(SMALL_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block SMALL_GRANITE_BRICK_SLAB = add("small_granite_brick_slab", new SlabBlock(SMALL_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block SMALL_GRANITE_BRICK_STAIRS = add("small_granite_brick_stairs", new StairsBlock(SMALL_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_SMALL_GRANITE_BRICKS = add("cracked_small_granite_bricks", new Block(FabricBlockSettings.copy(GRANITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMALL_GRANITE_BRICK_WALL = add("cracked_small_granite_brick_wall", new WallBlock(CRACKED_SMALL_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMALL_GRANITE_BRICK_FENCE = add("cracked_small_granite_brick_fence", new FenceBlock(CRACKED_SMALL_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMALL_GRANITE_BRICK_SLAB = add("cracked_small_granite_brick_slab", new SlabBlock(CRACKED_SMALL_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMALL_GRANITE_BRICK_STAIRS = add("cracked_small_granite_brick_stairs", new StairsBlock(CRACKED_SMALL_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_SMALL_GRANITE_BRICKS = add("mossy_small_granite_bricks", new Block(FabricBlockSettings.copy(GRANITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMALL_GRANITE_BRICK_WALL = add("mossy_small_granite_brick_wall", new WallBlock(MOSSY_SMALL_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMALL_GRANITE_BRICK_FENCE = add("mossy_small_granite_brick_fence", new FenceBlock(MOSSY_SMALL_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMALL_GRANITE_BRICK_SLAB = add("mossy_small_granite_brick_slab", new SlabBlock(MOSSY_SMALL_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMALL_GRANITE_BRICK_STAIRS = add("mossy_small_granite_brick_stairs", new StairsBlock(MOSSY_SMALL_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_SMALL_GRANITE_BRICKS = add("mossy_cracked_small_granite_bricks", new Block(FabricBlockSettings.copy(GRANITE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMALL_GRANITE_BRICK_WALL = add("mossy_cracked_small_granite_brick_wall", new WallBlock(MOSSY_CRACKED_SMALL_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMALL_GRANITE_BRICK_FENCE = add("mossy_cracked_small_granite_brick_fence", new FenceBlock(MOSSY_CRACKED_SMALL_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMALL_GRANITE_BRICK_SLAB = add("mossy_cracked_small_granite_brick_slab", new SlabBlock(MOSSY_CRACKED_SMALL_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMALL_GRANITE_BRICK_STAIRS = add("mossy_cracked_small_granite_brick_stairs", new StairsBlock(MOSSY_CRACKED_SMALL_GRANITE_BRICKS), ItemGroup.BUILDING_BLOCKS);
        // PILLAR
            // NORMAL
                public static final Block GRANITE_PILLAR = add("granite_pillar", new PillarBlock(FabricBlockSettings.copy(Blocks.GRANITE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block GRANITE_PILLAR_WALL = add("granite_pillar_wall", new WallBlock(GRANITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block GRANITE_PILLAR_FENCE = add("granite_pillar_fence", new FenceBlock(GRANITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block GRANITE_PILLAR_SLAB = add("granite_pillar_slab", new SlabBlock(GRANITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block GRANITE_PILLAR_STAIRS = add("granite_pillar_stairs", new StairsBlock(GRANITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_GRANITE_PILLAR = add("cracked_granite_pillar", new PillarBlock(FabricBlockSettings.copy(GRANITE_PILLAR).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_GRANITE_PILLAR_WALL = add("cracked_granite_pillar_wall", new WallBlock(CRACKED_GRANITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_GRANITE_PILLAR_FENCE = add("cracked_granite_pillar_fence", new FenceBlock(CRACKED_GRANITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_GRANITE_PILLAR_SLAB = add("cracked_granite_pillar_slab", new SlabBlock(CRACKED_GRANITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_GRANITE_PILLAR_STAIRS = add("cracked_granite_pillar_stairs", new StairsBlock(CRACKED_GRANITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_GRANITE_PILLAR = add("mossy_granite_pillar", new PillarBlock(FabricBlockSettings.copy(GRANITE_PILLAR).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_GRANITE_PILLAR_WALL = add("mossy_granite_pillar_wall", new WallBlock(MOSSY_GRANITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_GRANITE_PILLAR_FENCE = add("mossy_granite_pillar_fence", new FenceBlock(MOSSY_GRANITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_GRANITE_PILLAR_SLAB = add("mossy_granite_pillar_slab", new SlabBlock(MOSSY_GRANITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_GRANITE_PILLAR_STAIRS = add("mossy_granite_pillar_stairs", new StairsBlock(MOSSY_GRANITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_GRANITE_PILLAR = add("mossy_cracked_granite_pillar", new PillarBlock(FabricBlockSettings.copy(GRANITE_PILLAR).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_GRANITE_PILLAR_WALL = add("mossy_cracked_granite_pillar_wall", new WallBlock(MOSSY_CRACKED_GRANITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_GRANITE_PILLAR_FENCE = add("mossy_cracked_granite_pillar_fence", new FenceBlock(MOSSY_CRACKED_GRANITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_GRANITE_PILLAR_SLAB = add("mossy_cracked_granite_pillar_slab", new SlabBlock(MOSSY_CRACKED_GRANITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_GRANITE_PILLAR_STAIRS = add("mossy_cracked_granite_pillar_stairs", new StairsBlock(MOSSY_CRACKED_GRANITE_PILLAR), ItemGroup.BUILDING_BLOCKS);
    // STONE
        // BASE
            // NORMAL
                public static final Block STONE_WALL = add("stone_wall", new WallBlock(Blocks.STONE), ItemGroup.BUILDING_BLOCKS);
                public static final Block STONE_FENCE = add("stone_fence", new FenceBlock(Blocks.STONE), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block COBBLESTONE_FENCE = add("cobblestone_fence", new FenceBlock(Blocks.COBBLESTONE), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_STONE = add("mossy_stone", new Block(FabricBlockSettings.copy(Blocks.STONE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_STONE_WALL = add("mossy_stone_wall", new WallBlock(MOSSY_STONE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_STONE_FENCE = add("mossy_stone_fence", new FenceBlock(MOSSY_STONE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_STONE_SLAB = add("mossy_stone_slab", new SlabBlock(MOSSY_STONE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_STONE_STAIRS = add("mossy_stone_stairs", new StairsBlock(MOSSY_STONE), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_COBBLESTONE_FENCE = add("mossy_cobblestone_fence", new FenceBlock(Blocks.MOSSY_COBBLESTONE), ItemGroup.BUILDING_BLOCKS);
        // BRICKS
            // NORMAL
                public static final Block STONE_BRICK_FENCE = add("stone_brick_fence", new FenceBlock(Blocks.STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_STONE_BRICK_WALL = add("cracked_stone_brick_wall", new WallBlock(Blocks.CRACKED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_STONE_BRICK_FENCE = add ("cracked_stone_brick_fence", new FenceBlock(Blocks.CRACKED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_STONE_BRICK_SLAB = add("cracked_stone_brick_slab", new SlabBlock(Blocks.CRACKED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_STONE_BRICK_STAIRS = add("cracked_stone_brick_stairs", new StairsBlock(Blocks.CRACKED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_STONE_BRICK_FENCE = add ("mossy_stone_brick_fence", new FenceBlock(Blocks.MOSSY_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_STONE_BRICKS = add("mossy_cracked_stone_bricks", new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS).build()));
                public static final Block MOSSY_CRACKED_STONE_BRICK_WALL = add("mossy_cracked_stone_brick_wall", new WallBlock(MOSSY_CRACKED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_STONE_BRICK_FENCE = add ("mossy_cracked_stone_brick_fence", new FenceBlock(MOSSY_CRACKED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_STONE_BRICK_SLAB = add("mossy_cracked_stone_brick_slab", new SlabBlock(MOSSY_CRACKED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_STONE_BRICK_STAIRS = add("mossy_cracked_stone_brick_stairs", new StairsBlock(MOSSY_CRACKED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
        // CHISELED BRICKS
            // NORMAL
                public static final Block CHISELED_STONE_BRICK_WALL = add("chiseled_stone_brick_wall", new WallBlock(Blocks.CHISELED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CHISELED_STONE_BRICK_FENCE = add("chiseled_stone_brick_fence", new FenceBlock(Blocks.CHISELED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CHISELED_STONE_BRICK_SLAB = add("chiseled_stone_brick_slab", new SlabBlock(Blocks.CHISELED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CHISELED_STONE_BRICK_STAIRS = add("chiseled_stone_brick_stairs", new StairsBlock(Blocks.CHISELED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_CHISELED_STONE_BRICKS = add("cracked_chiseled_stone_bricks", new Block(FabricBlockSettings.copy(Blocks.CHISELED_STONE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_CHISELED_STONE_BRICK_WALL = add("cracked_chiseled_stone_brick_wall", new WallBlock(CRACKED_CHISELED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_CHISELED_STONE_BRICK_FENCE = add("cracked_chiseled_stone_brick_fence", new FenceBlock(CRACKED_CHISELED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_CHISELED_STONE_BRICK_SLAB = add("cracked_chiseled_stone_brick_slab", new SlabBlock(CRACKED_CHISELED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_CHISELED_STONE_BRICK_STAIRS = add("cracked_chiseled_stone_brick_stairs", new StairsBlock(CRACKED_CHISELED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_CHISELED_STONE_BRICKS = add("mossy_chiseled_stone_bricks", new Block(FabricBlockSettings.copy(Blocks.CHISELED_STONE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CHISELED_STONE_BRICK_WALL = add("mossy_chiseled_stone_brick_wall", new WallBlock(MOSSY_CHISELED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CHISELED_STONE_BRICK_FENCE = add("mossy_chiseled_stone_brick_fence", new FenceBlock(MOSSY_CHISELED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CHISELED_STONE_BRICK_SLAB = add("mossy_chiseled_stone_brick_slab", new SlabBlock(MOSSY_CHISELED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CHISELED_STONE_BRICK_STAIRS = add("mossy_chiseled_stone_brick_stairs", new StairsBlock(MOSSY_CHISELED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_CHISELED_STONE_BRICKS = add("mossy_cracked_chiseled_stone_bricks", new Block(FabricBlockSettings.copy(Blocks.CHISELED_STONE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_CHISELED_STONE_BRICK_WALL = add("mossy_cracked_chiseled_stone_brick_wall", new WallBlock(MOSSY_CRACKED_CHISELED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_CHISELED_STONE_BRICK_FENCE = add("mossy_cracked_chiseled_stone_brick_fence", new FenceBlock(MOSSY_CRACKED_CHISELED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_CHISELED_STONE_BRICK_SLAB = add("mossy_cracked_chiseled_stone_brick_slab", new SlabBlock(MOSSY_CRACKED_CHISELED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_CHISELED_STONE_BRICK_STAIRS = add("mossy_cracked_chiseled_stone_brick_stairs", new StairsBlock(MOSSY_CRACKED_CHISELED_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
        // POLISHED or SMOOTH
            // NORMAL
                public static final Block SMOOTH_STONE_WALL = add("smooth_stone_wall", new WallBlock(Blocks.SMOOTH_STONE), ItemGroup.BUILDING_BLOCKS);
                public static final Block SMOOTH_STONE_FENCE = add("smooth_stone_fence", new FenceBlock(Blocks.SMOOTH_STONE), ItemGroup.BUILDING_BLOCKS);
                public static final Block SMOOTH_STONE_STAIRS = add("smooth_stone_stairs", new StairsBlock(Blocks.SMOOTH_STONE), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_SMOOTH_STONE = add("cracked_smooth_stone", new Block(FabricBlockSettings.copy(Blocks.SMOOTH_STONE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMOOTH_STONE_WALL = add("cracked_smooth_stone_wall", new WallBlock(CRACKED_SMOOTH_STONE), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMOOTH_STONE_FENCE = add("cracked_smooth_stone_fence", new FenceBlock(CRACKED_SMOOTH_STONE), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMOOTH_STONE_SLAB = add("cracked_smooth_stone_slab", new SlabBlock(CRACKED_SMOOTH_STONE), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMOOTH_STONE_STAIRS = add("cracked_smooth_stone_stairs", new StairsBlock(CRACKED_SMOOTH_STONE), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_SMOOTH_STONE = add("mossy_smooth_stone", new Block(FabricBlockSettings.copy(Blocks.SMOOTH_STONE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMOOTH_STONE_WALL = add("mossy_smooth_stone_wall", new WallBlock(MOSSY_SMOOTH_STONE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMOOTH_STONE_FENCE = add("mossy_smooth_stone_fence", new FenceBlock(MOSSY_SMOOTH_STONE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMOOTH_STONE_SLAB = add("mossy_smooth_stone_slab", new SlabBlock(MOSSY_SMOOTH_STONE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMOOTH_STONE_STAIRS = add("mossy_smooth_stone_stairs", new StairsBlock(MOSSY_SMOOTH_STONE), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_SMOOTH_STONE = add("mossy_cracked_smooth_stone", new Block(FabricBlockSettings.copy(Blocks.SMOOTH_STONE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMOOTH_STONE_WALL = add("mossy_cracked_smooth_stone_wall", new WallBlock(MOSSY_CRACKED_SMOOTH_STONE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMOOTH_STONE_FENCE = add("mossy_cracked_smooth_stone_fence", new FenceBlock(MOSSY_CRACKED_SMOOTH_STONE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMOOTH_STONE_SLAB = add("mossy_cracked_smooth_stone_slab", new SlabBlock(MOSSY_CRACKED_SMOOTH_STONE), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMOOTH_STONE_STAIRS = add("mossy_cracked_smooth_stone_stairs", new StairsBlock(MOSSY_CRACKED_SMOOTH_STONE), ItemGroup.BUILDING_BLOCKS);
        // SMALL BRICKS
            // NORMAL
                public static final Block SMALL_STONE_BRICKS = add("small_stone_bricks", new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block SMALL_STONE_BRICK_WALL = add("small_stone_brick_wall", new WallBlock(SMALL_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block SMALL_STONE_BRICK_FENCE = add("small_stone_brick_fence", new FenceBlock(SMALL_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block SMALL_STONE_BRICK_SLAB = add("small_stone_brick_slab", new SlabBlock(SMALL_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block SMALL_STONE_BRICK_STAIRS = add("small_stone_brick_stairs", new StairsBlock(SMALL_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_SMALL_STONE_BRICKS = add("cracked_small_stone_bricks", new Block(FabricBlockSettings.copy(SMALL_STONE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMALL_STONE_BRICK_WALL = add("cracked_small_stone_brick_wall", new WallBlock(CRACKED_SMALL_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMALL_STONE_BRICK_FENCE = add("cracked_small_stone_brick_fence", new FenceBlock(CRACKED_SMALL_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMALL_STONE_BRICK_SLAB = add("cracked_small_stone_brick_slab", new SlabBlock(CRACKED_SMALL_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_SMALL_STONE_BRICK_STAIRS = add("cracked_small_stone_brick_stairs", new StairsBlock(CRACKED_SMALL_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_SMALL_STONE_BRICKS = add("mossy_small_stone_bricks", new Block(FabricBlockSettings.copy(SMALL_STONE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMALL_STONE_BRICK_WALL = add("mossy_small_stone_brick_wall", new WallBlock(MOSSY_SMALL_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMALL_STONE_BRICK_FENCE = add("mossy_small_stone_brick_fence", new FenceBlock(MOSSY_SMALL_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMALL_STONE_BRICK_SLAB = add("mossy_small_stone_brick_slab", new SlabBlock(MOSSY_SMALL_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_SMALL_STONE_BRICK_STAIRS = add("mossy_small_stone_brick_stairs", new StairsBlock(MOSSY_SMALL_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_SMALL_STONE_BRICKS = add("mossy_cracked_small_stone_bricks", new Block(FabricBlockSettings.copy(SMALL_STONE_BRICKS).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMALL_STONE_BRICK_WALL = add("mossy_cracked_small_stone_brick_wall", new WallBlock(MOSSY_CRACKED_SMALL_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMALL_STONE_BRICK_FENCE = add("mossy_cracked_small_stone_brick_fence", new FenceBlock(MOSSY_CRACKED_SMALL_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMALL_STONE_BRICK_SLAB = add("mossy_cracked_small_stone_brick_slab", new SlabBlock(MOSSY_CRACKED_SMALL_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_SMALL_STONE_BRICK_STAIRS = add("mossy_cracked_small_stone_brick_stairs", new StairsBlock(MOSSY_CRACKED_SMALL_STONE_BRICKS), ItemGroup.BUILDING_BLOCKS);
        // PILLAR
            // NORMAL
                public static final Block STONE_PILLAR = add("stone_pillar", new PillarBlock(FabricBlockSettings.copy(Blocks.STONE).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block STONE_PILLAR_WALL = add("stone_pillar_wall", new WallBlock(STONE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block STONE_PILLAR_FENCE = add("stone_pillar_fence", new FenceBlock(STONE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block STONE_PILLAR_SLAB = add("stone_pillar_slab", new SlabBlock(STONE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block STONE_PILLAR_STAIRS = add("stone_pillar_stairs", new StairsBlock(STONE_PILLAR), ItemGroup.BUILDING_BLOCKS);
            // CRACKED
                public static final Block CRACKED_STONE_PILLAR = add("cracked_stone_pillar", new PillarBlock(FabricBlockSettings.copy(STONE_PILLAR).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_STONE_PILLAR_WALL = add("cracked_stone_pillar_wall", new WallBlock(CRACKED_STONE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_STONE_PILLAR_FENCE = add("cracked_stone_pillar_fence", new FenceBlock(CRACKED_STONE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_STONE_PILLAR_SLAB = add("cracked_stone_pillar_slab", new SlabBlock(CRACKED_STONE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block CRACKED_STONE_PILLAR_STAIRS = add("cracked_stone_pillar_stairs", new StairsBlock(CRACKED_STONE_PILLAR), ItemGroup.BUILDING_BLOCKS);
            // MOSSY
                public static final Block MOSSY_STONE_PILLAR = add("mossy_stone_pillar", new PillarBlock(FabricBlockSettings.copy(STONE_PILLAR).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_STONE_PILLAR_WALL = add("mossy_stone_pillar_wall", new WallBlock(MOSSY_STONE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_STONE_PILLAR_FENCE = add("mossy_stone_pillar_fence", new FenceBlock(MOSSY_STONE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_STONE_PILLAR_SLAB = add("mossy_stone_pillar_slab", new SlabBlock(MOSSY_STONE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_STONE_PILLAR_STAIRS = add("mossy_stone_pillar_stairs", new StairsBlock(MOSSY_STONE_PILLAR), ItemGroup.BUILDING_BLOCKS);
            // MOSSY and CRACKED
                public static final Block MOSSY_CRACKED_STONE_PILLAR = add("mossy_cracked_stone_pillar", new PillarBlock(FabricBlockSettings.copy(STONE_PILLAR).build()), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_STONE_PILLAR_WALL = add("mossy_cracked_stone_pillar_wall", new WallBlock(MOSSY_CRACKED_STONE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_STONE_PILLAR_FENCE = add("mossy_cracked_stone_pillar_fence", new FenceBlock(MOSSY_CRACKED_STONE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_STONE_PILLAR_SLAB = add("mossy_cracked_stone_pillar_slab", new SlabBlock(MOSSY_CRACKED_STONE_PILLAR), ItemGroup.BUILDING_BLOCKS);
                public static final Block MOSSY_CRACKED_STONE_PILLAR_STAIRS = add("mossy_cracked_stone_pillar_stairs", new StairsBlock(MOSSY_CRACKED_STONE_PILLAR), ItemGroup.BUILDING_BLOCKS);
    
    ///////////
    // BRICK //
    ///////////
        // BASE
        // BRICKS: N/A
            // TODO
        // CHISELED BRICKS: N/A
        // POLISHED or SMOOTH: N/A
        // SMALL BRICKS
            // ADDED BY VANILLA ITS THE DEFAULT BRICKS
        // HERRINGBONE BRICKS
    
    /*
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
    */

}
