package net.fancy_socks.waterlogged.datagen;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fancy_socks.waterlogged.block.ModBlocks;
import net.fancy_socks.waterlogged.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.RAW_RUBY_BLOCK);

        addDrop(ModBlocks.RUBY_ORE, copperLikeOreDrops(ModBlocks.RUBY_ORE, ModItems.RAW_RUBY));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RAW_RUBY));
        addDrop(ModBlocks.NETHER_RUBY_ORE, copperLikeOreDrops(ModBlocks.NETHER_RUBY_ORE, ModItems.RAW_RUBY));
        addDrop(ModBlocks.END_STONE_RUBY_ORE, copperLikeOreDrops(ModBlocks.END_STONE_RUBY_ORE, ModItems.RAW_RUBY));

        addDrop(ModBlocks.RAINBOW_PLANKS);
        addDrop(ModBlocks.RAINBOW_LOG);
        addDrop(ModBlocks.STRIPPED_RAINBOW_LOG);
        addDrop(ModBlocks.RAINBOW_WOOD);
        addDrop(ModBlocks.STRIPPED_RAINBOW_WOOD);

        addDrop(ModBlocks.RAINBOW_LEAVES, leavesDrops(ModBlocks.RAINBOW_LEAVES,ModBlocks.RUBY_BLOCK, 0.25f));
        //0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F
    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}