package net.Ash_n_Ryu.examplemod.item;

import net.AshLeDrag.thingsfordays.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
		public static final Tier BREADINIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_BREADINIUM_TOOL,
																		  900, 7.5f, 2f, 28, () -> Ingredient.of(ModItems.Breadinium.Resource.INGOT));
		
		public static final Tier MYTHRIL = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_MYTHRIL_TOOL,
				900, 7.5f, 2f, 28, () -> Ingredient.of(ModItems.Mythril.Resource.INGOT));
		public static final Tier ORGA = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ORGA_TOOL,
				900, 7.5f, 2f, 28, () -> Ingredient.of(ModItems.Orga.Resource.INGOT));
		public static final Tier POLNUMARIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_POLNUMARIUM_TOOL,
				900, 7.5f, 2f, 28, () -> Ingredient.of(ModItems.Polnumarium.Resource.INGOT));
		public static final Tier FATIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_FATIUM_TOOL,
				900, 7.5f, 2f, 28, () -> Ingredient.of(ModItems.Fatium.Resource.INGOT));
		public static final Tier TITANIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_TITANIUM_TOOL,
				900, 7.5f, 2f, 28, () -> Ingredient.of(ModItems.Titanium.Resource.INGOT));
		public static final Tier HALIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_HALIUM_TOOL,
				900, 7.5f, 2f, 28, () -> Ingredient.of(ModItems.Halium.Resource.INGOT));
		public static final Tier UHEN = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_UHEN_TOOL,
				900, 7.5f, 2f, 28, () -> Ingredient.of(ModItems.Uhen.Resource.INGOT));
		public static final Tier MANTISITE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_MANTISITE_TOOL,
				900, 7.5f, 2f, 28, () -> Ingredient.of(ModItems.Mantisite.Resource.INGOT));
		public static final Tier FARIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_FARIUM_TOOL,
				900, 7.5f, 2f, 28, () -> Ingredient.of(ModItems.Farium.Resource.INGOT));
		public static final Tier PLACINE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_PLACINE_TOOL,
				900, 7.5f, 2f, 28, () -> Ingredient.of(ModItems.Placine.Resource.INGOT));

}
