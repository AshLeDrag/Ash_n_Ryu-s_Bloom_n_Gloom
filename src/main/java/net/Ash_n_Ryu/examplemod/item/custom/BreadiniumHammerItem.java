package net.Ash_n_Ryu.examplemod.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

import java.util.ArrayList;
import java.util.List;

public class BreadiniumHammerItem extends DiggerItem {
		
		public BreadiniumHammerItem(Tier tier, Properties properties, int rngw, int rngd, TagKey<Block> block) {
				super(tier, block, properties);
		}
		
		static int getWidthRange(){
				return 1;
		}
		
		static int getDepthRange(){
				return 2;
		}
		
		public static List<BlockPos> getBlocksToBeDestroyed( BlockPos initalBlockPos, ServerPlayer player) {
				List<BlockPos> positions = new ArrayList<>();
				
				BlockHitResult traceResult = player.level().clip(new ClipContext(player.getEyePosition(1f),
						(player.getEyePosition(1f).add(player.getViewVector(1f).scale(6f))),
						ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, player));
				if(traceResult.getType() == HitResult.Type.MISS) {
						return positions;
				}
				int depth_range = getDepthRange();
				int width_range = getWidthRange();
				
				System.out.println("depth_range: " + depth_range);
				System.out.println("width_range: " + width_range);
				
				if(traceResult.getDirection() == Direction.UP) {
						System.out.println("depth_range: " + depth_range);
						System.out.println("width_range: " + width_range);
						for(int y = -depth_range; y <=0; y++) {
								for (int x = -width_range; x <= width_range; x++) {
										for (int z = -width_range; z <= width_range; z++) {
												System.out.println("depth_range: " + depth_range);
												System.out.println("width_range: " + width_range);
												positions.add(new BlockPos(
														initalBlockPos.getX() + x,
														initalBlockPos.getY() + y,
														initalBlockPos.getZ() + z
												));
										}
								}
						}
				}
				if(traceResult.getDirection() == Direction.DOWN) {
						System.out.println("depth_range: " + depth_range);
						System.out.println("width_range: " + width_range);
						for(int y = 0; y <=depth_range; y++) {
								for (int x = -width_range; x <= width_range; x++) {
										for (int z = -width_range; z <= width_range; z++) {
												System.out.println("depth_range: " + depth_range);
												System.out.println("width_range: " + width_range);
												positions.add(new BlockPos(
														initalBlockPos.getX() + x,
														initalBlockPos.getY() + y,
														initalBlockPos.getZ() + z
												));
										}
								}
						}
				}
				
				
				
				if(traceResult.getDirection() == Direction.NORTH) {
						System.out.println("depth_range: " + depth_range);
						System.out.println("width_range: " + width_range);
						for(int z = 0; z <=depth_range; z++) {
								for (int x = -width_range; x <= width_range; x++) {
										for (int y = -width_range; y <= width_range; y++) {
												System.out.println("depth_range: " + depth_range);
												System.out.println("width_range: " + width_range);
												positions.add(new BlockPos(
														initalBlockPos.getX() + x,
														initalBlockPos.getY() + y,
														initalBlockPos.getZ() + z
												));
										}
								}
						}
				}
				if(traceResult.getDirection() == Direction.SOUTH) {
						System.out.println("depth_range: " + depth_range);
						System.out.println("width_range: " + width_range);
						for(int z = -depth_range; z <=0; z++) {
								for (int x = -width_range; x <= width_range; x++) {
										for (int y = -width_range; y <= width_range; y++) {
												System.out.println("depth_range: " + depth_range);
												System.out.println("width_range: " + width_range);
												positions.add(new BlockPos(
														initalBlockPos.getX() + x,
														initalBlockPos.getY() + y,
														initalBlockPos.getZ() + z
												));
										}
								}
						}
				}
				
				
				
				if(traceResult.getDirection() == Direction.EAST) {
						System.out.println("depth_range: " + depth_range);
						System.out.println("width_range: " + width_range);
						for(int x = -depth_range; x <=0; x++) {
								for (int z = -width_range; z <= width_range; z++) {
										for (int y = -width_range; y <= width_range; y++) {
												System.out.println("depth_range: " + depth_range);
												System.out.println("width_range: " + width_range);
												positions.add(new BlockPos(
														initalBlockPos.getX() + x,
														initalBlockPos.getY() + y,
														initalBlockPos.getZ() + z
												));
										}
								}
						}
				}
				if(traceResult.getDirection() == Direction.WEST) {
						System.out.println("depth_range: " + depth_range);
						System.out.println("width_range: " + width_range);
						for(int x = 0; x <=depth_range; x++) {
								for (int z = -width_range; z <= width_range; z++) {
										System.out.println("depth_range: " + depth_range);
										System.out.println("width_range: " + width_range);
										for (int y = -width_range; y <= width_range; y++) {
												positions.add(new BlockPos(
														initalBlockPos.getX() + x,
														initalBlockPos.getY() + y,
														initalBlockPos.getZ() + z
												));
										}
								}
						}
				}
				System.out.println(positions);
				return positions;
		}
		
		
}
