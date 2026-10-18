package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.worldgen.trunkplacers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.AshLeDrag.thingsfordays.worldgen.ModTrunkPlacerTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class GiantSequoiaTrunkPlacer extends TrunkPlacer {
		
		// Custom codec with wider ranges than vanilla (which caps at 32/24/24)
		public static final MapCodec<GiantSequoiaTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec(instance ->
																																		instance.group(
																																				Codec.intRange(0, 80).fieldOf("base_height").forGetter(p -> p.baseHeight),
																																				Codec.intRange(0, 60).fieldOf("height_rand_a").forGetter(p -> p.heightRandA),
																																				Codec.intRange(0, 60).fieldOf("height_rand_b").forGetter(p -> p.heightRandB)
																																		).apply(instance, GiantSequoiaTrunkPlacer::new));
		
		public GiantSequoiaTrunkPlacer(int baseHeight, int heightRandA, int heightRandB) {
				super(baseHeight, heightRandA, heightRandB);
		}
		
		@Override
		protected TrunkPlacerType<?> type() {
				return ModTrunkPlacerTypes.GIANT_SEQUOIA_TRUNK_PLACER.get();
		}
		
		@Override
		public int getTreeHeight(RandomSource random) {
				// Clamp to 115 just in case
				return Math.min(115, this.baseHeight + random.nextInt(this.heightRandA + 1) + random.nextInt(this.heightRandB + 1));
		}
		
		@Override
		public List<FoliagePlacer.FoliageAttachment> placeTrunk(
				LevelSimulatedReader level,
				BiConsumer<BlockPos, BlockState> blockSetter,
				RandomSource random,
				int height,
				BlockPos startPos,
				TreeConfiguration config) {
				
				List<FoliagePlacer.FoliageAttachment> foliagePoints = new ArrayList<>();
				
				// The trunk is 2x2. startPos is the SW corner.
				int[][] trunkOffsets = {{0, 0}, {1, 0}, {0, 1}, {1, 1}};
				
				// ── Main 2x2 trunk ──────────────────────────────────────────────────
				for (int y = 0; y < height; y++) {
						for (int[] offset : trunkOffsets) {
								placeLog(level, blockSetter, random, startPos.offset(offset[0], y, offset[1]), config);
						}
				}
				
				// ── Tapered single-wide spire at the top (3-6 blocks) ───────────────
				int spireHeight = 3 + random.nextInt(4);
				for (int y = height; y < height + spireHeight; y++) {
						placeLog(level, blockSetter, random, startPos.offset(0, y, 0), config);
				}
				
				// ── Branches ────────────────────────────────────────────────────────
				// Start branching from ~55% of the way up
				int branchStart = (int) (height * 0.55);
				int branchSpacing = 8 + random.nextInt(6);
				
				for (int y = branchStart; y < height - 5; y += branchSpacing) {
						int numBranches = 2 + random.nextInt(3); // 2-4 branches per level
						
						for (int b = 0; b < numBranches; b++) {
								Direction dir = Direction.Plane.HORIZONTAL.getRandomDirection(random);
								int branchLen = 4 + random.nextInt(5); // 4-8 blocks long
								int rise = 1 + random.nextInt(3);      // how many times the branch rises
								
								placeBranch(level, blockSetter, random, startPos, y, dir, branchLen, rise, config, foliagePoints);
						}
						
						branchSpacing = 6 + random.nextInt(8); // vary spacing between levels
				}
				
				// ── Crown foliage attachments at the very top ───────────────────────
				int crownY = height + spireHeight;
				foliagePoints.add(new FoliagePlacer.FoliageAttachment(startPos.offset(0, crownY,     0), 0, false));
				foliagePoints.add(new FoliagePlacer.FoliageAttachment(startPos.offset(1, crownY - 1, 1), 0, false));
				foliagePoints.add(new FoliagePlacer.FoliageAttachment(startPos.offset(0, crownY - 2, 1), 0, false));
				foliagePoints.add(new FoliagePlacer.FoliageAttachment(startPos.offset(1, crownY - 2, 0), 0, false));
				
				return foliagePoints;
		}
		
		/**
		 * Places a single curved branch extending outward from the trunk.
		 * Starts at the trunk edge, extends horizontally, and curves upward.
		 */
		private void placeBranch(
				LevelSimulatedReader level,
				BiConsumer<BlockPos, BlockState> blockSetter,
				RandomSource random,
				BlockPos trunkBase,
				int yLevel,
				Direction dir,
				int length,
				int rise,
				TreeConfiguration config,
				List<FoliagePlacer.FoliageAttachment> foliagePoints) {
				
				// Pick a start position on the edge of the 2x2 trunk facing the branch direction
				BlockPos branchStart = trunkBase.offset(
						dir == Direction.EAST  ?  2 : (dir == Direction.WEST  ? -1 : random.nextBoolean() ? 0 : 1),
						yLevel,
						dir == Direction.SOUTH ?  2 : (dir == Direction.NORTH ? -1 : random.nextBoolean() ? 0 : 1)
				);
				
				BlockPos cur = branchStart;
				int riseStep = Math.max(1, length / rise); // every N blocks, rise 1 block
				
				for (int i = 0; i < length; i++) {
						placeLog(level, blockSetter, random, cur, config);
						cur = cur.relative(dir);
						if (i > 0 && i % riseStep == 0) {
								cur = cur.above();
						}
				}
				
				// Foliage attachment at the branch tip
				foliagePoints.add(new FoliagePlacer.FoliageAttachment(cur, 0, false));
		}
}