package com.wtoll.buildersbounty;

import com.wtoll.buildersbounty.init.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.registry.Registry;

@SuppressWarnings("unused")
public class BuildersBounty implements ModInitializer {
    public static final String MODID = "buildersbounty";

    @Override
    public void onInitialize() {
        ModBlocks.initialize();

        FabricItemGroupBuilder.create(id("items")).icon(() -> ModBlocks.COBBLED_ANDESITE.asItem().getStackForRender()).appendItems(stacks -> Registry.ITEM.forEach(item -> {
            if (Registry.ITEM.getId(item).getNamespace().equals(MODID)) item.appendStacks(item.getGroup(), (DefaultedList<ItemStack>) stacks);
        })).build();
    }

    public static Identifier id(String s) {
        return new Identifier(MODID, s);
    }
}
