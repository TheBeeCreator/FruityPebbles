package com.example.fruitypebblemod.datagen;

import com.example.fruitypebblemod.fruitypebblemod;
import com.example.fruitypebblemod.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class FruityItemTags extends ItemTagsProvider {

    public FruityItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, fruitypebblemod.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(Registration.MYSTERIOUS_ORE_OVERWORLD_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_NETHER_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_END_ITEM.get())
                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE_ITEM.get());
    }

    @Override
    public String getName() {
        return "Tutorial Tags";
    }
}