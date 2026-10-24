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
      private final ModelPart root;
      private final ModelPart right_leg;
      private final ModelPart left_leg;
      private final ModelPart Head;
      private final ModelPart Cloak;
      private final ModelPart Body;
      public float netHeadYaw = 0f;
      public float  headPitch = 0f;
      
      
      
      
      public ArogModel(ModelPart root) {
            this.root = root;
            this.right_leg = root.getChild("right leg");
            this.left_leg = root.getChild("left leg");
            this.Head = root.getChild("Head");
            this.Cloak = root.getChild("Cloak");
            this.Body = root.getChild("Body");
      }
      
      public static LayerDefinition createBodyLayer() {
            MeshDefinition meshdefinition = new MeshDefinition();
            PartDefinition partdefinition = meshdefinition.getRoot();
            
            PartDefinition right_leg = partdefinition.addOrReplaceChild("right leg", CubeListBuilder.create().texOffs(28, 53).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 19.0F, 0.0F));
            
            PartDefinition left_leg = partdefinition.addOrReplaceChild("left leg", CubeListBuilder.create().texOffs(20, 48).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 19.0F, 0.0F));
            
            PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(11, 19).addBox(-4.0F, -5.9F, -2.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(23, 21).addBox(-4.0F, -5.9F, 1.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(0, 28).addBox(-3.0F, -0.9F, -2.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(16, 13).addBox(3.0F, -5.9F, -2.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(0, 22).addBox(-1.0F, -3.9F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(0, 17).addBox(-3.0F, -5.9F, -2.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(16, 25).addBox(1.0F, -5.9F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(20, 55).addBox(-5.0F, -5.25F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(54, 32).addBox(-6.0F, -8.25F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(24, 55).addBox(4.0F, -4.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(54, 37).addBox(5.0F, -6.25F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.25F, 0.0F));
            
            PartDefinition Cloak = partdefinition.addOrReplaceChild("Cloak", CubeListBuilder.create().texOffs(0, 32).addBox(-4.0F, -11.75F, -3.5F, 8.0F, 9.0F, 7.0F, new CubeDeformation(0.0F))
                                                                                   .texOffs(2, 33).addBox(-3.5F, -12.25F, -3.0F, 7.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
                                                                                   .texOffs(0, 48).addBox(-4.5F, -11.25F, -2.0F, 1.0F, 10.0F, 4.0F, new CubeDeformation(0.0F))
                                                                                   .texOffs(10, 48).addBox(3.5F, -11.25F, -2.0F, 1.0F, 10.0F, 4.0F, new CubeDeformation(0.0F))
                                                                                   .texOffs(48, 42).addBox(-3.0F, -11.25F, 3.0F, 6.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
                                                                                   .texOffs(48, 52).addBox(-3.0F, -11.25F, -4.0F, 6.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
            
            PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(30, 42).addBox(-2.5F, -11.8267F, -2.6441F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
                                                                                 .texOffs(36, 53).addBox(-1.5F, -12.8267F, -0.6441F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
            
            return LayerDefinition.create(meshdefinition, 64, 64);
      }
      
      
      @Override
      public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
            right_leg.render  (poseStack, vertexConsumer, packedLight, packedOverlay,color);
            left_leg.render   (poseStack, vertexConsumer, packedLight, packedOverlay,color);
            Head.render       (poseStack, vertexConsumer, packedLight, packedOverlay,color);
            Cloak.render      (poseStack, vertexConsumer, packedLight, packedOverlay,color);
            Body.render       (poseStack, vertexConsumer, packedLight, packedOverlay,color);
      }
      
      @Override
      public void setupAnim(ArogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.root().getAllParts().forEach(ModelPart::resetPose);
            this.applyHeadRotation(netHeadYaw, headPitch);
            this.netHeadYaw = netHeadYaw;
            this.headPitch = headPitch;
            this.animateWalk(ArogAnimations.ANIM_AROG_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
            this.animate(entity.idleAnimationState, ArogAnimations.ANIM_AROG_IDLE, ageInTicks, 1f);
      }
      
      public ModelPart getHead() {
            return this.Head;
      }
      
      public void applyHeadRotation(float headYaw, float headPitch) {
            headYaw = Mth.clamp(headYaw, -30f, 30f);
            headPitch = Mth.clamp(headPitch, -25f, 45);
            
            this.Head.yRot = headYaw * ((float)Math.PI / 180f);
            this.Head.xRot = headPitch * ((float)Math.PI / 180f);
      }
      
      @Override
      public ModelPart root() {
            return root;
      }
}

