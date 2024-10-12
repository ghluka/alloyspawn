
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package io.github.ghluka.alloyspawn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import io.github.ghluka.alloyspawn.potion.MercuryPoisoningMobEffect;
import io.github.ghluka.alloyspawn.potion.LeadPoisoningMobEffect;
import io.github.ghluka.alloyspawn.potion.KidneyFailureMobEffect;
import io.github.ghluka.alloyspawn.AlloyspawnMod;

public class AlloyspawnModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AlloyspawnMod.MODID);
	public static final RegistryObject<MobEffect> LEAD_POISONING = REGISTRY.register("lead_poisoning", () -> new LeadPoisoningMobEffect());
	public static final RegistryObject<MobEffect> KIDNEY_FAILURE = REGISTRY.register("kidney_failure", () -> new KidneyFailureMobEffect());
	public static final RegistryObject<MobEffect> MERCURY_POISONING = REGISTRY.register("mercury_poisoning", () -> new MercuryPoisoningMobEffect());
}
