package com.neocosplayer.hongkongdrinks.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.Direction;
import net.minecraft.entity.Entity;

import com.neocosplayer.hongkongdrinks.HongkongdrinksModElements;

@HongkongdrinksModElements.ModElement.Tag
public class DrinkPlaced extends HongkongdrinksModElements.ModElement {
	/**
	 * Do not remove this constructor
	 */
	public DrinkPlaced(HongkongdrinksModElements instance) {
		super(instance, 170);
	}

	public static void place(Entity entity, World world, Entity entityToSpawn) {
		float x = (float) entity.posX;
		float y = (float) entity.posY;
		float z = (float) entity.posZ;
		float a = x - (int) x;
		float b = z - (int) z;
		if (((entity.getHorizontalFacing()) == Direction.NORTH)) {
			if (!world.isRemote) {
				entityToSpawn
						.setLocationAndAngles(
								((entity.world
										.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f)
														.add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
										.getPos().getX()) + a),
								(y + 1),
								((entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()) - b),
								world.rand.nextFloat() * 360F, 0);
				world.addEntity(entityToSpawn);
			}
		} else if (((entity.getHorizontalFacing()) == Direction.SOUTH) || ((entity.getHorizontalFacing()) == Direction.WEST)) {
			if (!world.isRemote) {
				entityToSpawn
						.setLocationAndAngles(
								((entity.world
										.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f)
														.add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
										.getPos().getX()) + a),
								(y + 1),
								((entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()) + b + 1),
								world.rand.nextFloat() * 360F, 0);
				world.addEntity(entityToSpawn);
			}
		} else if (((entity.getHorizontalFacing()) == Direction.EAST)) {
			if (!world.isRemote) {
				entityToSpawn
						.setLocationAndAngles(
								((entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()) - a + 1),
								(y + 1),
								((entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()) + b + 1),
								world.rand.nextFloat() * 360F, 0);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
