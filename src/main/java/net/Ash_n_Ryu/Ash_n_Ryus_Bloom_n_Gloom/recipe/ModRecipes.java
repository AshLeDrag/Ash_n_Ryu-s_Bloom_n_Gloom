package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.recipe;

import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModRecipes {
		public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(Registries.RECIPE_SERIALIZER, ThingsForDays.MOD_ID);
		
		public static final DeferredRegister<RecipeType<?>> TYPES = DeferredRegister.create(Registries.RECIPE_TYPE, ThingsForDays.MOD_ID);
		
		public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<WeaponForgeRecipe>> WEAPON_FORGE_SERIALIZER =
				SERIALIZERS.register("weapon_forge", WeaponForgeRecipe.Serializer::new);
		public static final DeferredHolder<RecipeType<?>, RecipeType<WeaponForgeRecipe>> WEAPON_FORGE_TYPE =
				TYPES.register("weapon_forge", () -> new RecipeType<WeaponForgeRecipe>() {
						@Override
						public String toString() {
								return "weapon_forge";
						}
				});
		
		
		
		public static void register(IEventBus eventBus) {
				SERIALIZERS.register(eventBus);
				TYPES.register(eventBus);
		}
}
