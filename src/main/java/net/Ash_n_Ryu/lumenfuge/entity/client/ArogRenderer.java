package net.Ash_n_Ryu.lumenfuge.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.entity.custom.ArogEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ArogRenderer extends MobRenderer<ArogEntity, ArogModel<ArogEntity>> {
    public ArogRenderer(EntityRendererProvider.Context context) {
        super(context, new ArogModel<>(context.bakeLayer(ArogModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(ArogEntity arogEntity) {
        return ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, "textures/entity/arog/arog.png");
    }

    @Override
    public void render(ArogEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
