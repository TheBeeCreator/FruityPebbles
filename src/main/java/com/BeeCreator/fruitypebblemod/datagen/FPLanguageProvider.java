package com.BeeCreator.fruitypebblemod.datagen;


import com.BeeCreator.fruitypebblemod.fruitypebblemod;
//import com.example.tutorialv3.manasystem.client.KeyBindings;
//import com.example.tutorialv3.manasystem.network.PacketGatherMana;
import com.BeeCreator.fruitypebblemod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.BeeCreator.fruitypebblemod.blocks.FPPowerGeneratorBlock.MESSAGE_POWERGEN;
import static com.BeeCreator.fruitypebblemod.blocks.FPPowerGeneratorBlock.SCREEN_TUTORIAL_POWERGEN;
import static com.BeeCreator.fruitypebblemod.setup.ModSetup.TAB_NAME;

public class FPLanguageProvider extends LanguageProvider {

    public FPLanguageProvider(DataGenerator gen, String locale) {
        super(gen, fruitypebblemod.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "Tutorial");
        add(MESSAGE_POWERGEN, "Power generator generating %s per tick!");
        //add(MESSAGE_GENERATOR, "Generate ores from ingots!");
        add(SCREEN_TUTORIAL_POWERGEN, "Power generator");

        /*
        add(Registration.GENERATOR.get(), "Generator");
        add(Registration.POWERGEN.get(), "Power generator");
        add(Registration.PORTAL_BLOCK.get(), "Mysterious Portal");
        */

        add(Registration.MYSTERIOUS_ORE_OVERWORLD.get(), "Mysterious ore");
        add(Registration.MYSTERIOUS_ORE_NETHER.get(), "Mysterious ore");
        add(Registration.MYSTERIOUS_ORE_END.get(), "Mysterious ore");
        add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get(), "Mysterious ore");

        add(Registration.RAW_MYSTERIOUS_CHUNK.get(), "Mysterious Raw Chunk");
        add(Registration.MYSTERIOUS_INGOT.get(), "Mysterious Ingot");

        /*
        add(Registration.THIEF_EGG.get(), "Thief Egg");

        add(Registration.THIEF.get(), "Thief");

        add(KeyBindings.KEY_CATEGORIES_TUTORIAL, "Tutorial Keys");
        add(KeyBindings.KEY_GATHER_MANA, "Gather Mana");
        add(PacketGatherMana.MESSAGE_NO_MANA, "No mana on this location");
        */
    }
}