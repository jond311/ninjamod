package mtndewey.ninjamod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mtndewey.ninjamod.ninjamod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class steelPlating extends BaseModItem {

	public steelPlating(int par1) {
		super(par1);
		this.setUnlocalizedName("ninjamod:steelPlating");
		this.setCreativeTab(ninjamod.tabNinja);
	}


}
