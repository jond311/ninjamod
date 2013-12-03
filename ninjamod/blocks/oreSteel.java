package mtndewey.ninjamod.blocks;

import java.util.Random;

import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mtndewey.ninjamod.ninjamod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class oreSteel extends Block {


	public oreSteel(int par1, String texture) {
		super(par1, Material.rock);
		setCreativeTab(CreativeTabs.tabBlock);

	}


	public int idDropped(int par1, Random par2Random, int par3)
	{
		return ninjamod.oreSteel.blockID;
	}
	public int quantityDropped(Random random)
	{
		return 1;
	}

	@Override
	@SideOnly( Side.CLIENT )
	public void registerIcons( IconRegister iconRegister )
	{
		blockIcon = iconRegister.registerIcon( "ninjamod:oreSteel" );







	}
}