package net.Ash_n_Ryu.lumenfuge.entity.client;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.*;
import com.mojang.math.Axis;
import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.entity.custom.ArogEntity;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import org.joml.Matrix4f;

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
        if(!entity.isDeadOrDying()) {
            poseStack.pushPose();
            float bodyYaw = Mth.rotLerp(partialTicks, entity.yBodyRotO, entity.yBodyRot);
            poseStack.mulPose(Axis.YP.rotationDegrees(180.0F - bodyYaw));
            poseStack.scale(-1.0F, -1.0F, 1.0F);
            poseStack.translate(0.0F, -1.501F, 0.0F);
            this.getModel().getHead().translateAndRotate(poseStack);
            renderEyes(poseStack);
            poseStack.popPose();
        }
    }
    
    private void renderEyes(PoseStack poseStack) {
        Matrix4f matrix = new Matrix4f(poseStack.last().pose());
        
        RenderSystem.enableDepthTest();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader(GameRenderer::getPositionColorShader);
        
        Tesselator tesselator = Tesselator.getInstance();
        BufferBuilder cubeBuffer = tesselator.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_COLOR);
        
        
        //deux pixel de large par 3 pixel de haut par 3 pixel de prof
        // petit de 1.5 pixel de large 2.5 pixel de haut et 2.5 pixel de prof
        // le centre de cette œil a pour pos global 2;15.15;-0.5 .
        
        //le deuxiem a un grand cube de 2 pixel de large par 4 pixel de haut par 3 pixel de prof
        // petit de 1.5 pixel de large 3.5 pixel de haut et 2.5 pixel de prof
        // le centre de cette œil a pour pos global -2;15.65;-0.5
        
        
        float centerX1 = 2f;
        float centerY1 = 15.15f;
        float centerZ1 = -0.5f;
        
        renderCube(cubeBuffer, matrix, centerX1, centerY1, centerZ1,
              2.0F, 3.0F, 3.0F,
              245f / 255F, 140f / 255F, 35f/255f, 1F, true);
        renderCube(cubeBuffer, matrix, centerX1, centerY1, centerZ1,
              1.5f, 2.5f, 2.5f,
              230f / 255F, 230f / 255F, 70F/255f, 1F, false);
        
        float centerX2 = -2f;
        float centerY2 = 15.65f;
        float centerZ2 = -0.5f;
        
        renderCube(cubeBuffer, matrix, centerX2, centerY2, centerZ2,
              2.0F, 4.0F, 3.0F,
              245f / 255F, 140f / 255F, 35f/255f, 1F, true);
        renderCube(cubeBuffer, matrix, centerX2, centerY2, centerZ2,
              1.5f, 3.5f, 2.5f,
              230f / 255F, 230f / 255F, 70F/255f, 1F, false);
        
        BufferUploader.drawWithShader(cubeBuffer.buildOrThrow());
        RenderSystem.disableBlend();
    }
    
    private void renderCube(BufferBuilder buffer, Matrix4f matrix,
          float centerX, float centerY, float centerZ,
          float width, float height, float depth,
          float r, float g, float b, float a, boolean inverted) {
        float[][] faces = getFloats(width / 32.0F, height / 32.0F, depth / 32.0F, inverted);
        float localCenterX = -centerX / 16.0F;
        float localCenterY = (11.25F - (centerY - 1.5F)) / 16.0F;
        float localCenterZ = centerZ / 16.0F;
        for (float[] v : faces) {
            for (int i = 0; i < 4; i++) {
                float lx = v[i * 3] + localCenterX;
                float ly = v[i * 3 + 1] + localCenterY;
                float lz = v[i * 3 + 2] + localCenterZ;
                
                float wx = matrix.m00()*lx + matrix.m10()*ly + matrix.m20()*lz + matrix.m30();
                float wy = matrix.m01()*lx + matrix.m11()*ly + matrix.m21()*lz + matrix.m31();
                float wz = matrix.m02()*lx + matrix.m12()*ly + matrix.m22()*lz + matrix.m32();
                
                buffer.addVertex(wx, wy, wz).setColor(r, g, b, a);
            }
        }
    }
    
    // Copied directly from your particle — keep in sync if you change it
    private static float[][] getFloats(float sx, float sy, float sz, boolean inverted) {
        if (inverted) {
            return new float[][]{
                  {-sx, sy,-sz,  sx, sy,-sz,  sx, sy, sz, -sx, sy, sz},
                  {-sx,-sy, sz,  sx,-sy, sz,  sx,-sy,-sz, -sx,-sy,-sz},
                  { sx,-sy,-sz,  sx,-sy, sz,  sx, sy, sz,  sx, sy,-sz},
                  {-sx,-sy, sz, -sx,-sy,-sz, -sx, sy,-sz, -sx, sy, sz},
                  {-sx, sy, sz,  sx, sy, sz,  sx,-sy, sz, -sx,-sy, sz},
                  { sx, sy,-sz, -sx, sy,-sz, -sx,-sy,-sz,  sx,-sy,-sz}
            };
        } else {
            return new float[][]{
                  {-sx, sy, sz,  sx, sy, sz,  sx, sy,-sz, -sx, sy,-sz},
                  {-sx,-sy,-sz,  sx,-sy,-sz,  sx,-sy, sz, -sx,-sy, sz},
                  { sx, sy,-sz,  sx, sy, sz,  sx,-sy, sz,  sx,-sy,-sz},
                  {-sx, sy, sz, -sx, sy,-sz, -sx,-sy,-sz, -sx,-sy, sz},
                  {-sx,-sy, sz,  sx,-sy, sz,  sx, sy, sz, -sx, sy, sz},
                  { sx,-sy,-sz, -sx,-sy,-sz, -sx, sy,-sz,  sx, sy,-sz}
            };
        }
    }
    
}
