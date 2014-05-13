package com.qualmeru.qualtech;


import com.qualmeru.qualtech.RegestryBlocksItems.BlocksItems;
import com.qualmeru.qualtech.core.proxy.CommonProxy;

import com.qualmeru.qualtech.references.Reference;
import com.qualmeru.qualtech.world.generationmain;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(
        modid = Reference.MODID ,
        name= Reference.MODNAME,
        version = Reference.VERSION)
public class QualTech
{
    @SidedProxy(
            clientSide = Reference.CLIENT_PROXY_LOCATION,
            serverSide = Reference.COMMON_PROXY_LOCATION
    )
    public static CommonProxy proxy;


    @Metadata
    public static ModMetadata meta;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

       BlocksItems.init();
       generationmain.mainRegistry();


    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {


    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }


}
