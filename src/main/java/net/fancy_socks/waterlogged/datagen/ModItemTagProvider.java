package net.fancy_socks.waterlogged.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fancy_socks.waterlogged.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.RAINBOW_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.RAINBOW_LOG.asItem())
                .add(ModBlocks.RAINBOW_WOOD.asItem())
                .add(ModBlocks.STRIPPED_RAINBOW_LOG.asItem())
                .add(ModBlocks.STRIPPED_RAINBOW_WOOD.asItem());


    }
}