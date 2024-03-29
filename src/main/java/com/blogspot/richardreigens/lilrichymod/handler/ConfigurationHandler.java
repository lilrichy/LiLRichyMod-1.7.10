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
    public static boolean loadPlayerDetector, loadAdvancedDetector;
    public static boolean smeltingRecipes, itemRecipes, panelRecipes, thermalExpansionRecipes, coalDustRecipe, enderIORecipies, loadDecorativeBlockRecipes;
    public static int defaultRangePlayerDetector, defaultRangeAdvancedDetector;
    public static boolean flipPlayers;
    public static boolean resetConfigFile;

    private static void loadConfiguration() {
        String GENERAL_SETTINGS = "General Mod Settings";
        resetConfigFile = configuration.getBoolean("Reset Config File", GENERAL_SETTINGS, false, "Set true to reset the config file to default settings and regenerate it. Requires Game restart!");

        String SHOULD_LOAD = "Enable or Disable Blocks, Items, and Recipes";
        smeltingRecipes = configuration.getBoolean("Enable smelting recipes", SHOULD_LOAD, true, "Enable for smelting recipes ex: Concrete from Concrete Mix");
        itemRecipes = configuration.getBoolean("Enable item recipes", SHOULD_LOAD, true, "Enable for item recipes ex: Death sock, Concrete Mix");
        panelRecipes = configuration.getBoolean("Enable panel recipes", SHOULD_LOAD, true, "Enable recipes to make Panels");
        thermalExpansionRecipes = configuration.getBoolean("Enable Thermal Expansion Recipes", SHOULD_LOAD, true, "Enable for Pulverizer recipes ex: Concrete to Crushed Concrete");
        enderIORecipies = configuration.getBoolean("Enable Ender IO Recipes", SHOULD_LOAD, true, "Enable for Sag Mill recipes ex: Concrete to Crushed Concrete");
        loadPlayerDetector = configuration.getBoolean("Enable Player Detector", SHOULD_LOAD, true, "Enable the Player Detector Block.");
        loadAdvancedDetector = configuration.getBoolean("Enable Advanced Detector", SHOULD_LOAD, true, "Enable the Advanced Detector Block.");
        coalDustRecipe = configuration.getBoolean("Coal/Charcoal Dye", SHOULD_LOAD, true, "Enable to make Pulverized Coal and Charcoal useable as Black Dye. *Disabled if Thermal Expansion Recipes are Disabled");

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
