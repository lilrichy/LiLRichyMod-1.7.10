package com.blogspot.richardreigens.lilrichymod.blocks;

import com.blogspot.richardreigens.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

/**
 * Created by Rich on 11/23/2015.
 */
public abstract class BlockTileEntityLiLRichyMod extends BlockContainer
{
    public BlockTileEntityLiLRichyMod(Material material)
    {
        super(material);
    }

    public BlockTileEntityLiLRichyMod()
    {
        this(Material.rock);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
