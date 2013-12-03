package mtndewey.ninjamod.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import mtndewey.ninjamod.*;

import java.net.Proxy;
import java.util.Map;
import java.util.Random;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import mtndewey.ninjamod.items.darkLeather;
import mtndewey.ninjamod.items.katana;
import mtndewey.ninjamod.items.ninjaArmor;
import mtndewey.ninjamod.items.ninjaAwesome;
import mtndewey.ninjamod.items.steelPlating;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.EnumHelperClient;
import mtndewey.ninjamod.items.*;
import mtndewey.ninjamod.blocks.*;
import mtndewey.ninjamod.client.EntityNinjaStar;
import mtndewey.ninjamod.client.RenderNinjaStar;
import mtndewey.ninjamod.client.ServerProxy;
import mtndewey.ninjamod.client.WorldGenDojo;
import mtndewey.ninjamod.client.WorldGeneratorNinjaMod;
import mtndewey.ninjamod.client.tabNinja;
import mtndewey.ninjamod.ninjamodrecipes;
import mtndewey.ninjamod.items.ninjamoditems;

public class ninjamoditems {

	public static ServerProxy proxy;
	@SidedProxy(clientSide = "mtndewey.ninjamod.proxies.ClientProxy", serverSide = "mtndewey.ninjamod.proxies.ServerProxy")
	
	public static Item fireKatana;
	public static Item waterKatana;
	public static Item ninjaStar;
	public static Item ninjaChestAwesome;
	public static Item ninjaLegsAwesome;
	public static Item ninjaHelmAwesome;
	public static Item ninjaBootsAwesome;
	public static Item ninjaChest;
	public static Item ninjaLegs;
	public static Item ninjaHelm;
	public static Item ninjaBoots;
	public static Item darkLeather;
	public static Item steelPlating;
	public static Item katana;
	public static Item legendaryKatana;
	public static Item ingotSteel;
	
	public ninjamoditems(){
		
		//Katanas
		katana = new katana(7894, EnumToolMaterial.IRON).setUnlocalizedName("ninjamod:katana");
		legendaryKatana = new katana(7895, ninjamodmaterials.LEGENDARY).setUnlocalizedName("ninjamod:katanaLegendary");
		fireKatana = new katanaFire(7896, ninjamodmaterials.LEGENDARY).setUnlocalizedName("ninjamod:katanaFire");
		waterKatana = new katanaWater(7897, ninjamodmaterials.LEGENDARY).setUnlocalizedName("ninjamod:katanaWater");
		
		//Items
		ingotSteel = new ingotSteel(7898).setUnlocalizedName("ninjamod:ingotSteel");
		ninjaStar = new ItemNinjaStar(7900).setUnlocalizedName("ninjamod:ninjaStar");
		darkLeather = new darkLeather(7909).setUnlocalizedName("ninjamod:darkLeather");
		steelPlating = new steelPlating(7910).setUnlocalizedName("ninjamod:steelPlating");
		
		//Armor
		ninjamoditems.ninjaChestAwesome = new ninjaAwesome(7902, ninjamodmaterials.NINJA, proxy.addArmor("ninjaChestAwesome"), 1).setUnlocalizedName("ninjamod:chestNinjaAwesome").setCreativeTab(ninjamod.tabNinja);
		ninjamoditems.ninjaLegsAwesome = new ninjaAwesome(7903, ninjamodmaterials.NINJA, proxy.addArmor("ninjaLegsAwesome"), 2).setUnlocalizedName("ninjamod:legsNinjaAwesome").setCreativeTab(ninjamod.tabNinja);
		ninjamoditems.ninjaHelmAwesome = new ninjaAwesome(7901, ninjamodmaterials.NINJA, proxy.addArmor("ninjaHelmAwesome"), 0).setUnlocalizedName("ninjamod:helmNinjaAwesome").setCreativeTab(ninjamod.tabNinja);
		ninjamoditems.ninjaBootsAwesome = new ninjaAwesome(7904, ninjamodmaterials.NINJA, proxy.addArmor("ninjaBootsAwesome"), 3).setUnlocalizedName("ninjamod:bootsNinjaAwesome").setCreativeTab(ninjamod.tabNinja);
		ninjamoditems.ninjaChest = new ninjaArmor(7906, ninjamodmaterials.NINJA, proxy.addArmor("ninjaChest"), 1).setUnlocalizedName("ninjamod:chestNinja").setCreativeTab(ninjamod.tabNinja);
		ninjamoditems.ninjaLegs = new ninjaArmor(7907, ninjamodmaterials.NINJA, proxy.addArmor("ninjaLegs"), 2).setUnlocalizedName("ninjamod:legsNinja").setCreativeTab(ninjamod.tabNinja);
		ninjamoditems.ninjaHelm = new ninjaArmor(7905, ninjamodmaterials.NINJA, proxy.addArmor("ninjaHelm"), 0).setUnlocalizedName("ninjamod:helmNinja").setCreativeTab(ninjamod.tabNinja);
		ninjamoditems.ninjaBoots = new ninjaArmor(7908, ninjamodmaterials.NINJA, proxy.addArmor("ninjaBoots"), 3).setUnlocalizedName("ninjamod:bootsNinja").setCreativeTab(ninjamod.tabNinja);
		
		//Proxy
		proxy.registerRenderThings();
		proxy.registerServerTickHandler();

	}
}
