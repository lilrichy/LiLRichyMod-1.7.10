package com.blogspot.richardreigens.lilrichymod.blocks.type.concrete;

import com.blogspot.richardreigens.lilrichymod.blocks.BlockLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.init.ModItems;
import com.blogspot.richardreigens.lilrichymod.reference.Names;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Rich on 11/19/2015.
 */
public class BlockConcrete extends BlockLiLRichyMod
{
    public BlockConcrete()
    {
        super();
        this.setBlockName(Names.Blocks.CONCRETE);
        this.setHardness(2f);
        this.setStepSound(soundTypePiston);
    }

    //Overrides to drop different item then block
    @Override
    public int quantityDropped(Random p_149745_1_)
    {
        return 4;
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune)
    {
        return ModItems.crushedConcrete;
    }
}