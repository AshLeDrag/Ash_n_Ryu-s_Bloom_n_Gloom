package net.Ash_n_Ryu.lumenfuge.worldgen;

import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.*;

import static net.minecraft.world.level.biome.Climate.Parameter.span;

public class ModBiomes {
		
		public static final Climate.ParameterPoint BLOOM_GLOOM_PARAM =
				new ParameterPointBuilder()
						.temperature(span(-0.2F, 0.2F))
						.humidity(span(-0.2F, 0.2F))
						.continentalness(span(0.2F, 0.4F))
						.erosion(span(-0.2F, 0.2F))
						.depth(Climate.Parameter.point(0.0F))
						.weirdness(span(-0.2F, 0.2F))
						.offset(0.0F)
						.build();
		
		public static final ResourceKey<Biome> BLOOM_GLOOM =
				ResourceKey.create(
						Registries.BIOME,
						ResourceLocation.fromNamespaceAndPath(
								Lumenfuge.MOD_ID,
								"bloom_gloom"
						)
				);
		
		public static void bootstrap(BootstrapContext<Biome> context) {
				BiomeGenerationSettings generationSettings =
						new BiomeGenerationSettings.Builder(
								context.lookup(Registries.PLACED_FEATURE),
								context.lookup(Registries.CONFIGURED_CARVER)
						).build();
				
				BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder()
																.skyColor(0x5A5A5A)
																.fogColor(0x6A917C)
																.waterColor(0x426B70)
																.waterFogColor(0x263D42)
																.grassColorOverride(0x4A4A4A)
																.foliageColorOverride(0x444444)
																.build();
				
				Biome biome = new Biome.BiomeBuilder()
										  .hasPrecipitation(true)
										  .temperature(0.7F)
										  .downfall(0.8F)
										  .specialEffects(effects)
										  .mobSpawnSettings(MobSpawnSettings.EMPTY)
										  .generationSettings(generationSettings)
										  .build();
				
				context.register(BLOOM_GLOOM, biome);
		}
		
		private static class ParameterPointBuilder {
				Climate.Parameter temperature, humidity, continentalness, erosion, depth, weirdness;
				float offset;
				
				public ParameterPointBuilder temperature(Climate.Parameter temperature) {
						this.temperature = temperature;
						return this;
				}
				
				public ParameterPointBuilder humidity(Climate.Parameter humidity) {
						this.humidity = humidity;
						return this;
				}
				
				public ParameterPointBuilder continentalness(Climate.Parameter continentalness) {
						this.continentalness = continentalness;
						return this;
				}
				
				public ParameterPointBuilder erosion(Climate.Parameter erosion) {
						this.erosion = erosion;
						return this;
				}
				
				public ParameterPointBuilder depth(Climate.Parameter depth) {
						this.depth = depth;
						return this;
				}
				
				public ParameterPointBuilder weirdness(Climate.Parameter weirdness) {
						this.weirdness = weirdness;
						return this;
				}
				
				public ParameterPointBuilder offset(float offset) {
						this.offset = offset;
						return this;
				}
				
				public Climate.ParameterPoint build() {
						return Climate.parameters(temperature, humidity, continentalness, erosion, depth, weirdness, offset);
				}
		}
}