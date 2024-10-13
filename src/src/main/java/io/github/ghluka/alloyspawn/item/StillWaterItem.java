
package io.github.ghluka.alloyspawn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import io.github.ghluka.alloyspawn.init.AlloyspawnModFluids;

public class StillWaterItem extends BucketItem {
	public StillWaterItem() {
		super(AlloyspawnModFluids.STILL_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
