package net.Ash_n_Ryu.examplemod.entity.client;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.*;
import com.mojang.math.Axis;
import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.AshLeDrag.thingsfordays.entity.custom.TeleportSpearProjectileEntity;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import org.joml.Matrix4f;

public class TeleportSpearRendered extends EntityRenderer<TeleportSpearProjectileEntity> {
		private TeleportSpearModel model;
		
		public TeleportSpearRendered(EntityRendererProvider.Context context) {
				super(context);
				this.model = new TeleportSpearModel(context.bakeLayer(TeleportSpearModel.LAYER_LOCATION));
		}
		
		@Override
		public void render(
				TeleportSpearProjectileEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
				poseStack.pushPose();
				poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entity.yRotO, entity.getYRot()) - 90.0F));
				poseStack.mulPose(Axis.ZP.rotationDegrees(Mth.lerp(partialTicks, entity.xRotO, entity.getXRot()) + 90.0F));
				VertexConsumer vertexconsumer = ItemRenderer.getFoilBufferDirect(buffer, this.model.renderType(this.getTextureLocation(entity)),false, false);
				this.model.renderToBuffer(poseStack, vertexconsumer, packedLight, OverlayTexture.NO_OVERLAY);
				poseStack.popPose();
				renderCubes(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
				
				super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
		}
		
		private static final ResourceLocation FRAME = ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, "textures/entity/teleport_spear/teleport_spear.png");
		
		private static final int TICKS_PER_FRAME = 5;
		
		@Override
		public ResourceLocation getTextureLocation(TeleportSpearProjectileEntity entity) {return FRAME;}
		
		
		
		public void renderCubes(TeleportSpearProjectileEntity entity, float yaw, float partialTick,
				PoseStack poseStack, MultiBufferSource bufferSource, int light) {
				
				float rotX = entity.prevRotX + (entity.rotX - entity.prevRotX) * partialTick;
				float rotY = entity.prevRotY + (entity.rotY - entity.prevRotY) * partialTick;
				float rotZ = entity.prevRotZ + (entity.rotZ - entity.prevRotZ) * partialTick;
				
				poseStack.pushPose();
				
				// Re-apply the same spear facing rotation as in render()
				poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTick, entity.yRotO, entity.getYRot()) - 90.0F));
				poseStack.mulPose(Axis.ZP.rotationDegrees(Mth.lerp(partialTick, entity.xRotO, entity.getXRot()) + 90.0F));
				
				// Now translate in the spear's local space
				poseStack.translate(0, 33f/16f, 0f);
				
				// Now build the spin matrix from the translated poseStack
				Matrix4f matrix = new Matrix4f();
				matrix.set(poseStack.last().pose());
				matrix.rotateXYZ(
						(float) Math.toRadians(rotX),
						(float) Math.toRadians(rotY),
						(float) Math.toRadians(rotZ)
				);
				poseStack.popPose();
				
				RenderSystem.enableDepthTest();
				RenderSystem.enableBlend();
				RenderSystem.defaultBlendFunc();
				RenderSystem.setShader(GameRenderer::getPositionColorShader);
				
				Tesselator tesselator = Tesselator.getInstance();
				BufferBuilder buffer = tesselator.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_COLOR);
				
				renderCube(buffer, matrix, 0.17f, 78f/255f, 14f/255f, 180f/255f, 1f, true);
				renderCube(buffer, matrix, 0.12f, 232f/255f, 142f/255f, 1f,       1f, false);
				
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
}
