package com.blogspot.richardreigens.lilrichymod.blocks.type.stone;

import com.blogspot.richardreigens.lilrichymod.blocks.BlockLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.reference.Names;

/**
 * Created by Rich on 11/20/2015.
 */
public class BlockCrackedStone extends BlockLiLRichyMod
{
    public BlockCrackedStone()
    {
        super();
        this.setBlockName(Names.Blocks.CRACKED_STONE);
        this.setHardness(2f);
        this.setStepSound(soundTypePiston);
    }
}
