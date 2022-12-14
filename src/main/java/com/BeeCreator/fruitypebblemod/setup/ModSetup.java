package com.BeeCreator.fruitypebblemod.setup;

import com.BeeCreator.fruitypebblemod.fruitypebblemod;
//import com.BeeCreator.fruitypebblemod.entities.ThiefEntity;
//import com.BeeCreator.fruitypebblemod.manasystem.data.ManaEvents;
//import com.BeeCreator.fruitypebblemod.worldgen.dimensions.Dimensions;
//import com.BeeCreator.fruitypebblemod.worldgen.ores.Ores;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = fruitypebblemod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModSetup {

    public static final String TAB_NAME = "tutorialv3";

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.DIAMOND);
        }
    };

    public static void setup() {
        IEventBus bus = MinecraftForge.EVENT_BUS;
        //bus.addListener(Ores::onBiomeLoadingEvent);
        //bus.addGenericListener(Entity.class, ManaEvents::onAttachCapabilitiesPlayer);
        //bus.addListener(ManaEvents::onPlayerCloned);
        //bus.addListener(ManaEvents::onRegisterCapabilities);
        //bus.addListener(ManaEvents::onWorldTick);
    }

    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            //Ores.registerConfiguredFeatures();
            //Dimensions.register();
        });
        //Messages.register();
    }

    @SubscribeEvent
    public static void onAttributeCreate(EntityAttributeCreationEvent event) {
        //event.put(Registration.THIEF.get(), ThiefEntity.prepareAttributes().build());
    }
}