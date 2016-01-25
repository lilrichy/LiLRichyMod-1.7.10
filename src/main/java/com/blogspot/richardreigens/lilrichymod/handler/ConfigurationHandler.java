package com.blogspot.richardreigens.lilrichymod.handler;

import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import com.blogspot.richardreigens.lilrichymod.utility.LogHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Rich on 11/19/2015.
 */
public class ConfigurationHandler {
    public static Configuration configuration;
    public static boolean loadPlayerDetector = true;
    public static boolean loadAdvancedDetector = true;
    public static int defaultRangePlayerDetector;
    public static int defaultRangeAdvancedDetector;
    public static boolean flipPlayers = false;
    public static boolean loadDecorativeBlockRecipes = false;
    public static boolean resetConfigFile = true;


    private static void loadConfiguration() {
        String GENERAL_SETTINGS = "General Mod Settings";
        resetConfigFile = configuration.getBoolean("Reset Config File", GENERAL_SETTINGS, false, "Set true to reset the config file to default settings and regenerate it.");

        String SHOULD_LOAD = "Enable or Disable Blocks and Items";
        loadDecorativeBlockRecipes = configuration.getBoolean("Use old Decorative Block Recipes", SHOULD_LOAD, false, "If this is true old recipes for decorative blocks will load " +
                "*Depreciated and will not be updated*, if false blocks will need to be made in the Block Table");
        loadPlayerDetector = configuration.getBoolean("Enable Player Detector", SHOULD_LOAD, true, "Enable the Player Detector Block.");
        loadAdvancedDetector = configuration.getBoolean("Enable Advanced Detector", SHOULD_LOAD, true, "Enable the Advanced Detector Block.");

        String DETECTOR_SETTINGS = "Detector Settings";
        defaultRangePlayerDetector = configuration.getInt("Range Player Detector", DETECTOR_SETTINGS, 2, 1, 20, "Range of the Player Detector");
        defaultRangeAdvancedDetector = configuration.getInt("Range Advanced Detector", DETECTOR_SETTINGS, 5, 1, 20, "Range of the Advanced Detector");

        String FUN_SETTINGS = "Fun Settings";
        flipPlayers = configuration.getBoolean("Flip Players", FUN_SETTINGS, false, "Flip Players Upside Down.");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }

    public static void init(File configFile) {
        //Create config file if none exists
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }

        if (configuration != null && resetConfigFile) {
            configFile.delete();
            LogHelper.warn("LiLRichy Mod Config File Reset!");
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            //Reload Config
            loadConfiguration();
        }
    }
}
