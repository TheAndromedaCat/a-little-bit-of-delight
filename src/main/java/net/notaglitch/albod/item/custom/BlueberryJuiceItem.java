package net.notaglitch.albod.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;

public class BlueberryJuiceItem extends Item {
    public BlueberryJuiceItem(Settings settings) {
        super(settings);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

}
