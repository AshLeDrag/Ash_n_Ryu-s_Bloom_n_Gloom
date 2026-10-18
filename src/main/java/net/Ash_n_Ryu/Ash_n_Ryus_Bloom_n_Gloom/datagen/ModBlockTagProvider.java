package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.datagen;

import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.Ash_n_Ryus_Bloom_n_Gloom;
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
		super(output, lookupProvider, Ash_n_Ryus_Bloom_n_Gloom.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void addTags(HolderLookup.Provider provider) {
			tag(BlockTags.MINEABLE_WITH_PICKAXE)
					.add(ModBlocks.MANTISITE_ORE.get(), ModBlocks.MANTISITE_DEEPSLATE_ORE.get(), ModBlocks.MANTISITE_BLOCK.get());
				
				
				
			tag(BlockTags.NEEDS_DIAMOND_TOOL);
			
				
				
					
			tag(BlockTags.NEEDS_IRON_TOOL)
					.add(ModBlocks.MANTISITE_ORE.get(), ModBlocks.MANTISITE_DEEPSLATE_ORE.get(), ModBlocks.MANTISITE_BLOCK.get());
				
			tag(ModTags.Blocks.NEEDS_MANTISITE_TOOL)
					.addTag(BlockTags.NEEDS_IRON_TOOL);
				
			tag(ModTags.Blocks.INCORRECT_FOR_MANTISITE_TOOL)
					.addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
					.remove(ModTags.Blocks.NEEDS_MANTISITE_TOOL);
			
			
			
				
			tag(BlockTags.LOGS_THAT_BURN)
				 .add(ModBlocks.ERNEST_LOG.get())
				 .add(ModBlocks.ERNEST_WOOD.get())
				 .add(ModBlocks.STRIPPED_ERNEST_LOG.get())
				 .add(ModBlocks.STRIPPED_ERNEST_WOOD.get());
	}
}
