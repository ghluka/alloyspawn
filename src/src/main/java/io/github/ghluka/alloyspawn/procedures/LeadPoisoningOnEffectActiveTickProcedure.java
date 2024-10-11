package io.github.ghluka.alloyspawn.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import io.github.ghluka.alloyspawn.init.AlloyspawnModMobEffects;

public class LeadPoisoningOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.01) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(AlloyspawnModMobEffects.KIDNEY_FAILURE.get(), -1, 0));
		}
	}
}
