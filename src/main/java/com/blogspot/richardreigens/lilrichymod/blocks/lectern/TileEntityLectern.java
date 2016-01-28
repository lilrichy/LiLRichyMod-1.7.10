package com.blogspot.richardreigens.lilrichymod.blocks.lectern;

import cpw.mods.fml.common.Loader;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntityEnchantmentTable;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.api.ItemApi;

import java.util.ArrayList;

/**
 * Created by LiLRichy on 1/26/2016.
 */
public class TileEntityLectern extends TileEntityEnchantmentTable {
    public ItemStack stack;

    public TileEntityLectern() {
    }

    @Override
    public void updateEntity() {
        if (worldObj.isRemote) updateBookRender();
    }

    private void updateBookRender() {
        this.field_145927_n = this.field_145930_m;
        this.field_145925_p = this.field_145928_o;
        this.field_145930_m += 0.1F;

        if (this.field_145930_m < 0.5F || worldObj.rand.nextInt(20) == 0) {
            float f1 = this.field_145932_k;

            do {
                this.field_145932_k += (float) (worldObj.rand.nextInt(4) - worldObj.rand.nextInt(4));
            }
            while (f1 == this.field_145932_k);
        }

        while (this.field_145928_o >= (float) Math.PI) {
            this.field_145928_o -= ((float) Math.PI * 2F);
        }

        while (this.field_145928_o < -(float) Math.PI) {
            this.field_145928_o += ((float) Math.PI * 2F);
        }

        while (this.field_145924_q >= (float) Math.PI) {
            this.field_145924_q -= ((float) Math.PI * 2F);
        }

        while (this.field_145924_q < -(float) Math.PI) {
            this.field_145924_q += ((float) Math.PI * 2F);
        }

        float f2;

        for (f2 = this.field_145924_q - this.field_145928_o; f2 >= (float) Math.PI; f2 -= ((float) Math.PI * 2F)) {

        }
        while (f2 < -(float) Math.PI) {
            f2 += ((float) Math.PI * 2F);
        }

        this.field_145928_o += f2 * 0.4F;

        if (this.field_145930_m < 0.0F) this.field_145930_m = 0.0F;
        if (this.field_145930_m > 1.0F) this.field_145930_m = 1.0F;

        ++this.field_145926_a;
        this.field_145931_j = this.field_145933_i;
        float f = (this.field_145932_k - this.field_145933_i) * 0.4F;
        float f3 = 0.2F;

        if (f < -f3) f = -f3;
        if (f > f3) f = f3;

        this.field_145929_l += (f - this.field_145929_l) * 0.9F;
        this.field_145933_i += this.field_145929_l;
    }

    @Override
    public boolean canUpdate() {
        return true;
    }

    public ItemStack getStack() {
        return stack;
    }

    public boolean setStack(ItemStack itemStack) {
        if (itemStack == null || getValidItems().contains(itemStack.getItem())) {
            this.stack = itemStack;
            if (itemStack == null) {
                stack = null;
            }
            return true;
        }
        return false;
    }

    public boolean hasStack() {
        return stack != null;
    }

    @Override
    public Packet getDescriptionPacket() {
        NBTTagCompound compound = new NBTTagCompound();
        writeToNBT(compound);
        S35PacketUpdateTileEntity packet = new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, worldObj.getBlockMetadata(xCoord, yCoord, zCoord), compound);
        return packet;
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        this.readFromNBT(pkt.func_148857_g());
    }

    private ArrayList<Item> getValidItems() {
        ArrayList<Item> validItems = new ArrayList<Item>();

        //List of books that can be put into the Lectern
        validItems.add(Items.written_book);

        if (Loader.isModLoaded("Thaumcraft")) {
            ItemStack item = ItemApi.getItem("itemThaumonomicon", 0);
            if (item != null) {
                validItems.add(item.getItem());
            }
        }
        if (Loader.isModLoaded("Botania")) {
            for (ItemStack aLexList : OreDictionary.getOres("lexicaBotania")) {
                validItems.add(aLexList.getItem());
            }
        }
        //ToDo Add Immersive Engineering and Tinkers Construct books.

        //Immersive Engineering book would not open the gui in testing.
        /*if (Loader.isModLoaded("ImmersiveEngineering")) {
            ItemStack item = new ItemStack(IEContent.itemTool, 1, 3);
            validItems.add(item.getItem());
        }*/
        return validItems;
    }

    @Override
    public void readFromNBT(NBTTagCompound comp) {
        super.readFromNBT(comp);
        if (comp.hasKey("placedBook")) {
            NBTTagCompound tag = comp.getCompoundTag("placedBook");
            stack = ItemStack.loadItemStackFromNBT(tag);
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound comp) {
        super.writeToNBT(comp);
        if (stack != null) {
            NBTTagCompound tag = new NBTTagCompound();
            stack.writeToNBT(tag);
            comp.setTag("placedBook", tag);
        }
    }
}
