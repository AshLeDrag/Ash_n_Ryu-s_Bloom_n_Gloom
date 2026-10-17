package net.Ash_n_Ryu.examplemod.datagen;

import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.AshLeDrag.thingsfordays.block.ModBlocks;
import net.AshLeDrag.thingsfordays.item.ModGeneratedOres;
import net.AshLeDrag.thingsfordays.item.ModItems;
import net.AshLeDrag.thingsfordays.recipe.WeaponForgeRecipeBuilder;
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
				ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.Breadinium.Tools.PICKAXE_HAMMER.get())
						.requires(ModItems.Breadinium.Tools.HAMMER)
						.unlockedBy("has_bismuth_block", has(ModItems.Breadinium.Resource.INGOT)).save(recipeOutput);
				ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.Breadinium.Tools.SHOVEL_HAMMER.get())
						.requires(ModItems.Breadinium.Tools.PICKAXE_HAMMER)
						.unlockedBy("has_bismuth_block", has(ModItems.Breadinium.Resource.INGOT)).save(recipeOutput);
				ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.Breadinium.Tools.AXE_HAMMER.get())
						.requires(ModItems.Breadinium.Tools.SHOVEL_HAMMER)
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
				
				
				List<ItemLike> MYTHRIL_SMELTABLES = List.of(ModItems.Mythril.Resource.RAW,
						ModBlocks.MYTHRIL_ORE, ModBlocks.MYTHRIL_DEEPSLATE_ORE,
						ModBlocks.MYTHRIL_NETHER_ORE, ModBlocks.MYTHRIL_END_ORE);
				
				oreRecipies(recipeOutput, MYTHRIL_SMELTABLES, RecipeCategory.MISC,
						ModItems.Mythril.Resource.INGOT, ModBlocks.MYTHRIL_BLOCK, 0.25f, 600, "mythril");
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

				WeaponForgeRecipeBuilder.create(RecipeCategory.COMBAT)
						.forgingTime(700)
						.center(Items.BLAZE_ROD)
						.north(ModGeneratedOres.ALL.get(1).ingot.get()).south(ModGeneratedOres.ALL.get(1).ingot.get())
						.east(ModGeneratedOres.ALL.get(16).ingot.get()).west(ModGeneratedOres.ALL.get(19).ingot.get())
						.farNorth(Items.MAGMA_CREAM).farSouth(Items.NETHERITE_INGOT)
						.result(ModItems.Weapons.VOLCANIC_CLEAVER.get())
						.unlockedBy("has_volcarite", has(ModGeneratedOres.ALL.get(1).ingot.get()))
						.save(recipeOutput, ThingsForDays.MOD_ID + ":volcanic_cleaver_forging");

				WeaponForgeRecipeBuilder.create(RecipeCategory.COMBAT)
						.forgingTime(650)
						.center(Items.ECHO_SHARD)
						.north(ModGeneratedOres.ALL.get(7).ingot.get()).south(ModGeneratedOres.ALL.get(7).ingot.get())
						.east(ModGeneratedOres.ALL.get(14).ingot.get()).west(ModGeneratedOres.ALL.get(17).ingot.get())
						.farNorthEast(ModGeneratedOres.ALL.get(13).ingot.get()).farNorthWest(ModGeneratedOres.ALL.get(15).ingot.get())
						.result(ModItems.Weapons.SYLVAN_GLAIVE.get())
						.unlockedBy("has_sylvarium", has(ModGeneratedOres.ALL.get(7).ingot.get()))
						.save(recipeOutput, ThingsForDays.MOD_ID + ":sylvan_glaive_forging");

				WeaponForgeRecipeBuilder.create(RecipeCategory.COMBAT)
						.forgingTime(750)
						.center(Items.HEART_OF_THE_SEA)
						.north(ModGeneratedOres.ALL.get(2).ingot.get()).south(ModGeneratedOres.ALL.get(2).ingot.get())
						.east(ModGeneratedOres.ALL.get(5).ingot.get()).west(ModGeneratedOres.ALL.get(12).ingot.get())
						.farNorth(Items.BLUE_ICE).farSouth(ModGeneratedOres.ALL.get(18).ingot.get())
						.result(ModItems.Weapons.CRYOLUNE_GREATSWORD.get())
						.unlockedBy("has_cryonite", has(ModGeneratedOres.ALL.get(2).ingot.get()))
						.save(recipeOutput, ThingsForDays.MOD_ID + ":cryolune_greatsword_forging");
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
