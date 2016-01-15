package com.blogspot.richardreigens.lilrichymod.handler;

import com.blogspot.richardreigens.lilrichymod.handler.network.MessageBase;
import com.blogspot.richardreigens.lilrichymod.tileEntity.TileEntityLiLRichyMod;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by Rich on 11/30/2015.
 */
public class MessageHandleGuiButtonPress extends MessageBase<MessageHandleGuiButtonPress> {
    private int x, y, z, id;

    public MessageHandleGuiButtonPress() {
    }

    public MessageHandleGuiButtonPress(TileEntityLiLRichyMod te, int id) {
        x = te.xCoord;
        y = te.yCoord;
        z = te.zCoord;
        this.id = id;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        x = buf.readInt();
        y = buf.readInt();
        z = buf.readInt();
        id = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(x);
        buf.writeInt(y);
        buf.writeInt(z);
        buf.writeInt(id);
    }

    @Override
    public void handleClientSide(MessageHandleGuiButtonPress message, EntityPlayer player) {
    }

    @Override
    public void handleServerSide(MessageHandleGuiButtonPress message, EntityPlayer player) {
        TileEntity te = player.worldObj.getTileEntity(message.x, message.y, message.z);
        if (te instanceof TileEntityLiLRichyMod) {
            ((TileEntityLiLRichyMod) te).onGuiButtonPress(id);
        }
    }
}