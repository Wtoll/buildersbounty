package com.wtoll.buildersbounty.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;

public class FenceBlock extends net.minecraft.block.FenceBlock {
    public FenceBlock(Block baseBlock) {
        super(FabricBlockSettings.copy(baseBlock).build());
    }
}
