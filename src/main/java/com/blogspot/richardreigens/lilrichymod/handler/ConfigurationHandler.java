package com.blogspot.richardreigens.lilrichymod.handler;

import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Rich on 11/19/2015.
 */
public class ConfigurationHandler {
    public static Configuration configuration;
    public static boolean loadShadowmourne = false;
    public static boolean loadPlayerDetector = true;
    public static boolean loadAdvancedDetector = true;
    public static int defaultRangePlayerDetector;
    public static int defaultRangeAdvancedDetector;
    public static boolean flipPlayers = false;
    public static boolean loadDecorativeBlockRecipes = false;

    private static void loadConfiguration() {
        String SHOULD_LOAD = "Enable or Disable Blocks and Items";
        loadDecorativeBlockRecipes = configuration.getBoolean("loadDecorativeBlockRecipes", SHOULD_LOAD, false, "If this is true old recipes for decorative blocks will load, if " +
                "false blocks will need to be made in the Block Table");
        loadShadowmourne = configuration.getBoolean("loadShandowmourne", SHOULD_LOAD, false, "Enable the Shadowmourne Weapon *Note currently a WIP Creative Only Item.");
        loadPlayerDetector = configuration.getBoolean("loadPlayerDetector", SHOULD_LOAD, true, "Enable the Player Detector Block.");
        loadAdvancedDetector = configuration.getBoolean("loadAdvancedDetector", SHOULD_LOAD, true, "Enable the Advanced Detector Block.");

        String DETECTOR_SETTINGS = "Detector Settings";
        defaultRangePlayerDetector = configuration.getInt("defautRangePlayerDetector", DETECTOR_SETTINGS, 2, 1, 20, "Range of the Player Detector");
        defaultRangeAdvancedDetector = configuration.getInt("defautRangeAdvancedDetector", DETECTOR_SETTINGS, 5, 1, 20, "Range of the Advanced Detector");

        String FUN_SETTINGS = "Fun Settings";
        flipPlayers = configuration.getBoolean("flipPlayers", FUN_SETTINGS, false, "Flip Players Upside Down.");

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
    }

    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            //Reload Config
            loadConfiguration();
        }
    }
}
