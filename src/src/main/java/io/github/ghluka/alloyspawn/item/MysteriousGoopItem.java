
package io.github.ghluka.alloyspawn.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import java.util.List;

import io.github.ghluka.alloyspawn.procedures.MysteriousGoopPlayerFinishesUsingItemProcedure;
import io.github.ghluka.alloyspawn.init.AlloyspawnModItems;

public class MysteriousGoopItem extends Item {
	public MysteriousGoopItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat().build()));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("May or may not contain:"));
		list.add(Component.literal(" - Perfluoroalkyl substances"));
		list.add(Component.literal(" - Polyfluoroalkyl substances"));
		list.add(Component.literal(" - Bisphenol A"));
		list.add(Component.literal(" - Phthalates"));
		list.add(Component.literal(" - Titanium dioxide"));
		list.add(Component.literal(" - Artificial flavoring"));
		list.add(Component.literal(" - Artificial coloring"));
		list.add(Component.literal(" - Lead"));
		list.add(Component.literal(" - Mercury"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		entity.startUsingItem(hand);
		return ar;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(AlloyspawnModItems.MYSTERIOUS_GOOP.get());
		super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		MysteriousGoopPlayerFinishesUsingItemProcedure.execute(world, entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
