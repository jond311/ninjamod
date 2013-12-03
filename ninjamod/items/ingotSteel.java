package mtndewey.ninjamod.items;

import mtndewey.ninjamod.ninjamod;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;


public class ingotSteel extends BaseModItem {

	public ingotSteel(int itemId) {
		super (itemId);
		this.setCreativeTab(ninjamod.tabNinja);
	}

}