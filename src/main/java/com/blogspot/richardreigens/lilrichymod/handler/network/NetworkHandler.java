package com.blogspot.richardreigens.lilrichymod.handler.network;

import com.blogspot.richardreigens.lilrichymod.handler.MessageHandleGuiButtonPress;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import cpw.mods.fml.common.network.FMLEventChannel;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import io.netty.buffer.Unpooled;
import net.minecraft.entity.player.EntityPlayerMP;

/**
 * Created by Rich on 11/30/2015.
 */
public class NetworkHandler {
    private static final String ChannelLabel = "LiLRichyModData";
    public static SimpleNetworkWrapper INSTANCE;
    private static FMLEventChannel Channel;

    public static void init() {
        INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MOD_ID);
        INSTANCE.registerMessage(MessageHandleGuiButtonPress.class, MessageHandleGuiButtonPress.class, 1, Side.SERVER);
        Channel = NetworkRegistry.INSTANCE.newEventDrivenChannel(ChannelLabel);
    }

    public static void sendPacketToAllClientsNear(int dimension, double ox, double oy, double oz, double radius, byte packetID, byte[] data) {
        //first byte is ID, followed by data
        byte[] pkt_data = new byte[data.length + 1];
        pkt_data[0] = packetID;

        //copy the data
        for (int i = 0; i < data.length; ++i) {
            pkt_data[i + 1] = data[i];
        }

        FMLProxyPacket packet = new FMLProxyPacket(Unpooled.copiedBuffer(pkt_data), ChannelLabel);
        packet.setTarget(Side.CLIENT);
        Channel.sendToAllAround(packet, new NetworkRegistry.TargetPoint(dimension, ox, oy, oz, radius));
    }

    public static void sendToServer(IMessage message) {
        INSTANCE.sendToServer(message);
    }

    public static void sendTo(IMessage message, EntityPlayerMP player) {
        INSTANCE.sendTo(message, player);
    }

    public static void sendToAllAround(IMessage message, NetworkRegistry.TargetPoint point) {
        INSTANCE.sendToAllAround(message, point);
    }

    public static void sendToAll(IMessage message) {
        INSTANCE.sendToAll(message);
    }

    public static void sendToDimension(IMessage message, int dimensionId) {
        INSTANCE.sendToDimension(message, dimensionId);
    }
}