package mtndewey.ninjamod;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.client.EnumHelperClient;

public class ninjamodmaterials {

	public static final EnumToolMaterial LEGENDARY = EnumHelperClient.addToolMaterial ("legendary", 5, 2000, 15.0F, 4.0F, 30);
	public static final EnumArmorMaterial NINJAAWESOME = EnumHelperClient.addArmorMaterial("ninjaawesome", 30 , new int[]{5, 10, 8, 5}, 30);
	public static final EnumArmorMaterial NINJA = EnumHelperClient.addArmorMaterial("ninja", 30 , new int[]{4, 9, 7, 4}, 30);
	
}
