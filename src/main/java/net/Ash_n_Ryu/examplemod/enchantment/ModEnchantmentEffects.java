package net.Ash_n_Ryu.examplemod.enchantment;

import com.mojang.serialization.MapCodec;
import net.Ash_n_Ryu.examplemod.ExampleMod;
import net.Ash_n_Ryu.examplemod.enchantment.custom.LightningStrikerEnchantmentEffect;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEnchantmentEffects {
		public static final DeferredRegister<MapCodec<? extends EnchantmentEntityEffect>> ENTITY_ENCHANTMENT_EFFECTS =
				DeferredRegister.create(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, ExampleMod.MOD_ID);
		
		
		public static final Supplier<MapCodec<? extends EnchantmentEntityEffect>> LIGHTNING_STRIKER =
				ENTITY_ENCHANTMENT_EFFECTS.register("lightning_striker", () -> LightningStrikerEnchantmentEffect.CODEC);
		
		public static void register(IEventBus eventBus) {
				ENTITY_ENCHANTMENT_EFFECTS.register(eventBus);
		}
}


