package net.fancy_socks.waterlogged.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fancy_socks.waterlogged.Waterlogged;
import net.fancy_socks.waterlogged.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Waterlogged.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);

                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_STONE_RUBY_ORE);

                        entries.add(ModBlocks.RAINBOW_LEAVES);
                        entries.add(ModBlocks.RAINBOW_LOG);
                        entries.add(ModBlocks.RAINBOW_WOOD);
                        entries.add(ModBlocks.RAINBOW_PLANKS);
                        entries.add(ModBlocks.STRIPPED_RAINBOW_WOOD);
                        entries.add(ModBlocks.STRIPPED_RAINBOW_LOG);
                        entries.add(ModBlocks.RAINBOW_SAPLING);



                    }).build());


    public static void registerItemGroups() {
        Waterlogged.LOGGER.info("Registering Item Groups for " + Waterlogged.MOD_ID);
    }
}