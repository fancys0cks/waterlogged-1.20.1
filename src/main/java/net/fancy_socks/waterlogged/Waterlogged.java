package net.fancy_socks.waterlogged;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.fancy_socks.waterlogged.block.ModBlocks;
import net.fancy_socks.waterlogged.datagen.ModWorldGenerator;
import net.fancy_socks.waterlogged.item.ModItemGroups;
import net.fancy_socks.waterlogged.item.ModItems;
import net.fancy_socks.waterlogged.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Waterlogged implements ModInitializer {
	public static final String MOD_ID = "waterlogged";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		StrippableBlockRegistry.register(ModBlocks.RAINBOW_LOG, ModBlocks.STRIPPED_RAINBOW_LOG);
		StrippableBlockRegistry.register(ModBlocks.RAINBOW_WOOD, ModBlocks.STRIPPED_RAINBOW_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RAINBOW_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RAINBOW_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_RAINBOW_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_RAINBOW_WOOD, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RAINBOW_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RAINBOW_LEAVES, 30, 60);

		ModWorldGeneration.generateModWorldGen();

		LOGGER.info("Hello Fabric world!");
	}
}