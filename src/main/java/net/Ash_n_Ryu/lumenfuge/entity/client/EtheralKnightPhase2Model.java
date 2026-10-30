package net.Ash_n_Ryu.lumenfuge.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.entity.custom.boss.EtheralKnightEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class EtheralKnightPhase2Model<T extends EtheralKnightEntity> extends HierarchicalModel<T> {
		public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, "etheral_knight_phase2"), "main");
		private final ModelPart Whole;
		private final ModelPart Etheral_Knight;
		private final ModelPart Lower_Body;
		private final ModelPart Legs;
		private final ModelPart Right_leg;
		private final ModelPart right_upper;
		private final ModelPart right_lower;
		private final ModelPart Right_foot;
		private final ModelPart Right_bottom_foot;
		private final ModelPart right_paddle;
		private final ModelPart right_claw_3;
		private final ModelPart right_claw_2;
		private final ModelPart right_claw_1;
		private final ModelPart right_thumb;
		private final ModelPart right_claw_4;
		private final ModelPart Left_leg;
		private final ModelPart left_upper;
		private final ModelPart left_lower;
		private final ModelPart Left_foot;
		private final ModelPart Left_bottom_foot;
		private final ModelPart left_paddle;
		private final ModelPart left_claw_1;
		private final ModelPart left_claw_2;
		private final ModelPart left_claw_3;
		private final ModelPart left_thumb;
		private final ModelPart left_claw_4;
		private final ModelPart Upper_Body;
		private final ModelPart waist0;
		private final ModelPart waist1;
		private final ModelPart waist2;
		private final ModelPart waist3;
		private final ModelPart waist4;
		private final ModelPart Arms;
		private final ModelPart Left_arm;
		private final ModelPart left_elbow;
		private final ModelPart left_forarm;
		private final ModelPart Right_arm;
		private final ModelPart right_elbow;
		private final ModelPart right_forarm;
		private final ModelPart Neck1;
		private final ModelPart Neck2;
		private final ModelPart Head;
		private final ModelPart Helmet;
		private final ModelPart Horns;
		private final ModelPart Horn_A;
		private final ModelPart HAP1;
		private final ModelPart HAP2;
		private final ModelPart HAP3;
		private final ModelPart HAP4;
		private final ModelPart Horn_B;
		private final ModelPart HBP1;
		private final ModelPart HBP2;
		private final ModelPart HBP3;
		private final ModelPart HBP4;
		public float netHeadYaw = 0f;
		public float  headPitch = 0f;
		
		public EtheralKnightPhase2Model(ModelPart root) {
				this.Whole = root.getChild("Whole");
				this.Etheral_Knight = this.Whole.getChild("Etheral_Knight");
				this.Lower_Body = this.Etheral_Knight.getChild("Lower_Body");
				this.Legs = this.Lower_Body.getChild("Legs");
				this.Right_leg = this.Legs.getChild("Right_leg");
				this.right_upper = this.Right_leg.getChild("right_upper");
				this.right_lower = this.right_upper.getChild("right_lower");
				this.Right_foot = this.right_lower.getChild("Right_foot");
				this.Right_bottom_foot = this.Right_foot.getChild("Right_bottom_foot");
				this.right_paddle = this.Right_bottom_foot.getChild("right_paddle");
				this.right_claw_3 = this.right_paddle.getChild("right_claw_3");
				this.right_claw_2 = this.right_paddle.getChild("right_claw_2");
				this.right_claw_1 = this.right_paddle.getChild("right_claw_1");
				this.right_thumb = this.Right_bottom_foot.getChild("right_thumb");
				this.right_claw_4 = this.right_thumb.getChild("right_claw_4");
				this.Left_leg = this.Legs.getChild("Left_leg");
				this.left_upper = this.Left_leg.getChild("left_upper");
				this.left_lower = this.left_upper.getChild("left_lower");
				this.Left_foot = this.left_lower.getChild("Left_foot");
				this.Left_bottom_foot = this.Left_foot.getChild("Left_bottom_foot");
				this.left_paddle = this.Left_bottom_foot.getChild("left_paddle");
				this.left_claw_1 = this.left_paddle.getChild("left_claw_1");
				this.left_claw_2 = this.left_paddle.getChild("left_claw_2");
				this.left_claw_3 = this.left_paddle.getChild("left_claw_3");
				this.left_thumb = this.Left_bottom_foot.getChild("left_thumb");
				this.left_claw_4 = this.left_thumb.getChild("left_claw_4");
				this.Upper_Body = this.Legs.getChild("Upper_Body");
				this.waist0 = this.Upper_Body.getChild("waist0");
				this.waist1 = this.waist0.getChild("waist1");
				this.waist2 = this.waist1.getChild("waist2");
				this.waist3 = this.waist2.getChild("waist3");
				this.waist4 = this.waist3.getChild("waist4");
				this.Arms = this.waist4.getChild("Arms");
				this.Left_arm = this.Arms.getChild("Left_arm");
				this.left_elbow = this.Left_arm.getChild("left_elbow");
				this.left_forarm = this.left_elbow.getChild("left_forarm");
				this.Right_arm = this.Arms.getChild("Right_arm");
				this.right_elbow = this.Right_arm.getChild("right_elbow");
				this.right_forarm = this.right_elbow.getChild("right_forarm");
				this.Neck1 = this.waist4.getChild("Neck1");
				this.Neck2 = this.Neck1.getChild("Neck2");
				this.Head = this.Neck2.getChild("Head");
				this.Helmet = this.Head.getChild("Helmet");
				this.Horns = this.Head.getChild("Horns");
				this.Horn_A = this.Horns.getChild("Horn_A");
				this.HAP1 = this.Horn_A.getChild("HAP1");
				this.HAP2 = this.HAP1.getChild("HAP2");
				this.HAP3 = this.HAP2.getChild("HAP3");
				this.HAP4 = this.HAP3.getChild("HAP4");
				this.Horn_B = this.Horns.getChild("Horn_B");
				this.HBP1 = this.Horn_B.getChild("HBP1");
				this.HBP2 = this.HBP1.getChild("HBP2");
				this.HBP3 = this.HBP2.getChild("HBP3");
				this.HBP4 = this.HBP3.getChild("HBP4");
		}
		
		public static LayerDefinition createBodyLayer() {
				MeshDefinition meshdefinition = new MeshDefinition();
				PartDefinition partdefinition = meshdefinition.getRoot();
				
				PartDefinition Whole = partdefinition.addOrReplaceChild("Whole", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
				
				PartDefinition Etheral_Knight = Whole.addOrReplaceChild("Etheral_Knight", CubeListBuilder.create(), PartPose.offset(0.0F, -0.35F, 0.0F));
				
				PartDefinition Lower_Body = Etheral_Knight.addOrReplaceChild("Lower_Body", CubeListBuilder.create(), PartPose.offset(0.0F, -33.15F, 14.0F));
				
				PartDefinition Legs = Lower_Body.addOrReplaceChild("Legs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
				
				PartDefinition Right_leg = Legs.addOrReplaceChild("Right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, 0.0F));
				
				PartDefinition right_upper = Right_leg.addOrReplaceChild("right_upper", CubeListBuilder.create(), PartPose.offset(-8.0F, -0.35F, 0.0F));
				
				PartDefinition cube_r1 = right_upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(104, 0).addBox(-3.0F, -2.9925F, -2.9909F, 6.0F, 6.0F, 24.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(-1.0F, 7.7F, -18.25F, 0.3927F, 0.0F, 0.0F));
				
				PartDefinition right_lower = right_upper.addOrReplaceChild("right_lower", CubeListBuilder.create(), PartPose.offset(-1.0F, 8.0F, -17.0F));
				
				PartDefinition cube_r2 = right_lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(164, 100).addBox(-4.0F, -3.3107F, -13.5621F, 6.0F, 6.0F, 17.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.0F, 8.4F, 7.25F, -0.7854F, 0.0F, 0.0F));
				
				PartDefinition Right_foot = right_lower.addOrReplaceChild("Right_foot", CubeListBuilder.create(), PartPose.offset(0.0F, 9.0F, 7.0F));
				
				PartDefinition cube_r3 = Right_foot.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(48, 190).addBox(-4.0F, -9.0F, -4.0F, 5.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 8.95F, -2.05F, -0.3927F, 0.0F, 0.0F));
				
				PartDefinition Right_bottom_foot = Right_foot.addOrReplaceChild("Right_bottom_foot", CubeListBuilder.create().texOffs(194, 79).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, -4.0F));
				
				PartDefinition right_paddle = Right_bottom_foot.addOrReplaceChild("right_paddle", CubeListBuilder.create(), PartPose.offset(0.0F, 1.35F, -3.0F));
				
				PartDefinition cube_r4 = right_paddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(162, 201).addBox(-2.0F, -3.0F, -2.0F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.8F, -0.7F, 0.3927F, 0.0F, 0.0F));
				
				PartDefinition right_claw_3 = right_paddle.addOrReplaceChild("right_claw_3", CubeListBuilder.create().texOffs(150, 202).addBox(-1.0F, -0.975F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 1.25F, -3.0F));
				
				PartDefinition claw6_r1 = right_claw_3.addOrReplaceChild("claw6_r1", CubeListBuilder.create().texOffs(206, 158).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.475F, -3.45F, 0.7854F, 0.0F, 0.0F));
				
				PartDefinition claw5_r1 = right_claw_3.addOrReplaceChild("claw5_r1", CubeListBuilder.create().texOffs(206, 154).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.075F)), PartPose.offsetAndRotation(0.0F, -1.075F, -1.75F, 0.3927F, 0.0F, 0.0F));
				
				PartDefinition right_claw_2 = right_paddle.addOrReplaceChild("right_claw_2", CubeListBuilder.create().texOffs(140, 202).addBox(-1.0F, -0.975F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.25F, -3.0F));
				
				PartDefinition claw5_r2 = right_claw_2.addOrReplaceChild("claw5_r2", CubeListBuilder.create().texOffs(206, 150).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.475F, -3.45F, 0.7854F, 0.0F, 0.0F));
				
				PartDefinition claw4_r1 = right_claw_2.addOrReplaceChild("claw4_r1", CubeListBuilder.create().texOffs(206, 146).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.075F)), PartPose.offsetAndRotation(0.0F, -1.075F, -1.75F, 0.3927F, 0.0F, 0.0F));
				
				PartDefinition right_claw_1 = right_paddle.addOrReplaceChild("right_claw_1", CubeListBuilder.create().texOffs(48, 183).addBox(-1.0F, -0.975F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 1.25F, -3.0F));
				
				PartDefinition claw4_r2 = right_claw_1.addOrReplaceChild("claw4_r2", CubeListBuilder.create().texOffs(206, 49).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.475F, -3.45F, 0.7854F, 0.0F, 0.0F));
				
				PartDefinition claw3_r1 = right_claw_1.addOrReplaceChild("claw3_r1", CubeListBuilder.create().texOffs(206, 45).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.075F)), PartPose.offsetAndRotation(0.0F, -1.075F, -1.75F, 0.3927F, 0.0F, 0.0F));
				
				PartDefinition right_thumb = Right_bottom_foot.addOrReplaceChild("right_thumb", CubeListBuilder.create(), PartPose.offset(-2.0F, 1.35F, 3.0F));
				
				PartDefinition cube_r5 = right_thumb.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(86, 42).addBox(-2.0F, -3.0F, -3.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.8F, 0.7F, -0.3927F, 0.0F, 0.0F));
				
				PartDefinition right_claw_4 = right_thumb.addOrReplaceChild("right_claw_4", CubeListBuilder.create().texOffs(206, 202).addBox(-1.0F, -0.725F, -0.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 3.0F));
				
				PartDefinition claw5_r3 = right_claw_4.addOrReplaceChild("claw5_r3", CubeListBuilder.create().texOffs(206, 206).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.225F, 2.75F, -0.7854F, 0.0F, 0.0F));
				
				PartDefinition claw4_r3 = right_claw_4.addOrReplaceChild("claw4_r3", CubeListBuilder.create().texOffs(106, 204).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.075F)), PartPose.offsetAndRotation(0.0F, -0.825F, 1.05F, -0.3927F, 0.0F, 0.0F));
				
				PartDefinition Left_leg = Legs.addOrReplaceChild("Left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, 0.0F));
				
				PartDefinition left_upper = Left_leg.addOrReplaceChild("left_upper", CubeListBuilder.create(), PartPose.offset(8.0F, -0.35F, 0.0F));
				
				PartDefinition cube_r6 = left_upper.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(104, 30).addBox(-3.0F, -2.9925F, -2.9909F, 6.0F, 6.0F, 24.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(1.0F, 7.7F, -18.25F, 0.3927F, 0.0F, 0.0F));
				
				PartDefinition left_lower = left_upper.addOrReplaceChild("left_lower", CubeListBuilder.create(), PartPose.offset(1.0F, 8.0F, -17.0F));
				
				PartDefinition cube_r7 = left_lower.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(164, 123).addBox(-2.0F, -3.3107F, -13.5621F, 6.0F, 6.0F, 17.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-1.0F, 8.4F, 7.25F, -0.7854F, 0.0F, 0.0F));
				
				PartDefinition Left_foot = left_lower.addOrReplaceChild("Left_foot", CubeListBuilder.create(), PartPose.offset(0.0F, 9.0F, 7.0F));
				
				PartDefinition cube_r8 = Left_foot.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(70, 190).addBox(-1.0F, -9.0F, -4.0F, 5.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 8.95F, -2.05F, -0.3927F, 0.0F, 0.0F));
				
				PartDefinition Left_bottom_foot = Left_foot.addOrReplaceChild("Left_bottom_foot", CubeListBuilder.create().texOffs(194, 89).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, -4.0F));
				
				PartDefinition left_paddle = Left_bottom_foot.addOrReplaceChild("left_paddle", CubeListBuilder.create(), PartPose.offset(0.0F, 1.35F, -3.0F));
				
				PartDefinition cube_r9 = left_paddle.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(116, 202).addBox(-5.0F, -3.0F, -2.0F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.8F, -0.7F, 0.3927F, 0.0F, 0.0F));
				
				PartDefinition left_claw_1 = left_paddle.addOrReplaceChild("left_claw_1", CubeListBuilder.create().texOffs(92, 204).addBox(-1.0F, -0.975F, -1.34F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 1.25F, -3.66F));
				
				PartDefinition claw7_r1 = left_claw_1.addOrReplaceChild("claw7_r1", CubeListBuilder.create().texOffs(8, 208).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.475F, -2.79F, 0.7854F, 0.0F, 0.0F));
				
				PartDefinition claw6_r2 = left_claw_1.addOrReplaceChild("claw6_r2", CubeListBuilder.create().texOffs(0, 208).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.075F)), PartPose.offsetAndRotation(0.0F, -1.075F, -1.09F, 0.3927F, 0.0F, 0.0F));
				
				PartDefinition left_claw_2 = left_paddle.addOrReplaceChild("left_claw_2", CubeListBuilder.create().texOffs(196, 202).addBox(-1.0F, -0.975F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.25F, -3.0F));
				
				PartDefinition claw6_r3 = left_claw_2.addOrReplaceChild("claw6_r3", CubeListBuilder.create().texOffs(194, 207).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.475F, -3.45F, 0.7854F, 0.0F, 0.0F));
				
				PartDefinition claw5_r4 = left_claw_2.addOrReplaceChild("claw5_r4", CubeListBuilder.create().texOffs(186, 207).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.075F)), PartPose.offsetAndRotation(0.0F, -1.075F, -1.75F, 0.3927F, 0.0F, 0.0F));
				
				PartDefinition left_claw_3 = left_paddle.addOrReplaceChild("left_claw_3", CubeListBuilder.create().texOffs(186, 202).addBox(-1.0F, -0.975F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 1.25F, -3.0F));
				
				PartDefinition claw5_r5 = left_claw_3.addOrReplaceChild("claw5_r5", CubeListBuilder.create().texOffs(148, 207).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.475F, -3.45F, 0.7854F, 0.0F, 0.0F));
				
				PartDefinition claw4_r4 = left_claw_3.addOrReplaceChild("claw4_r4", CubeListBuilder.create().texOffs(140, 207).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.075F)), PartPose.offsetAndRotation(0.0F, -1.075F, -1.75F, 0.3927F, 0.0F, 0.0F));
				
				PartDefinition left_thumb = Left_bottom_foot.addOrReplaceChild("left_thumb", CubeListBuilder.create(), PartPose.offset(2.0F, 1.35F, 3.0F));
				
				PartDefinition cube_r10 = left_thumb.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(86, 50).addBox(-1.0F, -3.0F, -3.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.8F, 0.7F, -0.3927F, 0.0F, 0.0F));
				
				PartDefinition left_claw_4 = left_thumb.addOrReplaceChild("left_claw_4", CubeListBuilder.create().texOffs(16, 208).addBox(-1.0F, -0.725F, -0.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 3.0F));
				
				PartDefinition claw6_r4 = left_claw_4.addOrReplaceChild("claw6_r4", CubeListBuilder.create().texOffs(24, 208).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.225F, 2.75F, -0.7854F, 0.0F, 0.0F));
				
				PartDefinition claw5_r6 = left_claw_4.addOrReplaceChild("claw5_r6", CubeListBuilder.create().texOffs(206, 41).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.075F)), PartPose.offsetAndRotation(0.0F, -0.825F, 1.05F, -0.3927F, 0.0F, 0.0F));
				
				PartDefinition Upper_Body = Legs.addOrReplaceChild("Upper_Body", CubeListBuilder.create().texOffs(164, 0).addBox(-8.0F, -5.35F, -7.0F, 16.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, 0.0F));
				
				PartDefinition waist0 = Upper_Body.addOrReplaceChild("waist0", CubeListBuilder.create().texOffs(62, 144).addBox(-6.0F, -8.35F, -7.0F, 12.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 2.0F));
				
				PartDefinition waist1 = waist0.addOrReplaceChild("waist1", CubeListBuilder.create().texOffs(164, 22).addBox(-7.0F, -5.35F, -8.0F, 14.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, -1.0F));
				
				PartDefinition waist2 = waist1.addOrReplaceChild("waist2", CubeListBuilder.create().texOffs(0, 144).addBox(-8.0F, -7.35F, -13.0F, 16.0F, 8.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 4.0F));
				
				PartDefinition waist3 = waist2.addOrReplaceChild("waist3", CubeListBuilder.create().texOffs(0, 62).addBox(-10.0F, -8.35F, -14.0F, 20.0F, 9.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));
				
				PartDefinition waist4 = waist3.addOrReplaceChild("waist4", CubeListBuilder.create().texOffs(0, 42).addBox(-12.0F, -18.35F, -15.25F, 24.0F, 19.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));
				
				PartDefinition Arms = waist4.addOrReplaceChild("Arms", CubeListBuilder.create(), PartPose.offset(0.0F, -7.85F, -6.5F));
				
				PartDefinition Left_arm = Arms.addOrReplaceChild("Left_arm", CubeListBuilder.create().texOffs(152, 61).addBox(2.5F, -5.5F, -5.0F, 10.0F, 29.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(12.0F, 0.0F, 0.0F));
				
				PartDefinition cube_r11 = Left_arm.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(164, 41).addBox(-2.5F, -3.5F, -3.5F, 14.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
				
				PartDefinition left_elbow = Left_arm.addOrReplaceChild("left_elbow", CubeListBuilder.create(), PartPose.offset(7.5F, 19.0F, 1.0F));
				
				PartDefinition left_forarm = left_elbow.addOrReplaceChild("left_forarm", CubeListBuilder.create().texOffs(1, 89).addBox(-6.0F, -1.5F, -7.0F, 12.0F, 29.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
				
				PartDefinition Right_arm = Arms.addOrReplaceChild("Right_arm", CubeListBuilder.create().texOffs(120, 163).addBox(-12.25F, -5.5F, -5.0F, 10.0F, 29.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, 0.0F, 0.0F));
				
				PartDefinition cube_r12 = Right_arm.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(164, 146).addBox(-11.5F, -3.5F, -3.5F, 14.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
				
				PartDefinition right_elbow = Right_arm.addOrReplaceChild("right_elbow", CubeListBuilder.create(), PartPose.offset(-7.5F, 19.0F, 1.0F));
				
				PartDefinition right_forarm = right_elbow.addOrReplaceChild("right_forarm", CubeListBuilder.create().texOffs(54, 103).addBox(-6.0F, -1.5F, -7.0F, 12.0F, 29.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
				
				PartDefinition Neck1 = waist4.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(92, 190).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -19.35F, -17.0F, 0.7854F, 0.0F, 0.0F));
				
				PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(194, 67).addBox(-3.0F, -6.0F, 0.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -3.0F, -0.3927F, 0.0F, 0.0F));
				
				PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
				
				PartDefinition Helmet = Head.addOrReplaceChild("Helmet", CubeListBuilder.create().texOffs(0, 167).addBox(-5.0F, 4.0F, 3.0F, 13.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -12.65F, -6.0F));
				
				PartDefinition Horns = Head.addOrReplaceChild("Horns", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, 3.0F));
				
				PartDefinition Horn_A = Horns.addOrReplaceChild("Horn_A", CubeListBuilder.create(), PartPose.offset(-7.0F, 0.0F, 0.0F));
				
				PartDefinition HAP1 = Horn_A.addOrReplaceChild("HAP1", CubeListBuilder.create().texOffs(48, 167).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
				
				PartDefinition HAP2 = HAP1.addOrReplaceChild("HAP2", CubeListBuilder.create().texOffs(52, 88).addBox(-3.0F, -2.25F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offset(-1.0F, 0.75F, 0.0F));
				
				PartDefinition HAP3 = HAP2.addOrReplaceChild("HAP3", CubeListBuilder.create().texOffs(86, 58).addBox(-4.0F, -1.9F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 0.15F, 0.0F));
				
				PartDefinition HAP4 = HAP3.addOrReplaceChild("HAP4", CubeListBuilder.create().texOffs(164, 55).addBox(-4.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offset(-4.0F, 0.1F, 0.0F));
				
				PartDefinition Horn_B = Horns.addOrReplaceChild("Horn_B", CubeListBuilder.create(), PartPose.offset(7.0F, 0.0F, 0.0F));
				
				PartDefinition HBP1 = Horn_B.addOrReplaceChild("HBP1", CubeListBuilder.create().texOffs(48, 173).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
				
				PartDefinition HBP2 = HBP1.addOrReplaceChild("HBP2", CubeListBuilder.create().texOffs(52, 94).addBox(-1.0F, -2.25F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offset(1.0F, 0.75F, 0.0F));
				
				PartDefinition HBP3 = HBP2.addOrReplaceChild("HBP3", CubeListBuilder.create().texOffs(176, 55).addBox(0.0F, -1.9F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.15F, 0.0F));
				
				PartDefinition HBP4 = HBP3.addOrReplaceChild("HBP4", CubeListBuilder.create().texOffs(48, 179).addBox(0.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offset(4.0F, 0.1F, 0.0F));
				
				return LayerDefinition.create(meshdefinition, 256, 256);
		}
		
		@Override
		public void setupAnim(EtheralKnightEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            root().getAllParts().forEach(ModelPart::resetPose);
            if (entity.isTransforming()) {
                animate(entity.transformationAnimationState, EtheralKnightPhase2Animations.transition_to_phase_2, ageInTicks);
                return;
            }
            float partialTick = Mth.clamp(ageInTicks - entity.tickCount, 0F, 1F);
            animate(entity.idleAnimationState, EtheralKnightPhase2Animations.baseline, ageInTicks);
            EtheralKnightPoseBlend.blend(root(), entity.getWalkBlend(partialTick), () ->
                    animate(entity.walkAnimationState, EtheralKnightPhase2Animations.walk, ageInTicks, 2F));
            if (entity.isAttacking()) {
                var attack = switch (entity.getAttack()) {
                    case 2 -> EtheralKnightPhase2Animations.hit_hand2;
                    case 3 -> EtheralKnightPhase2Animations.hit_both_hands;
                    default -> EtheralKnightPhase2Animations.hit_hand;
                };
                float elapsed = entity.getAttackTicks() + partialTick;
                float weight = Mth.clamp(Math.min(elapsed / 5F, (entity.getAttackDuration() - elapsed) / 5F), 0F, 1F);
                EtheralKnightPoseBlend.blend(root(), weight, () -> animate(entity.attackAnimationState, attack, ageInTicks));
            } else {
                applyHeadRotation(netHeadYaw, headPitch);
            }
        }
		  public ModelPart getHead() {
				return this.Head;
		}
		
		public void applyHeadRotation(float headYaw, float headPitch) {
				headYaw = Mth.clamp(headYaw, -30f, 30f);
				headPitch = Mth.clamp(headPitch, -25f, 45);
				
				this.Head.yRot += headYaw * ((float)Math.PI / 180f);
				this.Head.xRot += headPitch * ((float)Math.PI / 180f);
		}
		
		@Override
		public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
				Whole.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
		}
		
		@Override public ModelPart root() {
				return Whole;
		}
}
