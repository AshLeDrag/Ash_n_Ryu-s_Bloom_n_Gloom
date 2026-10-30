package net.Ash_n_Ryu.lumenfuge.entity.client;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class EtheralKnightPhase1Animations {
		public static final AnimationDefinition baseline = AnimationDefinition.Builder.withLength(0.0F)
																					.addAnimation("right_upper", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("right_thumb", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -20.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("right_claw_3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("Left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("left_lower", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("left_claw_3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("left_claw_1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("left_thumb", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("Upper_Body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("waist1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("waist2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("waist3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("waist4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("Left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-49.8924F, -3.8282F, -3.2188F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("Right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-49.8924F, 3.8282F, 3.2188F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("Head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("Neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("waist0", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("left_elbow", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("left_forarm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("right_elbow", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("right_forarm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("Neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("HBP1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("HAP1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("HAP2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("HAP3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("HAP4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 40.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("HBP2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("HBP3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("HBP4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -40.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.build();
		
		public static final AnimationDefinition walk = AnimationDefinition.Builder.withLength(4.0F).looping()
																			  .addAnimation("Etheral_Knight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -21.5F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 21.5F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("Etheral_Knight", new AnimationChannel(AnimationChannel.Targets.POSITION,
																					  new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(0.1667F, KeyframeAnimations.posVec(2.025F, 0.88F, -0.458F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(0.3333F, KeyframeAnimations.posVec(4.015F, 1.88F, -0.93F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(0.5F, KeyframeAnimations.posVec(5.965F, 3.0F, -1.4F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(0.6667F, KeyframeAnimations.posVec(7.865F, 4.24F, -1.88F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(0.8333F, KeyframeAnimations.posVec(9.7F, 5.59F, -2.367F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(1.0F, KeyframeAnimations.posVec(11.475F, 7.04F, -2.854F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(1.1667F, KeyframeAnimations.posVec(9.7F, 5.59F, -2.367F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(1.3333F, KeyframeAnimations.posVec(7.865F, 4.24F, -1.88F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(1.5F, KeyframeAnimations.posVec(5.965F, 3.0F, -1.4F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(1.6667F, KeyframeAnimations.posVec(4.015F, 1.88F, -0.93F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(1.8333F, KeyframeAnimations.posVec(2.025F, 0.88F, -0.458F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.1667F, KeyframeAnimations.posVec(-2.025F, 0.88F, 0.458F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.3333F, KeyframeAnimations.posVec(-4.015F, 1.88F, 0.93F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.5F, KeyframeAnimations.posVec(-5.965F, 3.0F, 1.4F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.6667F, KeyframeAnimations.posVec(-7.865F, 4.24F, 1.88F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.8333F, KeyframeAnimations.posVec(-9.7F, 5.59F, 2.367F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(3.0F, KeyframeAnimations.posVec(-11.475F, 7.04F, 2.854F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(3.1667F, KeyframeAnimations.posVec(-9.7F, 5.59F, 2.367F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(3.3333F, KeyframeAnimations.posVec(-7.865F, 4.24F, 1.88F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(3.5F, KeyframeAnimations.posVec(-5.965F, 3.0F, 1.4F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(3.6667F, KeyframeAnimations.posVec(-4.015F, 1.88F, 0.93F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(3.8333F, KeyframeAnimations.posVec(-2.025F, 0.88F, 0.458F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("Right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 2.5F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 2.5F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 2.5F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 2.5F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("right_upper", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(1.0F, KeyframeAnimations.degreeVec(4.8493F, 11.5349F, 22.9901F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(3.0F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("right_lower", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(3.0F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("Right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("right_claw_1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("right_thumb", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -20.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -20.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, -20.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("right_claw_3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("Left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 2.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.5F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("left_upper", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(1.0F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(3.0F, KeyframeAnimations.degreeVec(4.8493F, -11.5349F, -22.9901F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("left_lower", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(1.0F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(3.0F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("Left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("left_claw_3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("left_claw_1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("left_thumb", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("Upper_Body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(1.0F, KeyframeAnimations.degreeVec(10.3453F, 14.7669F, 2.664F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(3.0F, KeyframeAnimations.degreeVec(10.3453F, -14.7669F, -2.664F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("waist1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("waist2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("waist3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("waist4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("Left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-49.8924F, -3.8282F, -3.2188F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(-49.8924F, -3.8282F, -3.2188F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(-49.8924F, -3.8282F, -3.2188F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("Right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-49.8924F, 3.8282F, 3.2188F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(-49.8924F, 3.8282F, 3.2188F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(-49.8924F, 3.8282F, 3.2188F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("Head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("Neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("Left_bottom_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("waist0", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("left_elbow", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("left_forarm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("right_elbow", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("right_forarm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("Neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("HBP1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("HAP1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("HAP2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("HAP3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("HAP4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 40.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 40.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 40.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("HBP2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("HBP3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("HBP4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -40.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -40.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -40.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .addAnimation("Whole", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -25.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 25.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, -25.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .build();
		
		public static final AnimationDefinition hit_hand = AnimationDefinition.Builder.withLength(3.7083F)
																					.addAnimation("right_upper", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("right_thumb", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -20.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, -20.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(0.0F, -20.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("right_claw_3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("Left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("left_lower", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("left_claw_3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("left_claw_1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("left_thumb", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("Upper_Body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(8.36F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(2.2083F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("waist1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(0.5F, KeyframeAnimations.degreeVec(10.0093F, -2.462F, -0.4344F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(2.6214F, -4.8519F, -1.5219F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.9583F, KeyframeAnimations.degreeVec(10.0374F, 4.9239F, 0.8704F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(2.2083F, KeyframeAnimations.degreeVec(7.5729F, 7.4022F, 1.201F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("waist2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(0.5F, KeyframeAnimations.degreeVec(7.5071F, -2.4786F, -0.3265F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(5.0778F, -4.9214F, -0.9797F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.9583F, KeyframeAnimations.degreeVec(7.5284F, 4.9571F, 0.6542F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(2.2083F, KeyframeAnimations.degreeVec(14.8076F, 5.1715F, -1.8464F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(2.4167F, KeyframeAnimations.degreeVec(3.7351F, 10.5153F, -6.5002F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("waist3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(0.5F, KeyframeAnimations.degreeVec(7.5071F, -2.4786F, -0.3265F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(7.55F, -1.24F, -0.17F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.9583F, KeyframeAnimations.degreeVec(7.5284F, 4.9571F, 0.6542F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(2.2083F, KeyframeAnimations.degreeVec(0.1137F, 7.4136F, 1.3134F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(2.4167F, KeyframeAnimations.degreeVec(0.1145F, 9.9136F, 1.3184F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("waist4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(0.5F, KeyframeAnimations.degreeVec(12.5115F, -2.4407F, -0.5414F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(9.18F, 0.81F, 0.18F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.9583F, KeyframeAnimations.degreeVec(7.5115F, 2.4407F, 0.5414F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(2.4167F, KeyframeAnimations.degreeVec(7.6182F, 9.8756F, 1.5338F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("Left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-49.8924F, -3.8282F, -3.2188F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(0.5F, KeyframeAnimations.degreeVec(-16.7542F, -6.6502F, -10.1975F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(23.2458F, -6.6502F, -10.1975F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.9583F, KeyframeAnimations.degreeVec(-1.7542F, -6.6502F, -10.1975F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(2.2083F, KeyframeAnimations.degreeVec(-51.5346F, 1.869F, -15.4437F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(2.4167F, KeyframeAnimations.degreeVec(-77.0672F, 5.7952F, -12.591F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(-49.8924F, -3.8282F, -3.2188F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("Right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-49.8924F, 3.8282F, 3.2188F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(-48.86F, 11.74F, 10.08F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(-49.8924F, 3.8282F, 3.2188F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("Head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("Neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("waist0", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(0.5F, KeyframeAnimations.degreeVec(7.5284F, -4.9571F, -0.6542F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(7.7F, 3.52F, -1.19F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.9583F, KeyframeAnimations.degreeVec(7.7825F, 7.7615F, -1.4556F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("left_elbow", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.9583F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("left_forarm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.9583F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("right_elbow", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("right_forarm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("Neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("HAP1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("HAP2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("HAP3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("HAP4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 40.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 40.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 40.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("HBP1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("HBP2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("HBP3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.addAnimation("HBP4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -40.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -40.0F), AnimationChannel.Interpolations.LINEAR),
																							new Keyframe(3.7083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -40.0F), AnimationChannel.Interpolations.LINEAR)
																					))
																					.build();
		
		public static final AnimationDefinition hit_hand2 = AnimationDefinition.Builder.withLength(4.2917F)
																					 .addAnimation("right_upper", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("right_thumb", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, -20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, -20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, -20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, -20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("right_claw_3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("Left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("left_lower", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("left_claw_3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("left_claw_1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("left_thumb", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("Upper_Body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(15.94F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("Arms", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("waist1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 7.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(1.5417F, KeyframeAnimations.degreeVec(0.0F, 10.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(5.74F, 1.47F, -0.5F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(10.0374F, -4.9239F, -0.8704F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.2083F, KeyframeAnimations.degreeVec(2.4246F, -11.4459F, -1.0168F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("waist2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(1.0F, KeyframeAnimations.degreeVec(-2.4998F, 2.3886F, -2.6066F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(1.5417F, KeyframeAnimations.degreeVec(-2.1998F, 7.3081F, -0.3003F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(3.36F, 0.3F, -0.5F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(7.5284F, -4.9571F, -0.6542F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("waist3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(1.0F, KeyframeAnimations.degreeVec(-7.5628F, 4.768F, -1.507F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(1.5417F, KeyframeAnimations.degreeVec(-7.3489F, 5.0925F, 0.9811F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(-3.15F, -2.1F, 0.42F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, -7.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("waist4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(1.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(1.5417F, KeyframeAnimations.degreeVec(7.5063F, 2.2985F, 0.39F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(3.22F, -1.87F, 0.17F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, -5.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("Left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(-49.8924F, -3.8282F, -3.2188F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(1.0F, KeyframeAnimations.degreeVec(-4.8924F, -3.8282F, -3.2188F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(1.5417F, KeyframeAnimations.degreeVec(27.6076F, -3.8282F, -3.2188F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(-9.7F, -3.83F, -3.22F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(-37.6781F, -3.8282F, -3.2188F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(-49.8924F, -3.8282F, -3.2188F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(-49.8924F, -3.8282F, -3.2188F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("Right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(-49.8924F, 3.8282F, 3.2188F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(1.0F, KeyframeAnimations.degreeVec(-5.5666F, -29.9494F, 63.196F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(-50.75F, 5.61F, 63.48F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(-71.2849F, 21.78F, 63.6097F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(-49.8924F, 3.8282F, 3.2188F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(-49.8924F, 3.8282F, 3.2188F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("Right_arm", new AnimationChannel(AnimationChannel.Targets.POSITION,
																							 new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -2.37F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, 0.0F, -3.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("Head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("Neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(1.0F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(1.87F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("waist0", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(1.5417F, KeyframeAnimations.degreeVec(0.0F, 10.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(7.14F, 4.29F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.2083F, KeyframeAnimations.degreeVec(7.9541F, -5.5199F, -0.6133F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("left_elbow", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("left_forarm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("right_elbow", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("right_elbow", new AnimationChannel(AnimationChannel.Targets.POSITION,
																							 new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, -3.17F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, -4.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("right_forarm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(-12.92F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(-35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("right_forarm", new AnimationChannel(AnimationChannel.Targets.POSITION,
																							 new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, -2.37F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, -3.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("Neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(1.0F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(1.09F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("HAP1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("HAP2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("HAP3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("HAP4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 40.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 40.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 40.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 40.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 40.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("HBP1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("HBP2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("HBP3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("HBP4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -40.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -40.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -40.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -40.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -40.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .addAnimation("right_shoulder", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 27.5F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.25F, KeyframeAnimations.degreeVec(-10.31F, 0.0F, 18.91F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(2.75F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 15.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																							 new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																					 ))
																					 .build();
		
		public static final AnimationDefinition phase_1_to_transition = AnimationDefinition.Builder.withLength(1.5F)
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
																									 .build();
}