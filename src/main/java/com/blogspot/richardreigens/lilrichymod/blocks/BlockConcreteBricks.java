package com.blogspot.richardreigens.lilrichymod.blocks;

import com.blogspot.richardreigens.lilrichymod.creativeTab.CreativeTabLiLRichyMod;

/**
 * Created by Rich on 11/19/2015.
 */
public class BlockConcreteBricks extends BlockLiLRichyMod
{
    public BlockConcreteBricks()
    {
        super();
        this.setBlockName("concreteBricks");
        this.setHardness(2f);
        this.setStepSound(soundTypePiston);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
    }
}
