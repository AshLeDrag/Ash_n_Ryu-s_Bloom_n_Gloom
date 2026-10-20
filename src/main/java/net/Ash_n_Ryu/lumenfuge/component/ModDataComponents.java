package net.Ash_n_Ryu.lumenfuge.component;

import com.mojang.serialization.Codec;
import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.UnaryOperator;

public class ModDataComponents {
		public static final DeferredRegister<DataComponentType<?>> DATA_COMPONENT_TYPES =
				DeferredRegister.createDataComponents(Registries.DATA_COMPONENT_TYPE, Lumenfuge.MOD_ID);
		
		public static final DeferredHolder<DataComponentType<?>, DataComponentType<BlockPos>> COORDINATES = register("coordinates",builder -> builder.persistent(BlockPos.CODEC));
		
		public static final DeferredHolder<DataComponentType<?>, DataComponentType<Integer>> WIDTH_RANGE = register("width",builder -> builder.persistent(Codec.INT));
		public static final DeferredHolder<DataComponentType<?>, DataComponentType<Integer>> DEPTH_RANGE = register("depth",builder -> builder.persistent(Codec.INT));
		
		public static final DeferredHolder<DataComponentType<?>, DataComponentType<Boolean>> CALCINATED = register("calcinated",builder -> builder.persistent(Codec.BOOL));
		
		
		
		private static <T>DeferredHolder<DataComponentType<?>, DataComponentType<T>> register(String name,
				UnaryOperator<DataComponentType.Builder<T>> builderOperator) {
				return DATA_COMPONENT_TYPES.register(name, () -> builderOperator.apply(DataComponentType.builder()).build());
		}
		
		public static void register(IEventBus eventBus) {
				DATA_COMPONENT_TYPES.register(eventBus);
		}
}
