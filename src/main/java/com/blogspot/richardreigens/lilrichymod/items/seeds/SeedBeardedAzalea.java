package com.blogspot.richardreigens.lilrichymod.items.seeds;

import com.blogspot.richardreigens.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.init.ModBlocks;
import com.blogspot.richardreigens.lilrichymod.items.ItemLiLRichySeedFood;
import net.minecraft.init.Blocks;

/**
 * Created by Rich on 12/2/2015.
 */
public class SeedBeardedAzalea extends ItemLiLRichySeedFood {
    public SeedBeardedAzalea(String name) {
        super(1, 0.3F, ModBlocks.beardedAzalea, Blocks.farmland);
        setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
    }
}