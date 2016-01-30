package com.blogspot.richardreigens.lilrichymod.blocks;

import com.blogspot.richardreigens.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

/**
 * Created by LiLRichy on 1/29/2016.
 */
public class LiLRichyStairs extends BlockStairs {
    public LiLRichyStairs(String name, Block block, int meta) {
        super(block, meta);
        this.setHardness(2f);
        this.setStepSound(soundTypeStone);
        this.setLightOpacity(255);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setBlockName(name);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", "decorativeBlocks/" + getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
