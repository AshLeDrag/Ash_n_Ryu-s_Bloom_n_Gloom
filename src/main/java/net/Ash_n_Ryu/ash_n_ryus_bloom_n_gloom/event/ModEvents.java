package net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.event;





import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.Ash_n_Ryus_Bloom_n_Gloom;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.worldgen.ModBiomes;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.material.FogType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ViewportEvent;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;
import net.neoforged.neoforge.event.level.BlockEvent;

import java.util.HashSet;
import java.util.Set;

@EventBusSubscriber(modid = Ash_n_Ryus_Bloom_n_Gloom.MOD_ID)
public class ModEvents {

		@SubscribeEvent
		public static void renderFog(ViewportEvent.RenderFog event) {
				Minecraft minecraft = Minecraft.getInstance();
				
				if (minecraft.level == null) {
						return;
				}
				
				if (!minecraft.level.getBiome(event.getCamera().getBlockPosition())
							  .is(ModBiomes.BLOOM_GLOOM)) {
						return;
				}
				
				// Ne change pas le brouillard quand la caméra est dans l'eau ou la lave.
				if (event.getType() != FogType.NONE) {
						return;
				}
				
				event.setNearPlaneDistance(0.0F);
				event.setFarPlaneDistance(40.0F);
				event.setCanceled(true);
		}
}
