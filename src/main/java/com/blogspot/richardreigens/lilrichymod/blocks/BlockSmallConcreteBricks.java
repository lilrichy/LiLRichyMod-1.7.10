package com.blogspot.richardreigens.lilrichymod.blocks;

import com.blogspot.richardreigens.lilrichymod.creativeTab.CreativeTabLiLRichyMod;

/**
 * Created by Rich on 11/19/2015.
 */
public class BlockSmallConcreteBricks extends BlockLiLRichyMod
{
    public BlockSmallConcreteBricks()
    {
        super();
        this.setBlockName("smallConcreteBricks");
        this.setHardness(2f);
        this.setStepSound(soundTypePiston);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
    }
}
