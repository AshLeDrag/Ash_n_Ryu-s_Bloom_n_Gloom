package net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.datagen;

import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.block.ModBlocks;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.block.custom.RadishCropBlock;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.item.ModItems;
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
import net.minecraft.world.level.block.Blocks;
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
        dropSelf(ModBlocks.MANTISITE_BLOCK.get());
        dropSelf(ModBlocks.RAW_MANTISITE_BLOCK.get());
        
        dropSelf(ModBlocks.ERNEST_LOG.get());
        dropSelf(ModBlocks.ERNEST_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_ERNEST_LOG.get());
        dropSelf(ModBlocks.STRIPPED_ERNEST_WOOD.get());
        dropSelf(ModBlocks.ERNEST_STAIRS.get());
        dropSelf(ModBlocks.ERNEST_PLANKS.get());
        dropSelf(ModBlocks.ERNEST_SLAB.get());
        dropSelf(ModBlocks.ERNEST_FENCE.get());
        dropSelf(ModBlocks.ERNEST_FENCE_GATE.get());
        dropSelf(ModBlocks.ERNEST_BUTTON.get());
        dropSelf(ModBlocks.ERNEST_DOOR.get());
        dropSelf(ModBlocks.ERNEST_TRAPDOOR.get());
        dropSelf(ModBlocks.ERNEST_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.ERNEST_SAPLING.get());
        dropSelf(ModBlocks.DEAD_ERNEST_SAPLING.get());
        
        add(ModBlocks.MANTISITE_ORE.get(),
              block -> createOreDrop(ModBlocks.MANTISITE_ORE.get(), ModItems.Mantisite.Resource.RAW.get()));
        add(ModBlocks.MANTISITE_DEEPSLATE_ORE.get(),
              block -> createMultipleOreDrops(ModBlocks.MANTISITE_DEEPSLATE_ORE.get(), ModItems.Mantisite.Resource.RAW.get(), 2, 5));
        
        
        
        
        add(ModBlocks.ERNEST_LEAVES.get(), block ->
                                                         createLeavesDrops(block, ModBlocks.ERNEST_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(ModBlocks.DEAD_ERNEST_LEAVES.get(), block ->
                                                         createLeavesDrops(block, Blocks.DEAD_BUSH, NORMAL_LEAVES_SAPLING_CHANCES));
        
        
        
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
