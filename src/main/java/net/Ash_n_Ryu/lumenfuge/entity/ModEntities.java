package net.Ash_n_Ryu.lumenfuge.entity;

import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntities {
		public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
				DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, Lumenfuge.MOD_ID);
		
		
		
			
		
		public static void register(
				IEventBus eventBus) {
				ENTITY_TYPES.register(eventBus);
		}}
