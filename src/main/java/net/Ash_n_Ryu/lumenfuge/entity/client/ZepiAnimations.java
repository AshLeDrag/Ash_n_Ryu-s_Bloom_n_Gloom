package net.Ash_n_Ryu.lumenfuge.entity.client;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class ZepiAnimations {
		public static final AnimationDefinition ZEPI_WALK = AnimationDefinition.Builder.withLength(0.7917F).looping()
																					 .addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																							 new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							 new Keyframe(0.1667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							 new Keyframe(0.25F, KeyframeAnimations.degreeVec(-35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							 new Keyframe(0.2917F, KeyframeAnimations.degreeVec(-42.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							 new Keyframe(0.4167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							 new Keyframe(0.5417F, KeyframeAnimations.degreeVec(35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							 new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							 new Keyframe(0.7917F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					 ))
																					 .addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
																							 new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																							 new Keyframe(0.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 8.0F), AnimationChannel.Interpolations.LINEAR),
																							 new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.7F, 14.7F), AnimationChannel.Interpolations.LINEAR),
																							 new Keyframe(0.2917F, KeyframeAnimations.posVec(0.0F, -0.3F, 14.7F), AnimationChannel.Interpolations.LINEAR),
																							 new Keyframe(0.4167F, KeyframeAnimations.posVec(0.0F, 9.7F, -0.05F), AnimationChannel.Interpolations.LINEAR),
																							 new Keyframe(0.5417F, KeyframeAnimations.posVec(0.0F, 0.7F, -14.7F), AnimationChannel.Interpolations.LINEAR),
																							 new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, -8.0F), AnimationChannel.Interpolations.LINEAR),
																							 new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																					 ))
																					 .build();
		
		public static final AnimationDefinition ZEPI_IDLE = AnimationDefinition.Builder.withLength(1.5F).looping()
																			  .addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
																					  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																					  new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																					  new Keyframe(0.5417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 12.5F), AnimationChannel.Interpolations.CATMULLROM),
																					  new Keyframe(0.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -12.5F), AnimationChannel.Interpolations.CATMULLROM),
																					  new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																					  new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
																			  ))
																			  .addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
																					  new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
																					  new Keyframe(0.5417F, KeyframeAnimations.posVec(1.2F, 0.6F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																					  new Keyframe(0.75F, KeyframeAnimations.posVec(0.05F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																					  new Keyframe(0.9583F, KeyframeAnimations.posVec(-1.1F, 0.6F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																					  new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
																					  new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
																			  ))
																			  .build();
}