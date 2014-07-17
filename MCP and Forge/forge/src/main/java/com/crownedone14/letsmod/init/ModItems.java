package com.crownedone14.letsmod.init;

import com.crownedone14.letsmod.item.ItemLM;
import com.crownedone14.letsmod.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemLM mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf,"maple_Leaf" );
    }
}
