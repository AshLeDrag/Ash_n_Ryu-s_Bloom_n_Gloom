package net.Ash_n_Ryu.lumenfuge.entity.client;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;

/** Blends complete exported poses instead of adding two absolute poses together. */
final class EtheralKnightPoseBlend {
    private EtheralKnightPoseBlend() {}

    static void blend(ModelPart root, float weight, Runnable pose) {
        if (weight <= 0F) return;
        var parts = root.getAllParts().toList();
        float[][] from = new float[parts.size()][];
        for (int i = 0; i < parts.size(); i++) {
            ModelPart p = parts.get(i);
            from[i] = new float[]{p.x, p.y, p.z, p.xRot, p.yRot, p.zRot, p.xScale, p.yScale, p.zScale};
            p.resetPose();
        }
        pose.run();
        for (int i = 0; i < parts.size(); i++) {
            ModelPart p = parts.get(i);
            float[] f = from[i];
            p.x = Mth.lerp(weight, f[0], p.x);
            p.y = Mth.lerp(weight, f[1], p.y);
            p.z = Mth.lerp(weight, f[2], p.z);
            p.xRot = Mth.lerp(weight, f[3], p.xRot);
            p.yRot = Mth.lerp(weight, f[4], p.yRot);
            p.zRot = Mth.lerp(weight, f[5], p.zRot);
            p.xScale = Mth.lerp(weight, f[6], p.xScale);
            p.yScale = Mth.lerp(weight, f[7], p.yScale);
            p.zScale = Mth.lerp(weight, f[8], p.zScale);
        }
    }
}
