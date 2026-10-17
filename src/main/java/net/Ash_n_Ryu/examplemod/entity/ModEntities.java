package net.Ash_n_Ryu.examplemod.entity;

import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.AshLeDrag.thingsfordays.entity.custom.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
		public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
				DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, ThingsForDays.MOD_ID);
		
		
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
		
		
		public static final Supplier<EntityType<HardenedSwordProjectileEntity>> HARDENED_SWORD =
				ENTITY_TYPES.register("hardened_sword", () -> EntityType.Builder.<HardenedSwordProjectileEntity>of(HardenedSwordProjectileEntity::new, MobCategory.MISC)
																			 .sized(0.5f, 0.5f).build("hardened_sword"));
		
		
		public static final Supplier<EntityType<TeleportHardenedSpearProjectileEntity>> TELEPORT_HARDENED_SWORD =
				ENTITY_TYPES.register("hardened_teleport_sword", () -> EntityType.Builder.<TeleportHardenedSpearProjectileEntity>of(TeleportHardenedSpearProjectileEntity::new, MobCategory.MISC)
																			 .sized(0.5f, 0.5f).build("hardened_teleport_sword"));
		
		
		public static final Supplier<EntityType<GatherSwordProjectileEntity>> GATHER_SWORD =
				ENTITY_TYPES.register("gather_sword", () -> EntityType.Builder.<GatherSwordProjectileEntity>of(GatherSwordProjectileEntity::new, MobCategory.MISC)
																			 .sized(0.5f, 0.5f).build("gather_sword"));
		
		
			
		
		public static void register(
				IEventBus eventBus) {
				ENTITY_TYPES.register(eventBus);
		}}
