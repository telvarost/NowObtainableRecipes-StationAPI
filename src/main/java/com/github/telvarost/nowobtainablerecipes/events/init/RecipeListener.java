package com.github.telvarost.nowobtainablerecipes.events.init;

import com.github.telvarost.nowobtainablerecipes.Config;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.recipe.CraftingRegistry;
import net.modificationstation.stationapi.api.recipe.SmeltingRegistry;
import net.modificationstation.stationapi.api.util.Identifier;

public class RecipeListener {

    @EventListener
    public void registerRecipes(RecipeRegisterEvent event) {
        Identifier type = event.recipeId;

        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPED.type()) {
            if (Config.config.enableCobwebRecipe) {
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.COBWEB.asItem(), 1), "X X", " X ", "X X", 'X', Item.STRING);
            }

            if (Config.config.enableCoalOreRecipes) {
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.COAL_ORE.asItem(), 1), "XXX", "XYX", "XXX", 'X', Block.STONE, 'Y', Item.COAL);
            }

            if (Config.config.enableRedstoneOreRecipe) {
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.REDSTONE_ORE.asItem(), 1), "XYX", "YYY", "XYX", 'X', Block.STONE, 'Y', Item.REDSTONE);
            }

            if (Config.config.enableLapisOreRecipe) {
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.LAPIS_ORE.asItem(), 1), "XYX", "YYY", "XYX", 'X', Block.STONE, 'Y', new ItemStack(Item.DYE, 1, 4));
            }

            if (Config.config.enableIronOreRecipe) {
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.IRON_ORE.asItem(), 1), "XXX", "XYX", "XXX", 'X', Block.STONE, 'Y', Item.IRON_INGOT);
            }

            if (Config.config.enableGoldOreRecipe) {
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.GOLD_ORE.asItem(), 1), "XXX", "XYX", "XXX", 'X', Block.STONE, 'Y', Item.GOLD_INGOT);
            }

            if (Config.config.enableDiamondOreRecipe) {
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.DIAMOND_ORE.asItem(), 1), "XXX", "XYX", "XXX", 'X', Block.STONE, 'Y', Item.DIAMOND);
            }

            if (Config.config.enableSpongeRecipe) {
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.SPONGE.asItem(), 1), "XYX", "YZY", "XYX", 'X', Item.SLIMEBALL, 'Y', new ItemStack(Block.WOOL, 1, 4), 'Z', Item.BUCKET);
            }

            if (Config.config.enableSpongeRecipe) {
                CraftingRegistry.addShapedRecipe(new ItemStack(Block.NETHER_PORTAL.asItem(), 1), "XXX", "XYX", "XXX", 'X', Block.OBSIDIAN, 'Y', Block.FIRE);
            }
        }

        if (type == RecipeRegisterEvent.Vanilla.SMELTING.type()) {
            if (Config.config.enableCoalOreRecipes) {
                SmeltingRegistry.addSmeltingRecipe(new ItemStack(Block.COAL_ORE.asItem(), 1), new ItemStack(Item.COAL, 1));
            }

            if (Config.config.enableRedstoneOreRecipe) {
                SmeltingRegistry.addSmeltingRecipe(new ItemStack(Block.REDSTONE_ORE.asItem(), 1), new ItemStack(Item.REDSTONE, 1));
            }

            if (Config.config.enableLapisOreRecipe) {
                SmeltingRegistry.addSmeltingRecipe(new ItemStack(Block.LAPIS_ORE.asItem(), 1), new ItemStack(Item.DYE, 1, 4));
            }
        }

        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPELESS.type()) {
            if (Config.config.enableAppleRecipe) {
                CraftingRegistry.addShapelessRecipe(new ItemStack(Item.APPLE, 1), Item.SUGAR, Item.SEEDS, new ItemStack(Item.DYE, 1, 1), Block.SAPLING);
            }

            if (Config.config.enableDeadBushRecipe) {
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.DEAD_BUSH.asItem(), 1), Block.SAPLING, Block.FIRE);
            }

            if (Config.config.enableFireRecipe) {
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.FIRE.asItem(), 3), Item.FLINT_AND_STEEL);
            }

            if (Config.config.enableGrassRecipe) {
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.GRASS_BLOCK.asItem(), 1), Block.DIRT, Item.SEEDS);
            }

            if (Config.config.enableIceRecipes) {
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.ICE.asItem(), 1), Item.WATER_BUCKET, Block.SNOW_BLOCK, Block.SNOW_BLOCK);
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.ICE.asItem(), 2), Item.WATER_BUCKET, Block.SNOW_BLOCK, Block.SNOW_BLOCK, Item.WATER_BUCKET, Block.SNOW_BLOCK, Block.SNOW_BLOCK);
                CraftingRegistry.addShapelessRecipe(new ItemStack(Block.ICE.asItem(), 3), Item.WATER_BUCKET, Block.SNOW_BLOCK, Block.SNOW_BLOCK, Item.WATER_BUCKET, Block.SNOW_BLOCK, Block.SNOW_BLOCK, Item.WATER_BUCKET, Block.SNOW_BLOCK, Block.SNOW_BLOCK);
            }
       }
    }
}