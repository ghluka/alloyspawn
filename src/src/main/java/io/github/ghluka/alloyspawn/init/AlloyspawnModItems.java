
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.ghluka.alloyspawn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import io.github.ghluka.alloyspawn.item.StillWaterItem;
import io.github.ghluka.alloyspawn.item.PrimeItem;
import io.github.ghluka.alloyspawn.item.Prime8Item;
import io.github.ghluka.alloyspawn.item.Prime7Item;
import io.github.ghluka.alloyspawn.item.Prime6Item;
import io.github.ghluka.alloyspawn.item.Prime5Item;
import io.github.ghluka.alloyspawn.item.Prime4Item;
import io.github.ghluka.alloyspawn.item.Prime3Item;
import io.github.ghluka.alloyspawn.item.Prime2Item;
import io.github.ghluka.alloyspawn.item.MysteriousGoopItem;
import io.github.ghluka.alloyspawn.item.LunchlyItem;
import io.github.ghluka.alloyspawn.item.Lunchly3Item;
import io.github.ghluka.alloyspawn.item.Lunchly2Item;
import io.github.ghluka.alloyspawn.item.FeastablesItem;
import io.github.ghluka.alloyspawn.item.Feastables8Item;
import io.github.ghluka.alloyspawn.item.Feastables7Item;
import io.github.ghluka.alloyspawn.item.Feastables6Item;
import io.github.ghluka.alloyspawn.item.Feastables5Item;
import io.github.ghluka.alloyspawn.item.Feastables4Item;
import io.github.ghluka.alloyspawn.item.Feastables3Item;
import io.github.ghluka.alloyspawn.item.Feastables2Item;
import io.github.ghluka.alloyspawn.item.ElectrolytesItem;
import io.github.ghluka.alloyspawn.AlloyspawnMod;

public class AlloyspawnModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AlloyspawnMod.MODID);
	public static final RegistryObject<Item> LUNCHLY = REGISTRY.register("lunchly", () -> new LunchlyItem());
	public static final RegistryObject<Item> LUNCHLY_2 = REGISTRY.register("lunchly_2", () -> new Lunchly2Item());
	public static final RegistryObject<Item> LUNCHLY_3 = REGISTRY.register("lunchly_3", () -> new Lunchly3Item());
	public static final RegistryObject<Item> MYSTERIOUS_GOOP = REGISTRY.register("mysterious_goop", () -> new MysteriousGoopItem());
	public static final RegistryObject<Item> PRIME = REGISTRY.register("prime", () -> new PrimeItem());
	public static final RegistryObject<Item> PRIME_2 = REGISTRY.register("prime_2", () -> new Prime2Item());
	public static final RegistryObject<Item> PRIME_3 = REGISTRY.register("prime_3", () -> new Prime3Item());
	public static final RegistryObject<Item> PRIME_4 = REGISTRY.register("prime_4", () -> new Prime4Item());
	public static final RegistryObject<Item> PRIME_5 = REGISTRY.register("prime_5", () -> new Prime5Item());
	public static final RegistryObject<Item> PRIME_6 = REGISTRY.register("prime_6", () -> new Prime6Item());
	public static final RegistryObject<Item> PRIME_7 = REGISTRY.register("prime_7", () -> new Prime7Item());
	public static final RegistryObject<Item> PRIME_8 = REGISTRY.register("prime_8", () -> new Prime8Item());
	public static final RegistryObject<Item> ELECTROLYTES = REGISTRY.register("electrolytes", () -> new ElectrolytesItem());
	public static final RegistryObject<Item> FEASTABLES = REGISTRY.register("feastables", () -> new FeastablesItem());
	public static final RegistryObject<Item> FEASTABLES_2 = REGISTRY.register("feastables_2", () -> new Feastables2Item());
	public static final RegistryObject<Item> FEASTABLES_3 = REGISTRY.register("feastables_3", () -> new Feastables3Item());
	public static final RegistryObject<Item> FEASTABLES_4 = REGISTRY.register("feastables_4", () -> new Feastables4Item());
	public static final RegistryObject<Item> FEASTABLES_5 = REGISTRY.register("feastables_5", () -> new Feastables5Item());
	public static final RegistryObject<Item> FEASTABLES_6 = REGISTRY.register("feastables_6", () -> new Feastables6Item());
	public static final RegistryObject<Item> FEASTABLES_7 = REGISTRY.register("feastables_7", () -> new Feastables7Item());
	public static final RegistryObject<Item> FEASTABLES_8 = REGISTRY.register("feastables_8", () -> new Feastables8Item());
	public static final RegistryObject<Item> STILL_WATER_BUCKET = REGISTRY.register("still_water_bucket", () -> new StillWaterItem());
	// Start of user code block custom items
	// End of user code block custom items
}
