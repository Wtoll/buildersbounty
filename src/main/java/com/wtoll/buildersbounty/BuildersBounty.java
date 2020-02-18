package com.wtoll.buildersbounty;

import com.wtoll.buildersbounty.block.ModBlocks;
import com.wtoll.buildersbounty.item.ModItems;
import net.fabricmc.api.ModInitializer;

@SuppressWarnings("unused")
public class BuildersBounty implements ModInitializer {
    @Override
    public void onInitialize() {
        ModBlocks.initialize();
        ModItems.initialize();
    }
}
