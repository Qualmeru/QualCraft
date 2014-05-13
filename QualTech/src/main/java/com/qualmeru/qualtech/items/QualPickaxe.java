package com.qualmeru.qualtech.items;

import com.qualmeru.qualtech.references.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by Qualmeru on 2014-05-13.
 */
public class QualPickaxe extends ItemPickaxe{

    private final String name = "QualPick";
    public QualPickaxe(){
    super(ToolMaterial.IRON);
     GameRegistry.registerItem(this, name);
     setTextureName(name);
     setUnlocalizedName(name);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register){
        this.itemIcon = register.registerIcon(Reference.MODID + ":" + name);
    }

}
