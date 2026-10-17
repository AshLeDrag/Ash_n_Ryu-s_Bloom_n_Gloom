package net.Ash_n_Ryu.examplemod.recipe;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeInput;

import java.util.List;

public record WeaponForgeRecipeInput(List<ItemStack> inputs) implements RecipeInput {
		
		@Override
		public ItemStack getItem(int i) {
				// Guard so absent slots read as EMPTY rather than throwing
				if (i < 0 || i >= inputs.size()) return ItemStack.EMPTY;
				return inputs.get(i);
		}
		
		@Override
		public int size() {
				return WeaponForgeRecipe.SLOT_NAMES.size(); // 17
		}
}