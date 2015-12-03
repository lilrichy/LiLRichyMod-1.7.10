package com.blogspot.richardreigens.lilrichymod.init;

import com.blogspot.richardreigens.lilrichymod.blocks.*;
import com.blogspot.richardreigens.lilrichymod.blocks.crops.BearedAzailia;
import com.blogspot.richardreigens.lilrichymod.handler.ConfigurationHandler;
import com.blogspot.richardreigens.lilrichymod.reference.Names;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

/**
 * Created by Rich on 11/19/2015.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    //Crops
    public static final LiLRichyCrop bearedAzailia = new BearedAzailia(Names.Crops.BEARED_AZAILIA);

    //Blocks
    public static final DecorativeBlocks concrete = new DecorativeBlocks(Names.Blocks.CONCRETE, Material.rock);
    public static final DecorativeBlocks fancyConcreteBlocks = new DecorativeBlocks(Names.Blocks.FANCY_CONCRETE_BLOCKS, Material.rock);
    public static final DecorativeBlocks concreteBricks = new DecorativeBlocks(Names.Blocks.CONCRETE_BRICKS, Material.rock);
    public static final DecorativeBlocks concreteBricksDark = new DecorativeBlocks(Names.Blocks.CONCRETE_BRICKS_DARK, Material.rock);
    public static final DecorativeBlocks concreteRocks = new DecorativeBlocks(Names.Blocks.CONCRETE_ROCKS, Material.rock);
    public static final DecorativeBlocks concreteTexturedBlocks = new DecorativeBlocks(Names.Blocks.CONCRETE_TEXTURED_BLOCKS, Material.rock);
    public static final DecorativeBlocks oldConcreteSquares = new DecorativeBlocks(Names.Blocks.OLD_CONCRETE_SQUARES, Material.rock);
    public static final DecorativeBlocks concreteSquares = new DecorativeBlocks(Names.Blocks.CONCRETE_SQUARES, Material.rock);
    public static final DecorativeBlocks smallConcreteBricks = new DecorativeBlocks(Names.Blocks.SMALL_CONCRETE_BRICKS, Material.rock);
    public static final DecorativeBlocks smallConcreteTexturedSquares = new DecorativeBlocks(Names.Blocks.SMALL_CONCRETE_TEXTURED_SQUARES, Material.rock);
    public static final DecorativeBlocks arrangedConcreteBricks = new DecorativeBlocks(Names.Blocks.ARRANGED_CONCRETE_BRICKS, Material.rock);
    public static final DecorativeBlocks crackedStone = new DecorativeBlocks(Names.Blocks.CRACKED_STONE, Material.rock);
    public static final DecorativeBlocks arrangedStoneBricks = new DecorativeBlocks(Names.Blocks.ARRANGED_STONE_BRICKS, Material.rock);

    //Panels
    public static final LiLRichyPanel acaciaPanel = new LiLRichyPanel(Names.Panels.ACACIA_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel big_oakPanel = new LiLRichyPanel(Names.Panels.BIG_OAK_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel birchPanel = new LiLRichyPanel(Names.Panels.BIRCH_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel junglePanel = new LiLRichyPanel(Names.Panels.JUNGLE_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel oakPanel = new LiLRichyPanel(Names.Panels.OAK_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel sprucePanel = new LiLRichyPanel(Names.Panels.SPRUCE_PANEL, "Side", "Top", Material.wood, true);

    public static final LiLRichyPanel log_acaciaPanel = new LiLRichyPanel(Names.Panels.LOG_ACACIA_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel log_big_oakPanel = new LiLRichyPanel(Names.Panels.LOG_BIG_OAK_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel log_birchPanel = new LiLRichyPanel(Names.Panels.LOG_BIRCH_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel log_junglePanel = new LiLRichyPanel(Names.Panels.LOG_JUNGLE_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel log_oakPanel = new LiLRichyPanel(Names.Panels.LOG_OAK_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel log_sprucePanel = new LiLRichyPanel(Names.Panels.LOG_SPRUCE_PANEL, "Side", "Top", Material.wood, true);


    //Tile Entity Blocks
    public static final BlockTileEntityLiLRichyMod playerDetector = new BlockPlayerDetector();
    public static final BlockTileEntityLiLRichyMod advancedDetector = new BlockAdvancedDetector();


    public static void init()
    {
        //Crops
        GameRegistry.registerBlock(bearedAzailia, Names.Crops.BEARED_AZAILIA);

        //Blocks
        GameRegistry.registerBlock(concrete, Names.Blocks.CONCRETE);
        GameRegistry.registerBlock(fancyConcreteBlocks, Names.Blocks.FANCY_CONCRETE_BLOCKS);
        GameRegistry.registerBlock(concreteBricks, Names.Blocks.CONCRETE_BRICKS);
        GameRegistry.registerBlock(concreteBricksDark, Names.Blocks.CONCRETE_BRICKS_DARK);
        GameRegistry.registerBlock(concreteRocks, Names.Blocks.CONCRETE_ROCKS);
        GameRegistry.registerBlock(concreteTexturedBlocks, Names.Blocks.CONCRETE_TEXTURED_BLOCKS);
        GameRegistry.registerBlock(oldConcreteSquares, Names.Blocks.OLD_CONCRETE_SQUARES);
        GameRegistry.registerBlock(concreteSquares, Names.Blocks.CONCRETE_SQUARES);
        GameRegistry.registerBlock(smallConcreteBricks, Names.Blocks.SMALL_CONCRETE_BRICKS);
        GameRegistry.registerBlock(smallConcreteTexturedSquares, Names.Blocks.SMALL_CONCRETE_TEXTURED_SQUARES);
        GameRegistry.registerBlock(arrangedConcreteBricks, Names.Blocks.ARRANGED_CONCRETE_BRICKS);
        GameRegistry.registerBlock(crackedStone, Names.Blocks.CRACKED_STONE);
        GameRegistry.registerBlock(arrangedStoneBricks, Names.Blocks.ARRANGED_STONE_BRICKS);

        //Panels Planks
        GameRegistry.registerBlock(acaciaPanel, Names.Panels.ACACIA_PANEL);
        GameRegistry.registerBlock(big_oakPanel, Names.Panels.BIG_OAK_PANEL);
        GameRegistry.registerBlock(birchPanel, Names.Panels.BIRCH_PANEL);
        GameRegistry.registerBlock(junglePanel, Names.Panels.JUNGLE_PANEL);
        GameRegistry.registerBlock(oakPanel, Names.Panels.OAK_PANEL);
        GameRegistry.registerBlock(sprucePanel, Names.Panels.SPRUCE_PANEL);
        //Panels Logs
        GameRegistry.registerBlock(log_acaciaPanel, Names.Panels.LOG_ACACIA_PANEL);
        GameRegistry.registerBlock(log_big_oakPanel, Names.Panels.LOG_BIG_OAK_PANEL);
        GameRegistry.registerBlock(log_birchPanel, Names.Panels.LOG_BIRCH_PANEL);
        GameRegistry.registerBlock(log_junglePanel, Names.Panels.LOG_JUNGLE_PANEL);
        GameRegistry.registerBlock(log_oakPanel, Names.Panels.LOG_OAK_PANEL);
        GameRegistry.registerBlock(log_sprucePanel, Names.Panels.LOG_SPRUCE_PANEL);

        //Tile Entity Blocks
        if (ConfigurationHandler.loadPlayerDetector)
            GameRegistry.registerBlock(playerDetector, Names.Blocks.PLAYER_DETECTOR);
        if (ConfigurationHandler.loadAdvancedDetector)
            GameRegistry.registerBlock(advancedDetector, Names.Blocks.ADVANCED_DETECTOR);

    }
}
