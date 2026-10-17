package net.Ash_n_Ryu.examplemod.datagen;

import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.AshLeDrag.thingsfordays.block.ModBlocks;
import net.AshLeDrag.thingsfordays.item.ModGeneratedOres;
import net.AshLeDrag.thingsfordays.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
	public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, ThingsForDays.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void addTags(HolderLookup.Provider provider) {
			tag(BlockTags.MINEABLE_WITH_PICKAXE)
					.add(ModBlocks.MANA_BLOCK.get(),
							ModBlocks.BREADINIUM_ORE.get(), ModBlocks.BREADINIUM_DEEPSLATE_ORE.get(),
							ModBlocks.BREADINIUM_NETHER_ORE.get(), ModBlocks.BREADINIUM_END_ORE.get(), ModBlocks.BREADINIUM_BLOCK.get(),
							ModBlocks.MYTHRIL_ORE.get(), ModBlocks.MYTHRIL_DEEPSLATE_ORE.get(),
							ModBlocks.MYTHRIL_NETHER_ORE.get(), ModBlocks.MYTHRIL_END_ORE.get(), ModBlocks.MYTHRIL_BLOCK.get(),
							ModBlocks.ORGA_ORE.get(), ModBlocks.ORGA_DEEPSLATE_ORE.get(), ModBlocks.ORGA_NETHER_ORE.get(), ModBlocks.ORGA_END_ORE.get(),
							ModBlocks.POLNUMARIUM_ORE.get(), ModBlocks.POLNUMARIUM_DEEPSLATE_ORE.get(), ModBlocks.POLNUMARIUM_NETHER_ORE.get(), ModBlocks.POLNUMARIUM_END_ORE.get(),
							ModBlocks.FATIUM_ORE.get(), ModBlocks.FATIUM_DEEPSLATE_ORE.get(), ModBlocks.FATIUM_NETHER_ORE.get(), ModBlocks.FATIUM_END_ORE.get(),
							ModBlocks.TITANIUM_ORE.get(), ModBlocks.TITANIUM_DEEPSLATE_ORE.get(), ModBlocks.TITANIUM_NETHER_ORE.get(), ModBlocks.TITANIUM_END_ORE.get(),
							ModBlocks.HALIUM_ORE.get(), ModBlocks.HALIUM_DEEPSLATE_ORE.get(), ModBlocks.HALIUM_NETHER_ORE.get(), ModBlocks.HALIUM_END_ORE.get(),
							ModBlocks.UHEN_ORE.get(), ModBlocks.UHEN_DEEPSLATE_ORE.get(), ModBlocks.UHEN_NETHER_ORE.get(), ModBlocks.UHEN_END_ORE.get(),
							ModBlocks.MANTISITE_ORE.get(), ModBlocks.FARIUM_END_ORE.get(), ModBlocks.PLACINE_END_ORE.get());
				
				
				
			tag(BlockTags.NEEDS_DIAMOND_TOOL)
					.add(ModBlocks.MANA_BLOCK.get());
			
			tag(ModTags.Blocks.BASIC_HAMMER_MINEABLE)
					.addTag(BlockTags.MINEABLE_WITH_PICKAXE)
					.addTag(BlockTags.MINEABLE_WITH_SHOVEL);
			
			tag(ModTags.Blocks.PICKAXE_HAMMER_MINEABLE)
					.addTag(BlockTags.MINEABLE_WITH_PICKAXE);
			
			tag(ModTags.Blocks.AXE_HAMMER_MINEABLE)
					.addTag(BlockTags.MINEABLE_WITH_AXE);
			
			tag(ModTags.Blocks.SHOVEL_HAMMER_MINEABLE)
					.addTag(BlockTags.MINEABLE_WITH_SHOVEL);
				
				
					
			tag(BlockTags.NEEDS_IRON_TOOL)
					.add(ModBlocks.MANA_BLOCK.get(),
							ModBlocks.BREADINIUM_ORE.get(), ModBlocks.BREADINIUM_DEEPSLATE_ORE.get(),
							ModBlocks.BREADINIUM_NETHER_ORE.get(), ModBlocks.BREADINIUM_END_ORE.get(), ModBlocks.BREADINIUM_BLOCK.get(),
							ModBlocks.MYTHRIL_ORE.get(), ModBlocks.MYTHRIL_DEEPSLATE_ORE.get(),
							ModBlocks.MYTHRIL_NETHER_ORE.get(), ModBlocks.MYTHRIL_END_ORE.get(), ModBlocks.MYTHRIL_BLOCK.get(),
							ModBlocks.ORGA_ORE.get(), ModBlocks.ORGA_DEEPSLATE_ORE.get(), ModBlocks.ORGA_NETHER_ORE.get(), ModBlocks.ORGA_END_ORE.get(),
							ModBlocks.POLNUMARIUM_ORE.get(), ModBlocks.POLNUMARIUM_DEEPSLATE_ORE.get(), ModBlocks.POLNUMARIUM_NETHER_ORE.get(), ModBlocks.POLNUMARIUM_END_ORE.get(),
							ModBlocks.FATIUM_ORE.get(), ModBlocks.FATIUM_DEEPSLATE_ORE.get(), ModBlocks.FATIUM_NETHER_ORE.get(), ModBlocks.FATIUM_END_ORE.get(),
							ModBlocks.TITANIUM_ORE.get(), ModBlocks.TITANIUM_DEEPSLATE_ORE.get(), ModBlocks.TITANIUM_NETHER_ORE.get(), ModBlocks.TITANIUM_END_ORE.get(),
							ModBlocks.HALIUM_ORE.get(), ModBlocks.HALIUM_DEEPSLATE_ORE.get(), ModBlocks.HALIUM_NETHER_ORE.get(), ModBlocks.HALIUM_END_ORE.get(),
							ModBlocks.UHEN_ORE.get(), ModBlocks.UHEN_DEEPSLATE_ORE.get(), ModBlocks.UHEN_NETHER_ORE.get(), ModBlocks.UHEN_END_ORE.get(),
							ModBlocks.MANTISITE_ORE.get(), ModBlocks.FARIUM_END_ORE.get(), ModBlocks.PLACINE_END_ORE.get());
				
			tag(ModTags.Blocks.NEEDS_BREADINIUM_TOOL)
					.addTag(BlockTags.NEEDS_IRON_TOOL)
					.add(Blocks.OBSIDIAN)
					.add(Blocks.CRYING_OBSIDIAN);
				
			tag(ModTags.Blocks.INCORRECT_FOR_BREADINIUM_TOOL)
					.addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
					.remove(ModTags.Blocks.NEEDS_BREADINIUM_TOOL);
			
			tag(ModTags.Blocks.NEEDS_MYTHRIL_TOOL)
					.addTag(BlockTags.NEEDS_IRON_TOOL)
					.add(Blocks.OBSIDIAN)
					.add(Blocks.CRYING_OBSIDIAN);
			
			tag(ModTags.Blocks.INCORRECT_FOR_MYTHRIL_TOOL)
					.addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
					.remove(ModTags.Blocks.NEEDS_MYTHRIL_TOOL);

			tag(ModTags.Blocks.INCORRECT_FOR_ORGA_TOOL).addTag(BlockTags.INCORRECT_FOR_IRON_TOOL);
			tag(ModTags.Blocks.INCORRECT_FOR_POLNUMARIUM_TOOL).addTag(BlockTags.INCORRECT_FOR_IRON_TOOL);
			tag(ModTags.Blocks.INCORRECT_FOR_FATIUM_TOOL).addTag(BlockTags.INCORRECT_FOR_IRON_TOOL);
			tag(ModTags.Blocks.INCORRECT_FOR_TITANIUM_TOOL).addTag(BlockTags.INCORRECT_FOR_IRON_TOOL);
			tag(ModTags.Blocks.INCORRECT_FOR_HALIUM_TOOL).addTag(BlockTags.INCORRECT_FOR_IRON_TOOL);
			tag(ModTags.Blocks.INCORRECT_FOR_UHEN_TOOL).addTag(BlockTags.INCORRECT_FOR_IRON_TOOL);
			tag(ModTags.Blocks.INCORRECT_FOR_MANTISITE_TOOL).addTag(BlockTags.INCORRECT_FOR_IRON_TOOL);
			tag(ModTags.Blocks.INCORRECT_FOR_FARIUM_TOOL).addTag(BlockTags.INCORRECT_FOR_IRON_TOOL);
			tag(ModTags.Blocks.INCORRECT_FOR_PLACINE_TOOL).addTag(BlockTags.INCORRECT_FOR_IRON_TOOL);

			for (ModGeneratedOres.Family family : ModGeneratedOres.ALL) {
				tag(BlockTags.MINEABLE_WITH_PICKAXE).add(family.ore.get(), family.storageBlock.get());
				tag(BlockTags.NEEDS_IRON_TOOL).add(family.ore.get(), family.storageBlock.get());
				tag(family.incorrectToolTag).addTag(BlockTags.INCORRECT_FOR_IRON_TOOL);
			}
			tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
					ModBlocks.ASTRALIS_PORTAL.get(), ModBlocks.VOLCANIS_PORTAL.get(),
					ModBlocks.SYLVARIA_PORTAL.get(), ModBlocks.CRYOLUNE_PORTAL.get(),
					ModBlocks.ASTRAL_STONE.get(), ModBlocks.VOLCANIC_ROCK.get(),
					ModBlocks.SYLVAN_STONE.get(), ModBlocks.CRYO_CRYSTAL.get());
			tag(BlockTags.NEEDS_IRON_TOOL).add(
					ModBlocks.ASTRAL_STONE.get(), ModBlocks.VOLCANIC_ROCK.get(),
					ModBlocks.SYLVAN_STONE.get(), ModBlocks.CRYO_CRYSTAL.get());
			
			
				
			this.tag(BlockTags.LOGS_THAT_BURN)
				 .add(ModBlocks.REDWOOD_LOG.get())
				 .add(ModBlocks.REDWOOD_WOOD.get())
				 .add(ModBlocks.STRIPPED_REDWOOD_LOG.get())
				 .add(ModBlocks.STRIPPED_REDWOOD_WOOD.get());
	}
}
