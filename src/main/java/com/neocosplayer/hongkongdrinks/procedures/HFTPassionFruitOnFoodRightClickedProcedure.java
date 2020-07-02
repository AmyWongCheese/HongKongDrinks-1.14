package com.neocosplayer.hongkongdrinks.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import com.neocosplayer.hongkongdrinks.item.HFTPassionFruitItem;
import com.neocosplayer.hongkongdrinks.entity.HFTPassionFruitEntityEntity;
import com.neocosplayer.hongkongdrinks.HongkongdrinksModElements;

@HongkongdrinksModElements.ModElement.Tag
public class HFTPassionFruitOnFoodRightClickedProcedure extends HongkongdrinksModElements.ModElement {
	public HFTPassionFruitOnFoodRightClickedProcedure(HongkongdrinksModElements instance) {
		super(instance, 168);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		Entity entityToSpawn = new HFTPassionFruitEntityEntity.CustomEntity(HFTPassionFruitEntityEntity.entity, world);
		if ((((entity.isSneaking()) && (new ItemStack(HFTPassionFruitItem.block, (int) (1))
				.getItem() == ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem()))
				|| ((new ItemStack(HFTPassionFruitItem.block, (int) (1))
						.getItem() == ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem())
						&& (new ItemStack(Blocks.AIR, (int) (1))
								.getItem() == ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem())))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory
						.clearMatchingItems(p -> new ItemStack(HFTPassionFruitItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
			world.playSound((PlayerEntity) null, x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
			DrinkPlaced.place(entity, world, entityToSpawn);
		}
	}
}