package com.blogspot.richardreigens.lilrichymod.init;

import com.blogspot.richardreigens.lilrichymod.blocks.*;
import com.blogspot.richardreigens.lilrichymod.blocks.type.concrete.*;
import com.blogspot.richardreigens.lilrichymod.blocks.type.stone.BlockArrangedStoneBricks;
import com.blogspot.richardreigens.lilrichymod.blocks.type.stone.BlockCrackedStone;
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
    //Blocks
    public static final BlockLiLRichyMod concrete = new BlockConcrete();
    public static final BlockLiLRichyMod fancyConcreteBlocks = new BlockFancyConcreteBlocks();
    public static final BlockLiLRichyMod concreteBricks = new BlockConcreteBricks();
    public static final BlockLiLRichyMod concreteBricksDark = new BlockConcreteBricksDark();
    public static final BlockLiLRichyMod concreteRocks = new BlockConcreteRocks();
    public static final BlockLiLRichyMod concreteTexturedBlocks = new BlockConcreteTexturedBlocks();
    public static final BlockLiLRichyMod oldConcreteSquares = new BlockOldConcreteSquares();
    public static final BlockLiLRichyMod concreteSquares = new BlockConcreteSquares();
    public static final BlockLiLRichyMod smallConcreteBricks = new BlockSmallConcreteBricks();
    public static final BlockLiLRichyMod smallConcreteTexturedSquares = new BlockSmallConcreteTexturedSquares();
    public static final BlockLiLRichyMod arrangedConcreteBricks = new BlockArrangedConcreteBricks();
    public static final BlockLiLRichyMod crackedStone = new BlockCrackedStone();
    public static final BlockLiLRichyMod arrangedStoneBricks = new BlockArrangedStoneBricks();

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

        //Panels
        GameRegistry.registerBlock(acaciaPanel, Names.Panels.ACACIA_PANEL);
        GameRegistry.registerBlock(big_oakPanel, Names.Panels.BIG_OAK_PANEL);
        GameRegistry.registerBlock(birchPanel, Names.Panels.BIRCH_PANEL);
        GameRegistry.registerBlock(junglePanel, Names.Panels.JUNGLE_PANEL);
        GameRegistry.registerBlock(oakPanel, Names.Panels.OAK_PANEL);
        GameRegistry.registerBlock(sprucePanel, Names.Panels.SPRUCE_PANEL);

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
