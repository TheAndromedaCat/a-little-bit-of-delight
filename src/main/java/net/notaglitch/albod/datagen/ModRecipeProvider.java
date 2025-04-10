package net.notaglitch.albod.datagen;

import com.mojang.datafixers.types.templates.Tag;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SmeltingRecipe;
import net.minecraft.recipe.SmokingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.notaglitch.albod.ALittleBitOfDelight;
import net.notaglitch.albod.block.AModBlocks;
import net.notaglitch.albod.item.AModItems;
import vectorwing.farmersdelight.common.crafting.CuttingBoardRecipeInput;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.integration.crafttweaker.handlers.CuttingBoardRecipeHandler;
import vectorwing.farmersdelight.integration.crafttweaker.managers.CuttingBoardRecipeManager;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> GELATIN_POWDER = List.of(AModItems.RAW_GELATIN_BRICK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, AModBlocks.BLUEBERRY_CHEESECAKE)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("MPM")
                .input('B', AModItems.BLUEBERRIES)
                .input('M', AModItems.MILK)
                .input('P', ModItems.PIE_CRUST.get())
                .criterion(hasItem(AModItems.BLUEBERRIES), conditionsFromItem(AModItems.BLUEBERRIES))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, AModItems.BLUEBERRY_COOKIE)
                .input(Items.WHEAT)
                .input(Items.WHEAT)
                .input(AModItems.BLUEBERRIES)
                .criterion(hasItem(AModItems.BLUEBERRIES), conditionsFromItem(AModItems.BLUEBERRIES))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AModItems.EMPTY_JAR)
                .pattern("   ")
                .pattern("G G")
                .pattern("GGG")
                .input('G', Items.GLASS)
                .criterion(hasItem(Items.GLASS), conditionsFromItem(Items.GLASS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AModBlocks.BLUEBERRY_CRATE)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .input('B', AModItems.BLUEBERRIES)
                .criterion(hasItem(AModItems.BLUEBERRIES), conditionsFromItem(AModItems.BLUEBERRIES))
                .offerTo(exporter);

        offerSmelting(exporter, GELATIN_POWDER, RecipeCategory.FOOD, AModItems.GELATIN_POWDER, 0.3f, 300, "gelatin_powder");
    }
}
