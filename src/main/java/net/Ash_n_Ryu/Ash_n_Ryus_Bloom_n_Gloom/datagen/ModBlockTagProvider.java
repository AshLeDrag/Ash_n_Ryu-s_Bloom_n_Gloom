package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.datagen;

import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.block.ModBlocks;
import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.util.ModTags;
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
							ModBlocks.BREADINIUM_NETHER_ORE.get(), ModBlocks.BREADINIUM_END_ORE.get(), ModBlocks.BREADINIUM_BLOCK.get());
				
				
				
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
							ModBlocks.BREADINIUM_NETHER_ORE.get(), ModBlocks.BREADINIUM_END_ORE.get(), ModBlocks.BREADINIUM_BLOCK.get());
				
			tag(ModTags.Blocks.NEEDS_BREADINIUM_TOOL)
					.addTag(BlockTags.NEEDS_IRON_TOOL)
					.add(Blocks.OBSIDIAN)
					.add(Blocks.CRYING_OBSIDIAN);
				
			tag(ModTags.Blocks.INCORRECT_FOR_BREADINIUM_TOOL)
					.addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
					.remove(ModTags.Blocks.NEEDS_BREADINIUM_TOOL);
			
			
			
				
			tag(BlockTags.LOGS_THAT_BURN)
				 .add(ModBlocks.REDWOOD_LOG.get())
				 .add(ModBlocks.REDWOOD_WOOD.get())
				 .add(ModBlocks.STRIPPED_REDWOOD_LOG.get())
				 .add(ModBlocks.STRIPPED_REDWOOD_WOOD.get());
	}
}
