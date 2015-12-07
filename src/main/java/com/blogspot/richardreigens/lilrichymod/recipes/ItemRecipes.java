package com.blogspot.richardreigens.lilrichymod.recipes;

import com.blogspot.richardreigens.lilrichymod.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Rich on 12/7/2015.
 */
public class ItemRecipes
{
    public static void init()
    {
        //DeathSock
        GameRegistry.addRecipe(new ItemStack(ModItems.deathSock), "  w", "  w", "www", 'w', new ItemStack(Blocks.wool));
        GameRegistry.addRecipe(new ItemStack(ModItems.deathSock), "w  ", "w  ", "www", 'w', new ItemStack(Blocks.wool));

        //Concrete Mix
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.concreteMix, 4),
                new ItemStack(Blocks.sand), new ItemStack(Blocks.gravel), new ItemStack(Blocks.gravel),
                new ItemStack(Blocks.cobblestone));

        //Seed of Beared Azailia
        GameRegistry.addRecipe(new ItemStack(ModItems.seedBearedAzailia, 1), " r ", "ese", " r ",
                'r', new ItemStack(Items.rotten_flesh), 'e', new ItemStack(Items.spider_eye),
                's', new ItemStack(Items.wheat_seeds));
    }
}
