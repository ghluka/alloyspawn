package io.github.ghluka.alloyspawn.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import io.github.ghluka.alloyspawn.init.AlloyspawnModMobEffects;

public class LunchlyPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, (int) (30 * 20), 1));
		if (Math.random() < 0.5) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(AlloyspawnModMobEffects.LEAD_POISONING.get(), (int) (36000 * 20), 0));
		}
	}
}
