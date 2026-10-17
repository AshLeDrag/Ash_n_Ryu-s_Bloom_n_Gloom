package net.Ash_n_Ryu.examplemod.datagen;

import net.Ash_n_Ryu.examplemod.ExampleMod;
import net.Ash_n_Ryu.examplemod.block.ModBlocks;
import net.Ash_n_Ryu.examplemod.item.ModItems;
import net.Ash_n_Ryu.examplemod.util.ModTags;
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
				super(output, lookupProvider, blockTags, ThingsForDays.MOD_ID, existingFileHelper);
		}
		
		@Override
		protected void addTags(HolderLookup.Provider provider) {
				tag(ModTags.Items.ESSENCE_TO_MANA)
						.add(ModItems.Mana.Resource.MANA_ESSENCE.get());
				
				tag(ModTags.Items.COLOSSAL_SWORD_ENCHANTABLE)
						.add(ModItems.Weapons.COLOSSAL_SWORD.get());
				
				tag(ItemTags.SWORDS)
						.add(ModItems.Breadinium.Weapons.SWORD.get());
				
				tag(ItemTags.BOW_ENCHANTABLE)
						.add(ModItems.Breadinium.Weapons.BOW.get());
				
				tag(ItemTags.AXES)
						.add(ModItems.Breadinium.Tools.AXE.get());
				
				tag(ItemTags.PICKAXES)
						.add(ModItems.Breadinium.Tools.PICKAXE.get());
				
				tag(ItemTags.SHOVELS)
						.add(ModItems.Breadinium.Tools.SHOVEL.get());
				
				tag(ItemTags.HOES)
						.add(ModItems.Breadinium.Tools.HOE.get());
				
				tag(ItemTags.TRIDENT_ENCHANTABLE)
						.add(ModItems.Weapons.COLOSSAL_SWORD.get());
				
				tag(ItemTags.TRIMMABLE_ARMOR)
						.add(ModItems.Breadinium.Armor.HELMET.get())
						.add(ModItems.Breadinium.Armor.CHESTPLATE.get())
						.add(ModItems.Breadinium.Armor.LEGGINGS.get())
						.add(ModItems.Breadinium.Armor.BOOTS.get());
				
				
				tag(ItemTags.PLANKS)
						.add(ModBlocks.REDWOOD_PLANKS.asItem());
				
				
				
				tag(ItemTags.LOGS_THAT_BURN)
						.add(ModBlocks.REDWOOD_LOG.get().asItem())
						.add(ModBlocks.REDWOOD_WOOD.get().asItem())
						.add(ModBlocks.STRIPPED_REDWOOD_LOG.get().asItem())
						.add(ModBlocks.STRIPPED_REDWOOD_WOOD.get().asItem());
				
				
				
				tag(ItemTags.LEAVES)
						.add(ModBlocks.REDWOOD_LEAVES.get().asItem());
				
		}
}
