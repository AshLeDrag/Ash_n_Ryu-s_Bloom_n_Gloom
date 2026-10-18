package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.entity.client;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.*;
import net.AshLeDrag.thingsfordays.entity.custom.TeleportParticleEntity;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.joml.Matrix4f;

public class TeleportParticleRenderer extends EntityRenderer<TeleportParticleEntity> {
		
		public TeleportParticleRenderer(EntityRendererProvider.Context context) {
				super(context);
		}
		
		@Override
		public void render(TeleportParticleEntity entity, float yaw, float partialTick,
				PoseStack poseStack, MultiBufferSource bufferSource, int light) {
				
				float rotX = entity.prevRotX + (entity.rotX - entity.prevRotX) * partialTick;
				float rotY = entity.prevRotY + (entity.rotY - entity.prevRotY) * partialTick;
				float rotZ = entity.prevRotZ + (entity.rotZ - entity.prevRotZ) * partialTick;
				
				Matrix4f matrix = new Matrix4f();
				// poseStack already positions us at the entity origin
				matrix.set(poseStack.last().pose());
				matrix.rotateXYZ(
						(float) Math.toRadians(rotX),
						(float) Math.toRadians(rotY),
						(float) Math.toRadians(rotZ)
				);
				
				RenderSystem.enableDepthTest();
				RenderSystem.enableBlend();
				RenderSystem.defaultBlendFunc();
				RenderSystem.setShader(GameRenderer::getPositionColorShader);
				
				Tesselator tesselator = Tesselator.getInstance();
				BufferBuilder buffer = tesselator.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_COLOR);
				
				renderCube(buffer, matrix, 0.20f, 219f/255f, 63f/255f, 253f/255f, 1f, true);
				renderCube(buffer, matrix, 0.15f, 240f/255f, 167f/255f, 1f,       1f, false);
				
				BufferUploader.drawWithShader(buffer.buildOrThrow());
				
				RenderSystem.disableBlend();
				
		}
		
		private void renderCube(BufferBuilder buffer, Matrix4f matrix,
				float s, float r, float g, float b, float a, boolean inverted) {
				float[][] faces = getFloats(s, inverted);
				for (float[] v : faces) {
						for (int i = 0; i < 4; i++) {
								float lx = v[i * 3];
								float ly = v[i * 3 + 1];
								float lz = v[i * 3 + 2];
								
								float wx = matrix.m00()*lx + matrix.m10()*ly + matrix.m20()*lz + matrix.m30();
								float wy = matrix.m01()*lx + matrix.m11()*ly + matrix.m21()*lz + matrix.m31();
								float wz = matrix.m02()*lx + matrix.m12()*ly + matrix.m22()*lz + matrix.m32();
								
								buffer.addVertex(wx, wy, wz).setColor(r, g, b, a);
						}
				}
		}
		
		// Copied directly from your particle — keep in sync if you change it
		private static float[][] getFloats(float s, boolean inverted) {
				if (inverted) {
						return new float[][]{
								{-s, s,-s,  s, s,-s,  s, s, s, -s, s, s},
								{-s,-s, s,  s,-s, s,  s,-s,-s, -s,-s,-s},
								{ s,-s,-s,  s,-s, s,  s, s, s,  s, s,-s},
								{-s,-s, s, -s,-s,-s, -s, s,-s, -s, s, s},
								{-s, s, s,  s, s, s,  s,-s, s, -s,-s, s},
								{ s, s,-s, -s, s,-s, -s,-s,-s,  s,-s,-s}
						};
				} else {
						return new float[][]{
								{-s, s, s,  s, s, s,  s, s,-s, -s, s,-s},
								{-s,-s,-s,  s,-s,-s,  s,-s, s, -s,-s, s},
								{ s, s,-s,  s, s, s,  s,-s, s,  s,-s,-s},
								{-s, s, s, -s, s,-s, -s,-s,-s, -s,-s, s},
								{-s,-s, s,  s,-s, s,  s, s, s, -s, s, s},
								{ s,-s,-s, -s,-s,-s, -s, s,-s,  s, s,-s}
						};
				}
		}
		
		// No texture needed
		@Override
		public ResourceLocation getTextureLocation(TeleportParticleEntity entity) {
				return ResourceLocation.withDefaultNamespace("textures/misc/white.png");
		}
}