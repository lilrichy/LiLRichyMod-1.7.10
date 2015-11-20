package com.blogspot.richardreigens.lilrichymod.blocks;

import com.blogspot.richardreigens.lilrichymod.creativeTab.CreativeTabLiLRichyMod;

/**
 * Created by Rich on 11/19/2015.
 */
public class BlockConcreteBricksDark extends BlockLiLRichyMod
{
    public BlockConcreteBricksDark()
    {
        super();
        this.setBlockName("concreteBricksDark");
        this.setHardness(2f);
        this.setStepSound(soundTypePiston);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
    }
}
