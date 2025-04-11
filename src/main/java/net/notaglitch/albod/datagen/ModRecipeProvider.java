package net.notaglitch.albod.datagen;

import com.axperty.moredelight.registry.ItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.notaglitch.albod.block.AModBlocks;
import net.notaglitch.albod.item.AModItems;
import vectorwing.farmersdelight.common.registry.ModItems;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> GELATIN_POWDER = List.of(AModItems.RAW_GELATIN_BRICK);

        // Shaped Crafting
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, AModBlocks.BLUEBERRY_CHEESECAKE)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("MPM")
                .input('B', AModItems.BLUEBERRIES)
                .input('M', AModItems.MILK)
                .input('P', ModItems.PIE_CRUST.get())
                .criterion(hasItem(AModItems.BLUEBERRIES), conditionsFromItem(AModItems.BLUEBERRIES))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, AModBlocks.BLUEBERRY_PIE)
                .pattern("WWW")
                .pattern("BBB")
                .pattern("SPS")
                .input('B', AModItems.BLUEBERRIES)
                .input('W', Items.WHEAT)
                .input('S', Items.SUGAR)
                .input('P', ModItems.PIE_CRUST.get())
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, AModItems.BLUEBERRY_SCONE, 3)
                .pattern("WBW")
                .pattern("BWB")
                .pattern("EMS")
                .input('B', AModItems.BLUEBERRIES)
                .input('W', Items.WHEAT)
                .input('E', Items.EGG)
                .input('M', Items.MILK_BUCKET)
                .input('S', Items.SUGAR)
                .criterion(hasItem(AModItems.BLUEBERRIES), conditionsFromItem(AModItems.BLUEBERRIES))
                .offerTo(exporter);

        // Shapeless Crafting
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, AModItems.BLUEBERRY_COOKIE)
                .input(Items.WHEAT)
                .input(Items.WHEAT)
                .input(AModItems.BLUEBERRIES)
                .criterion(hasItem(AModItems.BLUEBERRIES), conditionsFromItem(AModItems.BLUEBERRIES))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemRegistry.TOAST_WITH_BLUEBERRIES)
                .input(AModItems.BLUEBERRIES)
                .input(ItemRegistry.TOAST)
                .criterion(hasItem(AModItems.BLUEBERRIES), conditionsFromItem(AModItems.BLUEBERRIES))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, AModItems.TOAST_WITH_BLUEBERRY_JELLY)
                .input(AModItems.BLUEBERRY_JELLY)
                .input(ItemRegistry.TOAST)
                .criterion(hasItem(AModItems.BLUEBERRIES), conditionsFromItem(AModItems.BLUEBERRIES))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, AModItems.BLUEBERRY_MILK)
                .input(AModItems.BLUEBERRY_SYRUP)
                .input(AModItems.MILK)
                .input(Items.GLASS_BOTTLE)
                .criterion(hasItem(AModItems.BLUEBERRIES), conditionsFromItem(AModItems.BLUEBERRIES))
                .offerTo(exporter);

        // Smelting Crafting
        offerSmelting(exporter, GELATIN_POWDER, RecipeCategory.FOOD, AModItems.GELATIN_POWDER, 0.3f, 300, "gelatin_powder");
    }
}
