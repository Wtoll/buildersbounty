package com.wtoll.buildersbounty.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;

public class WallBlock extends net.minecraft.block.WallBlock {
    public WallBlock(Block baseBlock) {
        super(FabricBlockSettings.copy(baseBlock).build());
    }
}
