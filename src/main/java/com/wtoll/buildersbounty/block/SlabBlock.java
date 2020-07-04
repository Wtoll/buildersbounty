package com.wtoll.buildersbounty.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;

public class SlabBlock extends net.minecraft.block.SlabBlock {
    public SlabBlock(Block baseBlock) {
        super(FabricBlockSettings.copy(baseBlock).build());
    }
}
