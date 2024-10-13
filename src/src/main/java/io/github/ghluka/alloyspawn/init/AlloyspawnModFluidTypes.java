
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package io.github.ghluka.alloyspawn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import io.github.ghluka.alloyspawn.fluid.types.StillWaterFluidType;
import io.github.ghluka.alloyspawn.AlloyspawnMod;

public class AlloyspawnModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, AlloyspawnMod.MODID);
	public static final RegistryObject<FluidType> STILL_WATER_TYPE = REGISTRY.register("still_water", () -> new StillWaterFluidType());
}
