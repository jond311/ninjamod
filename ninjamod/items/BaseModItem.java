package mtndewey.ninjamod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import mtndewey.ninjamod.ninjamod;

public class BaseModItem extends Item{
	public BaseModItem(int par1)
	{
	super(par1);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister)//updateIcons
	{
	this.itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(5));
	}
	}

