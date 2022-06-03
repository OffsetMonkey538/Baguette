package me.offsetmonkey538.baguette.items.baguettes;

import me.offsetmonkey538.baguette.config.JsonConfig;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class ChargedTntBaguette extends Baguette {

    public ChargedTntBaguette(Settings settings) {
        super(settings.food(FOOD_COMPONENT));
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient)
            world.createExplosion(user, user.getX(), user.getY(), user.getZ(), JsonConfig.getConfig().chargedTntBaguetteExplosionStrength(), Explosion.DestructionType.BREAK);

        return super.finishUsing(stack, world, user);
    }
}
