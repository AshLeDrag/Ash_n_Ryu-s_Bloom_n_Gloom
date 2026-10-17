package net.Ash_n_Ryu.examplemod.particle;

import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModParticles {
		public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
				DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, ThingsForDays.MOD_ID);
		
		public static final Supplier<SimpleParticleType> MY_3D_PARTICLE =
				PARTICLE_TYPES.register("my_3d_particle", () -> new SimpleParticleType(false));
		
		public static void register(IEventBus eventBus) {
				PARTICLE_TYPES.register(eventBus);
		}
}