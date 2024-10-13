
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.ghluka.alloyspawn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import io.github.ghluka.alloyspawn.AlloyspawnMod;

public class AlloyspawnModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AlloyspawnMod.MODID);
	public static final RegistryObject<SoundEvent> LIBETS_DELAY = REGISTRY.register("libets_delay", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("alloyspawn", "libets_delay")));
}
