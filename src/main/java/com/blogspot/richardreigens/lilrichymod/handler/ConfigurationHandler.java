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
    // public static boolean testValue = false;
    public static boolean loadShadowmourne = false;
    public static boolean loadPlayerDetector = true;
    public static boolean loadAdvancedDetector = true;
    public static int defaultRangePlayerDetector;
    public static int defaultRangeAdvancedDetector;

    public static void init(File configFile)
    {
        //Create config file if none exists
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        String Main = "Main Settings";
        // testValue = configuration.getBoolean("configValue", "Main Settings", false, "This is an example of a config value");
        // Get int = String name, String category, int defaultValue, int minValue, int maxValue, String comment


        loadShadowmourne = configuration.getBoolean("loadShandowmourne", Main, false, "Load the Shadowmourne Weapon.");
        loadPlayerDetector = configuration.getBoolean("loadPlayerDetector", Main, true, "Enable the Player Detector Block.");
        loadAdvancedDetector = configuration.getBoolean("loadAdvancedDetector", Main, true, "Enable the Advanced Detector Block.");
        defaultRangePlayerDetector = configuration.getInt("defautRangePlayerDetector", Main, 3, 1, 20, "Range of the Player Detector");
        defaultRangeAdvancedDetector = configuration.getInt("defautRangeAdvancedDetector", Main, 5, 1, 20, "Range of the Advanced Detector");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }

    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            //Reload Config
            loadConfiguration();
        }
    }
}
