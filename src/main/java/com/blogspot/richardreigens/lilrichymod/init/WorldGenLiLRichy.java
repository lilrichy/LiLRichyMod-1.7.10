package com.blogspot.richardreigens.lilrichymod.init;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.util.Random;

/**
 * Created by Rich on 12/2/2015.
 */
public class WorldGenLiLRichy implements IWorldGenerator
{

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        int x = chunkX * 16;
        int z = chunkZ * 16;
        switch (world.provider.dimensionId) {
            case 0:
                generateSurface(world, x, z, random);
                break;
            case -1:
                generateNether(world, x, z, random);
                break;
            case 1:
                generateEnd(world, x, z, random);
                break;
            default:
                generateSurface(world, x, z, random);
        }
    }

    private void generateEnd(World world, int x, int z, Random random)
    {

    }

    private void generateNether(World world, int x, int z, Random random)
    {

    }

    private void generateSurface(World world, int x, int z, Random random)
    {
        if (random.nextInt(3) == 1) {
            int randX = x + random.nextInt(16);
            int randZ = z + random.nextInt(16);
            int randY = world.getActualHeight();

            if (world.isAirBlock(randX, randY, randZ) && ModBlocks.bearedAzailia.canBlockStay(world, randX, randY, randZ))
                world.setBlock(randX, randY, randZ, ModBlocks.bearedAzailia);
        }
    }
}