package mtndewey.ninjamod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mtndewey.ninjamod.ninjamod;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class katanaWater extends ItemSword {

	public katanaWater(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super (par1, par2EnumToolMaterial);
		setCreativeTab(ninjamod.tabNinja);
	}

	@Override
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
	{
		par1ItemStack.damageItem(1, par3EntityLivingBase);
		par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 120, 5));
		return true;
	}


	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	{
		if (par7 == 0)
		{
			--par5;
		}

		if (par7 == 1)
		{
			++par5;
		}

		if (par7 == 2)
		{
			--par6;
		}

		if (par7 == 3)
		{
			++par6;
		}

		if (par7 == 4)
		{
			--par4;
		}

		if (par7 == 5)
		{
			++par4;
		}

		if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
		{
			return false;
		}
		else
		{
			if (par3World.isAirBlock(par4, par5, par6))
			{
				par3World.setBlock(par4, par5, par6, Block.waterMoving.blockID);
			}

			par1ItemStack.damageItem(1, par2EntityPlayer);
			return true;
		}	

	}




	@Override
	@SideOnly( Side.CLIENT )
	public void registerIcons( IconRegister iconRegister )
	{
		itemIcon = iconRegister.registerIcon( "ninjamod:katanaWater" );
	}   

}
