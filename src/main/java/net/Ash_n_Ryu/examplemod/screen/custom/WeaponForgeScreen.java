package net.Ash_n_Ryu.examplemod.screen.custom;

import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class WeaponForgeScreen extends AbstractContainerScreen<WeaponForgeMenu> {
		private static final ResourceLocation GUI_TEXTURE =
				ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID,"textures/gui/weapon_forge/weapon_forge_gui.png");
		private static final ResourceLocation ARROW_TEXTURE =
				ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID,"textures/gui/arrow_progress.png");
		
		public WeaponForgeScreen(WeaponForgeMenu menu, Inventory playerInventory, Component title) {
				super(menu, playerInventory, title);
		}
		@Override
		public void init() {
				this.imageWidth = 243;
				this.imageHeight = 221;
				super.init();
				this.titleLabelX = (this.imageWidth - this.font.width(this.title)) / 2 - 35;
				this.titleLabelY = 6;
				this.inventoryLabelY = this.imageHeight - 96;
				this.inventoryLabelX = 60;
		}
		@Override
		protected void renderBg(GuiGraphics guiGraphics, float v, int i, int i1) {
				int x = (width - this.imageWidth) / 2;
				int y = (height - this.imageHeight) / 2;
				guiGraphics.blit(GUI_TEXTURE, x, y, 0, 0, this.imageWidth, this.imageHeight);
				renderProgressArrow(guiGraphics, x, y);
		}
		
		private void renderProgressArrow(GuiGraphics guiGraphics, int x, int y) {
				if (menu.isCrafting()) {
						guiGraphics.blit(ARROW_TEXTURE, x + 149, y + 60, 0, 0, menu.getScaledArrowProgress(), 16, 24, 16);
				}
		}
		
		@Override
		public void render(GuiGraphics pGuiGraphics, int pMouseX, int pMouseY, float pPartialTick) {
				super.render(pGuiGraphics, pMouseX, pMouseY, pPartialTick);
				this.renderTooltip(pGuiGraphics, pMouseX, pMouseY);
		}
}
