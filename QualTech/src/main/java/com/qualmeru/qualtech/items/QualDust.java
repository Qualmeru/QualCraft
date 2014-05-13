package com.qualmeru.qualtech.items;

import com.qualmeru.qualtech.references.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Qualmeru on 2014-05-09.
 */
public class QualDust extends Item {
    private final String name = "QualDust";
    public QualDust(int id)
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
