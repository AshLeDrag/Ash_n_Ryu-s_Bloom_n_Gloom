package net.Ash_n_Ryu.examplemod.recipe;

import com.mojang.serialization.*;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class SlotsCodecHelper {
		
		record SlotsA(
				Optional<Ingredient> center,
				Optional<Ingredient> north,      Optional<Ingredient> far_north,
				Optional<Ingredient> south,      Optional<Ingredient> far_south,
				Optional<Ingredient> east,       Optional<Ingredient> far_east,
				Optional<Ingredient> west,       Optional<Ingredient> far_west
		) {
				static SlotsA fromMap(Map<String, Ingredient> m) {
						return new SlotsA(
								opt(m,"center"),   opt(m,"north"),    opt(m,"far_north"),
								opt(m,"south"),    opt(m,"far_south"),
								opt(m,"east"),     opt(m,"far_east"),
								opt(m,"west"),     opt(m,"far_west")
						);
				}
		}
		
		record SlotsB(
				Optional<Ingredient> north_east,     Optional<Ingredient> far_north_east,
				Optional<Ingredient> south_east,     Optional<Ingredient> far_south_east,
				Optional<Ingredient> south_west,     Optional<Ingredient> far_south_west,
				Optional<Ingredient> north_west,     Optional<Ingredient> far_north_west
		) {
				static SlotsB fromMap(Map<String, Ingredient> m) {
						return new SlotsB(
								opt(m,"north_east"),     opt(m,"far_north_east"),
								opt(m,"south_east"),     opt(m,"far_south_east"),
								opt(m,"south_west"),     opt(m,"far_south_west"),
								opt(m,"north_west"),     opt(m,"far_north_west")
						);
				}
		}
		
		private static final MapCodec<SlotsA> CODEC_A = RecordCodecBuilder.mapCodec(inst -> inst.group(
				Ingredient.CODEC.optionalFieldOf("center")    .forGetter(SlotsA::center),
				Ingredient.CODEC.optionalFieldOf("north")     .forGetter(SlotsA::north),
				Ingredient.CODEC.optionalFieldOf("far_north") .forGetter(SlotsA::far_north),
				Ingredient.CODEC.optionalFieldOf("south")     .forGetter(SlotsA::south),
				Ingredient.CODEC.optionalFieldOf("far_south") .forGetter(SlotsA::far_south),
				Ingredient.CODEC.optionalFieldOf("east")      .forGetter(SlotsA::east),
				Ingredient.CODEC.optionalFieldOf("far_east")  .forGetter(SlotsA::far_east),
				Ingredient.CODEC.optionalFieldOf("west")      .forGetter(SlotsA::west),
				Ingredient.CODEC.optionalFieldOf("far_west")  .forGetter(SlotsA::far_west)
		).apply(inst, SlotsA::new));
		
		private static final MapCodec<SlotsB> CODEC_B = RecordCodecBuilder.mapCodec(inst -> inst.group(
				Ingredient.CODEC.optionalFieldOf("north_east")     .forGetter(SlotsB::north_east),
				Ingredient.CODEC.optionalFieldOf("far_north_east") .forGetter(SlotsB::far_north_east),
				Ingredient.CODEC.optionalFieldOf("south_east")     .forGetter(SlotsB::south_east),
				Ingredient.CODEC.optionalFieldOf("far_south_east") .forGetter(SlotsB::far_south_east),
				Ingredient.CODEC.optionalFieldOf("south_west")     .forGetter(SlotsB::south_west),
				Ingredient.CODEC.optionalFieldOf("far_south_west") .forGetter(SlotsB::far_south_west),
				Ingredient.CODEC.optionalFieldOf("north_west")     .forGetter(SlotsB::north_west),
				Ingredient.CODEC.optionalFieldOf("far_north_west") .forGetter(SlotsB::far_north_west)
		).apply(inst, SlotsB::new));
		
		/**
		 * A flat MapCodec that reads/writes all 17 ingredient slots into the same
		 * JSON object level by manually implementing encode/decode over both sub-codecs.
		 * Wrap with .codec().fieldOf("ingredients") at the recipe level to get the
		 * "ingredients": { ... } nesting.
		 */
		public static final MapCodec<Map<String, Ingredient>> MERGED = new MapCodec<>() {
				
				@Override
				public <T> DataResult<Map<String, Ingredient>> decode(DynamicOps<T> ops, MapLike<T> input) {
						return CODEC_A.decode(ops, input).flatMap(a ->
																						CODEC_B.decode(ops, input).map(b -> {
																								Map<String, Ingredient> m = new HashMap<>();
																								putOpt(m, "center",         a.center());
																								putOpt(m, "north",          a.north());
																								putOpt(m, "far_north",      a.far_north());
																								putOpt(m, "south",          a.south());
																								putOpt(m, "far_south",      a.far_south());
																								putOpt(m, "east",           a.east());
																								putOpt(m, "far_east",       a.far_east());
																								putOpt(m, "west",           a.west());
																								putOpt(m, "far_west",       a.far_west());
																								putOpt(m, "north_east",     b.north_east());
																								putOpt(m, "far_north_east", b.far_north_east());
																								putOpt(m, "south_east",     b.south_east());
																								putOpt(m, "far_south_east", b.far_south_east());
																								putOpt(m, "south_west",     b.south_west());
																								putOpt(m, "far_south_west", b.far_south_west());
																								putOpt(m, "north_west",     b.north_west());
																								putOpt(m, "far_north_west", b.far_north_west());
																								return m;
																						}));
				}
				
				@Override
				public <T> RecordBuilder<T> encode(Map<String, Ingredient> input, DynamicOps<T> ops, RecordBuilder<T> prefix) {
						CODEC_A.encode(SlotsA.fromMap(input), ops, prefix);
						CODEC_B.encode(SlotsB.fromMap(input), ops, prefix);
						return prefix;
				}
				
				@Override
				public <T> Stream<T> keys(DynamicOps<T> ops) {
						return Stream.concat(CODEC_A.keys(ops), CODEC_B.keys(ops));
				}
		};
		
		private static void putOpt(Map<String, Ingredient> m, String key, Optional<Ingredient> val) {
				val.ifPresent(v -> m.put(key, v));
		}
		
		static Optional<Ingredient> opt(Map<String, Ingredient> m, String key) {
				return Optional.ofNullable(m.get(key));
		}
}