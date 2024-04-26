package com.github.telvarost.nowobtainablerecipes;

import blue.endless.jankson.Comment;
import net.glasslauncher.mods.api.gcapi.api.*;

public class Config {

    @GConfig(value = "config", visibleName = "NowObtainableRecipes")
    public static ConfigFields config = new ConfigFields();

    public static class ConfigFields {
        @ConfigName("Enable Apple Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableAppleRecipe = true;

        @ConfigName("Enable Cobweb Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableCobwebRecipe = true;

        @ConfigName("Enable Coal Ore Recipes")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableCoalOreRecipes = true;

        @ConfigName("Enable Dead Bush Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableDeadBushRecipe = true;

        @ConfigName("Enable Redstone Ore Recipes")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableRedstoneOreRecipe = true;

        @ConfigName("Enable Lapis Lazuli Ore Recipes")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableLapisOreRecipe = true;

        @ConfigName("Enable Iron Ore Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableIronOreRecipe = true;

        @ConfigName("Enable Gold Ore Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableGoldOreRecipe = true;

        @ConfigName("Enable Diamond Ore Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableDiamondOreRecipe = true;

        @ConfigName("Enable Fire Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableFireRecipe = true;

        @ConfigName("Enable Grass Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableGrassRecipe = true;

        @ConfigName("Enable Ice Recipes")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableIceRecipes = true;

        @ConfigName("Enable Sponge Recipe")
        @Comment("Restart required")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableSpongeRecipe = true;

        @ConfigName("Sponge Soaks Up Water")
        @Comment("Will soak up a 5x5 water cube when placed")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableSpongeSoaksUpWater = true;
    }
}
