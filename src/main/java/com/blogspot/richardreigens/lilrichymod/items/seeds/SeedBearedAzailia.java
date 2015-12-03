package com.blogspot.richardreigens.lilrichymod.items.seeds;

import com.blogspot.richardreigens.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.init.ModBlocks;
import com.blogspot.richardreigens.lilrichymod.items.ItemLiLRichySeedFood;
import net.minecraft.init.Blocks;

/**
 * Created by Rich on 12/2/2015.
 */
public class SeedBearedAzailia extends ItemLiLRichySeedFood
{

    public SeedBearedAzailia(String name)
    {
        super(1, 0.3F, ModBlocks.bearedAzailia, Blocks.farmland);
        setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
    }


}