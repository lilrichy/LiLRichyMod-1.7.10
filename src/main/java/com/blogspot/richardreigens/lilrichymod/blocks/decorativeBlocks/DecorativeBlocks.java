package com.blogspot.richardreigens.lilrichymod.blocks.decorativeBlocks;

import com.blogspot.richardreigens.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by Rich on 12/2/2015.
 */
public class DecorativeBlocks extends Block {
    private final String blockToolTip;
    private final String blockCraftTip;

    //Constructor with Tool tip and Crafting tip string
    public DecorativeBlocks(String name, Material material, String toolTip, String craftTip) {
        super(material);
        this.setHardness(2f);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setBlockName(name);
        this.blockToolTip = toolTip;
        this.blockCraftTip = craftTip;
    }

    //Constructor with Tool tip
    public DecorativeBlocks(String name, Material material, String toolTip) {
        super(material);
        this.setHardness(2f);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setBlockName(name);
        this.blockToolTip = toolTip;
        this.blockCraftTip = null;
    }

    //Constructor with no tool tips
    public DecorativeBlocks(String name, Material material) {
        super(material);
        this.setHardness(2f);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setBlockName(name);
        this.blockToolTip = null;
        this.blockCraftTip = null;
    }

    public static String getToolTip(Block block) {
        if (block instanceof DecorativeBlocks) {
            DecorativeBlocks n = (DecorativeBlocks) block;
            return n.blockToolTip;
        } else return null;
    }

    public static Object getCraftTip(Block block) {
        if (block instanceof DecorativeBlocks) {
            DecorativeBlocks n = (DecorativeBlocks) block;
            return n.blockCraftTip;
        } else return null;
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", "decorativeBlocks/" + getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }


}
