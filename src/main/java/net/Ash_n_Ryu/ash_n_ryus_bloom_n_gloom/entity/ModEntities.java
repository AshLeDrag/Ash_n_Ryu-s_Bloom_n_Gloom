package net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.entity;

import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.Ash_n_Ryus_Bloom_n_Gloom;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntities {
		public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
				DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, Ash_n_Ryus_Bloom_n_Gloom.MOD_ID);
		
		
		
			
		
		public static void register(
				IEventBus eventBus) {
				ENTITY_TYPES.register(eventBus);
		}}
