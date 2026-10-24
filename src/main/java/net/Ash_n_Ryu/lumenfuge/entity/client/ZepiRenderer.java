package net.Ash_n_Ryu.lumenfuge.entity.client;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.*;
import com.mojang.math.Axis;
import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.entity.custom.ArogEntity;
import net.Ash_n_Ryu.lumenfuge.entity.custom.ZepiEntity;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import org.joml.Matrix4f;

public class ZepiRenderer extends MobRenderer<ZepiEntity, ZepiModel<ZepiEntity>> {
    public ZepiRenderer(EntityRendererProvider.Context context) {
        super(context, new ZepiModel<>(context.bakeLayer(ZepiModel.LAYER_LOCATION)), 0.5f);
    }
    
    @Override
    public ResourceLocation getTextureLocation(ZepiEntity zepiEntity) {
        return ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, "textures/entity/zepi/zepi.png");
    }
    
    @Override
    public void render(ZepiEntity entity, float entityYaw, float partialTicks,
          PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
        if(!entity.isDeadOrDying()) {
            poseStack.pushPose();
            float bodyYaw = Mth.rotLerp(partialTicks, entity.yBodyRotO, entity.yBodyRot);
            poseStack.mulPose(Axis.YP.rotationDegrees(180.0F - bodyYaw));
            poseStack.scale(-1.0F, -1.0F, 1.0F);
            poseStack.translate(0.0F, -1.501F, 0.0F);
            this.getModel()
                  .root()
                  .translateAndRotate(poseStack);
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
        float centerX = 0f;
        float centerY = 0f;
        float centerZ = 0f;
        
        renderCube(cubeBuffer, matrix, centerX, centerY, centerZ,
              6.0F, 6.0F, 8.0F,
              245f / 255F, 140f / 255F, 35f/255f, 1F, true);
        renderCube(cubeBuffer, matrix, centerX, centerY, centerZ,
              8.0F, 6.0F, 6.0F,
              245f / 255F, 140f / 255F, 35f/255f, 1F, true);
        renderCube(cubeBuffer, matrix, centerX, centerY, centerZ,
              6.0F, 8.0F, 6.0F,
              245f / 255F, 140f / 255F, 35f/255f, 1F, true);
        
        renderCube(cubeBuffer, matrix, centerX, centerY, centerZ,
              4.0f, 4.0f, 4.0f,
              230f / 255F, 230f / 255F, 70F/255f, 1F, false);
        
        BufferUploader.drawWithShader(cubeBuffer.buildOrThrow());
        RenderSystem.disableBlend();
    }
    
    private void renderCube(BufferBuilder buffer, Matrix4f matrix,
          float centerX, float centerY, float centerZ,
          float width, float height, float depth,
          float r, float g, float b, float a, boolean inverted) {
        float[][] faces = getFloats(width / 32.0F, height / 32.0F, depth / 32.0F, inverted);
        for (float[] v : faces) {
            for (int i = 0; i < 4; i++) {
                float lx = v[i * 3] + centerX;
                float ly = v[i * 3 + 1] + centerY;
                float lz = v[i * 3 + 2] + centerZ;
                
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
