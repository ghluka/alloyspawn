
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.ghluka.alloyspawn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import io.github.ghluka.alloyspawn.AlloyspawnMod;

public class AlloyspawnModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlloyspawnMod.MODID);
	public static final RegistryObject<CreativeModeTab> INFLUENCER_PRODUCTS = REGISTRY.register("influencer_products",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.alloyspawn.influencer_products")).icon(() -> new ItemStack(AlloyspawnModItems.LUNCHLY.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AlloyspawnModItems.LUNCHLY.get());
				tabData.accept(AlloyspawnModItems.LUNCHLY_2.get());
				tabData.accept(AlloyspawnModItems.LUNCHLY_3.get());
				tabData.accept(AlloyspawnModItems.PRIME.get());
				tabData.accept(AlloyspawnModItems.PRIME_2.get());
				tabData.accept(AlloyspawnModItems.PRIME_3.get());
				tabData.accept(AlloyspawnModItems.PRIME_4.get());
				tabData.accept(AlloyspawnModItems.PRIME_5.get());
				tabData.accept(AlloyspawnModItems.PRIME_6.get());
				tabData.accept(AlloyspawnModItems.PRIME_7.get());
				tabData.accept(AlloyspawnModItems.PRIME_8.get());
				tabData.accept(AlloyspawnModItems.FEASTABLES.get());
				tabData.accept(AlloyspawnModItems.FEASTABLES_2.get());
				tabData.accept(AlloyspawnModItems.FEASTABLES_3.get());
				tabData.accept(AlloyspawnModItems.FEASTABLES_4.get());
				tabData.accept(AlloyspawnModItems.FEASTABLES_5.get());
				tabData.accept(AlloyspawnModItems.FEASTABLES_6.get());
				tabData.accept(AlloyspawnModItems.FEASTABLES_7.get());
				tabData.accept(AlloyspawnModItems.FEASTABLES_8.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> BRAINROT = REGISTRY.register("brainrot",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.alloyspawn.brainrot")).icon(() -> new ItemStack(AlloyspawnModItems.MYSTERIOUS_GOOP.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AlloyspawnModItems.MYSTERIOUS_GOOP.get());
				tabData.accept(AlloyspawnModItems.ELECTROLYTES.get());
				tabData.accept(AlloyspawnModItems.STILL_WATER_BUCKET.get());
			})

					.build());
}
