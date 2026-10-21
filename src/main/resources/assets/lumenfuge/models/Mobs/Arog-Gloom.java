// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Arog-Gloom<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "arog-gloom"), "main");
	private final ModelPart right leg;
	private final ModelPart left leg;
	private final ModelPart Head;
	private final ModelPart Cloak;
	private final ModelPart Body;

	public Arog-Gloom(ModelPart root) {
		this.right leg = root.getChild("right leg");
		this.left leg = root.getChild("left leg");
		this.Head = root.getChild("Head");
		this.Cloak = root.getChild("Cloak");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition right leg = partdefinition.addOrReplaceChild("right leg", CubeListBuilder.create().texOffs(28, 53).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 19.0F, 0.0F));

		PartDefinition left leg = partdefinition.addOrReplaceChild("left leg", CubeListBuilder.create().texOffs(20, 48).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 19.0F, 0.0F));

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
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		right leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Cloak.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}