package com.blogspot.richardreigens.lilrichymod.tileEntity;

import com.blogspot.richardreigens.lilrichymod.handler.PacketDescriptionHandler;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.network.Packet;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by Rich on 11/24/2015.
 */
public abstract class TileEntityLiLRichyMod extends TileEntity
{
    @Override
    public Packet getDescriptionPacket()
    {
        ByteBuf buf = Unpooled.buffer();
        buf.writeInt(xCoord);
        buf.writeInt(yCoord);
        buf.writeInt(zCoord);

        writeToPacket(buf);
        return new FMLProxyPacket(buf, PacketDescriptionHandler.CHANNEL);
    }


    public void writeToPacket(ByteBuf buf)
    {

    }

    public void readFromPacket(ByteBuf buf)
    {

    }
}
