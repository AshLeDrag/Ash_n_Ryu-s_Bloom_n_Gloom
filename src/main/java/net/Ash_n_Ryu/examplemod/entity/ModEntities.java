package net.Ash_n_Ryu.examplemod.entity;

import net.Ash_n_Ryu.examplemod.ExampleMod;
import net.Ash_n_Ryu.examplemod.entity.custom.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
		public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
				DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, ExampleMod.MOD_ID);
		
		
		public static final Supplier<EntityType<TeleportParticleEntity>> SPINNING_CUBE =
				ENTITY_TYPES.register("spinning_cube", () ->
																			EntityType.Builder.<TeleportParticleEntity>of(TeleportParticleEntity::new, MobCategory.MISC)
																					.sized(0.5f, 0.5f)
																					.clientTrackingRange(8)
																					.build("spinning_cube"));
		
		public static final Supplier<EntityType<SteelThrowableProjectileEntity>> STEEL_THROWABLE =
				ENTITY_TYPES.register("steel_throwable", () -> EntityType.Builder.<SteelThrowableProjectileEntity>of(SteelThrowableProjectileEntity::new, MobCategory.MISC)
																			 .sized(0.5f, 0.5f).build("steel_throwable"));
		
		
		public static final Supplier<EntityType<TeleportSpearProjectileEntity>> TELEPORT_SWORD =
				ENTITY_TYPES.register("teleport_spear", () -> EntityType.Builder.<TeleportSpearProjectileEntity>of(TeleportSpearProjectileEntity::new, MobCategory.MISC)
																			 .sized(0.5f, 0.5f).build("teleport_spear"));
		
			
		
		public static void register(
				IEventBus eventBus) {
				ENTITY_TYPES.register(eventBus);
		}}
