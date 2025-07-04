package net.fancy_socks.waterlogged;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fancy_socks.waterlogged.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class WaterloggedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RAINBOW_LEAVES, RenderLayer.getCutout());

    }
}
