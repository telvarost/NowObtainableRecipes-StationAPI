package com.github.telvarost.nowobtainablerecipes;

import blue.endless.jankson.Comment;
import net.glasslauncher.mods.api.gcapi.api.*;

public class Config {

    @GConfig(value = "config", visibleName = "NowObtainableRec...")
    public static ConfigFields config = new ConfigFields();

    public static class ConfigFields {
        @ConfigName("Enable Apple Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public static Boolean enableAppleRecipe = true;

        @ConfigName("Enable Cobweb Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public static Boolean enableCobwebRecipe = true;

        @ConfigName("Enable Coal Ore Recipes")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public static Boolean enableCoalOreRecipes = true;

        @ConfigName("Enable Redstone Ore Recipes")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public static Boolean enableRedstoneOreRecipe = true;

        @ConfigName("Enable Lapis Lazuli Ore Recipes")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public static Boolean enableLapisOreRecipe = true;

        @ConfigName("Enable Iron Ore Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public static Boolean enableIronOreRecipe = true;

        @ConfigName("Enable Gold Ore Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public static Boolean enableGoldOreRecipe = true;

        @ConfigName("Enable Diamond Ore Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public static Boolean enableDiamondOreRecipe = true;

        @ConfigName("Enable Fire Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public static Boolean enableFireRecipe = true;

        @ConfigName("Enable Grass Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public static Boolean enableGrassRecipe = true;
    }
}
