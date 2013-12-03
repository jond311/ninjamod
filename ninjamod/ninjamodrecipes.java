package mtndewey.ninjamod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import mtndewey.ninjamod.ninjamod;
import mtndewey.ninjamod.items.ninjamoditems;

public class ninjamodrecipes {

	public ninjamodrecipes(){
		
		//Declaring Itemstacks
		ItemStack katanastack = new ItemStack(ninjamoditems.katana);
		ItemStack legendarykatanastack = new ItemStack(ninjamoditems.legendaryKatana);
		ItemStack firekatanastack = new ItemStack(ninjamoditems.fireKatana);
		ItemStack waterkatanastack = new ItemStack(ninjamoditems.waterKatana);
		ItemStack ninjastarstack = new ItemStack(ninjamoditems.ninjaStar, 5);
		ItemStack chestawesomestack = new ItemStack(ninjamoditems.ninjaChestAwesome);
		ItemStack legsawesomestack = new ItemStack(ninjamoditems.ninjaLegsAwesome);
		ItemStack helmawesomestack = new ItemStack(ninjamoditems.ninjaHelmAwesome);
		ItemStack bootsawesomestack = new ItemStack(ninjamoditems.ninjaBootsAwesome);
		ItemStack ninjacheststack = new ItemStack(ninjamoditems.ninjaChest);
		ItemStack ninjalegsstack = new ItemStack(ninjamoditems.ninjaLegs);
		ItemStack ninjahelmstack = new ItemStack(ninjamoditems.ninjaHelm);
		ItemStack ninjabootsstack = new ItemStack(ninjamoditems.ninjaBoots);
		ItemStack darkleatherstack = new ItemStack(ninjamoditems.darkLeather);
		ItemStack steelplatingstack = new ItemStack(ninjamoditems.steelPlating);
		ItemStack leatherstack = new ItemStack(Item.leather);
		ItemStack incstack = new ItemStack(Item.dyePowder, 1, 0);
		ItemStack steelstack = new ItemStack(ninjamoditems.ingotSteel);
		ItemStack stickstack = new ItemStack(Item.stick);
		ItemStack goldstack = new ItemStack(Item.ingotGold);
		ItemStack flintsteelstack = new ItemStack(Item.flintAndSteel);
		ItemStack lavabucketstack = new ItemStack(Item.bucketLava);
		ItemStack lapizstack = new ItemStack(Item.dyePowder, 1, 4);
		ItemStack waterbucketstack = new ItemStack(Item.bucketWater);
		ItemStack featherstack = new ItemStack(Item.feather);
	
		//Shapeless Recipes
		GameRegistry.addShapelessRecipe(darkleatherstack, leatherstack, incstack);
		
		//Shaped Recipes
		GameRegistry.addRecipe(katanastack,"  S", " S ", "$  ", 'S', steelstack, '$', stickstack);
		GameRegistry.addRecipe(legendarykatanastack, " PK", " GP", "G  ", 'P', steelplatingstack, 'K', katanastack, 'G', goldstack);
		GameRegistry.addRecipe(firekatanastack, "BFB", "FLF", "BFB", 'L', legendarykatanastack, 'F', flintsteelstack, 'B', lavabucketstack);
		GameRegistry.addRecipe(firekatanastack, "FBF", "BLB", "FBF", 'L', legendarykatanastack, 'F', flintsteelstack, 'B', lavabucketstack);
		GameRegistry.addRecipe(waterkatanastack, "LBL", "BMB", "LBL", 'L', lapizstack, 'B', waterbucketstack, 'M', legendarykatanastack);
		GameRegistry.addRecipe(waterkatanastack, "BLB", "LML", "BLB", 'L', lapizstack, 'B', waterbucketstack, 'M', legendarykatanastack);
		GameRegistry.addRecipe(ninjastarstack, "N N", " I ", "N N", 'N', steelstack, 'I', incstack);
		GameRegistry.addRecipe(ninjacheststack, "I I", "III", "III", 'I', darkleatherstack);
		GameRegistry.addRecipe(ninjalegsstack, "III", "I I", "I I", 'I', darkleatherstack);
		GameRegistry.addRecipe(ninjabootsstack, "I I", "I I", 'I', darkleatherstack);
		GameRegistry.addRecipe(ninjahelmstack, "III", "I I", 'I', darkleatherstack);
		GameRegistry.addRecipe(chestawesomestack, "III", "PCP", "III", 'I', steelstack, 'C', ninjacheststack, 'P', steelplatingstack );
		GameRegistry.addRecipe(legsawesomestack, "III", "PLP", "III", 'I', steelstack, 'L', ninjalegsstack, 'P', Block.pistonBase);
		GameRegistry.addRecipe(bootsawesomestack, "FIF", "IBI", "FIF", 'I', steelstack, 'B', ninjabootsstack, 'F', featherstack);

		//Smelting Recipes
		GameRegistry.addSmelting(ninjamod.oreSteel.blockID, steelstack, 0.4F);
		GameRegistry.addSmelting(ninjamoditems.ingotSteel.itemID, steelplatingstack, 0.4F);
	
	}
}
