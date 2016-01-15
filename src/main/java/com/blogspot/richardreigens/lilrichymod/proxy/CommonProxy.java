package com.blogspot.richardreigens.lilrichymod.proxy;

import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Rich on 11/19/2015.
 */
public abstract class CommonProxy {
    public abstract void registerRenderers();

    public abstract void preInit();

    public abstract void init();

    public abstract void postInit();

    public abstract EntityPlayer getClientPlayer();
}
