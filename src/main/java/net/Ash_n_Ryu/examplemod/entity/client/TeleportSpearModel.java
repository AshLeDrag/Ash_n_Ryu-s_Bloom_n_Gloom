package net.Ash_n_Ryu.examplemod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.AshLeDrag.thingsfordays.entity.custom.TeleportSpearProjectileEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class TeleportSpearModel extends EntityModel<TeleportSpearProjectileEntity> {
		// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
		public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, "teleport_spear"), "main");
		private final ModelPart bb_main;
		
		public TeleportSpearModel(ModelPart root) {
				this.bb_main = root.getChild("bb_main");
		}
		
		public static LayerDefinition createBodyLayer() {
				MeshDefinition meshdefinition = new MeshDefinition();
				PartDefinition partdefinition = meshdefinition.getRoot();
				
				PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -19.0F, -1.0F, 2.0F, 21.0F, 2.0F, new CubeDeformation(0.0F))
																													.texOffs(30, 10).addBox(-1.5F, -19.25F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
																													.texOffs(22, 0).addBox(-1.5F, -15.25F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
																													.texOffs(22, 0).addBox(-1.5F, -13.25F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
																													.texOffs(22, 0).addBox(-1.5F, -1.25F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
																													.texOffs(22, 0).addBox(-1.5F, 0.75F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
																													.texOffs(22, 0).addBox(-1.5F, -3.25F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
																													.texOffs(39, 20).addBox(-4.5F, -31.5F, 0.0F, 9.0F, 12.25F, 0.0F, new CubeDeformation(0.0F))
																													.texOffs(42, 35).addBox(-0.5F, -28.25F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
				
				PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(12, 14).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -0.5F, -0.7854F, 0.0F, 0.0F));
				
				PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 14).addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.7F, 3.1F, 0.0F, 0.0F, 0.0F, -0.3927F));
				
				PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 14).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 3.1F, 1.7F, 0.3927F, 0.0F, 0.0F));
				
				PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(12, 14).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 3.1F, -1.7F, -0.3927F, 0.0F, 0.0F));
				
				PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(12, 14).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.7F, 3.1F, 0.0F, 0.0F, 0.0F, 0.3927F));
				
				PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(12, 14).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.5F, 0.7854F, 0.0F, 0.0F));
				
				PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(12, 14).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
				
				PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 14).addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
				
				return LayerDefinition.create(meshdefinition, 64, 64);
		}
		@Override
		public void setupAnim(
				TeleportSpearProjectileEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}
		
		@Override
		public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
				bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay,color);
		}
}
