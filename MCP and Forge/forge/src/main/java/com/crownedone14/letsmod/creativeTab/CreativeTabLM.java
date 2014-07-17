package com.crownedone14.letsmod.creativeTab;


import com.crownedone14.letsmod.init.ModItems;
import com.crownedone14.letsmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLM
{
    public static final CreativeTabs LM_TAB= new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeaf;
        }
    };
}
