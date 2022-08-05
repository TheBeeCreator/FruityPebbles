package com.BeeCreator.fruitypebblemod.datagen;

import com.BeeCreator.fruitypebblemod.fruitypebblemod;
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
            generator.addProvider(new FPRecipes(generator));
            generator.addProvider(new FPLootTables(generator));
            FPBlockTags blockTags = new FPBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new FPItemTags(generator, blockTags, event.getExistingFileHelper()));
            //generator.addProvider(new PRBiomeTags(generator, event.getExistingFileHelper()));
            //generator.addProvider(new PRStructureSetTags(generator, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new FPBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new FPItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new FPLanguageProvider(generator, "en_us"));
        }
    }
}