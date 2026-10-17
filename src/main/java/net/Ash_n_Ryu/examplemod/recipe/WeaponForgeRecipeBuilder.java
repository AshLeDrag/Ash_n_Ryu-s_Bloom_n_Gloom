package net.Ash_n_Ryu.examplemod.recipe;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRequirements;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WeaponForgeRecipeBuilder {
		
		private final RecipeCategory category;
		private final Map<String, Ingredient> slots = new HashMap<>();
		private final Map<String, Criterion<?>> criteria = new LinkedHashMap<>();
		private ItemStack result = ItemStack.EMPTY;
		private int forgingTime = 200;
		
		private WeaponForgeRecipeBuilder(RecipeCategory category) {
				this.category = category;
		}
		
		public static WeaponForgeRecipeBuilder create(RecipeCategory category) {
				return new WeaponForgeRecipeBuilder(category);
		}
		
		// ── Forging time ─────────────────────────────────────────────────────────
		
		public WeaponForgeRecipeBuilder forgingTime(int ticks) {
				this.forgingTime = ticks;
				return this;
		}
		
		// ── Result ───────────────────────────────────────────────────────────────
		
		public WeaponForgeRecipeBuilder result(ItemLike item) {
				return result(item, 1);
		}
		
		public WeaponForgeRecipeBuilder result(ItemLike item, int count) {
				this.result = new ItemStack(item, count);
				return this;
		}
		
		// ── Slot setters (Item / tag overloads) ──────────────────────────────────
		
		private WeaponForgeRecipeBuilder slot(String name, Ingredient ing) {
				slots.put(name, ing);
				return this;
		}
		
		// helper overloads for convenience
		private WeaponForgeRecipeBuilder slot(String name, ItemLike item)         { return slot(name, Ingredient.of(item)); }
		private WeaponForgeRecipeBuilder slot(String name, TagKey<Item> tag)      { return slot(name, Ingredient.of(tag)); }
		
		public WeaponForgeRecipeBuilder center       (ItemLike i) { return slot("center",         i); }
		public WeaponForgeRecipeBuilder center       (TagKey<Item> t) { return slot("center",     t); }
		public WeaponForgeRecipeBuilder north        (ItemLike i) { return slot("north",          i); }
		public WeaponForgeRecipeBuilder north        (TagKey<Item> t) { return slot("north",      t); }
		public WeaponForgeRecipeBuilder farNorth     (ItemLike i) { return slot("far_north",      i); }
		public WeaponForgeRecipeBuilder farNorth     (TagKey<Item> t) { return slot("far_north",  t); }
		public WeaponForgeRecipeBuilder south        (ItemLike i) { return slot("south",          i); }
		public WeaponForgeRecipeBuilder south        (TagKey<Item> t) { return slot("south",      t); }
		public WeaponForgeRecipeBuilder farSouth     (ItemLike i) { return slot("far_south",      i); }
		public WeaponForgeRecipeBuilder farSouth     (TagKey<Item> t) { return slot("far_south",  t); }
		public WeaponForgeRecipeBuilder east         (ItemLike i) { return slot("east",           i); }
		public WeaponForgeRecipeBuilder east         (TagKey<Item> t) { return slot("east",       t); }
		public WeaponForgeRecipeBuilder farEast      (ItemLike i) { return slot("far_east",       i); }
		public WeaponForgeRecipeBuilder farEast      (TagKey<Item> t) { return slot("far_east",   t); }
		public WeaponForgeRecipeBuilder west         (ItemLike i) { return slot("west",           i); }
		public WeaponForgeRecipeBuilder west         (TagKey<Item> t) { return slot("west",       t); }
		public WeaponForgeRecipeBuilder farWest      (ItemLike i) { return slot("far_west",       i); }
		public WeaponForgeRecipeBuilder farWest      (TagKey<Item> t) { return slot("far_west",   t); }
		public WeaponForgeRecipeBuilder northEast    (ItemLike i) { return slot("north_east",     i); }
		public WeaponForgeRecipeBuilder northEast    (TagKey<Item> t) { return slot("north_east", t); }
		public WeaponForgeRecipeBuilder farNorthEast (ItemLike i) { return slot("far_north_east",     i); }
		public WeaponForgeRecipeBuilder farNorthEast (TagKey<Item> t) { return slot("far_north_east",  t); }
		public WeaponForgeRecipeBuilder southEast    (ItemLike i) { return slot("south_east",     i); }
		public WeaponForgeRecipeBuilder southEast    (TagKey<Item> t) { return slot("south_east", t); }
		public WeaponForgeRecipeBuilder farSouthEast (ItemLike i) { return slot("far_south_east",     i); }
		public WeaponForgeRecipeBuilder farSouthEast (TagKey<Item> t) { return slot("far_south_east",  t); }
		public WeaponForgeRecipeBuilder southWest    (ItemLike i) { return slot("south_west",     i); }
		public WeaponForgeRecipeBuilder southWest    (TagKey<Item> t) { return slot("south_west", t); }
		public WeaponForgeRecipeBuilder farSouthWest (ItemLike i) { return slot("far_south_west",     i); }
		public WeaponForgeRecipeBuilder farSouthWest (TagKey<Item> t) { return slot("far_south_west",  t); }
		public WeaponForgeRecipeBuilder northWest    (ItemLike i) { return slot("north_west",     i); }
		public WeaponForgeRecipeBuilder northWest    (TagKey<Item> t) { return slot("north_west", t); }
		public WeaponForgeRecipeBuilder farNorthWest (ItemLike i) { return slot("far_north_west",     i); }
		public WeaponForgeRecipeBuilder farNorthWest (TagKey<Item> t) { return slot("far_north_west",  t); }
		
		// ── Advancement criteria ─────────────────────────────────────────────────
		
		public WeaponForgeRecipeBuilder unlockedBy(String key, Criterion<?> criterion) {
				this.criteria.put(key, criterion);
				return this;
		}
		
		/** Shorthand: unlocked by having any item in the inventory. */
		public WeaponForgeRecipeBuilder unlockedBy(String key, ItemLike item) {
				return unlockedBy(key, InventoryChangeTrigger.TriggerInstance.hasItems(item));
		}
		
		// ── Save ─────────────────────────────────────────────────────────────────
		
		public void save(RecipeOutput output, ResourceLocation id) {
				ensureValid(id);
				
				Advancement.Builder advancement = output.advancement()
																	 .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(id))
																	 .rewards(AdvancementRewards.Builder.recipe(id))
																	 .requirements(AdvancementRequirements.Strategy.OR);
				criteria.forEach(advancement::addCriterion);
				
				WeaponForgeRecipe recipe = new WeaponForgeRecipe(
						Map.copyOf(slots), result, forgingTime);
				
				output.accept(
						id,
						recipe,
						advancement.build(id.withPrefix("recipes/" + category.getFolderName() + "/"))
				);
		}
		
		public void save(RecipeOutput output, String id) {
				save(output, ResourceLocation.parse(id));
		}
		
		private void ensureValid(ResourceLocation id) {
				if (result.isEmpty())
						throw new IllegalStateException("No result set for weapon forge recipe " + id);
				if (criteria.isEmpty())
						throw new IllegalStateException("No unlock criteria set for weapon forge recipe " + id);
		}
}