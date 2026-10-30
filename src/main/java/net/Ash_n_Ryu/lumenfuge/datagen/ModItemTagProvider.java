package net.Ash_n_Ryu.lumenfuge.datagen;

import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.block.ModBlocks;
import net.Ash_n_Ryu.lumenfuge.item.ModItems;
import net.Ash_n_Ryu.lumenfuge.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
		public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
				super(output, lookupProvider, blockTags, Lumenfuge.MOD_ID, existingFileHelper);
		}
		
		@Override
		protected void addTags(HolderLookup.Provider provider) {
				
				tag(ModTags.Items.ERNEST_LOGS)
						.add(ModBlocks.ERNEST_LOG.get().asItem())
						.add(ModBlocks.ERNEST_WOOD.get().asItem())
						.add(ModBlocks.STRIPPED_ERNEST_LOG.get().asItem())
						.add(ModBlocks.STRIPPED_ERNEST_WOOD.get().asItem());
				
				tag(ItemTags.SWORDS)
						.add(ModItems.MANTISITE_SWORD.get());
				
				tag(ItemTags.AXES)
						.add(ModItems.MANTISITE_AXE.get());
				
				tag(ItemTags.PICKAXES)
						.add(ModItems.MANTISITE_PICKAXE.get());
				
				tag(ItemTags.SHOVELS)
						.add(ModItems.MANTISITE_SHOVEL.get());
				
				tag(ItemTags.HOES)
						.add(ModItems.MANTISITE_HOE.get());
				
				tag(ItemTags.TRIDENT_ENCHANTABLE);
				
				tag(ItemTags.TRIMMABLE_ARMOR)
						.add(ModItems.MANTISITE_HELMET.get())
						.add(ModItems.MANTISITE_CHESTPLATE.get())
						.add(ModItems.MANTISITE_LEGGINGS.get())
						.add(ModItems.MANTISITE_BOOTS.get());
				
				
				tag(ItemTags.PLANKS)
						.add(ModBlocks.ERNEST_PLANKS.asItem());
				
				
				
				tag(ItemTags.LOGS_THAT_BURN)
						.add(ModBlocks.ERNEST_LOG.get().asItem())
						.add(ModBlocks.ERNEST_WOOD.get().asItem())
						.add(ModBlocks.STRIPPED_ERNEST_LOG.get().asItem())
						.add(ModBlocks.STRIPPED_ERNEST_WOOD.get().asItem());
				
				
				
				tag(ItemTags.LEAVES)
						.add(ModBlocks.ERNEST_LEAVES.get().asItem());
				
		}
}
