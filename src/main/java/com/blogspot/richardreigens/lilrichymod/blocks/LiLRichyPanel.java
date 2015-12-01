package com.blogspot.richardreigens.lilrichymod.blocks;

import com.blogspot.richardreigens.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * Created by Rich on 12/1/2015.
 */
public class LiLRichyPanel extends BlockPane
{
    private IIcon blockIconTop;
    private String sideIcon;
    private String topIcon;

    public LiLRichyPanel(String Name, String sideBlockName, String topName, Material material, boolean canDrop)
    {
        super(sideBlockName, topName, material, canDrop);
        this.sideIcon = sideBlockName;
        this.topIcon = topName;
        this.setBlockName(Name);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setHardness(2.0f);
    }

    @SideOnly(Side.CLIENT)
    public IIcon func_150097_e()
    {
        return this.blockIconTop;
    }

    @Override
    public int getRenderType()
    {
        return this.blockMaterial == Material.wood ? 41 : 18;
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", "panels/" + getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {

        this.blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName((this.getUnlocalizedName() + this.sideIcon))));
        this.blockIconTop = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName((this.getUnlocalizedName() + this.topIcon))));
    }
}