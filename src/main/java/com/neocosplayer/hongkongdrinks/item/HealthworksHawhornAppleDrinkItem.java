
package com.neocosplayer.hongkongdrinks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;

import java.util.Map;
import java.util.HashMap;

import com.neocosplayer.hongkongdrinks.procedures.VitaLemonTeaFoodEatenProcedure;
import com.neocosplayer.hongkongdrinks.procedures.HealthworksHawhornAppleDrinkOnFoodRightClickedProcedure;
import com.neocosplayer.hongkongdrinks.itemgroup.HongKongDrinksItemGroup;
import com.neocosplayer.hongkongdrinks.HongkongdrinksModElements;

@HongkongdrinksModElements.ModElement.Tag
public class HealthworksHawhornAppleDrinkItem extends HongkongdrinksModElements.ModElement {
	@ObjectHolder("hongkongdrinks:healthworks_hawhorn_apple_drink")
	public static final Item block = null;
	public HealthworksHawhornAppleDrinkItem(HongkongdrinksModElements instance) {
		super(instance, 39);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(HongKongDrinksItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(4).saturation(0.3f).build()));
			setRegistryName("healthworks_hawhorn_apple_drink");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.DRINK;
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			double x = entity.posX;
			double y = entity.posY;
			double z = entity.posZ;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				HealthworksHawhornAppleDrinkOnFoodRightClickedProcedure.executeProcedure($_dependencies);
			}
			return ar;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemStack, world, entity);
			double x = entity.posX;
			double y = entity.posY;
			double z = entity.posZ;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				VitaLemonTeaFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
