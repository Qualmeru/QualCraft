package com.qualmeru.qualtech.blocks;


import com.qualmeru.qualtech.references.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Qualmeru on 2014-05-06.
 */
public final class QualOre extends Block {

    private final String name = "QualOre";

    public  QualOre() {
        super(Material.rock);
        setBlockName(name);
        GameRegistry.registerBlock(this, name);
        setHardness(5f);
        setResistance(70f);
        setStepSound(soundTypePiston);
        setLightLevel(1f);
        setHarvestLevel("pickaxe",2);

        setCreativeTab(CreativeTabs.tabBlock);

    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
      blockIcon = iconRegister.registerIcon(Reference.MODID + ":" + name);
    }



}
