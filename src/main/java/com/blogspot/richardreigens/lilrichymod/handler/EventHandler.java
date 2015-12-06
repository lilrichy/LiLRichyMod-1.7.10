package com.blogspot.richardreigens.lilrichymod.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import org.lwjgl.opengl.GL11;

/**
 * Created by Rich on 12/4/2015.
 */
public class EventHandler
{
    @SubscribeEvent
    public void playerRenderPre(RenderPlayerEvent.Pre e)
    {
        GL11.glPushMatrix();

        //Flip Player Render
        // if (e.entityPlayer.getDisplayName().equals(Reference.LILRICHY)) {
        if (ConfigurationHandler.flipPlayers) {
            GL11.glTranslatef(0f, e.entityPlayer.height - 3F, 0.0F);
            GL11.glRotatef(180f, 0f, 0f, 1f);
        }
    }

    @SubscribeEvent
    public void playerRenderPost(RenderPlayerEvent.Post e)
    {
        GL11.glPopMatrix();
    }

    /*@SubscribeEvent
    public void giveSockEffect(LivingEvent.LivingUpdateEvent event)
    {
        if (ItemDeathSock.charged) {
            if (event.entityLiving instanceof EntityPlayer) {
                EntityPlayer player1 = (EntityPlayer) event.entityLiving;
                EntityPlayer player2 = player1.worldObj.getClosestPlayerToEntity(player1, -1);
                if (player2 != null && player1.getDistanceToEntity(player2) < 10) {
                    if (player1.getActivePotionEffect(Potion.poison) != null) {
                        player2.addPotionEffect(new PotionEffect(Potion.poison.id, 20, 60, false));
                    }
                }
            }
        }
    }*/
}
