package com.blogspot.richardreigens.lilrichymod.blocks.lectern;

import com.blogspot.richardreigens.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.reference.Names;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/**
 * Created by LiLRichy on 1/26/2016.
 */
public class BlockLectern extends BlockContainer {

    public BlockLectern() {
        super(Material.wood);
        setHardness(2.0f);
        setResistance(2.0f);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setBlockTextureName(Reference.MOD_ID + ":" + Names.Models.BLOCK_TABLE);
        this.setBlockName(Names.Models.LECTERN);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new TileEntityLectern();
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {

        super.onBlockActivated(world, x, y, z, player, side, hitX, hitY, hitZ);

        TileEntityLectern te = getTileEntity(world, x, y, z);
        if (te == null) {
            return true;
        }

        if (te.hasStack()) {
            if (player.isSneaking()) {
                if (!world.isRemote) {
                    float f = world.rand.nextFloat() * 0.8F + 0.1F;
                    float f1 = world.rand.nextFloat() * 0.8F + 0.1F;
                    float f2 = world.rand.nextFloat() * 0.8F + 0.1F;
                    ItemStack newItem = new ItemStack(te.getStack().getItem(), 1, te.getStack().getItemDamage());
                    if (te.getStack().stackTagCompound != null)
                        newItem.setTagCompound((NBTTagCompound) te.getStack().stackTagCompound.copy());
                    EntityItem entityitem = new EntityItem(world, x + f, y + f1, z + f2, newItem);
                    float f3 = 0.05F;
                    entityitem.motionX = (float) world.rand.nextGaussian() * f3;
                    entityitem.motionY = (float) world.rand.nextGaussian() * f3 + 0.2F;
                    entityitem.motionZ = (float) world.rand.nextGaussian() * f3;
                    world.spawnEntityInWorld(entityitem);
                }
                te.setStack(null);
            } else {
                //Open Book
                te.getStack().getItem().onItemRightClick(te.getStack(), world, player);
            }
        } else {
            if (player.getCurrentEquippedItem() != null) {
                if (te.setStack(player.getCurrentEquippedItem())) {
                    player.getCurrentEquippedItem().stackSize--;
                    if (player.getCurrentEquippedItem().stackSize <= 0) {
                        player.inventory.setInventorySlotContents(player.inventory.currentItem, null);
                    }
                }
            }
        }
        return true;
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block b, int par1) {
        TileEntityLectern te = getTileEntity(world, x, y, z);
        if (te == null) return;

        if (!world.isRemote) {
            if (te.hasStack()) {
                float f = world.rand.nextFloat() * 0.8F + 0.1F;
                float f1 = world.rand.nextFloat() * 0.8F + 0.1F;
                float f2 = world.rand.nextFloat() * 0.8F + 0.1F;
                ItemStack newItem = new ItemStack(te.getStack().getItem(), 1, te.getStack().getItemDamage());
                if (te.getStack().stackTagCompound != null)
                    newItem.setTagCompound((NBTTagCompound) te.getStack().stackTagCompound.copy());
                EntityItem entityitem = new EntityItem(world, x + f, y + f1, z + f2, newItem);
                float f3 = 0.05F;
                entityitem.motionX = (float) world.rand.nextGaussian() * f3;
                entityitem.motionY = (float) world.rand.nextGaussian() * f3 + 0.2F;
                entityitem.motionZ = (float) world.rand.nextGaussian() * f3;
                world.spawnEntityInWorld(entityitem);
            }
        }
        super.breakBlock(world, x, y, z, b, par1);
    }

    private TileEntityLectern getTileEntity(World world, int x, int y, int z) {
        TileEntity te = world.getTileEntity(x, y, z);
        if (te != null && te instanceof TileEntityLectern) {
            return (TileEntityLectern) te;
        }
        return null;
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) {
        int p = MathHelper.floor_double((player.rotationYaw * 4F) / 360F + 0.5D) & 3;
        byte byte0 = 3;

        if (p == 0) byte0 = 4;
        if (p == 1) byte0 = 3;
        if (p == 2) byte0 = 2;
        if (p == 3) byte0 = 1;

        world.setBlockMetadataWithNotify(x, y, z, byte0, 2);
        super.onBlockPlacedBy(world, x, y, z, player, stack);
    }
}
