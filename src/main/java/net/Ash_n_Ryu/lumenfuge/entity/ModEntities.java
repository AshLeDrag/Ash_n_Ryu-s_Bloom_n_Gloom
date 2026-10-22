package net.Ash_n_Ryu.lumenfuge.entity;

import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.entity.custom.ArogEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
			DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, Lumenfuge.MOD_ID);

	public static final Supplier<EntityType<ArogEntity>> AROG =
			ENTITY_TYPES.register("arog", () ->  EntityType.Builder.of(ArogEntity::new, MobCategory.CREATURE)
					.sized( 0.5f, 1.17f).build("arog"));

	public static void register(IEventBus eventBus) {ENTITY_TYPES.register(eventBus);}
}