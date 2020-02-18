package com.wtoll.buildersbounty.client;

import com.wtoll.buildersbounty.block.ModBlocks;
import com.wtoll.buildersbounty.item.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.item.Items;

@SuppressWarnings("unused")
public class BuildersBountyClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ColorProviderRegistry.BLOCK.register((block, pos, world, layer) -> {
            BlockColorProvider provider = ColorProviderRegistry.BLOCK.get(Blocks.GRASS_BLOCK);
            return provider == null ? -1 : provider.getColor(block, pos, world, layer);
        }, ModBlocks.TURF);


        ColorProviderRegistry.ITEM.register((item, layer) -> {
            ItemColorProvider provider = ColorProviderRegistry.ITEM.get(Items.GRASS_BLOCK);
            return provider == null ? -1 : provider.getColor(item, layer);
        }, ModItems.TURF);
    }
}
