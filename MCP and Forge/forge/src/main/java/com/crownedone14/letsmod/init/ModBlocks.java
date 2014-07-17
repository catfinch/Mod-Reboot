package com.crownedone14.letsmod.init;


import com.crownedone14.letsmod.block.BlockFlag;
import com.crownedone14.letsmod.block.BlockLM;
import com.crownedone14.letsmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLM flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}