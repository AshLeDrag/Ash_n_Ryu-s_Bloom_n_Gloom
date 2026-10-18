package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.sound;


import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.util.DeferredSoundType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModSounds {
		public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
				DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, ThingsForDays.MOD_ID);
		
		public static final Supplier<SoundEvent> MANA_BLOCK_BREAK = registerSoundEvent("mana_block_break");
		public static final Supplier<SoundEvent> MANA_BLOCK_STEP = registerSoundEvent("mana_block_step");
		public static final Supplier<SoundEvent> MANA_BLOCK_PLACE = registerSoundEvent("mana_block_place");
		public static final Supplier<SoundEvent> MANA_BLOCK_HIT = registerSoundEvent("mana_block_hit");
		public static final Supplier<SoundEvent> MANA_BLOCK_FALL = registerSoundEvent("mana_block_fall");
		
		public static final DeferredSoundType MANA_BLOCK_SOUNDS = new DeferredSoundType(1f, 1f,
				ModSounds.MANA_BLOCK_BREAK, ModSounds.MANA_BLOCK_STEP, ModSounds.MANA_BLOCK_PLACE,
				ModSounds.MANA_BLOCK_HIT, ModSounds.MANA_BLOCK_FALL);
		
		
		private static Supplier<SoundEvent> registerSoundEvent(String name) {
				ResourceLocation id = ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, name);
				return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
		}
		
		public static void register(IEventBus eventBus) {
				SOUND_EVENTS.register(eventBus);
		}
}