package net.Ash_n_Ryu.lumenfuge.event;





import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.worldgen.ModBiomes;
import net.minecraft.client.Minecraft;
import net.minecraft.world.level.material.FogType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ViewportEvent;

@EventBusSubscriber(modid = Lumenfuge.MOD_ID)
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
				
				event.setNearPlaneDistance(40.0F);
				event.setFarPlaneDistance(100.0F);
				event.setCanceled(true);
		}
}
