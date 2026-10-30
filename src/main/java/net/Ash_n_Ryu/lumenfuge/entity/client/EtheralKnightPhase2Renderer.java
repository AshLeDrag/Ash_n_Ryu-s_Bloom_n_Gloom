package net.Ash_n_Ryu.lumenfuge.entity.client;


import com.mojang.blaze3d.vertex.PoseStack;
import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.entity.custom.boss.EtheralKnightEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class EtheralKnightPhase2Renderer extends MobRenderer<EtheralKnightEntity, EtheralKnightPhase2Model<EtheralKnightEntity>> {
		public EtheralKnightPhase2Renderer(EntityRendererProvider.Context context) {
				super(context, new EtheralKnightPhase2Model<>(context.bakeLayer(EtheralKnightPhase2Model.LAYER_LOCATION)), 0.25f);
		}
		
		@Override
		public ResourceLocation getTextureLocation(EtheralKnightEntity entity) {
				return ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, "textures/entity/etheral_knight/etheral_knight_phase2.png");
		}
		
		@Override
		public void render(EtheralKnightEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
				super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
		}
}