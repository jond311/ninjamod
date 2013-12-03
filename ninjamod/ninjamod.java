package mtndewey.ninjamod;

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
import net.minecraftforge.common.Configuration;
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
import mtndewey.ninjamod.*;

//Forge Declaration
@Mod(modid="ninjamod",name="Ninja Mod",version="v3.0")
@NetworkMod(clientSideRequired=true,serverSideRequired=true)


public class ninjamod {

	//Proxies and Forge Stuff
	@SidedProxy(clientSide = "mtndewey.ninjamod.proxies.ClientProxy", serverSide = "mtndewey.ninjamod.proxies.ServerProxy")
	public static ServerProxy proxy;
	public static final String modid = "ninjamod";
	public static ninjamod instance;
	
	//Creative Tabs
	public static CreativeTabs tabNinja = new tabNinja(CreativeTabs.getNextID(), "Ninja Mod");

	//Item and Block Declaration
	public static Block oreSteel;
	
	//Config
	public static Configuration config;

	@PreInit
	public void PreInit(FMLPreInitializationEvent event){	
		
		new ninjamodconfig();
		new ninjamodrecipes();
		new ninjamoditems();
		new ninjamodnames();
		
        config = new Configuration(event.getSuggestedConfigurationFile());
        
        //World Generator
		GameRegistry.registerWorldGenerator(new WorldGeneratorNinjaMod());
		GameRegistry.registerWorldGenerator(new WorldGenDojo());

		//Ninja Star
		EntityRegistry.registerGlobalEntityID(EntityNinjaStar.class, "ninjaStar", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerModEntity(EntityNinjaStar.class, "ninjaStar", 200, this, 64, 1, true);
		LanguageRegistry.instance().addStringLocalization("entity.ninjamod.ninjaStar.name", "ninjaStar");
		
		}

	@Init
	public void load(FMLInitializationEvent event){

		//Proxy
		proxy.registerRenderThings();
		proxy.registerServerTickHandler();
	
	}


}
