package net.fancy_socks.waterlogged.block.custom;

import net.fancy_socks.waterlogged.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class CustomSaplingBlock extends SaplingBlock {

    public CustomSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        // Default behavior:
        // return floor.isIn(BlockTags.DIRT);

        // Custom behavior: allow placement on custom blocks or any solid block
        return floor.isOf(ModBlocks.RAINBOW_GRASS_BLOCK) || floor.isOf(ModBlocks.RAINBOW_DIRT);
    }
}