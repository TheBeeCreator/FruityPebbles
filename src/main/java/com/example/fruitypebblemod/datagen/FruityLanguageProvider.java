package com.example.fruitypebblemod.datagen;


import com.example.fruitypebblemod.fruitypebblemod;
import com.example.fruitypebblemod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import static com.example.fruitypebblemod.setup.ModSetup.TAB_NAME;

import static com.example.fruitypebblemod.setup.ModSetup.TAB_NAME;

public class FruityLanguageProvider extends LanguageProvider {

    public FruityLanguageProvider(DataGenerator gen, String locale) {
        super(gen, fruitypebblemod.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "Tutorial");

        add(Registration.MYSTERIOUS_ORE_OVERWORLD.get(), "Mysterious ore");
        add(Registration.MYSTERIOUS_ORE_NETHER.get(), "Mysterious ore");
        add(Registration.MYSTERIOUS_ORE_END.get(), "Mysterious ore");
        add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get(), "Mysterious ore");
    }
}