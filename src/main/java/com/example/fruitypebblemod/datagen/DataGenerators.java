package com.example.fruitypebblemod.datagen;

import com.example.fruitypebblemod.fruitypebblemod;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = fruitypebblemod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new FruityRecipes(generator));
            generator.addProvider(new FruityLootTables(generator));
            FruityBlockTags blockTags = new FruityBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new FruityItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new FruityBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new FruityItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new FruityLanguageProvider(generator, "en_us"));
        }
    }
}