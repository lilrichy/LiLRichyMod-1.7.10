package com.blogspot.richardreigens.lilrichymod.blocks.type.stone;

import com.blogspot.richardreigens.lilrichymod.blocks.BlockLiLRichyMod;

/**
 * Created by Rich on 11/20/2015.
 */
public class BlockCrackedStone extends BlockLiLRichyMod
{
    public BlockCrackedStone()
    {
        super();
        this.setBlockName("crackedStone");
        this.setHardness(2f);
        this.setStepSound(soundTypePiston);
    }
}
