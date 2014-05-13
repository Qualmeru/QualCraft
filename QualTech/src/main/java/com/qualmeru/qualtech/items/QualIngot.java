package com.qualmeru.qualtech.items;

import com.qualmeru.qualtech.QualTech;
import com.qualmeru.qualtech.references.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Qualmeru on 2014-05-08.
 */
public class QualIngot  extends Item {

    private final String name = "QualIngot";
    public QualIngot(int id)
    {
        super();

        this.setCreativeTab(CreativeTabs.tabMaterials);
        this.setMaxStackSize(64);
        GameRegistry.registerItem(this, name);
        setTextureName(name);
        setUnlocalizedName(name);


    }

    @Override
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.MODID + ":" + name);
    }

}
