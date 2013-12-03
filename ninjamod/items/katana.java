package mtndewey.ninjamod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mtndewey.ninjamod.ninjamod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;


public class katana extends ItemSword {

	public katana(int ItemID, EnumToolMaterial material){
		super(ItemID, material);
		setCreativeTab(ninjamod.tabNinja);
	}

	@SideOnly (Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
		if(itemID == ninjamoditems.katana.itemID)
		{
			this.itemIcon = iconRegister.registerIcon("ninjamod:katana");
		}
		if(itemID == ninjamoditems.legendaryKatana.itemID)
		{
			this.itemIcon = iconRegister.registerIcon("ninjamod:katanaLegendary");
		}

	}
}