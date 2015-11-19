package com.blogspot.richardreigens.lilrichymod.handler;

import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Rich on 11/19/2015.
 */
public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        //Create config file if none exists
        if(configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            //Reload Config
            loadConfiguration();

        }
    }

    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue", "Main Settings", false, "This is an example of a config value");

        if(configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
