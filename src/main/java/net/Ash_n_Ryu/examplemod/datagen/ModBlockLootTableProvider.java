package net.Ash_n_Ryu.examplemod.datagen;

import net.AshLeDrag.thingsfordays.block.ModBlocks;
import net.AshLeDrag.thingsfordays.block.custom.RadishCropBlock;
import net.AshLeDrag.thingsfordays.item.ModGeneratedOres;
import net.AshLeDrag.thingsfordays.item.ModItems;
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
        
        add(ModBlocks.MYTHRIL_ORE.get(),
              block -> createOreDrop(ModBlocks.MYTHRIL_ORE.get(), ModItems.Mythril.Resource.RAW.get()));
        add(ModBlocks.MYTHRIL_DEEPSLATE_ORE.get(),
              block -> createMultipleOreDrops(ModBlocks.MYTHRIL_DEEPSLATE_ORE.get(), ModItems.Mythril.Resource.RAW.get(), 2, 5));
        add(ModBlocks.MYTHRIL_END_ORE.get(),
              block -> createMultipleOreDrops(ModBlocks.MYTHRIL_END_ORE.get(), ModItems.Mythril.Resource.RAW.get(), 3, 6));
        add(ModBlocks.MYTHRIL_NETHER_ORE.get(),
              block -> createMultipleOreDrops(ModBlocks.MYTHRIL_NETHER_ORE.get(), ModItems.Mythril.Resource.RAW.get(), 4, 8));
        dropSelf(ModBlocks.MYTHRIL_BLOCK.get());

        addFourVariantOreDrops(
              ModBlocks.ORGA_ORE.get(), ModBlocks.ORGA_DEEPSLATE_ORE.get(),
              ModBlocks.ORGA_NETHER_ORE.get(), ModBlocks.ORGA_END_ORE.get(),
              ModItems.Orga.Resource.RAW.get());
        addFourVariantOreDrops(
              ModBlocks.POLNUMARIUM_ORE.get(), ModBlocks.POLNUMARIUM_DEEPSLATE_ORE.get(),
              ModBlocks.POLNUMARIUM_NETHER_ORE.get(), ModBlocks.POLNUMARIUM_END_ORE.get(),
              ModItems.Polnumarium.Resource.RAW.get());
        addFourVariantOreDrops(
              ModBlocks.FATIUM_ORE.get(), ModBlocks.FATIUM_DEEPSLATE_ORE.get(),
              ModBlocks.FATIUM_NETHER_ORE.get(), ModBlocks.FATIUM_END_ORE.get(),
              ModItems.Fatium.Resource.RAW.get());
        addFourVariantOreDrops(
              ModBlocks.TITANIUM_ORE.get(), ModBlocks.TITANIUM_DEEPSLATE_ORE.get(),
              ModBlocks.TITANIUM_NETHER_ORE.get(), ModBlocks.TITANIUM_END_ORE.get(),
              ModItems.Titanium.Resource.RAW.get());
        addFourVariantOreDrops(
              ModBlocks.HALIUM_ORE.get(), ModBlocks.HALIUM_DEEPSLATE_ORE.get(),
              ModBlocks.HALIUM_NETHER_ORE.get(), ModBlocks.HALIUM_END_ORE.get(),
              ModItems.Halium.Resource.RAW.get());
        addFourVariantOreDrops(
              ModBlocks.UHEN_ORE.get(), ModBlocks.UHEN_DEEPSLATE_ORE.get(),
              ModBlocks.UHEN_NETHER_ORE.get(), ModBlocks.UHEN_END_ORE.get(),
              ModItems.Uhen.Resource.RAW.get());

        add(ModBlocks.MANTISITE_ORE.get(),
              block -> createOreDrop(ModBlocks.MANTISITE_ORE.get(), ModItems.Mantisite.Resource.RAW.get()));
        add(ModBlocks.FARIUM_END_ORE.get(),
              block -> createMultipleOreDrops(ModBlocks.FARIUM_END_ORE.get(), ModItems.Farium.Resource.RAW.get(), 3, 6));
        add(ModBlocks.PLACINE_END_ORE.get(),
              block -> createMultipleOreDrops(ModBlocks.PLACINE_END_ORE.get(), ModItems.Placine.Resource.RAW.get(), 3, 6));

        for (ModGeneratedOres.Family family : ModGeneratedOres.ALL) {
            add(family.ore.get(), block -> createOreDrop(family.ore.get(), family.raw.get()));
            dropSelf(family.storageBlock.get());
        }
        dropSelf(ModBlocks.ASTRALIS_PORTAL.get());
        dropSelf(ModBlocks.VOLCANIS_PORTAL.get());
        dropSelf(ModBlocks.SYLVARIA_PORTAL.get());
        dropSelf(ModBlocks.CRYOLUNE_PORTAL.get());
		dropSelf(ModBlocks.ASTRAL_STONE.get());
		dropSelf(ModBlocks.VOLCANIC_ROCK.get());
		dropSelf(ModBlocks.SYLVAN_STONE.get());
		dropSelf(ModBlocks.CRYO_CRYSTAL.get());
        
        
        
        dropSelf(ModBlocks.HOLDER.get());
        
        
        
        dropSelf(ModBlocks.REDWOOD_LOG.get());
        dropSelf(ModBlocks.REDWOOD_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_REDWOOD_LOG.get());
        dropSelf(ModBlocks.STRIPPED_REDWOOD_WOOD.get());
        dropSelf(ModBlocks.REDWOOD_PLANKS.get());
        dropSelf(ModBlocks.REDWOOD_SAPLING.get());
        
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
