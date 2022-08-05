package com.example.fruitypebblemod.datagen;

import com.example.fruitypebblemod.fruitypebblemod;
import com.example.fruitypebblemod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class FruityBlockStates extends BlockStateProvider {

    public FruityBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, fruitypebblemod.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.MYSTERIOUS_ORE_OVERWORLD.get());
        simpleBlock(Registration.MYSTERIOUS_ORE_NETHER.get());
        simpleBlock(Registration.MYSTERIOUS_ORE_END.get());
        simpleBlock(Registration.MYSTERIOUS_ORE_DEEPSLATE.get());
    }
}