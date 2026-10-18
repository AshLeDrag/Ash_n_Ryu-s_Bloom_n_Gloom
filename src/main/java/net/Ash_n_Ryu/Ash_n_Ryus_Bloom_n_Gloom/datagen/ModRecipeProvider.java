package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.datagen;

import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.block.ModBlocks;
import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.item.ModItems;
import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.recipe.WeaponForgeRecipeBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
		public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
				super(output, registries);
		}
		
		@Override
		protected void buildRecipes(RecipeOutput recipeOutput) {
				
				modRecipes(recipeOutput);
				
				ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.Breadinium.Tools.HAMMER.get())
						.requires(ModItems.Breadinium.Tools.AXE_HAMMER)
						.unlockedBy("has_bismuth_block", has(ModItems.Breadinium.Resource.INGOT)).save(recipeOutput);
				
				
				ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Weapons.COLOSSAL_SWORD)
						.pattern("SMS")
						.pattern("SSS")
						.pattern("LTL")
						.define('S', ModItems.Steel.Stainless.Resource.INGOT)
						.define('M', ModItems.Mana.Resource.PURE_MANA)
						.define('L', Items.LEATHER)
						.define('T', Items.STICK)
						.unlockedBy("has_pure_mana", has(ModItems.Mana.Resource.PURE_MANA))
						.unlockedBy("has_stainless_steel_ingot", has(ModItems.Steel.Stainless.Resource.INGOT)).save(recipeOutput);
				
				
				List<ItemLike> BREADINIUM_SMELTABLES = List.of(ModItems.Breadinium.Resource.RAW,
						ModBlocks.BREADINIUM_ORE, ModBlocks.BREADINIUM_DEEPSLATE_ORE,
						ModBlocks.BREADINIUM_NETHER_ORE, ModBlocks.BREADINIUM_END_ORE);
				
				
				
				oreRecipies(recipeOutput, BREADINIUM_SMELTABLES, RecipeCategory.MISC, ModItems.Breadinium.Resource.INGOT, ModBlocks.BREADINIUM_BLOCK, 0.25f,  600, "breadinium");
				
		}
		
		
		
		
		
		protected static void modRecipes(RecipeOutput recipeOutput) {
				WeaponForgeRecipeBuilder.create(RecipeCategory.MISC)
						.forgingTime(800)
						.center(Items.NETHER_STAR)
						.north(ModGeneratedOres.ALL.get(0).ingot.get()).south(ModGeneratedOres.ALL.get(0).ingot.get())
						.east(ModGeneratedOres.ALL.get(3).ingot.get()).west(ModGeneratedOres.ALL.get(6).ingot.get())
						.farNorthEast(ModGeneratedOres.ALL.get(8).ingot.get()).farNorthWest(ModGeneratedOres.ALL.get(20).ingot.get())
						.result(ModItems.Weapons.ASTRAL_RIFTBLADE.get())
						.unlockedBy("has_astralium", has(ModGeneratedOres.ALL.get(0).ingot.get()))
						.save(recipeOutput, ThingsForDays.MOD_ID + ":astral_riftblade_forging");
		}
		
		
		
		
		
		
		
		
		protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
				float pExperience, int pCookingTIme, String pGroup) {
				oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
						pExperience, pCookingTIme, pGroup, "_from_smelting");
		}
		
		protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
				float pExperience, int pCookingTime, String pGroup) {
				oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
						pExperience, pCookingTime, pGroup, "_from_blasting");
		}
		
		protected static void oreRecipies(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, ItemLike pBlock,
				float pExperience, int pCookingTime, String pGroup) {
				
				oreSmelting(recipeOutput, pIngredients, pCategory, pResult, pExperience, pCookingTime*2, pGroup);
				oreBlasting(recipeOutput, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup);
				
				ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pBlock)
						.pattern("BBB")
						.pattern("BBB")
						.pattern("BBB")
						.define('B', pResult)
						.unlockedBy("has_" + getItemName(pResult), has(pResult)).save(recipeOutput);
				
				ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pResult, 9)
						.requires(pBlock)
						.unlockedBy("has_" + getItemName(pBlock), has(pBlock)).save(recipeOutput);
		}
		
		protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
				List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
				for(ItemLike itemlike : pIngredients) {
						SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
								.save(recipeOutput, ThingsForDays.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
				}
		}
}
