package com.crownedone14.letsmod.block;

import net.minecraft.block.material.Material;

public class BlockFlag extends BlockLM
{
    public BlockFlag()
    {
        super(Material.cloth);
        this.setBlockName("flag");
        this.setBlockTextureName("flag");
        this.setLightLevel(1);
        this.setLightOpacity(15);
    }
}