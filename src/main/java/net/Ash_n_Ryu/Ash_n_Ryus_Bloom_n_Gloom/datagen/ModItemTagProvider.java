package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.datagen;

import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.Ash_n_Ryus_Bloom_n_Gloom;
import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.block.ModBlocks;
import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.item.ModItems;
import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.util.ModTags;
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
				super(output, lookupProvider, blockTags, Ash_n_Ryus_Bloom_n_Gloom.MOD_ID, existingFileHelper);
		}
		
		@Override
		protected void addTags(HolderLookup.Provider provider) {
				
				tag(ModTags.Items.COLOSSAL_SWORD_ENCHANTABLE)
						.add(ModItems.Weapons.COLOSSAL_SWORD.get());
				
				tag(ItemTags.SWORDS)
						.add(ModItems.Mantisite.Weapons.SWORD.get());
				
				tag(ItemTags.BOW_ENCHANTABLE)
						.add(ModItems.Mantisite.Weapons.BOW.get());
				
				tag(ItemTags.AXES)
						.add(ModItems.Mantisite.Tools.AXE.get());
				
				tag(ItemTags.PICKAXES)
						.add(ModItems.Mantisite.Tools.PICKAXE.get());
				
				tag(ItemTags.SHOVELS)
						.add(ModItems.Mantisite.Tools.SHOVEL.get());
				
				tag(ItemTags.HOES)
						.add(ModItems.Mantisite.Tools.HOE.get());
				
				tag(ItemTags.TRIDENT_ENCHANTABLE)
						.add(ModItems.Weapons.COLOSSAL_SWORD.get());
				
				tag(ItemTags.TRIMMABLE_ARMOR)
						.add(ModItems.Mantisite.Armor.HELMET.get())
						.add(ModItems.Mantisite.Armor.CHESTPLATE.get())
						.add(ModItems.Mantisite.Armor.LEGGINGS.get())
						.add(ModItems.Mantisite.Armor.BOOTS.get());
				
				
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
