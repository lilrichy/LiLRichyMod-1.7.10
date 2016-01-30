package com.blogspot.richardreigens.lilrichymod.init;

import com.blogspot.richardreigens.lilrichymod.blocks.LiLRichyPane;
import com.blogspot.richardreigens.lilrichymod.blocks.decorativeBlocks.DecorativeItemBlock;
import com.blogspot.richardreigens.lilrichymod.blocks.decorativeBlocks.GlassBlocks;
import com.blogspot.richardreigens.lilrichymod.reference.Names;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by LiLRichy on 1/26/2016.
 */
public class ModBlocksGlass {
    //Glass Blocks
    public static final GlassBlocks CLEAR_GLASS_BLUE = new GlassBlocks(Names.Glass.CLEAR_GLASS_BLUE,
            Reference.MADE_BY + Reference.LILRICHY, Reference.GLASS_COLORS_CRAFT_TIP);
    public static final GlassBlocks CLEAR_GLASS_GREEN = new GlassBlocks(Names.Glass.CLEAR_GLASS_GREEN,
            Reference.MADE_BY + Reference.LILRICHY, Reference.GLASS_COLORS_CRAFT_TIP);
    public static final GlassBlocks CLEAR_GLASS_PINK = new GlassBlocks(Names.Glass.CLEAR_GLASS_PINK,
            Reference.MADE_BY + Reference.LILRICHY, Reference.GLASS_COLORS_CRAFT_TIP);
    public static final GlassBlocks CLEAR_GLASS_BROWN = new GlassBlocks(Names.Glass.CLEAR_GLASS_BROWN,
            Reference.MADE_BY + Reference.LILRICHY, Reference.GLASS_COLORS_CRAFT_TIP);

    public static final GlassBlocks FROSTY_GLASS_BLUE = new GlassBlocks(Names.Glass.FROSTY_GLASS_BLUE,
            Reference.MADE_BY + Reference.LILRICHY, Reference.GLASS_COLORS_CRAFT_TIP);
    public static final GlassBlocks FROSTY_GLASS_GREEN = new GlassBlocks(Names.Glass.FROSTY_GLASS_GREEN,
            Reference.MADE_BY + Reference.LILRICHY, Reference.GLASS_COLORS_CRAFT_TIP);
    public static final GlassBlocks FROSTY_GLASS_PURPLE = new GlassBlocks(Names.Glass.FROSTY_GLASS_PURPLE,
            Reference.MADE_BY + Reference.LILRICHY, Reference.GLASS_COLORS_CRAFT_TIP);

    //Glass Panes
    public static final LiLRichyPane CLEAR_GLASS_BLUE_PANE = new LiLRichyPane(Names.Glass.CLEAR_GLASS_BLUE_PANE,
            "clearGlassBlue", "clearGlassBlueTop", Material.glass, true);
    public static final LiLRichyPane CLEAR_GLASS_GREEN_PANE = new LiLRichyPane(Names.Glass.CLEAR_GLASS_GREEN_PANE,
            "clearGlassGreen", "clearGlassGreenTop", Material.glass, true);
    public static final LiLRichyPane CLEAR_GLASS_PINK_PANE = new LiLRichyPane(Names.Glass.CLEAR_GLASS_PINK_PANE,
            "clearGlassPink", "clearGlassPinkTop", Material.glass, true);
    public static final LiLRichyPane CLEAR_GLASS_BROWN_PANE = new LiLRichyPane(Names.Glass.CLEAR_GLASS_BROWN_PANE,
            "clearGlassBrown", "clearGlassBrownTop", Material.glass, true);

    public static final LiLRichyPane FROSTY_GLASS_BLUE_PANE = new LiLRichyPane(Names.Glass.FROSTY_GLASS_BLUE_PANE,
            "frostyGlassBlue", "clearGlassBlueTop", Material.glass, true);
    public static final LiLRichyPane FROSTY_GLASS_GREEN_PANE = new LiLRichyPane(Names.Glass.FROSTY_GLASS_GREEN_PANE,
            "frostyGlassGreen", "clearGlassGreenTop", Material.glass, true);
    public static final LiLRichyPane FROSTY_GLASS_PURPLE_PANE = new LiLRichyPane(Names.Glass.FROSTY_GLASS_PURPLE_PANE,
            "frostyGlassPurple", "clearGlassBlueTop", Material.glass, true);

    public static void init() {
        //Glass Blocks
        GameRegistry.registerBlock(CLEAR_GLASS_BLUE, DecorativeItemBlock.class, Names.Glass.CLEAR_GLASS_BLUE);
        OreDictionary.registerOre("blockGlass", CLEAR_GLASS_BLUE);
        GameRegistry.registerBlock(CLEAR_GLASS_GREEN, DecorativeItemBlock.class, Names.Glass.CLEAR_GLASS_GREEN);
        OreDictionary.registerOre("blockGlass", CLEAR_GLASS_GREEN);
        GameRegistry.registerBlock(CLEAR_GLASS_PINK, DecorativeItemBlock.class, Names.Glass.CLEAR_GLASS_PINK);
        OreDictionary.registerOre("blockGlass", CLEAR_GLASS_PINK);
        GameRegistry.registerBlock(CLEAR_GLASS_BROWN, DecorativeItemBlock.class, Names.Glass.CLEAR_GLASS_BROWN);
        OreDictionary.registerOre("blockGlass", CLEAR_GLASS_BROWN);

        GameRegistry.registerBlock(FROSTY_GLASS_BLUE, DecorativeItemBlock.class, Names.Glass.FROSTY_GLASS_BLUE);
        OreDictionary.registerOre("blockGlass", FROSTY_GLASS_BLUE);
        GameRegistry.registerBlock(FROSTY_GLASS_GREEN, DecorativeItemBlock.class, Names.Glass.FROSTY_GLASS_GREEN);
        OreDictionary.registerOre("blockGlass", FROSTY_GLASS_GREEN);
        GameRegistry.registerBlock(FROSTY_GLASS_PURPLE, DecorativeItemBlock.class, Names.Glass.FROSTY_GLASS_PURPLE);
        OreDictionary.registerOre("blockGlass", FROSTY_GLASS_PURPLE);

        //Glass Panes
        GameRegistry.registerBlock(CLEAR_GLASS_BLUE_PANE, Names.Glass.CLEAR_GLASS_BLUE_PANE);
        OreDictionary.registerOre(Names.OreDicNames.GLASS_PANE, CLEAR_GLASS_BLUE_PANE);
        GameRegistry.registerBlock(CLEAR_GLASS_GREEN_PANE, Names.Glass.CLEAR_GLASS_GREEN_PANE);
        OreDictionary.registerOre(Names.OreDicNames.GLASS_PANE, CLEAR_GLASS_GREEN_PANE);
        GameRegistry.registerBlock(CLEAR_GLASS_PINK_PANE, Names.Glass.CLEAR_GLASS_PINK_PANE);
        OreDictionary.registerOre(Names.OreDicNames.GLASS_PANE, CLEAR_GLASS_PINK_PANE);
        GameRegistry.registerBlock(CLEAR_GLASS_BROWN_PANE, Names.Glass.CLEAR_GLASS_BROWN_PANE);
        OreDictionary.registerOre(Names.OreDicNames.GLASS_PANE, CLEAR_GLASS_BROWN_PANE);

        GameRegistry.registerBlock(FROSTY_GLASS_BLUE_PANE, Names.Glass.FROSTY_GLASS_BLUE_PANE);
        OreDictionary.registerOre(Names.OreDicNames.GLASS_PANE, FROSTY_GLASS_BLUE_PANE);
        GameRegistry.registerBlock(FROSTY_GLASS_GREEN_PANE, Names.Glass.FROSTY_GLASS_GREEN_PANE);
        OreDictionary.registerOre(Names.OreDicNames.GLASS_PANE, FROSTY_GLASS_GREEN_PANE);
        GameRegistry.registerBlock(FROSTY_GLASS_PURPLE_PANE, Names.Glass.FROSTY_GLASS_PURPLE_PANE);
        OreDictionary.registerOre(Names.OreDicNames.GLASS_PANE, FROSTY_GLASS_PURPLE_PANE);
    }
}
