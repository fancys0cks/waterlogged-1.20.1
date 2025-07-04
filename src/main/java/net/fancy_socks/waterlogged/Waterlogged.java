package net.fancy_socks.waterlogged;

import net.fabricmc.api.ModInitializer;

import net.fancy_socks.waterlogged.block.ModBlocks;
import net.fancy_socks.waterlogged.item.ModItemGroups;
import net.fancy_socks.waterlogged.item.ModItems;
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
		LOGGER.info("Hello Fabric world!");
	}
}