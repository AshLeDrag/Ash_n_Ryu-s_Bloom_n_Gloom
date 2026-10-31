package net.Ash_n_Ryu.lumenfuge.sound;



import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.util.DeferredSoundType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModSounds {
		public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
				DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, Lumenfuge.MOD_ID);
		
		public static final Supplier<SoundEvent> ZEPI_NORMAL = registerSoundEvent("zepi");
		public static final Supplier<SoundEvent> ZEPI_HURT = registerSoundEvent("zepi_hurt");
		public static final Supplier<SoundEvent> ZEPI_STEP = registerSoundEvent("zepi_step");
		public static final Supplier<SoundEvent> ZEPI_DEATH = registerSoundEvent("zepi_death");
		public static final Supplier<SoundEvent> AROG_NORMAL = registerSoundEvent("arog");
		public static final Supplier<SoundEvent> AROG_HURT = registerSoundEvent("arog_hurt");
		public static final Supplier<SoundEvent> AROG_STEP = registerSoundEvent("arog_step");
		public static final Supplier<SoundEvent> AROG_DEATH = registerSoundEvent("arog_death");
		
		
		public static final Supplier<SoundEvent> ETHEREAL_AMBIENT = registerSoundEvent("ethereal_ambient");
		public static final Supplier<SoundEvent> ETHEREAL_HURT = registerSoundEvent("ethereal_hurt");
		public static final Supplier<SoundEvent> ETHEREAL_TRANSITION = registerSoundEvent("ethereal_transition");
		public static final Supplier<SoundEvent> ETHEREAL_ATTACK = registerSoundEvent("ethereal_attack");
		public static final Supplier<SoundEvent> ETHEREAL_DEATH = registerSoundEvent("ethereal_death");
		
		
		private static Supplier<SoundEvent> registerSoundEvent(String name) {
				ResourceLocation id = ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, name);
				return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
		}
		
		public static void register(IEventBus eventBus) {
				SOUND_EVENTS.register(eventBus);
		}
}