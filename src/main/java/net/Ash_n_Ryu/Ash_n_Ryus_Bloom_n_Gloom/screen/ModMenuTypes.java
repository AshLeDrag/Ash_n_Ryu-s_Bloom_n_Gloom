package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.screen;

import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.AshLeDrag.thingsfordays.screen.custom.WeaponForgeMenu;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModMenuTypes {
		public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(Registries.MENU, ThingsForDays.MOD_ID);
		
		public static final DeferredHolder<MenuType<?>, MenuType<WeaponForgeMenu>> WEAPON_FORGE_MENU =
				registerMenuType("weapon_forge_menu", WeaponForgeMenu::new);
		
		private static <T extends AbstractContainerMenu>DeferredHolder<MenuType<?>, MenuType<T>> registerMenuType(String name, IContainerFactory<T> factory) {
				return MENUS.register(name, () -> IMenuTypeExtension.create(factory));
		}
		
		public static void register(IEventBus eventBus) {
				MENUS.register(eventBus);
		}
}

