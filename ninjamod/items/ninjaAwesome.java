package mtndewey.ninjamod.items;

import mtndewey.ninjamod.ninjamod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
public class ninjaAwesome extends ItemArmor {


	public ninjaAwesome(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		
}
	private final String armorTexture = ninjamod.modid + ":" + "textures/armor/";

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
    		if(slot == 2)return armorTexture + "ninjaAwesome_layer_2.png";
    		else return armorTexture + "ninjaAwesome_layer_1.png";
			} 

	
	public void registerIcons(IconRegister iconRegister)
	{
		if(itemID == ninjamoditems.ninjaBootsAwesome.itemID)
		{
			this.itemIcon = iconRegister.registerIcon("ninjamod:ninjaBootsAwesome");
		}
		if(itemID == ninjamoditems.ninjaLegsAwesome.itemID)
		{
			this.itemIcon = iconRegister.registerIcon("ninjamod:ninjaLegsAwesome");
		}
		if(itemID == ninjamoditems.ninjaChestAwesome.itemID)
		{
			this.itemIcon = iconRegister.registerIcon("ninjamod:ninjaChestAwesome");
		}
		if(itemID == ninjamoditems.ninjaHelmAwesome.itemID)
		{
			this.itemIcon = iconRegister.registerIcon("ninjamod:ninjaHelmAwesome");
		}
	}
}
