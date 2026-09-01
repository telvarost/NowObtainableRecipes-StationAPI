package com.github.telvarost.nowobtainablerecipes;

import net.glasslauncher.mods.gcapi3.api.*;

public class Config {

    @ConfigRoot(value = "config", visibleName = "NowObtainableRecipes")
    public static ConfigFields config = new ConfigFields();

    public static class ConfigFields {
        @ConfigEntry(
                name = "Enable Apple Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableAppleRecipe = true;

        @ConfigEntry(
                name = "Enable Cobweb Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableCobwebRecipe = true;

        @ConfigEntry(
                name = "Enable Coal Ore Crafting Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableCoalOreCraftingRecipe = true;

        @ConfigEntry(
                name = "Enable Coal Ore Furnace Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableCoalOreFurnaceRecipe = true;

        @ConfigEntry(
                name = "Enable Dead Bush Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableDeadBushRecipe = true;

        @ConfigEntry(
                name = "Enable Double Stone Slab Recipes",
                description = "Restart required",
                multiplayerSynced = true
        )
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean enableDoubleStoneSlabRecipe = true;

        @ConfigEntry(
                name = "Enable Redstone Ore Crafting Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableRedstoneOreCraftingRecipe = true;

        @ConfigEntry(
                name = "Redstone Ore Furnace Recipe Output",
                description = "Restart required; Use 0 to Disable",
                maxLength = 8,
                multiplayerSynced = true
        )
        public Integer redstoneOreFurnaceRecipeOutput = 4;

        @ConfigEntry(
                name = "Enable Lapis Lazuli Ore Crafting Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableLapisOreCraftingRecipe = true;

        @ConfigEntry(
                name = "Lapis Lazuli Ore Furnace Recipe Output",
                description = "Restart required; Use 0 to Disable",
                maxLength = 8,
                multiplayerSynced = true
        )
        public Integer lapisOreFurnaceRecipeOutput = 4;

        @ConfigEntry(
                name = "Enable Iron Ore Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableIronOreRecipe = true;

        @ConfigEntry(
                name = "Enable Gold Ore Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableGoldOreRecipe = true;

        @ConfigEntry(
                name = "Enable Diamond Ore Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableDiamondOreRecipe = true;

        @ConfigEntry(
                name = "Enable Fire Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableFireRecipe = true;

        @ConfigEntry(
                name = "Enable Grass Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableGrassRecipe = true;

        @ConfigEntry(
                name = "Enable Ice Recipes",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableIceRecipes = true;

        @ConfigEntry(
                name = "Enable Sponge Recipe",
                description = "Restart required",
                multiplayerSynced = true
        )
        public Boolean enableSpongeRecipe = true;

        @ConfigEntry(
                name = "Sponge Soaks Up Water",
                description = "Will soak up a 5x5 water cube when placed",
                multiplayerSynced = true
        )
        public Boolean enableSpongeSoaksUpWater = true;
    }
}
