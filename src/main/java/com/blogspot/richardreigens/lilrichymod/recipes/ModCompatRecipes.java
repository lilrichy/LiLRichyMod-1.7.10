package com.blogspot.richardreigens.lilrichymod.recipes;

import cofh.api.modhelpers.ThermalExpansionHelper;
import com.blogspot.richardreigens.lilrichymod.init.ModBlocks;
import com.blogspot.richardreigens.lilrichymod.init.ModItems;
import cpw.mods.fml.common.event.FMLInterModComms;
import net.minecraft.item.ItemStack;

/**
 * Created by LiLRichy on 1/25/2016.
 */
public class ModCompatRecipes {

    public static void thermalExpansionRecipesInit() {
        //Thermal Expansion Pulverizer recipe for Crushed Concrete
        ThermalExpansionHelper.addPulverizerRecipe(2400, new ItemStack(ModBlocks.concrete), new ItemStack(ModItems.crushedConcrete, 4));
    }

    public static void enderIORecipesInit() {
        //Ender IO Sag Mill Recipie
        String recipe =
                "<recipeGroup name=\"LiLRichyMod\" >" +
                        "<recipe name=\"Crushed Concrete\" energyCost=\"2400\" >" +
                        "<input>" +
                        "<itemStack modID=\"lilrichymod\" itemName=\"concrete\" />" +
                        "</input>" +
                        "<output>" +
                        "<itemStack modID=\"lilrichymod\" itemName=\"crushedConcrete\" number=\"4\" />" +
                        "<itemStack modID=\"lilrichymod\" itemName=\"concreteMix\" chance=\"0.015\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
        FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", recipe);
    }
}
