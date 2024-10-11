
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.ghluka.alloyspawn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import io.github.ghluka.alloyspawn.item.LunchlyItem;
import io.github.ghluka.alloyspawn.item.Lunchly3Item;
import io.github.ghluka.alloyspawn.item.Lunchly2Item;
import io.github.ghluka.alloyspawn.AlloyspawnMod;

public class AlloyspawnModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AlloyspawnMod.MODID);
	public static final RegistryObject<Item> LUNCHLY = REGISTRY.register("lunchly", () -> new LunchlyItem());
	public static final RegistryObject<Item> LUNCHLY_2 = REGISTRY.register("lunchly_2", () -> new Lunchly2Item());
	public static final RegistryObject<Item> LUNCHLY_3 = REGISTRY.register("lunchly_3", () -> new Lunchly3Item());
	// Start of user code block custom items
	// End of user code block custom items
}
