package net.fancy_socks.waterlogged.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fancy_socks.waterlogged.block.ModBlocks;
import net.fancy_socks.waterlogged.item.ModItems;
import net.minecraft.data.client.*;

import static net.fancy_socks.waterlogged.block.ModBlocks.RAINBOW_GRASS_BLOCK;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_RUBY_ORE);

        blockStateModelGenerator.registerLog(ModBlocks.RAINBOW_LOG).log(ModBlocks.RAINBOW_LOG).wood(ModBlocks.RAINBOW_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_RAINBOW_LOG).log(ModBlocks.STRIPPED_RAINBOW_LOG).wood(ModBlocks.STRIPPED_RAINBOW_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAINBOW_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAINBOW_PLANKS);

        blockStateModelGenerator.registerTintableCross(ModBlocks.RAINBOW_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAINBOW_DIRT);




  }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);

    }
}