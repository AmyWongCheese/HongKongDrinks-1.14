package com.neocosplayer.hongkongdrinks.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import com.neocosplayer.hongkongdrinks.item.YGAppleJuiceItem;
import com.neocosplayer.hongkongdrinks.entity.YGAppleJuiceEntityEntity;
import com.neocosplayer.hongkongdrinks.HongkongdrinksModElements;

@HongkongdrinksModElements.ModElement.Tag
public class YGAppleJuiceOnFoodRightClickedProcedure extends HongkongdrinksModElements.ModElement {
	public YGAppleJuiceOnFoodRightClickedProcedure(HongkongdrinksModElements instance) {
		super(instance, 128);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure YGAppleJuiceOnFoodRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure YGAppleJuiceOnFoodRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure YGAppleJuiceOnFoodRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure YGAppleJuiceOnFoodRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure YGAppleJuiceOnFoodRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity.isSneaking()) && (new ItemStack(YGAppleJuiceItem.block, (int) (1))
				.getItem() == ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem()))
				|| ((new ItemStack(YGAppleJuiceItem.block, (int) (1))
						.getItem() == ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem())
						&& (new ItemStack(Blocks.AIR, (int) (1))
								.getItem() == ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem())))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory.clearMatchingItems(p -> new ItemStack(YGAppleJuiceItem.block, (int) (1)).getItem() == p.getItem(),
						(int) 1);
			world.playSound((PlayerEntity) null, x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
			if (((entity.getHorizontalFacing()) == Direction.NORTH)) {
				if (!world.isRemote) {
					Entity entityToSpawn = new YGAppleJuiceEntityEntity.CustomEntity(YGAppleJuiceEntityEntity.entity, world);
					entityToSpawn.setLocationAndAngles((x + 0.5), (y + 1), (z - 0.5), world.rand.nextFloat() * 360F, 0);
					world.addEntity(entityToSpawn);
				}
			} else if (((entity.getHorizontalFacing()) == Direction.SOUTH)) {
				if (!world.isRemote) {
					Entity entityToSpawn = new YGAppleJuiceEntityEntity.CustomEntity(YGAppleJuiceEntityEntity.entity, world);
					entityToSpawn.setLocationAndAngles((x + 0.5), (y + 1), (z + 1.5), world.rand.nextFloat() * 360F, 0);
					world.addEntity(entityToSpawn);
				}
			} else if (((entity.getHorizontalFacing()) == Direction.EAST)) {
				if (!world.isRemote) {
					Entity entityToSpawn = new YGAppleJuiceEntityEntity.CustomEntity(YGAppleJuiceEntityEntity.entity, world);
					entityToSpawn.setLocationAndAngles((x + 1.5), (y + 1), (z + 0.5), world.rand.nextFloat() * 360F, 0);
					world.addEntity(entityToSpawn);
				}
			} else if (((entity.getHorizontalFacing()) == Direction.WEST)) {
				if (!world.isRemote) {
					Entity entityToSpawn = new YGAppleJuiceEntityEntity.CustomEntity(YGAppleJuiceEntityEntity.entity, world);
					entityToSpawn.setLocationAndAngles((x - 0.5), (y + 1), (z + 0.5), world.rand.nextFloat() * 360F, 0);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
