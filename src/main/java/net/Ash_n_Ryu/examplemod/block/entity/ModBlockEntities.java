package net.Ash_n_Ryu.examplemod.block.entity;

import net.Ash_n_Ryu.examplemod.ExampleMod;
import net.Ash_n_Ryu.examplemod.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
		public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, ExampleMod.MOD_ID);
		
		
		public static final Supplier<BlockEntityType<WeaponForgeBlockEntity>> WEAPON_FORGE_BE = BLOCK_ENTITIES.register("weapon_forge", () -> BlockEntityType.Builder.of(
				WeaponForgeBlockEntity::new, ModBlocks.WEAPON_FORGE.get()).build(null));
		
		
		public static void register(IEventBus bus) {
				BLOCK_ENTITIES.register(bus);
		}
}
