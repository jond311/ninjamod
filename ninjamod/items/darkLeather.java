package mtndewey.ninjamod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mtndewey.ninjamod.ninjamod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class darkLeather extends BaseModItem{

	public darkLeather(int itemID) {
		super(itemID);
		this.setCreativeTab(ninjamod.tabNinja);
		this.setUnlocalizedName("ninjamod:darkLeather");
	}
}
