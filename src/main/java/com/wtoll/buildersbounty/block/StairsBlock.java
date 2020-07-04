package com.wtoll.buildersbounty.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;

public class StairsBlock extends net.minecraft.block.StairsBlock {
    public StairsBlock(Block baseBlock) {
        super(baseBlock.getDefaultState(), FabricBlockSettings.copy(baseBlock).build());
    }
}
