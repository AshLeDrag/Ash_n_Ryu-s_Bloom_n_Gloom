package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.entity.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class TeleportParticleEntity extends Entity {
		
		public float rotX, rotY, rotZ;
		public float prevRotX, prevRotY, prevRotZ;
		
		public TeleportParticleEntity(EntityType<?> type, Level level) {
				super(type, level);
				this.noPhysics = true;
				this.rotX = random.nextFloat() * 360f;
				this.rotY = random.nextFloat() * 360f;
				this.rotZ = random.nextFloat() * 360f;
		}
		
		@Override
		public void tick() {
				super.tick();
				prevRotX = rotX;
				prevRotY = rotY;
				prevRotZ = rotZ;
				rotX += 2.5f;
				rotY += 3.0f;
				rotZ += 1.5f;
		}
		
		@Override
		protected void defineSynchedData(SynchedEntityData.Builder builder) {}
		
		@Override
		protected void readAdditionalSaveData(CompoundTag tag) {
				rotX = tag.getFloat("rotX");
				rotY = tag.getFloat("rotY");
				rotZ = tag.getFloat("rotZ");
		}
		
		@Override
		protected void addAdditionalSaveData(CompoundTag tag) {
				tag.putFloat("rotX", rotX);
				tag.putFloat("rotY", rotY);
				tag.putFloat("rotZ", rotZ);
		}
}