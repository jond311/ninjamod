package mtndewey.ninjamod.client;
import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenDojo extends WorldGenerator implements IWorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
			Block.grass.blockID,
			Block.stone.blockID,
			Block.cobblestone.blockID,
			Block.dirt.blockID,
			Block.sand.blockID,
			Block.gravel.blockID
		};
	}

	public boolean LocationIsValidSpawn(World world, int i, int j, int k){
		int distanceToAir = 0;
		int checkID = world.getBlockId(i, j, k);

		while (checkID != 0){
			distanceToAir++;
			checkID = world.getBlockId(i, j + distanceToAir, k);
		}

		if (distanceToAir > 3){
			return false;
		}
		j += distanceToAir - 1;

		int blockID = world.getBlockId(i, j, k);
		int blockIDAbove = world.getBlockId(i, j+1, k);
		int blockIDBelow = world.getBlockId(i, j-1, k);
		for (int x : GetValidSpawnBlocks()){
			if (blockIDAbove != 0){
				return false;
			}
			if (blockID == x){
				return true;
			}else if (blockID == Block.snow.blockID && blockIDBelow == x){
				return true;
			}
		}
		return false;
	}

	public WorldGenDojo() { }

	public boolean generate1(World world, Random rand, int i, int j, int k) {
		//check that each corner is one of the valid spawn blocks
		if(!LocationIsValidSpawn(world, i, j, k) || !LocationIsValidSpawn(world, i + 8, j, k) || !LocationIsValidSpawn(world, i + 8, j, k + 8) || !LocationIsValidSpawn(world, i, j, k + 8))
		{
			return false;
		}

		world.setBlock(i + 0, j + 0, k + 0, Block.stone.blockID);
		world.setBlock(i + 0, j + 0, k + 1, Block.stone.blockID);
		world.setBlock(i + 0, j + 1, k + 1, Block.netherFence.blockID);
		world.setBlock(i + 0, j + 1, k + 2, Block.netherFence.blockID);
		world.setBlock(i + 0, j + 1, k + 3, Block.netherFence.blockID);
		world.setBlock(i + 0, j + 1, k + 5, Block.netherFence.blockID);
		world.setBlock(i + 0, j + 1, k + 6, Block.netherFence.blockID);
		world.setBlock(i + 0, j + 1, k + 7, Block.netherFence.blockID);
		world.setBlock(i + 0, j + 2, k + 2, Block.netherFence.blockID);
		world.setBlock(i + 0, j + 2, k + 3, Block.netherFence.blockID);
		world.setBlock(i + 0, j + 2, k + 5, Block.netherFence.blockID);
		world.setBlock(i + 0, j + 2, k + 6, Block.netherFence.blockID);
		world.setBlock(i + 0, j + 3, k + 3, Block.netherFence.blockID);
		world.setBlock(i + 0, j + 3, k + 4, Block.netherFence.blockID);
		world.setBlock(i + 0, j + 3, k + 5, Block.netherFence.blockID);
		world.setBlockMetadataWithNotify(i + 0, j + 4, k + 0, Block.stairsStoneBrick.blockID, 3);
		world.setBlock(i + 0, j + 4, k + 1, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 0, j + 4, k + 2, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 0, j + 4, k + 3, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 0, j + 4, k + 4, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 0, j + 4, k + 5, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 0, j + 4, k + 6, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 0, j + 4, k + 7, Block.stairsStoneBrick.blockID);
		world.setBlockMetadataWithNotify(i + 0, j + 4, k + 8, Block.stairsStoneBrick.blockID, 2);
		world.setBlock(i + 1, j + 0, k + 0, Block.stone.blockID);
		world.setBlock(i + 1, j + 0, k + 1, Block.dirt.blockID);
		world.setBlock(i + 1, j + 0, k + 2, Block.dirt.blockID);
		world.setBlock(i + 1, j + 0, k + 3, Block.dirt.blockID);
		world.setBlock(i + 1, j + 0, k + 4, Block.stone.blockID);
		world.setBlock(i + 1, j + 0, k + 5, Block.dirt.blockID);
		world.setBlock(i + 1, j + 0, k + 6, Block.dirt.blockID);
		world.setBlock(i + 1, j + 0, k + 7, Block.dirt.blockID);
		world.setBlockMetadataWithNotify(i + 1, j + 1, k + 1, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 1, j + 1, k + 2, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 1, j + 1, k + 3, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 1, j + 1, k + 5, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 1, j + 1, k + 6, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 1, j + 1, k + 7, Block.wood.blockID, 1);
		world.setBlock(i + 1, j + 2, k + 1, Block.planks.blockID);
		world.setBlock(i + 1, j + 2, k + 2, Block.planks.blockID);
		world.setBlock(i + 1, j + 2, k + 3, Block.planks.blockID);
		world.setBlock(i + 1, j + 2, k + 5, Block.planks.blockID);
		world.setBlock(i + 1, j + 2, k + 6, Block.planks.blockID);
		world.setBlock(i + 1, j + 2, k + 7, Block.planks.blockID);
		world.setBlock(i + 1, j + 3, k + 1, Block.planks.blockID);
		world.setBlock(i + 1, j + 3, k + 2, Block.planks.blockID);
		world.setBlock(i + 1, j + 3, k + 3, Block.planks.blockID);
		world.setBlock(i + 1, j + 3, k + 4, Block.planks.blockID);
		world.setBlock(i + 1, j + 3, k + 5, Block.planks.blockID);
		world.setBlock(i + 1, j + 3, k + 6, Block.planks.blockID);
		world.setBlock(i + 1, j + 3, k + 7, Block.planks.blockID);
		world.setBlockMetadataWithNotify(i + 1, j + 4, k + 0, Block.stairsStoneBrick.blockID, 2);
		world.setBlockMetadataWithNotify(i + 1, j + 4, k + 1, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 1, j + 4, k + 2, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 1, j + 4, k + 3, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 1, j + 4, k + 4, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 1, j + 4, k + 5, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 1, j + 4, k + 6, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 1, j + 4, k + 7, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 1, j + 4, k + 8, Block.stairsStoneBrick.blockID, 3);
		world.setBlockMetadataWithNotify(i + 1, j + 5, k + 1, Block.stairsStoneBrick.blockID, 3);
		world.setBlock(i + 1, j + 5, k + 2, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 1, j + 5, k + 3, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 1, j + 5, k + 4, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 1, j + 5, k + 5, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 1, j + 5, k + 6, Block.stairsStoneBrick.blockID);
		world.setBlockMetadataWithNotify(i + 1, j + 5, k + 7, Block.stairsStoneBrick.blockID, 2);
		world.setBlock(i + 2, j + 0, k + 0, Block.stone.blockID);
		world.setBlock(i + 2, j + 0, k + 1, Block.dirt.blockID);
		world.setBlock(i + 2, j + 0, k + 2, Block.stone.blockID);
		world.setBlock(i + 2, j + 0, k + 3, Block.stone.blockID);
		world.setBlock(i + 2, j + 0, k + 4, Block.stone.blockID);
		world.setBlock(i + 2, j + 0, k + 5, Block.stone.blockID);
		world.setBlock(i + 2, j + 0, k + 6, Block.stone.blockID);
		world.setBlock(i + 2, j + 0, k + 7, Block.dirt.blockID);
		world.setBlockMetadataWithNotify(i + 2, j + 1, k + 1, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 2, j + 1, k + 7, Block.wood.blockID, 1);
		world.setBlock(i + 2, j + 2, k + 1, Block.planks.blockID);
		world.setBlock(i + 2, j + 2, k + 7, Block.planks.blockID);
		world.setBlock(i + 2, j + 3, k + 1, Block.planks.blockID);
		world.setBlock(i + 2, j + 3, k + 7, Block.planks.blockID);
		world.setBlockMetadataWithNotify(i + 2, j + 4, k + 0, Block.stairsStoneBrick.blockID, 2);
		world.setBlockMetadataWithNotify(i + 2, j + 4, k + 1, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 2, j + 4, k + 2, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 2, j + 4, k + 3, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 2, j + 4, k + 4, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 2, j + 4, k + 5, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 2, j + 4, k + 6, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 2, j + 4, k + 7, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 2, j + 4, k + 8, Block.stairsStoneBrick.blockID, 3);
		world.setBlockMetadataWithNotify(i + 2, j + 5, k + 1, Block.stairsStoneBrick.blockID, 2);
		world.setBlockMetadataWithNotify(i + 2, j + 5, k + 2, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 2, j + 5, k + 6, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 2, j + 5, k + 7, Block.stairsStoneBrick.blockID, 3);
		world.setBlockMetadataWithNotify(i + 2, j + 6, k + 2, Block.stairsStoneBrick.blockID, 3);
		world.setBlock(i + 2, j + 6, k + 3, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 2, j + 6, k + 4, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 2, j + 6, k + 5, Block.stairsStoneBrick.blockID);
		world.setBlockMetadataWithNotify(i + 2, j + 6, k + 6, Block.stairsStoneBrick.blockID, 2);
		world.setBlock(i + 3, j + 0, k + 0, Block.stone.blockID);
		world.setBlock(i + 3, j + 0, k + 1, Block.dirt.blockID);
		world.setBlock(i + 3, j + 0, k + 2, Block.stone.blockID);
		world.setBlock(i + 3, j + 0, k + 3, Block.stone.blockID);
		world.setBlock(i + 3, j + 0, k + 4, Block.stone.blockID);
		world.setBlock(i + 3, j + 0, k + 5, Block.stone.blockID);
		world.setBlock(i + 3, j + 0, k + 6, Block.stone.blockID);
		world.setBlock(i + 3, j + 0, k + 7, Block.dirt.blockID);
		world.setBlockMetadataWithNotify(i + 3, j + 1, k + 1, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 3, j + 1, k + 7, Block.wood.blockID, 1);
		world.setBlock(i + 3, j + 2, k + 1, Block.planks.blockID);
		world.setBlock(i + 3, j + 2, k + 7, Block.planks.blockID);
		world.setBlock(i + 3, j + 3, k + 1, Block.planks.blockID);
		world.setBlock(i + 3, j + 3, k + 7, Block.planks.blockID);
		world.setBlockMetadataWithNotify(i + 3, j + 4, k + 0, Block.stairsStoneBrick.blockID, 2);
		world.setBlockMetadataWithNotify(i + 3, j + 4, k + 1, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 3, j + 4, k + 2, Block.wood.blockID, 1);
		world.setBlock(i + 3, j + 4, k + 3, Block.fence.blockID);
		world.setBlock(i + 3, j + 4, k + 4, Block.fence.blockID);
		world.setBlock(i + 3, j + 4, k + 5, Block.fence.blockID);
		world.setBlockMetadataWithNotify(i + 3, j + 4, k + 6, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 3, j + 4, k + 7, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 3, j + 4, k + 8, Block.stairsStoneBrick.blockID, 3);
		world.setBlockMetadataWithNotify(i + 3, j + 5, k + 1, Block.stairsStoneBrick.blockID, 2);
		world.setBlockMetadataWithNotify(i + 3, j + 5, k + 7, Block.stairsStoneBrick.blockID, 3);
		world.setBlockMetadataWithNotify(i + 3, j + 6, k + 2, Block.stairsStoneBrick.blockID, 2);
		world.setBlockMetadataWithNotify(i + 3, j + 6, k + 6, Block.stairsStoneBrick.blockID, 3);
		world.setBlock(i + 4, j + 0, k + 0, Block.stone.blockID);
		world.setBlock(i + 4, j + 0, k + 1, Block.dirt.blockID);
		world.setBlock(i + 4, j + 0, k + 2, Block.stone.blockID);
		world.setBlock(i + 4, j + 0, k + 3, Block.stone.blockID);
		world.setBlock(i + 4, j + 0, k + 4, Block.stone.blockID);
		world.setBlock(i + 4, j + 0, k + 5, Block.stone.blockID);
		world.setBlock(i + 4, j + 0, k + 6, Block.stone.blockID);
		world.setBlock(i + 4, j + 0, k + 7, Block.dirt.blockID);
		world.setBlockMetadataWithNotify(i + 4, j + 1, k + 1, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 4, j + 1, k + 7, Block.wood.blockID, 1);
		world.setBlock(i + 4, j + 2, k + 1, Block.planks.blockID);
		world.setBlock(i + 4, j + 2, k + 7, Block.planks.blockID);
		world.setBlock(i + 4, j + 3, k + 1, Block.planks.blockID);
		world.setBlock(i + 4, j + 3, k + 7, Block.planks.blockID);
		world.setBlockMetadataWithNotify(i + 4, j + 4, k + 0, Block.stairsStoneBrick.blockID, 2);
		world.setBlockMetadataWithNotify(i + 4, j + 4, k + 1, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 4, j + 4, k + 2, Block.wood.blockID, 1);
		world.setBlock(i + 4, j + 4, k + 3, Block.fence.blockID);
		world.setBlock(i + 4, j + 4, k + 4, Block.fence.blockID);
		world.setBlock(i + 4, j + 4, k + 5, Block.fence.blockID);
		world.setBlockMetadataWithNotify(i + 4, j + 4, k + 6, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 4, j + 4, k + 7, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 4, j + 4, k + 8, Block.stairsStoneBrick.blockID, 3);
		world.setBlockMetadataWithNotify(i + 4, j + 5, k + 1, Block.stairsStoneBrick.blockID, 2);
		world.setBlockMetadataWithNotify(i + 4, j + 5, k + 7, Block.stairsStoneBrick.blockID, 3);
		world.setBlockMetadataWithNotify(i + 4, j + 6, k + 2, Block.stairsStoneBrick.blockID, 2);
		world.setBlockMetadataWithNotify(i + 4, j + 6, k + 6, Block.stairsStoneBrick.blockID, 3);
		world.setBlock(i + 5, j + 0, k + 0, Block.stone.blockID);
		world.setBlock(i + 5, j + 0, k + 1, Block.dirt.blockID);
		world.setBlock(i + 5, j + 0, k + 2, Block.stone.blockID);
		world.setBlock(i + 5, j + 0, k + 3, Block.stone.blockID);
		world.setBlock(i + 5, j + 0, k + 4, Block.stone.blockID);
		world.setBlock(i + 5, j + 0, k + 5, Block.stone.blockID);
		world.setBlock(i + 5, j + 0, k + 6, Block.stone.blockID);
		world.setBlock(i + 5, j + 0, k + 7, Block.dirt.blockID);
		world.setBlockMetadataWithNotify(i + 5, j + 1, k + 1, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 5, j + 1, k + 7, Block.wood.blockID, 1);
		world.setBlock(i + 5, j + 2, k + 1, Block.planks.blockID);
		world.setBlock(i + 5, j + 2, k + 7, Block.planks.blockID);
		world.setBlock(i + 5, j + 3, k + 1, Block.planks.blockID);
		world.setBlock(i + 5, j + 3, k + 7, Block.planks.blockID);
		world.setBlockMetadataWithNotify(i + 5, j + 4, k + 0, Block.stairsStoneBrick.blockID, 2);
		world.setBlockMetadataWithNotify(i + 5, j + 4, k + 1, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 5, j + 4, k + 2, Block.wood.blockID, 1);
		world.setBlock(i + 5, j + 4, k + 3, Block.fence.blockID);
		world.setBlock(i + 5, j + 4, k + 4, Block.fence.blockID);
		world.setBlock(i + 5, j + 4, k + 5, Block.fence.blockID);
		world.setBlockMetadataWithNotify(i + 5, j + 4, k + 6, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 5, j + 4, k + 7, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 5, j + 4, k + 8, Block.stairsStoneBrick.blockID, 3);
		world.setBlockMetadataWithNotify(i + 5, j + 5, k + 1, Block.stairsStoneBrick.blockID, 2);
		world.setBlockMetadataWithNotify(i + 5, j + 5, k + 7, Block.stairsStoneBrick.blockID, 3);
		world.setBlockMetadataWithNotify(i + 5, j + 6, k + 2, Block.stairsStoneBrick.blockID, 2);
		world.setBlockMetadataWithNotify(i + 5, j + 6, k + 6, Block.stairsStoneBrick.blockID, 3);
		world.setBlock(i + 6, j + 0, k + 0, Block.stone.blockID);
		world.setBlock(i + 6, j + 0, k + 1, Block.dirt.blockID);
		world.setBlock(i + 6, j + 0, k + 2, Block.stone.blockID);
		world.setBlock(i + 6, j + 0, k + 3, Block.stone.blockID);
		world.setBlock(i + 6, j + 0, k + 4, Block.stone.blockID);
		world.setBlock(i + 6, j + 0, k + 5, Block.stone.blockID);
		world.setBlock(i + 6, j + 0, k + 6, Block.stone.blockID);
		world.setBlock(i + 6, j + 0, k + 7, Block.dirt.blockID);
		world.setBlockMetadataWithNotify(i + 6, j + 1, k + 1, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 6, j + 1, k + 7, Block.wood.blockID, 1);
		world.setBlock(i + 6, j + 2, k + 1, Block.planks.blockID);
		world.setBlock(i + 6, j + 2, k + 7, Block.planks.blockID);
		world.setBlock(i + 6, j + 3, k + 1, Block.planks.blockID);
		world.setBlock(i + 6, j + 3, k + 7, Block.planks.blockID);
		world.setBlockMetadataWithNotify(i + 6, j + 4, k + 0, Block.stairsStoneBrick.blockID, 2);
		world.setBlockMetadataWithNotify(i + 6, j + 4, k + 1, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 6, j + 4, k + 2, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 6, j + 4, k + 3, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 6, j + 4, k + 4, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 6, j + 4, k + 5, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 6, j + 4, k + 6, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 6, j + 4, k + 7, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 6, j + 4, k + 8, Block.stairsStoneBrick.blockID, 3);
		world.setBlockMetadataWithNotify(i + 6, j + 5, k + 1, Block.stairsStoneBrick.blockID, 2);
		world.setBlockMetadataWithNotify(i + 6, j + 5, k + 2, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 6, j + 5, k + 6, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 6, j + 5, k + 7, Block.stairsStoneBrick.blockID, 3);
		world.setBlockMetadataWithNotify(i + 6, j + 6, k + 2, Block.stairsStoneBrick.blockID, 3);
		world.setBlockMetadataWithNotify(i + 6, j + 6, k + 3, Block.stairsStoneBrick.blockID, 1);
		world.setBlockMetadataWithNotify(i + 6, j + 6, k + 4, Block.stairsStoneBrick.blockID, 1);
		world.setBlockMetadataWithNotify(i + 6, j + 6, k + 5, Block.stairsStoneBrick.blockID, 1);
		world.setBlockMetadataWithNotify(i + 6, j + 6, k + 6, Block.stairsStoneBrick.blockID, 2);
		world.setBlock(i + 7, j + 0, k + 0, Block.stone.blockID);
		world.setBlock(i + 7, j + 0, k + 1, Block.dirt.blockID);
		world.setBlock(i + 7, j + 0, k + 2, Block.dirt.blockID);
		world.setBlock(i + 7, j + 0, k + 3, Block.dirt.blockID);
		world.setBlock(i + 7, j + 0, k + 4, Block.dirt.blockID);
		world.setBlock(i + 7, j + 0, k + 5, Block.dirt.blockID);
		world.setBlock(i + 7, j + 0, k + 6, Block.dirt.blockID);
		world.setBlock(i + 7, j + 0, k + 7, Block.dirt.blockID);
		world.setBlockMetadataWithNotify(i + 7, j + 1, k + 1, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 7, j + 1, k + 2, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 7, j + 1, k + 3, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 7, j + 1, k + 4, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 7, j + 1, k + 5, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 7, j + 1, k + 6, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 7, j + 1, k + 7, Block.wood.blockID, 1);
		world.setBlock(i + 7, j + 2, k + 1, Block.planks.blockID);
		world.setBlock(i + 7, j + 2, k + 2, Block.planks.blockID);
		world.setBlock(i + 7, j + 2, k + 3, Block.planks.blockID);
		world.setBlock(i + 7, j + 2, k + 4, Block.planks.blockID);
		world.setBlock(i + 7, j + 2, k + 5, Block.planks.blockID);
		world.setBlock(i + 7, j + 2, k + 6, Block.planks.blockID);
		world.setBlock(i + 7, j + 2, k + 7, Block.planks.blockID);
		world.setBlock(i + 7, j + 3, k + 1, Block.planks.blockID);
		world.setBlock(i + 7, j + 3, k + 2, Block.planks.blockID);
		world.setBlock(i + 7, j + 3, k + 3, Block.planks.blockID);
		world.setBlock(i + 7, j + 3, k + 4, Block.planks.blockID);
		world.setBlock(i + 7, j + 3, k + 5, Block.planks.blockID);
		world.setBlock(i + 7, j + 3, k + 6, Block.planks.blockID);
		world.setBlock(i + 7, j + 3, k + 7, Block.planks.blockID);
		world.setBlockMetadataWithNotify(i + 7, j + 4, k + 0, Block.stairsStoneBrick.blockID, 2);
		world.setBlockMetadataWithNotify(i + 7, j + 4, k + 1, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 7, j + 4, k + 2, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 7, j + 4, k + 3, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 7, j + 4, k + 4, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 7, j + 4, k + 5, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 7, j + 4, k + 6, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 7, j + 4, k + 7, Block.wood.blockID, 1);
		world.setBlockMetadataWithNotify(i + 7, j + 4, k + 8, Block.stairsStoneBrick.blockID, 3);
		world.setBlockMetadataWithNotify(i + 7, j + 5, k + 1, Block.stairsStoneBrick.blockID, 3);
		world.setBlockMetadataWithNotify(i + 7, j + 5, k + 2, Block.stairsStoneBrick.blockID, 1);
		world.setBlockMetadataWithNotify(i + 7, j + 5, k + 3, Block.stairsStoneBrick.blockID, 1);
		world.setBlockMetadataWithNotify(i + 7, j + 5, k + 4, Block.stairsStoneBrick.blockID, 1);
		world.setBlockMetadataWithNotify(i + 7, j + 5, k + 5, Block.stairsStoneBrick.blockID, 1);
		world.setBlockMetadataWithNotify(i + 7, j + 5, k + 6, Block.stairsStoneBrick.blockID, 1);
		world.setBlockMetadataWithNotify(i + 7, j + 5, k + 7, Block.stairsStoneBrick.blockID, 2);
		world.setBlock(i + 8, j + 0, k + 0, Block.stone.blockID);
		world.setBlock(i + 8, j + 0, k + 1, Block.stone.blockID);
		world.setBlockMetadataWithNotify(i + 8, j + 4, k + 0, Block.stairsStoneBrick.blockID, 3);
		world.setBlockMetadataWithNotify(i + 8, j + 4, k + 1, Block.stairsStoneBrick.blockID, 1);
		world.setBlockMetadataWithNotify(i + 8, j + 4, k + 2, Block.stairsStoneBrick.blockID, 1);
		world.setBlockMetadataWithNotify(i + 8, j + 4, k + 3, Block.stairsStoneBrick.blockID, 1);
		world.setBlockMetadataWithNotify(i + 8, j + 4, k + 4, Block.stairsStoneBrick.blockID, 1);
		world.setBlockMetadataWithNotify(i + 8, j + 4, k + 5, Block.stairsStoneBrick.blockID, 1);
		world.setBlockMetadataWithNotify(i + 8, j + 4, k + 6, Block.stairsStoneBrick.blockID, 1);
		world.setBlockMetadataWithNotify(i + 8, j + 4, k + 7, Block.stairsStoneBrick.blockID, 1);
		world.setBlockMetadataWithNotify(i + 8, j + 4, k + 8, Block.stairsStoneBrick.blockID, 2);

		return true;
	}

	@Override
	public boolean generate(World world, Random random, int i, int j, int k) {
		return false;
	}

	public void generateSurface(World world, Random rand, int i, int j) 
	   {
	      for(int k = 0; k < 50; k++) 
	      {
	         int RandPosX = i + rand.nextInt(16); 
	         int RandPosY = rand.nextInt(200);    
	         int RandPosZ = j + rand.nextInt(16); 
	         (new WorldGenDojo()).generate(world, rand, RandPosX, RandPosY, RandPosZ);
	      }
	   }

	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
	}
		
	}
