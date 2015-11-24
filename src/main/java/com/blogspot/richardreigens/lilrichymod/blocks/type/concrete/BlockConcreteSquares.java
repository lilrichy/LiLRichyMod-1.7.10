package com.blogspot.richardreigens.lilrichymod.blocks.type.concrete;

import com.blogspot.richardreigens.lilrichymod.blocks.BlockLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.reference.Names;

/**
 * Created by Rich on 11/19/2015.
 */
public class BlockConcreteSquares extends BlockLiLRichyMod
{
    public BlockConcreteSquares()
    {
        super();
        this.setBlockName(Names.Blocks.CONCRETE_SQUARES);
        this.setHardness(2f);
        this.setStepSound(soundTypePiston);

    }
}
