package com.qualmeru.qualtech.RegestryBlocksItems;

import com.qualmeru.qualtech.blocks.QualOre;
import com.qualmeru.qualtech.items.QualDust;
import com.qualmeru.qualtech.items.QualIngot;
import com.qualmeru.qualtech.items.QualPickaxe;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Qualmeru on 2014-05-13.
 */
public final class BlocksItems {
    public static Block qualOre;
    private static Item qualIngot;
    private static Item qualDust;
    private static Item qualPick;
    public static void init()
    {

        qualOre  = new QualOre();
        qualIngot = new QualIngot(510);
        qualDust = new QualDust(511);
        qualPick = new QualPickaxe();
        GameRegistry.addSmelting(new ItemStack(qualOre), new ItemStack(qualIngot, 1), 3.0F);
        GameRegistry.addSmelting(new ItemStack(qualDust),new ItemStack(qualIngot,2),3.0F);
        GameRegistry.addShapelessRecipe( new ItemStack(qualDust,2), new Object[]
                {
                        qualIngot, Blocks.iron_block

                });
        GameRegistry.addRecipe(new ItemStack(qualPick), new Object[]
                {
                        "XXX",
                        " Y ",
                        " Y ",
                         'X',	qualIngot, 'Y', Items.stick

                });
    }

}
