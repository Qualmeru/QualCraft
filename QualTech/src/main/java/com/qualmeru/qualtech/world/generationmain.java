package com.qualmeru.qualtech.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Qualmeru on 2014-05-13.
 */
public class generationmain {
    public static void mainRegistry() {
        initWorldGen();
    }

    public static void initWorldGen() {
        registerWorldGen(new WorldGenqualtech(),1);
    }
    public static void registerWorldGen(IWorldGenerator worldGenerator,int weighedProbability)
    {
        GameRegistry.registerWorldGenerator(worldGenerator,weighedProbability);

    }
}
