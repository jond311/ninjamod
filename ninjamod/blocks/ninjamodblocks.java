package mtndewey.ninjamod.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ninjamodblocks {

	public static Block oreSteel;
	
	public ninjamodblocks(){
		
		//Blocks
		oreSteel = new oreSteel(1500, "Steel Ore").setUnlocalizedName("ninjamod:oreSteel").setHardness(4.0F).setStepSound(Block.soundStoneFootstep).setResistance(3.0F);
		
		//Registry
		GameRegistry.registerBlock(oreSteel, "Ninja Ore");
		
	}
}
