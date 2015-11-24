package com.blogspot.richardreigens.lilrichymod.blocks.type.concrete;

import com.blogspot.richardreigens.lilrichymod.blocks.BlockLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.reference.Names;

/**
 * Created by Rich on 11/19/2015.
 */
public class BlockOldConcreteSquares extends BlockLiLRichyMod
{
    public BlockOldConcreteSquares()
    {
        super();
        this.setBlockName(Names.Blocks.OLD_CONCRETE_SQUARES);
        this.setHardness(2f);
        this.setStepSound(soundTypePiston);
    }
}
