
package io.github.ghluka.alloyspawn.potion;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.List;
import java.util.ArrayList;

import io.github.ghluka.alloyspawn.procedures.BrainEatingAmoebaOnEffectActiveTickProcedure;

public class BrainEatingAmoebaMobEffect extends MobEffect {
	public BrainEatingAmoebaMobEffect() {
		super(MobEffectCategory.HARMFUL, -1565608);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		cures.add(new ItemStack(Items.TOTEM_OF_UNDYING));
		return cures;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BrainEatingAmoebaOnEffectActiveTickProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
