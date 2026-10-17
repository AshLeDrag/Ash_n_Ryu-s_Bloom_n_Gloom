package net.Ash_n_Ryu.examplemod.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public record WeaponForgeRecipe(Map<String, Ingredient> slotMap, ItemStack output, int forgingTime) implements Recipe<WeaponForgeRecipeInput> {
		
		public static final List<String> SLOT_NAMES = List.of(
				"center",
				"north",      "far_north",
				"south",      "far_south",
				"east",       "far_east",
				"west",       "far_west",
				"north_east", "far_north_east",
				"south_east", "far_south_east",
				"south_west", "far_south_west",
				"north_west", "far_north_west"
		);
		
		public Ingredient ingredientFor(String slotName) {
				return slotMap.getOrDefault(slotName, Ingredient.of());
		}
		
		@Override
		public boolean matches(WeaponForgeRecipeInput input, Level level) {
				if (level.isClientSide()) return false;
				for (int i = 0; i < SLOT_NAMES.size(); i++) {
						if (!ingredientFor(SLOT_NAMES.get(i)).test(input.getItem(i))) return false;
				}
				return true;
		}
		
		@Override
		public ItemStack assemble(WeaponForgeRecipeInput input, HolderLookup.Provider provider) {
				return output.copy();
		}
		
		@Override public boolean canCraftInDimensions(int w, int h) { return true; }
		@Override public ItemStack getResultItem(HolderLookup.Provider provider) { return output; }
		@Override public RecipeSerializer<?> getSerializer() { return ModRecipes.WEAPON_FORGE_SERIALIZER.get(); }
		@Override public RecipeType<?> getType() { return ModRecipes.WEAPON_FORGE_TYPE.get(); }
		
		// ── Codecs ───────────────────────────────────────────────────────────────
		
		public static final MapCodec<WeaponForgeRecipe> MAP_CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
				SlotsCodecHelper.MERGED.codec()
						.fieldOf("ingredients")
						.forGetter(r -> r.slotMap),
				ItemStack.CODEC
						.fieldOf("result")
						.forGetter(WeaponForgeRecipe::output),
				Codec.INT
						.optionalFieldOf("forgingtime", 200)
						.forGetter(WeaponForgeRecipe::forgingTime)
		).apply(inst, WeaponForgeRecipe::new));
		
		public static final StreamCodec<RegistryFriendlyByteBuf, WeaponForgeRecipe> STREAM_CODEC =
				StreamCodec.composite(
						ByteBufCodecs.map(
								HashMap::new,
								ByteBufCodecs.STRING_UTF8,
								Ingredient.CONTENTS_STREAM_CODEC
						), WeaponForgeRecipe::slotMap,
						ItemStack.STREAM_CODEC,  WeaponForgeRecipe::output,
						ByteBufCodecs.INT,       WeaponForgeRecipe::forgingTime,
						WeaponForgeRecipe::new
				);
		
		public static class Serializer implements RecipeSerializer<WeaponForgeRecipe> {
				@Override public MapCodec<WeaponForgeRecipe> codec()             { return MAP_CODEC; }
				@Override public StreamCodec<RegistryFriendlyByteBuf, WeaponForgeRecipe> streamCodec() { return STREAM_CODEC; }
		}
}