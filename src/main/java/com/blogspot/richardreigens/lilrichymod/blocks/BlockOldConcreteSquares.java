package com.blogspot.richardreigens.lilrichymod.blocks;

import com.blogspot.richardreigens.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Rich on 11/19/2015.
 */
public class BlockOldConcreteSquares extends BlockLiLRichyMod
{
    public BlockOldConcreteSquares()
    {
        super();
        this.setBlockName("oldConcreteSquares");
        this.setHardness(2f);
        this.setStepSound(soundTypePiston);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
    }
}
