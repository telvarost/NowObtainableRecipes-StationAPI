package com.github.telvarost.nowobtainablerecipes;

import net.glasslauncher.mods.api.gcapi.api.ConfigName;
import net.glasslauncher.mods.api.gcapi.api.GConfig;

public class Config {

    @GConfig(value = "config", visibleName = "NowObtainableRecipes Config")
    public static ConfigFields config = new ConfigFields();

    public static class ConfigFields {

//        @ConfigName("Player Crafting Grid Can Be Used As Inventory Slots")
//        public static Boolean allowCraftingInventorySlots = true;
    }
}
