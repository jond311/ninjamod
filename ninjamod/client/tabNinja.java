package mtndewey.ninjamod.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mtndewey.ninjamod.ninjamod;
import mtndewey.ninjamod.items.ninjamoditems;
import net.minecraft.creativetab.CreativeTabs;



public final class tabNinja extends CreativeTabs
{

	public tabNinja(int par1, String par2Str)
	{
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return ninjamoditems.legendaryKatana.itemID;
	}

	public String getTranslatedTabLabel()
	{
		return "Ninja";
	}
}