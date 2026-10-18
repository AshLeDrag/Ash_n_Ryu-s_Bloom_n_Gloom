package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.item;

import net.AshLeDrag.thingsfordays.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
		public static final Tier BREADINIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_BREADINIUM_TOOL,
																		  900, 7.5f, 2f, 28, () -> Ingredient.of(ModItems.Breadinium.Resource.INGOT));
		

}
