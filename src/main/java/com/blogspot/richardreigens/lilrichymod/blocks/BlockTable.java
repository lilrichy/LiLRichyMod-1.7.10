package com.blogspot.richardreigens.lilrichymod.blocks;

import com.blogspot.richardreigens.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.handler.GuiHandler;
import com.blogspot.richardreigens.lilrichymod.lilrichymod;
import com.blogspot.richardreigens.lilrichymod.reference.Names;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import com.blogspot.richardreigens.lilrichymod.tileEntity.TileEntityBlockTable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/**
 * Created by Rich on 12/8/2015.
 */
public class BlockTable extends BlockContainer
{
    public BlockTable(Material material)
    {
        super(material);
        this.setBlockName(Names.Models.BLOCK_TABLE);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setBlockTextureName(Reference.MOD_ID + ":" + Names.Models.BLOCK_TABLE);
        this.setHardness(5f);
        this.setResistance(0.5f);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        if (!world.isRemote) {
            player.openGui(lilrichymod.instance, GuiHandler.GuiIDs.BLOCK_TABLE.ordinal(), world, x, y, z);
        }
        return true;
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block b, int par1)
    {
        TileEntity tileEntityBlockTable = world.getTileEntity(x, y, z);
        if (tileEntityBlockTable instanceof IInventory) {

            // For each slot in the inventory
            for (int i = TileEntityBlockTable.FIRST_INPUT_SLOT; i < TileEntityBlockTable.FIRST_INPUT_SLOT + 2; i++) {
                // If the slot is not empty
                if (((IInventory) tileEntityBlockTable).getStackInSlot(i) != null) {
                    // Create a new entity item with the item stack in the slot
                    EntityItem item = new EntityItem(world, x + 0.5, y + 0.5, z + 0.5,
                            ((IInventory) tileEntityBlockTable).getStackInSlot(i));

                    // Apply some random motion to the item
                    float multiplier = 0.1f;
                    float motionX = world.rand.nextFloat() - 0.5f;
                    float motionY = world.rand.nextFloat() - 0.5f;
                    float motionZ = world.rand.nextFloat() - 0.5f;

                    item.motionX = motionX * multiplier;
                    item.motionY = motionY * multiplier;
                    item.motionZ = motionZ * multiplier;

                    // Spawn the item in the world
                    world.spawnEntityInWorld(item);
                }
            }
        }
        super.breakBlock(world, x, y, z, b, par1);
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

    @Override
    public int getRenderType()
    {
        return -1;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack)
    {
        int l = MathHelper.floor_double(player.rotationYaw * 4F / 360F + 0.5D) & 3;
        TileEntityBlockTable te = (TileEntityBlockTable) world.getTileEntity(x, y, z);
        if (te != null) {
            te.direction = l;
        }
    }

    @Override
    public TileEntity createNewTileEntity(World world, int p_149915_2_)
    {
        return new TileEntityBlockTable();
    }
}
