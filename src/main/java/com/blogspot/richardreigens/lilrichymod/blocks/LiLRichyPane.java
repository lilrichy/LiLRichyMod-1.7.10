package com.blogspot.richardreigens.lilrichymod.blocks;

import com.blogspot.richardreigens.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

/**
 * Created by LiLRichy on 1/28/2016.
 */
public class LiLRichyPane extends BlockPane {
    private String sideIcon;
    private String topIcon;

    @SideOnly(Side.CLIENT)
    private IIcon blockIconTop;

    public LiLRichyPane(String Name, String sideBlockName, String topName, Material material, boolean canDrop) {
        super(sideBlockName, topName, material, canDrop);
        this.sideIcon = sideBlockName;
        this.topIcon = topName;
        this.setBlockName(Name);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(.2f);
    }

    public int getRenderType() {
        return this.blockMaterial == Material.glass ? 41 : 18;
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

    @SideOnly(Side.CLIENT)
    public IIcon func_150097_e() {
        return this.blockIconTop;
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
        this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":glass/" + this.sideIcon);
        this.blockIconTop = iconRegister.registerIcon(Reference.MOD_ID + ":glass/" + this.topIcon);
    }
}
