package com.blogspot.richardreigens.lilrichymod.blocks.type.concrete;

import com.blogspot.richardreigens.lilrichymod.blocks.BlockLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.reference.Names;

/**
 * Created by Rich on 11/19/2015.
 */
public class BlockSmallConcreteBricks extends BlockLiLRichyMod
{
    public BlockSmallConcreteBricks()
    {
        super();
        this.setBlockName(Names.Blocks.SMALL_CONCRETE_BRICKS);
        this.setHardness(2f);
        this.setStepSound(soundTypePiston);

    }
}
