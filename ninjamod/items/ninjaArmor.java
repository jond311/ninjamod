package mtndewey.ninjamod.items;

import mtndewey.ninjamod.ninjamod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ninjaArmor extends ItemArmor {

	public ninjaArmor(int par1, EnumArmorMaterial material, int i, int j) {
		super(par1, material, i, j);
	}
	
	private final String armorTexture = ninjamod.modid + ":" + "textures/armor/";
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
    		if(slot == 2)return armorTexture + "ninjaArmor_layer_2.png";
    		else return armorTexture + "ninjaArmor_layer_1.png";
			} 

	
	public void registerIcons(IconRegister iconRegister)
	{
		if(itemID == ninjamoditems.ninjaBoots.itemID)
		{
			this.itemIcon = iconRegister.registerIcon("ninjamod:ninjaBootsAwesome");
		}
		if(itemID == ninjamoditems.ninjaLegs.itemID)
		{
			this.itemIcon = iconRegister.registerIcon("ninjamod:ninjaLegsAwesome");
		}
		if(itemID == ninjamoditems.ninjaChest.itemID)
		{
			this.itemIcon = iconRegister.registerIcon("ninjamod:ninjaChestAwesome");
		}
		if(itemID == ninjamoditems.ninjaHelm.itemID)
		{
			this.itemIcon = iconRegister.registerIcon("ninjamod:ninjaHelmAwesome");
		}
	}
	


}
