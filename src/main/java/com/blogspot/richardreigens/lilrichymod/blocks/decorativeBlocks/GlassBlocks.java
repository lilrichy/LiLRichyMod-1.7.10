package com.blogspot.richardreigens.lilrichymod.blocks.decorativeBlocks;

import com.blogspot.richardreigens.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.world.IBlockAccess;

/**
 * Created by LiLRichy on 1/26/2016.
 */
public class GlassBlocks extends Block {
    private final String blockToolTip;
    private final String blockCraftTip;

    //Constructor with Tool tip and Crafting tip string
    public GlassBlocks(String name, String toolTip, String craftTip) {
        super(Material.glass);
        this.setHardness(0.5f);
        this.setLightLevel(1.0F);
        this.setStepSound(soundTypeGlass);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setBlockName(name);
        this.blockToolTip = toolTip;
        this.blockCraftTip = craftTip;
    }

    //Constructor with Tool tip
    public GlassBlocks(String name, String toolTip) {
        super(Material.glass);
        this.setHardness(0.5f);
        this.setLightLevel(1.0F);
        this.setStepSound(soundTypeGlass);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setBlockName(name);
        this.blockToolTip = toolTip;
        this.blockCraftTip = null;
    }

    //Constructor with no tool tips
    public GlassBlocks(String name) {
        super(Material.glass);
        this.setHardness(0.5f);
        this.setLightLevel(1.0F);
        this.setStepSound(soundTypeGlass);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setBlockName(name);
        this.blockToolTip = null;
        this.blockCraftTip = null;
    }

    public static String getToolTip(Block block) {
        if (block instanceof GlassBlocks) {
            GlassBlocks n = (GlassBlocks) block;
            return n.blockToolTip;
        } else return null;
    }

    public static Object getCraftTip(Block block) {
        if (block instanceof GlassBlocks) {
            GlassBlocks n = (GlassBlocks) block;
            return n.blockCraftTip;
        } else return null;
    }

    @Override
    public int getRenderBlockPass() {
        return 1;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    public boolean shouldSideBeRendered1(IBlockAccess blockAccess, int x, int y, int z, int side) {
        Block block = blockAccess.getBlock(x, y, z);

        return block == this ? false : super.shouldSideBeRendered(blockAccess, x, y, z, side);
    }

    @Override
    public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int side) {
        return shouldSideBeRendered1(blockAccess, x, y, z, 1 - side);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", "glass/" + getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
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
