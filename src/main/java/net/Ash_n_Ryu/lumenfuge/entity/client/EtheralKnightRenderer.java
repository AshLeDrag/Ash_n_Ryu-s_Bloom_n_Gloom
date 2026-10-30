package net.Ash_n_Ryu.lumenfuge.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.entity.custom.boss.EtheralKnightEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BeaconRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

/** Keeps each exported model and its texture in its own renderer. */
public class EtheralKnightRenderer extends EntityRenderer<EtheralKnightEntity> {
    private final EtheralKnightPhase1Renderer phaseOne;
    private final EtheralKnightTransitionRenderer transition;
    private final EtheralKnightPhase2Renderer phaseTwo;
    private final ResourceLocation phaseOneResourceLocation = ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, "textures/entity/etheral_knight/etheral_knight_phase1.png");
    private final ResourceLocation transitionResourceLocation = ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, "textures/entity/etheral_knight/etheral_knight_transition.png");
    private final ResourceLocation phaseTwoResourceLocation = ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, "textures/entity/etheral_knight/etheral_knight_phase2.png");
    private static final ResourceLocation BEAM_TEXTURE = ResourceLocation.withDefaultNamespace("textures/entity/beacon_beam.png");

    public EtheralKnightRenderer(EntityRendererProvider.Context context) {
        super(context);
        phaseOne = new EtheralKnightPhase1Renderer(context);
        transition = new EtheralKnightTransitionRenderer(context);
        phaseTwo = new EtheralKnightPhase2Renderer(context);
        shadowRadius = 0.25F;
    }

    private EntityRenderer<EtheralKnightEntity> rendererFor(EtheralKnightEntity entity) {
        return switch (entity.getPhase()) {
            case EtheralKnightEntity.ARMOR_BREAK -> transition;
            case EtheralKnightEntity.REVEAL, EtheralKnightEntity.PHASE_TWO -> phaseTwo;
            default -> phaseOne;
        };
    }

    @Override
    public ResourceLocation getTextureLocation(EtheralKnightEntity entity) {
        return switch (entity.getPhase()) {
        case EtheralKnightEntity.ARMOR_BREAK -> transitionResourceLocation;
        case EtheralKnightEntity.REVEAL, EtheralKnightEntity.PHASE_TWO -> phaseTwoResourceLocation;
        default -> phaseOneResourceLocation;
        };
    }

    @Override
    public void render(EtheralKnightEntity entity, float yaw, float partialTick,
                       PoseStack pose, MultiBufferSource buffers, int light) {
        rendererFor(entity).render(entity, yaw, partialTick, pose, buffers, light);
        if (entity.isSpawning()) {
            pose.pushPose();
            // BeaconRenderer adds half a block internally; keep the beam centered on the boss.
            pose.translate(-0.5, 0, -0.5);
            float fade = Math.min(1F, (entity.getSpawnTicks() - partialTick) / 15F);
            BeaconRenderer.renderBeaconBeam(pose, buffers, BEAM_TEXTURE, partialTick, 1F,
                    entity.level().getGameTime(), 0,
                    Math.max(256, entity.level().getMaxBuildHeight() - entity.getBlockY()),
                    0xFFB9EAFF, 4.2F * fade, 6F * fade);
            pose.popPose();
        }
    }
}
