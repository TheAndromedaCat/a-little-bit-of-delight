package net.notaglitch.albod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.World;
import net.notaglitch.albod.util.AModTags;
import vectorwing.farmersdelight.common.item.MilkBottleItem;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.ArrayList;
import java.util.Iterator;

public class BlueberryMilkItem extends MilkBottleItem {
    public BlueberryMilkItem(Settings properties) {
        super(properties);
    }

    @Override
    public void affectConsumer(ItemStack stack, World level, LivingEntity consumer) {
        Iterator<StatusEffectInstance> itr = consumer.getStatusEffects().iterator();
        ArrayList<RegistryEntry<StatusEffect>> compatibleEffects = new ArrayList<>();

        while (itr.hasNext()) {
            StatusEffectInstance effect = itr.next();
            if (!effect.getEffectType().isIn(AModTags.MILK_BOTTLE_IGNORED)) {
                compatibleEffects.add(effect.getEffectType());
            }
        }

        if (!compatibleEffects.isEmpty()) {
            StatusEffectInstance selectedEffect = consumer.getStatusEffect(compatibleEffects.get(level.random.nextInt(compatibleEffects.size())));
            if (selectedEffect != null) {
                consumer.removeStatusEffect(selectedEffect.getEffectType());
            }
        }
    }

}
