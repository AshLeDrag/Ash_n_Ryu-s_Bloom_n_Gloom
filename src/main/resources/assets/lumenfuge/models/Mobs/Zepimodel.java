// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Zepi-Gloom2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "zepi-gloom2"), "main");
	private final ModelPart root;

	public Zepi-Gloom2(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create().texOffs(40, 56).addBox(-1.0F, 4.0F, -3.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(39, 53).addBox(-3.0F, 4.0F, 1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(50, 53).addBox(1.0F, 4.0F, -1.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(52, 58).addBox(-3.0F, 4.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(12, 60).addBox(-5.0F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(36, 59).addBox(-5.0F, -3.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(28, 51).addBox(-5.0F, -3.0F, 2.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 51).addBox(-5.0F, -3.0F, -3.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 60).addBox(-5.0F, 0.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(16, 60).addBox(-5.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 59).addBox(-5.0F, 2.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(6, 55).addBox(-1.0F, -1.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 58).addBox(-1.0F, -2.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 53).addBox(-1.0F, -3.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 57).addBox(1.0F, -3.0F, 4.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(6, 57).addBox(-3.0F, -3.0F, 4.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 55).addBox(-1.0F, 2.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 56).addBox(4.0F, -3.0F, -3.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(18, 56).addBox(4.0F, -3.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 56).addBox(4.0F, -3.0F, 1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(14, 54).addBox(4.0F, 2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 48).addBox(-3.0F, -5.0F, -3.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(8, 44).addBox(1.0F, -5.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(27, 47).addBox(-3.0F, -5.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 44).addBox(-3.0F, -5.0F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(14, 48).addBox(-2.0F, -5.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 49).addBox(-3.0F, -3.0F, -5.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 51).addBox(-2.0F, -3.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 52).addBox(-1.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 48).addBox(0.0F, -2.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 52).addBox(-2.0F, -1.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 49).addBox(-2.0F, 2.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 56).addBox(2.0F, -3.0F, -5.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 5).addBox(-4.0F, 3.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(44, 4).addBox(-4.0F, -4.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(24, 6).addBox(3.0F, -4.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(14, 7).addBox(3.0F, 3.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 9).addBox(-3.0F, -4.0F, 3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 7).addBox(-3.0F, 3.0F, 3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 11).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 13).addBox(-3.0F, 3.0F, -4.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.0F, -3.0F, 3.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 0).addBox(-4.0F, -3.0F, -4.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 0).addBox(3.0F, -3.0F, -4.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 0).addBox(3.0F, -3.0F, 3.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}