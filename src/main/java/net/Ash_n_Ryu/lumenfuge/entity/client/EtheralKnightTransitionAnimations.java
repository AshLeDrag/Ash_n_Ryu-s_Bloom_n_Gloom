package net.Ash_n_Ryu.lumenfuge.entity.client;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class EtheralKnightTransitionAnimations {
		public static final AnimationDefinition btransition = AnimationDefinition.Builder.withLength(5.0417F)
																						.addAnimation("right_upper", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("right_thumb", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -20.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, -20.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("right_claw_3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("Left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("left_lower", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("left_claw_3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("left_claw_1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("left_thumb", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("Upper_Body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("waist1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("waist2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("waist3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("waist4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.25F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("Left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(-49.8924F, -3.8282F, -3.2188F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(-49.8924F, -3.8282F, -3.2188F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("Right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(-49.8924F, 3.8282F, 3.2188F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.0F, KeyframeAnimations.degreeVec(-37.6722F, -17.7098F, 60.413F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(-68.3918F, -30.2664F, 112.0053F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("Right_arm", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.0F, KeyframeAnimations.posVec(-2.0F, -5.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(-7.0F, 0.0F, 7.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("Head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("Neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.0F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("Neck1", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(5.0417F, KeyframeAnimations.posVec(0.0F, -1.0F, 4.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("waist0", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("left_elbow", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("left_forarm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("right_elbow", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.25F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("right_forarm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.25F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(-55.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("Neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.0F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("HAP1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("HAP2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("HAP3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("HAP4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 40.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 40.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("HBP1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("HBP2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("HBP3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("HBP4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -40.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -40.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("left_shoulder", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(47.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.degreeVec(72.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("left_shoulder", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(0.0F, -7.5423F, -38.6667F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, -20.1587F, -56.6913F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, -29.9108F, -70.6156F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("right_shoulder", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(199.1177F, -43.3564F, -39.327F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.degreeVec(222.011F, -23.3404F, -52.2247F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("right_shoulder", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(0.0F, 9.8298F, -6.8829F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, 8.1883F, -30.146F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, -9.0173F, -54.7246F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, -24.5066F, -76.8371F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("p1ra", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(0.0F, -17.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("p1ra", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(-12.9521F, -8.015F, 0.0602F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.posVec(-11.9749F, -25.4044F, -11.6802F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.posVec(-10.8092F, -46.0957F, -25.6564F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(-9.8349F, -63.4844F, -37.4002F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("p2ra", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(0.0F, 40.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("p2ra", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(14.2958F, -5.4364F, -6.8611F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.posVec(16.0645F, -36.8975F, -28.1042F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.posVec(16.4779F, -44.3505F, -33.1315F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(17.2694F, -58.4231F, -42.634F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("p3ra", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(3.5417F, KeyframeAnimations.posVec(2.8789F, -51.3253F, -34.6615F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(4.7373F, -84.4431F, -57.0223F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("pre1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 7.5F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 50.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.degreeVec(-6.312F, -20.4608F, 83.9447F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("pre1", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(23.5634F, -19.4651F, -1.6967F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.posVec(40.8495F, -26.2521F, -5.583F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.posVec(41.7787F, -45.1996F, 0.7486F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(42.4765F, -59.4122F, 5.4964F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("pre2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -22.5F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -70.0F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("pre2", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(-17.6309F, -5.4742F, 8.3178F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.posVec(-16.8871F, -20.6297F, 13.3828F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.posVec(-16.0542F, -37.6846F, 19.0757F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(-15.3071F, -52.8397F, 24.1428F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("w4p1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(0.0F, -22.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.degreeVec(53.128F, -52.5524F, -83.9636F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("w4p1", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(-9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.posVec(-25.0F, -6.8829F, -9.8298F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.posVec(-25.0F, -13.7629F, -19.6598F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(-25.0F, -24.0844F, -34.4047F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("w4p2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(0.0F, 17.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.degreeVec(6.3368F, 66.6189F, 57.0748F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("w4p2", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.posVec(24.0F, -10.898F, -15.5639F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.posVec(24.0F, -15.4886F, -22.1132F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(24.0F, -30.403F, -43.408F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("lap1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 35.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.degreeVec(3.8892F, 2.483F, 89.9057F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("lap1", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(17.9315F, -1.5688F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.posVec(14.0424F, -46.005F, -17.9559F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(12.6508F, -61.8885F, -19.3545F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("lap2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(39.7114F, -17.6742F, -14.1526F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("lap2", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(-0.5503F, -6.2896F, -19.6249F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(2.9167F, KeyframeAnimations.posVec(-11.86F, -32.3005F, -21.9732F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.posVec(-13.1624F, -47.1861F, -23.2773F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(-14.8097F, -66.0457F, -24.936F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("lep2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -32.5F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -97.5F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("lep2", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.0417F, KeyframeAnimations.posVec(-4.981F, 0.4341F, -0.038F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(-21.3121F, -14.2072F, -0.1592F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(2.9167F, KeyframeAnimations.posVec(-22.786F, -31.1458F, -0.1656F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(-24.0055F, -45.0971F, -0.1746F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("lep1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 27.5F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 70.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.degreeVec(46.9579F, 3.9603F, 91.9026F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("lep1", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.0417F, KeyframeAnimations.posVec(5.9772F, -0.5209F, 0.0456F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(13.1681F, -10.1806F, 0.1078F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.posVec(11.3467F, -31.1007F, 0.1031F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(9.353F, -54.0131F, 0.0924F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("lap3", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(3.5417F, KeyframeAnimations.posVec(-6.7752F, -77.4093F, -6.7961F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(4.4167F, KeyframeAnimations.posVec(-5.6151F, -64.175F, -5.6379F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(-13.0237F, -148.8606F, -13.0734F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("w3p2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(0.0F, -25.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("w3p2", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.posVec(-27.0F, -20.6438F, -18.9165F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.posVec(-27.0F, -31.6992F, -29.0539F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(-27.0F, -46.4455F, -42.5618F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("w2p2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(0.0F, -22.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("w2p2", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.posVec(-5.0F, -14.7413F, -34.7375F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.posVec(-5.0F, -27.8464F, -43.9172F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(-5.0F, -40.9564F, -53.0972F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("w1p2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("w1p2", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(-12.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.posVec(-19.0F, -19.5142F, -10.1585F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.posVec(-19.0F, -25.7191F, -13.3922F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(-19.0F, -47.8953F, -24.9337F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("w0p1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -22.5F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("w0p1", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.posVec(-19.0F, -27.6578F, -8.7205F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.posVec(-19.0F, -36.2435F, -11.4264F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(-19.0F, -56.2681F, -17.7448F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("w0p2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 27.5F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("w0p2", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.posVec(15.0F, -21.3768F, 7.9393F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.posVec(15.0F, -36.6395F, 3.1287F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(15.0F, -49.992F, -1.0799F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("w1p3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.75F, KeyframeAnimations.degreeVec(1.3007F, 27.4716F, 92.8176F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("w1p3", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.75F, KeyframeAnimations.posVec(15.0F, -38.1415F, -19.8552F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(15.0F, -49.6711F, -25.8627F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("w2p1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(9.8263F, 10.5274F, 13.3606F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("w2p1", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.posVec(15.0F, -23.7554F, -16.6337F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.posVec(15.0F, -34.409F, -24.0865F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(15.0F, -46.6973F, -32.6936F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("w3p1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 25.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.degreeVec(-11.1496F, 6.2796F, 24.2476F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("w3p1", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(4.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.posVec(18.0F, -12.5337F, -11.485F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.posVec(18.0F, -37.5974F, -34.4601F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(18.0F, -47.1846F, -43.2427F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("upboda", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -14.28F, -2.52F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(2.3333F, KeyframeAnimations.posVec(0.0F, -28.5594F, -5.0358F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, -47.2713F, -8.3393F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("lua", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.25F, KeyframeAnimations.degreeVec(16.1022F, -25.6589F, 56.31F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("lua", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, -28.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, -44.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("rua", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -112.5F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("rua", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.0417F, KeyframeAnimations.posVec(-13.6681F, -13.0F, -3.0302F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(2.375F, KeyframeAnimations.posVec(-13.67F, -18.0F, -3.03F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(-13.67F, -31.0F, -3.03F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("hl", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(0.0F, -37.5F, -30.0F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("hl", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(-8.0F, -1.5529F, -5.7956F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.posVec(-16.0F, -8.7969F, -32.8459F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.posVec(-21.0F, -11.1294F, -41.5433F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(-21.0F, -20.4475F, -76.3133F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("hr", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.degreeVec(22.2693F, 24.3052F, 44.854F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("hr", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.4167F, KeyframeAnimations.posVec(4.0F, -6.9695F, -10.5558F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.posVec(10.0F, -12.9228F, -32.7763F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.5F, KeyframeAnimations.posVec(10.0F, -16.8023F, -47.2689F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(10.0F, -22.494F, -68.5204F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("Left_arm2", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(1.9924F, -0.1743F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(1.99F, -0.17F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.3333F, KeyframeAnimations.posVec(-0.9986F, 0.0915F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("left_forarm2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("left_forarm2", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(1.9924F, -0.1717F, 0.0303F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(1.99F, -0.17F, 0.03F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.3333F, KeyframeAnimations.posVec(-0.9986F, 0.0875F, -0.0154F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("Right_arm2", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(-1.9924F, -0.1743F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(-1.99F, -0.17F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(3.5417F, KeyframeAnimations.posVec(-2.0364F, 0.6578F, 0.5591F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("right_forarm2", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(-1.9924F, -0.1717F, 0.0303F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(-1.99F, -0.17F, 0.03F), AnimationChannel.Interpolations.LINEAR)
																						))
																						.addAnimation("lfa", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(1.7917F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(1.9167F, KeyframeAnimations.degreeVec(-25.6849F, -10.1779F, -20.1737F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(2.0417F, KeyframeAnimations.degreeVec(-88.1391F, -14.8559F, 2.3848F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("lfa", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.7917F, KeyframeAnimations.posVec(0.0F, -9.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(1.9167F, KeyframeAnimations.posVec(-0.6078F, -15.9472F, 0.6055F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(2.0417F, KeyframeAnimations.posVec(-1.6942F, -25.3799F, 18.4958F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(-3.2528F, -43.2443F, 20.057F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("rfa", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																								new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.0417F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(3.0F, KeyframeAnimations.degreeVec(-18.7237F, 2.7649F, 5.0382F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.addAnimation("rfa", new AnimationChannel(AnimationChannel.Targets.POSITION,
																								new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																								new Keyframe(2.0417F, KeyframeAnimations.posVec(-8.0663F, 7.564F, 38.1408F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(2.375F, KeyframeAnimations.posVec(-7.7914F, 5.8545F, 43.8858F), AnimationChannel.Interpolations.CATMULLROM),
																								new Keyframe(5.0F, KeyframeAnimations.posVec(-6.9542F, 0.7335F, 61.1273F), AnimationChannel.Interpolations.CATMULLROM)
																						))
																						.build();
}