package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.datagen;

import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.block.ModBlocks;
import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.block.custom.RadishCropBlock;
import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.MANA_BLOCK.get());
        dropSelf(ModBlocks.WEAPON_FORGE.get());
        
        
        add(ModBlocks.BREADINIUM_ORE.get(),
              block -> createOreDrop(ModBlocks.BREADINIUM_ORE.get(), ModItems.Breadinium.Resource.RAW.get()));
        add(ModBlocks.BREADINIUM_DEEPSLATE_ORE.get(),
              block -> createMultipleOreDrops(ModBlocks.BREADINIUM_DEEPSLATE_ORE.get(), ModItems.Breadinium.Resource.RAW.get(), 2, 5));
        add(ModBlocks.BREADINIUM_END_ORE.get(),
              block -> createMultipleOreDrops(ModBlocks.BREADINIUM_END_ORE.get(), ModItems.Breadinium.Resource.RAW.get(), 3, 6));
        add(ModBlocks.BREADINIUM_NETHER_ORE.get(),
              block -> createMultipleOreDrops(ModBlocks.BREADINIUM_NETHER_ORE.get(), ModItems.Breadinium.Resource.RAW.get(), 4, 8));
        dropSelf(ModBlocks.BREADINIUM_BLOCK.get());

        addFourVariantOreDrops(
              ModBlocks.ORGA_ORE.get(), ModBlocks.ORGA_DEEPSLATE_ORE.get(),
              ModBlocks.ORGA_NETHER_ORE.get(), ModBlocks.ORGA_END_ORE.get(),
              ModItems.Orga.Resource.RAW.get());
        
        
        
        
        add(ModBlocks.REDWOOD_LEAVES.get(), block ->
                                                         createLeavesDrops(block, ModBlocks.REDWOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        
        
        
        LootItemCondition.Builder lootItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.RADISH_CROP.get())
                                                                   .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(RadishCropBlock.AGE, 3));
        add(ModBlocks.RADISH_CROP.get(), this.createCropDrops(ModBlocks.RADISH_CROP.get(),
              ModItems.Foods.RADISH.get(), ModItems.Foods.RADISH_SEEDS.get(), lootItemConditionBuilder));

    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = registries.lookupOrThrow(Registries.ENCHANTMENT);
        return createSilkTouchDispatchTable(pBlock,
                                                 applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                                                         .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                                         .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    private void addFourVariantOreDrops(Block ore, Block deepslateOre, Block netherOre, Block endOre, Item rawOre) {
        add(ore, block -> createOreDrop(ore, rawOre));
        add(deepslateOre, block -> createMultipleOreDrops(deepslateOre, rawOre, 2, 5));
        add(endOre, block -> createMultipleOreDrops(endOre, rawOre, 3, 6));
        add(netherOre, block -> createMultipleOreDrops(netherOre, rawOre, 4, 8));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
