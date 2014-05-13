package com.qualmeru.qualtech.world;

import com.qualmeru.qualtech.RegestryBlocksItems.BlocksItems;
import com.qualmeru.qualtech.blocks.QualOre;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

/**
 * Created by Qualmeru on 2014-05-13.
 */
public class WorldGenqualtech implements IWorldGenerator{

    @Override
    public void generate(Random random, int chinkX, int chunkZ, World world, IChunkProvider iChunkProvider, IChunkProvider iChunkProvider2) {
        switch (world.provider.dimensionId){
            case -1:
                generateNether(world,random,chinkX * 16,chunkZ * 16);
            case 0:
                generateSerfice(world,random,chinkX * 16,chunkZ * 16);
        }

    }

    private void generateSerfice(World world, Random random, int chinkX, int chunkZ) {
        for (int i = 0; i < 1; i++)
        {
          int randPosX = chinkX + random.nextInt(16);
          int randPosY = random.nextInt(64);
          int randPosZ = chunkZ + random.nextInt(16);

            (new WorldGenMinable(BlocksItems.qualOre,10)).generate(world,random,randPosX,randPosY,randPosZ);
        }

    }

    private void generateNether(World world, Random random, int chinkX, int chunkZ) {

    }
}
