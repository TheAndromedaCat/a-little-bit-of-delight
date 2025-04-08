package net.notaglitch.albod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.notaglitch.albod.ALittleBitOfDelight;
import net.notaglitch.albod.block.AModBlocks;
import net.notaglitch.albod.item.AModItems;
import org.intellij.lang.annotations.Identifier;
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
        List<ItemConvertible> CRAFTING_RECIPES = List.of(AModItems.BLUEBERRIES, Items.MILK_BUCKET, ModItems.MILK_BOTTLE.get(), ModItems.PIE_CRUST.get());

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, AModBlocks.BLUEBERRY_CHEESECAKE)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("MPM")
                .input('B', AModItems.BLUEBERRIES)
                .input('M', Items.MILK_BUCKET)
                .input('P', ModItems.PIE_CRUST.get())
                .criterion(hasItem(AModItems.BLUEBERRIES),conditionsFromItem(AModItems.BLUEBERRIES))
                .offerTo(exporter);
        // Put Blueberry Cheesecake Slice recipe here for when I can figure that out.
    }
}
