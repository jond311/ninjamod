package mtndewey.ninjamod.client;

import java.util.EnumSet;

import mtndewey.ninjamod.ninjamod;
import mtndewey.ninjamod.items.ninjamoditems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ServerTickHandler implements ITickHandler {

	private void onPlayerTick(EntityPlayer player){
		if (player.getCurrentItemOrArmor(4) != null){
			ItemStack helmet = player.getCurrentItemOrArmor(4);

			if (helmet.getItem() == ninjamoditems.ninjaHelmAwesome){
				player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 20, 0));
			}
		}
		if (player.getCurrentItemOrArmor(3) != null){
			ItemStack chestplate = player.getCurrentItemOrArmor(3);

			if (chestplate.getItem() == ninjamoditems.ninjaChestAwesome){
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 20, 0));
			}
		}
		if (player.getCurrentItemOrArmor(2) != null){
			ItemStack leggings = player.getCurrentItemOrArmor(2);

			if (leggings.getItem() == ninjamoditems.ninjaLegsAwesome){
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 20, 5));
			}
		}
		if (player.getCurrentItemOrArmor(1) != null){
			ItemStack boots = player.getCurrentItemOrArmor(1);

			if (boots.getItem() == ninjamoditems.ninjaBootsAwesome){
				player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 20 ,5));
			}
		}
	}

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData)
	{
		if (type.equals(EnumSet.of(TickType.PLAYER)))
		{
			onPlayerTick((EntityPlayer)tickData[0]);
		}
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {


	}

	@Override
	public EnumSet<TickType> ticks() 
	{
		return EnumSet.of(TickType.PLAYER, TickType.SERVER);
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}

}
