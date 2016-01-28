package com.blogspot.richardreigens.lilrichymod.handler.network;

import com.blogspot.richardreigens.lilrichymod.utility.LogHelper;
import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Created by LiLRichy on 1/27/2016 from AMDataWriter
 */
public class DataWriter {
    ByteArrayOutputStream bytes;
    DataOutputStream data;

    public DataWriter() {
        bytes = new ByteArrayOutputStream();
        data = new DataOutputStream(bytes);
    }

    public DataWriter add(int value) {
        try {
            data.writeInt(Integer.valueOf(value));
        } catch (IOException e) {
            LogHelper.error("AMDataWriter: " + e.getMessage());
        }
        return this;
    }

    public DataWriter add(boolean value) {
        try {
            data.writeBoolean(value);
        } catch (IOException e) {
            LogHelper.error(e.getMessage());
        }
        return this;
    }

    public DataWriter add(byte value) {
        try {
            data.writeByte(value);
        } catch (IOException e) {
            LogHelper.error("AMDataWriter: " + e.getMessage());
        }
        return this;
    }

    public DataWriter add(String value) {
        try {
            data.writeUTF(value);
        } catch (IOException e) {
            LogHelper.error("AMDataWriter: " + e.getMessage());
        }
        return this;
    }

    public DataWriter add(short value) {
        try {
            data.writeShort(value);
        } catch (IOException e) {
            LogHelper.error("AMDataWriter: " + e.getMessage());
        }
        return this;
    }

    public DataWriter add(double value) {
        try {
            data.writeDouble(value);
        } catch (IOException e) {
            LogHelper.error("AMDataWriter: " + e.getMessage());
        }
        return this;
    }

    public DataWriter add(float value) {
        try {
            data.writeFloat(value);
        } catch (IOException e) {
            LogHelper.error("AMDataWriter: " + e.getMessage());
        }
        return this;
    }

    public DataWriter add(long value) {
        try {
            data.writeLong(value);
        } catch (IOException e) {
            LogHelper.error("AMDataWriter: " + e.getMessage());
        }
        return this;
    }

    public DataWriter add(byte[] value) {
        try {
            data.write(value);
        } catch (IOException e) {
            LogHelper.error("AMDataWriter: " + e.getMessage());
        }
        return this;
    }

    public DataWriter add(int[] value) {
        try {
            data.writeInt(Integer.valueOf(value.length));
            for (int i = 0; i < value.length; ++i)
                data.writeInt(Integer.valueOf(value[i]));
        } catch (IOException e) {
            LogHelper.error("AMDataWriter: " + e.getMessage());
        }
        return this;
    }

    public DataWriter add(NBTTagCompound compound) {
        try {
            ByteBuf buf = Unpooled.buffer();
            ByteBufUtils.writeTag(buf, compound);
            byte[] arr = buf.array();
            data.writeInt(arr.length);
            data.write(arr);
        } catch (IOException ex) {
            LogHelper.error("AMDataWriter: " + ex.getMessage());
        }
        return this;
    }

    public DataWriter add(ItemStack stack) {
        NBTTagCompound compound = new NBTTagCompound();
        stack.writeToNBT(compound);
        return add(compound);
    }

    public byte[] generate() {
        return bytes.toByteArray();
    }
}