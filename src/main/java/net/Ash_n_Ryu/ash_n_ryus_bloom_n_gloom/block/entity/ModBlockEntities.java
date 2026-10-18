package net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.block.entity;

import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.Ash_n_Ryus_Bloom_n_Gloom;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockEntities {
		public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Ash_n_Ryus_Bloom_n_Gloom.MOD_ID);
		
		
		
		
		public static void register(IEventBus bus) {
				BLOCK_ENTITIES.register(bus);
		}
}
