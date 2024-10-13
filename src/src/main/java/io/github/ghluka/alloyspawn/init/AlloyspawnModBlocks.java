
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.ghluka.alloyspawn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import io.github.ghluka.alloyspawn.block.StillWaterBlock;
import io.github.ghluka.alloyspawn.AlloyspawnMod;

public class AlloyspawnModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AlloyspawnMod.MODID);
	public static final RegistryObject<Block> STILL_WATER = REGISTRY.register("still_water", () -> new StillWaterBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
