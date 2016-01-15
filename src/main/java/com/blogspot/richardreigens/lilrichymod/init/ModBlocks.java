package com.blogspot.richardreigens.lilrichymod.init;

import com.blogspot.richardreigens.lilrichymod.blocks.*;
import com.blogspot.richardreigens.lilrichymod.blocks.crops.BeardedAzalea;
import com.blogspot.richardreigens.lilrichymod.blocks.crops.CropItemBlock;
import com.blogspot.richardreigens.lilrichymod.blocks.crops.LiLRichyCrop;
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
    //Testing


    //Crops
    public static final LiLRichyCrop beardedAzalea = new BeardedAzalea(Names.Crops.BEARDED_AZALEA);

    //Custom Rendered Blocks
    public static final BlockTable blockTable = new BlockTable(Material.rock);

    //Decorative Blocks ------------------------------------------------------------------------------------------------

    //Lava
    public static final DecorativeBlocks lavaBowl = new DecorativeBlocks(Names.Blocks.LAVA_BOWL, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks lavaCracks = new DecorativeBlocks(Names.Blocks.LAVA_CRACKS, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks lavaDeepFire = new DecorativeBlocks(Names.Blocks.LAVA_DEEP_FIRE, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks lavaPelesLake = new DecorativeBlocks(Names.Blocks.LAVA_PELES_LAKE, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks lavaSearingGorge = new DecorativeBlocks(Names.Blocks.LAVA_SEARING_GORGE, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks lavaVolcano = new DecorativeBlocks(Names.Blocks.LAVA_SLUMBERING_VOLCANO, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);

    //Metal
    public static final DecorativeBlocks metalBatteredRobot = new DecorativeBlocks(Names.Blocks.METAL_BATTERED_ROBOT, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks metalBubbleGrip = new DecorativeBlocks(Names.Blocks.METAL_BUBBLE_GRIP, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks metalNeedlepointSteel = new DecorativeBlocks(Names.Blocks.METAL_NEEDLEPOINT_STEEL, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks metalRustedIronGrip = new DecorativeBlocks(Names.Blocks.METAL_RUSTED_IRON_GRIP, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks metalSeafoamTarnish = new DecorativeBlocks(Names.Blocks.METAL_SEAFOAM_TARNISH, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks metalStained = new DecorativeBlocks(Names.Blocks.METAL_STAINED, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);

    //Marble
    public static final DecorativeBlocks marbleBlack = new DecorativeBlocks(Names.Blocks.MARBLE_BLACK, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks marbleBlancoAurora = new DecorativeBlocks(Names.Blocks.MARBLE_BLANCO_AURORA, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks marbleBlancoNafin = new DecorativeBlocks(Names.Blocks.MARBLE_BLANCO_NAFIN, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks marbleSpottedBianco = new DecorativeBlocks(Names.Blocks.MARBLE_SPOTTED_BIANCO, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);

    //Cottage
    public static final DecorativeBlocks cottageWall = new DecorativeBlocks(Names.Blocks.COTTAGE_WALL, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks cottageWallArchedBeam = new DecorativeBlocks(Names.Blocks.COTTAGE_WALL_ARCHED_BEAM, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks cottageWallArchedBeamDark = new DecorativeBlocks(Names.Blocks.COTTAGE_WALL_ARCHED_BEAM_DARK, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks cottageWallDark = new DecorativeBlocks(Names.Blocks.COTTAGE_WALL_DARK, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks cottageWallPanelDark = new DecorativeBlocks(Names.Blocks.COTTAGE_WALL_PANEL_DARK, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks cottageWallPanelLight = new DecorativeBlocks(Names.Blocks.COTTAGE_WALL_PANEL_LIGHT, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks cottageWallXDark = new DecorativeBlocks(Names.Blocks.COTTAGE_WALL_X_DARK, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks cottageWallXLight = new DecorativeBlocks(Names.Blocks.COTTAGE_WALL_X_LIGHT, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks cottageWindowDark = new DecorativeBlocks(Names.Blocks.COTTAGE_WINDOW_DARK, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);
    public static final DecorativeBlocks cottageWindowLight = new DecorativeBlocks(Names.Blocks.COTTAGE_WINDOW_LIGHT, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS);

    //Concrete
    public static final BlockConcrete concrete = new BlockConcrete(Names.Blocks.CONCRETE, Material.rock, Reference.MADE_BY + Reference.LILRICHY);
    public static final DecorativeBlocks fancyConcreteBlocks = new DecorativeBlocks(Names.Blocks.FANCY_CONCRETE_BLOCKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY);
    public static final DecorativeBlocks concreteBricks = new DecorativeBlocks(Names.Blocks.CONCRETE_BRICKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY);
    public static final DecorativeBlocks concreteBricksDark = new DecorativeBlocks(Names.Blocks.CONCRETE_BRICKS_DARK, Material.rock, Reference.MADE_BY + Reference.LILRICHY);
    public static final DecorativeBlocks concreteRocks = new DecorativeBlocks(Names.Blocks.CONCRETE_ROCKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY);
    public static final DecorativeBlocks concreteTexturedBlocks = new DecorativeBlocks(Names.Blocks.CONCRETE_TEXTURED_BLOCKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY);
    public static final DecorativeBlocks oldConcreteSquares = new DecorativeBlocks(Names.Blocks.OLD_CONCRETE_SQUARES, Material.rock, Reference.MADE_BY + Reference.LILRICHY);
    public static final DecorativeBlocks concreteSquares = new DecorativeBlocks(Names.Blocks.CONCRETE_SQUARES, Material.rock, Reference.MADE_BY + Reference.LILRICHY);
    public static final DecorativeBlocks smallConcreteBricks = new DecorativeBlocks(Names.Blocks.SMALL_CONCRETE_BRICKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY);
    public static final DecorativeBlocks smallConcreteTexturedSquares = new DecorativeBlocks(Names.Blocks.SMALL_CONCRETE_TEXTURED_SQUARES, Material.rock, Reference.MADE_BY + Reference.LILRICHY);
    public static final DecorativeBlocks arrangedConcreteBricks = new DecorativeBlocks(Names.Blocks.ARRANGED_CONCRETE_BRICKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY);

    //Stone
    public static final DecorativeBlocks crackedStone = new DecorativeBlocks(Names.Blocks.CRACKED_STONE, Material.rock, Reference.MADE_BY + Reference.LILRICHY);
    public static final DecorativeBlocks arrangedStoneBricks = new DecorativeBlocks(Names.Blocks.ARRANGED_STONE_BRICKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY);

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
        //Testing



        //Custom Rendered Blocks
        GameRegistry.registerBlock(blockTable, Names.Models.BLOCK_TABLE);

        //Crops
        GameRegistry.registerBlock(beardedAzalea, CropItemBlock.class, Names.Crops.BEARDED_AZALEA);

        //Decorative Blocks---------------------------------------------------------------------------------------------

        //Lava
        GameRegistry.registerBlock(lavaBowl, DecorativeItemBlock.class, Names.Blocks.LAVA_BOWL);
        GameRegistry.registerBlock(lavaCracks, DecorativeItemBlock.class, Names.Blocks.LAVA_CRACKS);
        GameRegistry.registerBlock(lavaDeepFire, DecorativeItemBlock.class, Names.Blocks.LAVA_DEEP_FIRE);
        GameRegistry.registerBlock(lavaPelesLake, DecorativeItemBlock.class, Names.Blocks.LAVA_PELES_LAKE);
        GameRegistry.registerBlock(lavaSearingGorge, DecorativeItemBlock.class, Names.Blocks.LAVA_SEARING_GORGE);
        GameRegistry.registerBlock(lavaVolcano, DecorativeItemBlock.class, Names.Blocks.LAVA_SLUMBERING_VOLCANO);

        //Metal
        GameRegistry.registerBlock(metalBatteredRobot, DecorativeItemBlock.class, Names.Blocks.METAL_BATTERED_ROBOT);
        GameRegistry.registerBlock(metalBubbleGrip, DecorativeItemBlock.class, Names.Blocks.METAL_BUBBLE_GRIP);
        GameRegistry.registerBlock(metalNeedlepointSteel, DecorativeItemBlock.class, Names.Blocks.METAL_NEEDLEPOINT_STEEL);
        GameRegistry.registerBlock(metalRustedIronGrip, DecorativeItemBlock.class, Names.Blocks.METAL_RUSTED_IRON_GRIP);
        GameRegistry.registerBlock(metalSeafoamTarnish, DecorativeItemBlock.class, Names.Blocks.METAL_SEAFOAM_TARNISH);
        GameRegistry.registerBlock(metalStained, DecorativeItemBlock.class, Names.Blocks.METAL_STAINED);

        //Marble
        GameRegistry.registerBlock(marbleBlack, DecorativeItemBlock.class, Names.Blocks.MARBLE_BLACK);
        GameRegistry.registerBlock(marbleBlancoAurora, DecorativeItemBlock.class, Names.Blocks.MARBLE_BLANCO_AURORA);
        GameRegistry.registerBlock(marbleBlancoNafin, DecorativeItemBlock.class, Names.Blocks.MARBLE_BLANCO_NAFIN);
        GameRegistry.registerBlock(marbleSpottedBianco, DecorativeItemBlock.class, Names.Blocks.MARBLE_SPOTTED_BIANCO);

        //Cottage
        GameRegistry.registerBlock(cottageWall, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL);
        GameRegistry.registerBlock(cottageWallArchedBeam, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_ARCHED_BEAM);
        GameRegistry.registerBlock(cottageWallArchedBeamDark, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_ARCHED_BEAM_DARK);
        GameRegistry.registerBlock(cottageWallDark, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_DARK);
        GameRegistry.registerBlock(cottageWallPanelDark, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_PANEL_DARK);
        GameRegistry.registerBlock(cottageWallPanelLight, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_PANEL_LIGHT);
        GameRegistry.registerBlock(cottageWallXDark, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_X_DARK);
        GameRegistry.registerBlock(cottageWallXLight, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_X_LIGHT);
        GameRegistry.registerBlock(cottageWindowDark, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WINDOW_DARK);
        GameRegistry.registerBlock(cottageWindowLight, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WINDOW_LIGHT);

        //Concrete
        GameRegistry.registerBlock(concrete, DecorativeItemBlock.class, Names.Blocks.CONCRETE);
        GameRegistry.registerBlock(fancyConcreteBlocks, DecorativeItemBlock.class, Names.Blocks.FANCY_CONCRETE_BLOCKS);
        GameRegistry.registerBlock(concreteBricks, DecorativeItemBlock.class, Names.Blocks.CONCRETE_BRICKS);
        GameRegistry.registerBlock(concreteBricksDark, DecorativeItemBlock.class, Names.Blocks.CONCRETE_BRICKS_DARK);
        GameRegistry.registerBlock(concreteRocks, DecorativeItemBlock.class, Names.Blocks.CONCRETE_ROCKS);
        GameRegistry.registerBlock(concreteTexturedBlocks, DecorativeItemBlock.class, Names.Blocks.CONCRETE_TEXTURED_BLOCKS);
        GameRegistry.registerBlock(oldConcreteSquares, DecorativeItemBlock.class, Names.Blocks.OLD_CONCRETE_SQUARES);
        GameRegistry.registerBlock(concreteSquares, DecorativeItemBlock.class, Names.Blocks.CONCRETE_SQUARES);
        GameRegistry.registerBlock(smallConcreteBricks, DecorativeItemBlock.class, Names.Blocks.SMALL_CONCRETE_BRICKS);
        GameRegistry.registerBlock(smallConcreteTexturedSquares, DecorativeItemBlock.class, Names.Blocks.SMALL_CONCRETE_TEXTURED_SQUARES);
        GameRegistry.registerBlock(arrangedConcreteBricks, DecorativeItemBlock.class, Names.Blocks.ARRANGED_CONCRETE_BRICKS);

        //Stone
        GameRegistry.registerBlock(crackedStone, DecorativeItemBlock.class, Names.Blocks.CRACKED_STONE);
        GameRegistry.registerBlock(arrangedStoneBricks, DecorativeItemBlock.class, Names.Blocks.ARRANGED_STONE_BRICKS);

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
