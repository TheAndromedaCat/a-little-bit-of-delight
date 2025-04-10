package net.notaglitch.albod.mixin;

import io.github.lucaargolo.seasons.FabricSeasons;
import io.github.lucaargolo.seasons.utils.Season;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.notaglitch.albod.ALittleBitOfDelight;
import net.notaglitch.albod.block.custom.BlueberryBushBlock;

public class BlueberryBushBlockMixin extends BlueberryBushBlock {

    public BlueberryBushBlockMixin(Settings settings) {
        super(settings);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!ALittleBitOfDelight.SEASON_INSTALL){
super.randomTick(state, world, pos, random);
            return;
        }

        Season season = FabricSeasons.getCurrentSeason();
        if (season != Season.SUMMER && season != Season.FALL) return;
        int age = this.getAge(state);
        if (age < this.getMaxAge() - 1) super.randomTick(state, world, pos, random);
        else if (season == Season.FALL) super.randomTick(state, world, pos, random);
    }

    private int getMaxAge() {
        return (BlueberryBushBlock.MAX_AGE);
    }

    private int getAge(BlockState state) {
        return (state.get(BlueberryBushBlock.AGE));
    }

}
