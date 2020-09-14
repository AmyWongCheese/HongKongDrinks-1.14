package com.neocosplayer.hongkongdrinks.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

import com.neocosplayer.hongkongdrinks.item.YGSugarcaneJuiceItem;
import com.neocosplayer.hongkongdrinks.item.YGPineappleJuiceItem;
import com.neocosplayer.hongkongdrinks.item.YGPeachTeaItem;
import com.neocosplayer.hongkongdrinks.item.YGMelonMilkItem;
import com.neocosplayer.hongkongdrinks.item.YGMangoJuiceItem;
import com.neocosplayer.hongkongdrinks.item.YGMandarinTeaItem;
import com.neocosplayer.hongkongdrinks.item.YGLemonTeaItem;
import com.neocosplayer.hongkongdrinks.item.YGCoconutMilkItem;
import com.neocosplayer.hongkongdrinks.item.YGChrysanthemumTeaItem;
import com.neocosplayer.hongkongdrinks.item.YGAppleJuiceItem;
import com.neocosplayer.hongkongdrinks.item.VitasoyGoBananaPancakeDrinkItem;
import com.neocosplayer.hongkongdrinks.item.VitaVanillaSoyaMilkItem;
import com.neocosplayer.hongkongdrinks.item.VitaTiramisuDrinkGirlItem;
import com.neocosplayer.hongkongdrinks.item.VitaTiramisuDrinkBoyItem;
import com.neocosplayer.hongkongdrinks.item.VitaSweetPotatoSoyaMilkItem;
import com.neocosplayer.hongkongdrinks.item.VitaSugarcaneJuiceItem;
import com.neocosplayer.hongkongdrinks.item.VitaStrawberrySoyaMilkItem;
import com.neocosplayer.hongkongdrinks.item.VitaSoyaMilkItem;
import com.neocosplayer.hongkongdrinks.item.VitaRedBeanSoyaMilkItem;
import com.neocosplayer.hongkongdrinks.item.VitaOrangeChocoSoyaMilkItem;
import com.neocosplayer.hongkongdrinks.item.VitaMintChocoSoyaMilkItem;
import com.neocosplayer.hongkongdrinks.item.VitaMangoJuiceItem;
import com.neocosplayer.hongkongdrinks.item.VitaMaltSoyaMilkItem;
import com.neocosplayer.hongkongdrinks.item.VitaLycheeLoveTeaItem;
import com.neocosplayer.hongkongdrinks.item.VitaLemonTeaItem;
import com.neocosplayer.hongkongdrinks.item.VitaImperataeCaneDrinkItem;
import com.neocosplayer.hongkongdrinks.item.VitaIcyGrapefruitItem;
import com.neocosplayer.hongkongdrinks.item.VitaHoneyLimeDrinkItem;
import com.neocosplayer.hongkongdrinks.item.VitaGuavaJuiceItem;
import com.neocosplayer.hongkongdrinks.item.VitaGingerSoyaMilkItem;
import com.neocosplayer.hongkongdrinks.item.VitaCookiesCreamSoyaMilkItem;
import com.neocosplayer.hongkongdrinks.item.VitaCoconutSoyaMilkItem;
import com.neocosplayer.hongkongdrinks.item.VitaChrysanthemumTeaItem;
import com.neocosplayer.hongkongdrinks.item.VitaChocolateMilkItem;
import com.neocosplayer.hongkongdrinks.item.VitaChocoSoyaMilkItem;
import com.neocosplayer.hongkongdrinks.item.VitaChinesePearTeaItem;
import com.neocosplayer.hongkongdrinks.item.VitaBlackcurrantJuiceItem;
import com.neocosplayer.hongkongdrinks.item.VitaAppleMangoTeaItem;
import com.neocosplayer.hongkongdrinks.item.VitaAppleGreenTeaItem;
import com.neocosplayer.hongkongdrinks.item.TaoTiWhiteTeaItem;
import com.neocosplayer.hongkongdrinks.item.TaoTiOolongTeaItem;
import com.neocosplayer.hongkongdrinks.item.TaoTiMetaTeaItem;
import com.neocosplayer.hongkongdrinks.item.TaoTiMetaGreenTeaItem;
import com.neocosplayer.hongkongdrinks.item.TaoTiMandarinLemonItem;
import com.neocosplayer.hongkongdrinks.item.TaoTiHoneyGreenTeaItem;
import com.neocosplayer.hongkongdrinks.item.TaoTiGrapeJuiceItem;
import com.neocosplayer.hongkongdrinks.item.HealthworksRockSugarWithPearDrinkItem;
import com.neocosplayer.hongkongdrinks.item.HealthworksHawhornAppleDrinkItem;
import com.neocosplayer.hongkongdrinks.item.HFTSaltedMandarinItem;
import com.neocosplayer.hongkongdrinks.item.HFTPassionFruitItem;
import com.neocosplayer.hongkongdrinks.item.HFTMandarinAloeItem;
import com.neocosplayer.hongkongdrinks.HongkongdrinksModElements;

@HongkongdrinksModElements.ModElement.Tag
public class InputCoinProcedure extends HongkongdrinksModElements.ModElement {
	public InputCoinProcedure(HongkongdrinksModElements instance) {
		super(instance, 271);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure InputCoin!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure InputCoin!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure InputCoin!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure InputCoin!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure InputCoin!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (0))) == 1) && (((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (2))) == 0) && ((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (4))) == 0))) && ((((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (6))) == 0) && ((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (8))) == 0)) && (((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (10))) == 0) && ((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (12))) == 0)))) && ((((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (14))) == 0) && ((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (16))) == 0)) && ((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (18))) == 0)))) {
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
			}
			if ((BiomeDictionary.hasType(world.getBiome(new BlockPos((int) x, (int) y, (int) z)), BiomeDictionary.Type.BEACH))) {
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(YGCoconutMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(YGCoconutMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(YGCoconutMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(YGCoconutMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(YGCoconutMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaCoconutSoyaMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaCoconutSoyaMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (14))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaCoconutSoyaMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaCoconutSoyaMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			} else if ((BiomeDictionary.hasType(world.getBiome(new BlockPos((int) x, (int) y, (int) z)), BiomeDictionary.Type.SNOWY))) {
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaIcyGrapefruitItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaIcyGrapefruitItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaIcyGrapefruitItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaIcyGrapefruitItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (7))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaIcyGrapefruitItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaIcyGrapefruitItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaIcyGrapefruitItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaIcyGrapefruitItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaIcyGrapefruitItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			} else if ((BiomeDictionary.hasType(world.getBiome(new BlockPos((int) x, (int) y, (int) z)), BiomeDictionary.Type.FOREST))) {
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaAppleGreenTeaItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaAppleMangoTeaItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(YGAppleJuiceItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(HealthworksHawhornAppleDrinkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaChinesePearTeaItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(HealthworksRockSugarWithPearDrinkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaBlackcurrantJuiceItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (14))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaLycheeLoveTeaItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaLycheeLoveTeaItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			} else if ((BiomeDictionary.hasType(world.getBiome(new BlockPos((int) x, (int) y, (int) z)), BiomeDictionary.Type.SWAMP))) {
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaMintChocoSoyaMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaTiramisuDrinkBoyItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaTiramisuDrinkBoyItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaTiramisuDrinkBoyItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaTiramisuDrinkGirlItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaTiramisuDrinkGirlItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaTiramisuDrinkGirlItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (14))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(TaoTiGrapeJuiceItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(TaoTiGrapeJuiceItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			} else if ((BiomeDictionary.hasType(world.getBiome(new BlockPos((int) x, (int) y, (int) z)), BiomeDictionary.Type.PLAINS))) {
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaCookiesCreamSoyaMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitasoyGoBananaPancakeDrinkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaStrawberrySoyaMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(TaoTiHoneyGreenTeaItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaHoneyLimeDrinkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaMaltSoyaMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaMaltSoyaMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (14))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(YGChrysanthemumTeaItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaChrysanthemumTeaItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			} else if (((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
					.equals(new ResourceLocation("jungle")))
					|| (ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("modified_jungle"))))) {
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaMangoJuiceItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaGuavaJuiceItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaRedBeanSoyaMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(YGMelonMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(YGMangoJuiceItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(YGMandarinTeaItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(YGPeachTeaItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (14))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(YGPineappleJuiceItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(TaoTiMandarinLemonItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			} else if (((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
					.equals(new ResourceLocation("jungle_hills")))
					|| ((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("bamboo_jungle")))
							|| (ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
									.equals(new ResourceLocation("bamboo_jungle_hills")))))) {
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaLemonTeaItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaSugarcaneJuiceItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaImperataeCaneDrinkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(YGLemonTeaItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(YGSugarcaneJuiceItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(TaoTiOolongTeaItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(TaoTiMetaTeaItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (14))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(TaoTiMetaGreenTeaItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(TaoTiWhiteTeaItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			} else if (((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
					.equals(new ResourceLocation("jungle_edge")))
					|| (ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("modified_jungle_edge"))))) {
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(HFTPassionFruitItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(HFTPassionFruitItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(HFTSaltedMandarinItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(HFTSaltedMandarinItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaChocoSoyaMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaVanillaSoyaMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaSweetPotatoSoyaMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (14))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaOrangeChocoSoyaMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaGingerSoyaMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			} else if (((BiomeDictionary.hasType(world.getBiome(new BlockPos((int) x, (int) y, (int) z)), BiomeDictionary.Type.SANDY))
					|| (BiomeDictionary.hasType(world.getBiome(new BlockPos((int) x, (int) y, (int) z)), BiomeDictionary.Type.SAVANNA)))) {
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(HFTMandarinAloeItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(HFTMandarinAloeItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(HFTMandarinAloeItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(HFTMandarinAloeItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(HFTMandarinAloeItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(HFTMandarinAloeItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(HFTMandarinAloeItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (14))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(HFTMandarinAloeItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(HFTMandarinAloeItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			} else {
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaLemonTeaItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaSoyaMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (4))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaMaltSoyaMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (6))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaChocolateMilkItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (8))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(YGLemonTeaItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (10))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaChrysanthemumTeaItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (12))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(TaoTiMandarinLemonItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (14))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaBlackcurrantJuiceItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (16))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity instanceof PlayerEntity) {
					Container _current = ((PlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack _setstack = new ItemStack(VitaMangoJuiceItem.block, (int) (1));
							_setstack.setCount((int) 1);
							((Slot) ((Map) invobj).get((int) (18))).putStack(_setstack);
							_current.detectAndSendChanges();
						}
					}
				}
			}
		}
	}
}
