package com.github.telvarost.nowobtainablerecipes.events.init;

import com.github.telvarost.nowobtainablerecipes.Config;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.mine_diver.unsafeevents.listener.ListenerPriority;
import net.minecraft.block.BlockBase;
import net.minecraft.item.Block;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeRegistry;
import net.minecraft.recipe.SmeltingRecipeRegistry;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.recipe.CraftingRegistry;
import net.modificationstation.stationapi.api.recipe.FuelRegistry;
import net.modificationstation.stationapi.api.recipe.SmeltingRegistry;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.List;

public class RecipeListener {

    @EventListener
    public void registerRecipes(RecipeRegisterEvent event) {
        Identifier type = event.recipeId;

        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPED.type()) {
            if (Config.config.enableCobwebRecipe) {
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.COBWEB.asItem(), 1), "X X", " X ", "X X", 'X', ItemBase.string);
            }

            if (Config.config.enableCoalOreRecipes) {
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.COAL_ORE.asItem(), 1), "XXX", "XYX", "XXX", 'X', BlockBase.STONE, 'Y', ItemBase.coal);
            }

            if (Config.config.enableRedstoneOreRecipe) {
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.REDSTONE_ORE.asItem(), 1), "XYX", "YYY", "XYX", 'X', BlockBase.STONE, 'Y', ItemBase.redstoneDust);
            }

            if (Config.config.enableLapisOreRecipe) {
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.LAPIS_LAZULI_ORE.asItem(), 1), "XYX", "YYY", "XYX", 'X', BlockBase.STONE, 'Y', new ItemInstance(ItemBase.dyePowder, 1, 4));
            }

            if (Config.config.enableIronOreRecipe) {
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.IRON_ORE.asItem(), 1), "XXX", "XYX", "XXX", 'X', BlockBase.STONE, 'Y', ItemBase.ironIngot);
            }

            if (Config.config.enableGoldOreRecipe) {
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.GOLD_ORE.asItem(), 1), "XXX", "XYX", "XXX", 'X', BlockBase.STONE, 'Y', ItemBase.goldIngot);
            }

            if (Config.config.enableDiamondOreRecipe) {
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockBase.DIAMOND_ORE.asItem(), 1), "XXX", "XYX", "XXX", 'X', BlockBase.STONE, 'Y', ItemBase.diamond);
            }
        }

        if (type == RecipeRegisterEvent.Vanilla.SMELTING.type()) {
            if (Config.config.enableCoalOreRecipes) {
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockBase.COAL_ORE.asItem(), 1), new ItemInstance(ItemBase.coal, 1));
            }

            if (Config.config.enableRedstoneOreRecipe) {
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockBase.REDSTONE_ORE.asItem(), 1), new ItemInstance(ItemBase.redstoneDust, 1));
            }

            if (Config.config.enableLapisOreRecipe) {
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockBase.LAPIS_LAZULI_ORE.asItem(), 1), new ItemInstance(ItemBase.dyePowder, 1, 4));
            }
        }

        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPELESS.type()) {
            if (Config.config.enableDeadBushRecipe) {
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockBase.DEADBUSH.asItem(), 1), BlockBase.SAPLING, BlockBase.FIRE);
            }

            if (Config.config.enableFireRecipe) {
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockBase.FIRE.asItem(), 3), ItemBase.flintAndSteel);
            }

            if (Config.config.enableGrassRecipe) {
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockBase.GRASS.asItem(), 1), BlockBase.DIRT, ItemBase.seeds);
            }

            if (Config.config.enableAppleRecipe) {
                CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemBase.apple, 1), ItemBase.sugar, ItemBase.seeds, new ItemInstance(ItemBase.dyePowder, 1, 1), BlockBase.SAPLING);
            }
       }
    }
}