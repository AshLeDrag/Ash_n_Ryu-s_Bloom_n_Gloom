package net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.item;


import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
		public static final Tier MANTISITE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_MANTISITE_TOOL,
																		  900, 7.5f, 2f, 28, () -> Ingredient.of(ModItems.Mantisite.Resource.INGOT));
		

}
