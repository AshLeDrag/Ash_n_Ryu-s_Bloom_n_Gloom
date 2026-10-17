package net.Ash_n_Ryu.examplemod.event;


import net.Ash_n_Ryu.examplemod.ExampleMod;
import net.Ash_n_Ryu.examplemod.item.custom.BreadiniumHammerItem;
import net.Ash_n_Ryu.examplemod.potion.ModPotions;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;
import net.neoforged.neoforge.event.level.BlockEvent;

import java.util.HashSet;
import java.util.Set;

@EventBusSubscriber(modid = ExampleMod.MOD_ID)
public class ModEvents {
		private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();
		
		// Done with the help of https://github.com/CoFH/CoFHCore/blob/1.19.x/src/main/java/cofh/core/event/AreaEffectEvents.java
		// Don't be a jerk License
		@SubscribeEvent
		public static void onHammerUsage(BlockEvent.BreakEvent event) {
				Player player = event.getPlayer();
				ItemStack mainHandItem = player.getMainHandItem();
				
				if(mainHandItem.getItem() instanceof DiggerItem hammer && player instanceof ServerPlayer serverPlayer) {
						BlockPos initialBlockPos = event.getPos();
						if(HARVESTED_BLOCKS.contains(initialBlockPos)) {
								return;
						}
						
						for(BlockPos pos : BreadiniumHammerItem.getBlocksToBeDestroyed(initialBlockPos, serverPlayer)) {
								if(pos == initialBlockPos || !hammer.isCorrectToolForDrops(mainHandItem, event.getLevel().getBlockState(pos))) {
										continue;
								}
								
								HARVESTED_BLOCKS.add(pos);
								serverPlayer.gameMode.destroyBlock(pos);
								HARVESTED_BLOCKS.remove(pos);
						}
				}
		}
		
		@SubscribeEvent
		public static void onBrewingRecipeRegister(RegisterBrewingRecipesEvent event) {
				PotionBrewing.Builder builder = event.getBuilder();
				
				builder.addMix(Potions.AWKWARD, Items.SLIME_BALL, ModPotions.SLIMEY_POTION);
		}
}
