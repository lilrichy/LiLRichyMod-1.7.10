package com.blogspot.richardreigens.lilrichymod.blocks.type.concrete;

import com.blogspot.richardreigens.lilrichymod.blocks.BlockLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.reference.Names;

/**
 * Created by Rich on 11/20/2015.
 */
public class BlockArrangedConcreteBricks extends BlockLiLRichyMod
{

        public BlockArrangedConcreteBricks()
        {
            super();
            this.setBlockName(Names.Blocks.ARRANGED_CONCRETE_BRICKS);
            this.setHardness(2f);
            this.setStepSound(soundTypePiston);
        }
}
