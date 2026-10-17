package net.Ash_n_Ryu.examplemod.particle;


import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.*;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.SimpleParticleType;
import org.joml.Matrix4f;

public class My3DParticle extends Particle {
		
		private float rotX, rotY, rotZ;
		private final float size;
		
		protected My3DParticle(ClientLevel level, double x, double y, double z,
				double dx, double dy, double dz) {
				super(level, x, y, z, dx, dy, dz);
				this.lifetime = 60;
				this.size = 0.15f;
				this.yd = 0.04;
				this.xd = dx;
				this.zd = dz;
				// Random starting rotation
				this.rotX = random.nextFloat() * 360f;
				this.rotY = random.nextFloat() * 360f;
				this.rotZ = random.nextFloat() * 360f;
		}
		
		public static final ParticleRenderType CUBE_RENDER_TYPE = new ParticleRenderType() {
				
				@Override
				public BufferBuilder begin(Tesselator tesselator, TextureManager textureManager) {
						RenderSystem.enableDepthTest();
						RenderSystem.enableBlend();
						RenderSystem.defaultBlendFunc();
						RenderSystem.depthMask(true);
						RenderSystem.setShader(GameRenderer::getPositionColorShader);
						return tesselator.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_COLOR);
				}
				
				@Override
				public String toString() {
						return "thingsfordays:cube_particle";
				}
		};
		
		@Override
		public ParticleRenderType getRenderType() {
				return CUBE_RENDER_TYPE;
		}
		
		
		
		@Override
		public void tick() {
				super.tick();
				// Spin
				rotX += 2.5f;
				rotY += 3.0f;
				rotZ += 1.5f;
				// Drag
				this.xd *= 0.96;
				this.yd *= 0.96;
				this.zd *= 0.96;
		}
		
		@Override
		public void render(VertexConsumer buffer, Camera camera, float partialTick) {
				// Interpolated world position relative to camera
				double camX = camera.getPosition().x;
				double camY = camera.getPosition().y;
				double camZ = camera.getPosition().z;
				
				float px = (float)(this.xo + (this.x - this.xo) * partialTick - camX);
				float py = (float)(this.yo + (this.y - this.yo) * partialTick - camY);
				float pz = (float)(this.zo + (this.z - this.zo) * partialTick - camZ);
				
				// Build rotation matrix
				Matrix4f matrix = new Matrix4f();
				matrix.translate(px, py, pz);
				matrix.rotateXYZ(
						(float) Math.toRadians(rotX),
						(float) Math.toRadians(rotY),
						(float) Math.toRadians(rotZ)
				);
				
				// Light level at particle position
				int light = LevelRenderer.getLightColor(this.level, BlockPos.containing(this.x, this.y, this.z));
				float r = 0f, g = 1f, b = 1f; // blue color — change as needed
				
				renderCube(buffer, matrix, 0.20f, 219f/255f, 63f/255f, 253f/255f, 1, light, true);
				renderCube(buffer, matrix, 0.15f, 240f/255f, 167f/255f, 1f, 1, light, false);
		}
		
		private void renderCube(VertexConsumer buffer, Matrix4f matrix,
				float s, float r, float g, float b, float a, int light, boolean inverted) {
				// 6 faces, each as 2 triangles (4 vertices, Quads topology)
				// Each face defined by 4 corners in local space
				float[][] faces = getFloats(s, inverted);
				
				
				// Per-face brightness multiplier for fake lighting
				
				for (int f = 0; f < faces.length; f++) {
						float[] v = faces[f];
						for (int i = 0; i < 4; i++) {
								float lx = v[i * 3];
								float ly = v[i * 3 + 1];
								float lz = v[i * 3 + 2];
								
								// Transform by matrix
								float wx = matrix.m00() * lx + matrix.m10() * ly + matrix.m20() * lz + matrix.m30();
								float wy = matrix.m01() * lx + matrix.m11() * ly + matrix.m21() * lz + matrix.m31();
								float wz = matrix.m02() * lx + matrix.m12() * ly + matrix.m22() * lz + matrix.m32();
								
								
								buffer.addVertex(wx, wy, wz)
										.setColor(r, g, b, a)
										.setUv(0f, 0f)           // no texture needed for solid color
										.setLight(light);
						}
				}
		}
		
		private static float[][] getFloats(float s, boolean inverted) {
				float[][] faces;
				if(inverted) {
						faces = new float[][]{
								// +Y (top)
								{-s, s, -s, s, s, -s, s, s, s, -s, s, s},
								// -Y (bottom)
								{-s, -s, s, s, -s, s, s, -s, -s, -s, -s, -s},
								// +X (right)
								{s, -s, -s, s, -s, s, s, s, s, s, s, -s},
								// -X (left)
								{-s, -s, s, -s, -s, -s, -s, s, -s, -s, s, s},
								// +Z (front)
								{-s, s, s, s, s, s, s, -s, s, -s, -s, s},
								// -Z (back)
								{s, s, -s, -s, s, -s, -s, -s, -s, s, -s, -s}};
				} else {
						faces = new float[][]{
								// +Y (top)
								{-s, s, s, s, s, s, s, s, -s, -s, s, -s},
								// -Y (bottom)
								{-s, -s, -s, s, -s, -s, s, -s, s, -s, -s, s},
								// +X (right)
								{s, s, -s, s, s, s, s, -s, s, s, -s, -s},
								// -X (left)
								{-s, s, s, -s, s, -s, -s, -s, -s, -s, -s, s},
								// +Z (front)
								{-s, -s, s, s, -s, s, s, s, s, -s, s, s},
								// -Z (back)
								{s, -s, -s, -s, -s, -s, -s, s, -s, s, s, -s}};
						
				}
				return faces;
		}
		
		// This is the critical part — use a custom render type
	
		
		public static class Provider implements ParticleProvider<SimpleParticleType> {
				public Provider(SpriteSet sprites) {} // sprites unused but required
				
				@Override
				public Particle createParticle(SimpleParticleType type, ClientLevel level,
						double x, double y, double z,
						double dx, double dy, double dz) {
						return new My3DParticle(level, x, y, z, dx, dy, dz);
				}
		}
}