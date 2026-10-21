package net.Ash_n_Ryu.lumenfuge.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.entity.custom.ArogEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;


public class ArogModel<T extends ArogEntity> extends HierarchicalModel<T> {
      // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
      public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, "arog-gloom"), "main");
      private final ModelPart Legs;
      private final ModelPart Head;
      private final ModelPart Body;
      private final ModelPart Cloak;
      
      public ArogModel(ModelPart root) {
            this.Legs = root.getChild("Legs");
            this.Head = root.getChild("Head");
            this.Body = root.getChild("Body");
            this.Cloak = root.getChild("Cloak");
      }
      
      public static LayerDefinition createBodyLayer() {
            MeshDefinition meshdefinition = new MeshDefinition();
            PartDefinition partdefinition = meshdefinition.getRoot();
            
            PartDefinition Legs = partdefinition.addOrReplaceChild("Legs", CubeListBuilder.create().texOffs(28, 53).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(20, 48).addBox(1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 24.0F, 0.0F));
            
            PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(11, 19).addBox(2.0F, -1.65F, -3.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(23, 21).addBox(2.0F, -1.65F, 0.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(0, 28).addBox(3.0F, 3.35F, -3.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(16, 13).addBox(9.0F, -1.65F, -3.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(0, 22).addBox(5.0F, 0.35F, -3.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(0, 17).addBox(3.0F, -1.65F, -3.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(16, 25).addBox(7.0F, -1.65F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(20, 55).addBox(1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(54, 32).addBox(0.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(24, 55).addBox(10.0F, 0.0F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(54, 37).addBox(11.0F, -2.0F, -1.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 7.0F, 1.0F));
            
            PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(30, 42).addBox(-4.0F, -7.0F, -1.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(36, 53).addBox(-3.0F, -8.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 19.0F, -1.0F));
            
            PartDefinition Cloak = partdefinition.addOrReplaceChild("Cloak", CubeListBuilder.create().texOffs(0, 32).addBox(-4.0F, -11.75F, -3.5F, 8.0F, 9.0F, 7.0F, new CubeDeformation(0.0F))
                                                                                   .texOffs(2, 33).addBox(-3.5F, -12.25F, -3.0F, 7.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
                                                                                   .texOffs(0, 48).addBox(-4.5F, -11.25F, -2.0F, 1.0F, 10.0F, 4.0F, new CubeDeformation(0.0F))
                                                                                   .texOffs(10, 48).addBox(3.5F, -11.25F, -2.0F, 1.0F, 10.0F, 4.0F, new CubeDeformation(0.0F))
                                                                                   .texOffs(48, 42).addBox(-3.0F, -11.25F, 3.0F, 6.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
                                                                                   .texOffs(48, 52).addBox(-3.0F, -11.25F, -4.0F, 6.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
            
            return LayerDefinition.create(meshdefinition, 64, 64);
      }
      
      @Override
      public void setupAnim(ArogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.root().getAllParts().forEach(ModelPart::resetPose);
            this.applyHeadRotation(netHeadYaw, headPitch);
            
            this.animateWalk(ArogAnimations.ANIM_AROG_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
            this.animate(entity.idleAnimationState, ArogAnimations.ANIM_AROG_IDLE, ageInTicks, 1f);
      }
      
      private void applyHeadRotation(float headYaw, float headPitch) {
            headYaw = Mth.clamp(headYaw, -30f, 30f);
            headPitch = Mth.clamp(headPitch, -25f, 45);
            
            this.Head.yRot = headYaw * ((float)Math.PI / 180f);
            this.Head.xRot = headPitch * ((float)Math.PI / 180f);
      }
      
      @Override
      public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
            Legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
            Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
            Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
            Cloak.render(poseStack, vertexConsumer, packedLight, packedOverlay,color);
      }
      
      @Override
      public ModelPart root() {
            return Body;
      }
}

