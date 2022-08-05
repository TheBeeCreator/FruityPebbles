package com.BeeCreator.fruitypebblemod.setup;

import com.BeeCreator.fruitypebblemod.Client.FPPowerGeneratorScreen;
import com.BeeCreator.fruitypebblemod.fruitypebblemod;
//import com.BeeCreator.fruitypebblemod.client.GeneratorModelLoader;
//import com.BeeCreator.fruitypebblemod.client.PowergenRenderer;
//import com.BeeCreator.fruitypebblemod.client.PowergenScreen;
//import com.BeeCreator.fruitypebblemod.entities.ThiefModel;
//import com.BeeCreator.fruitypebblemod.entities.ThiefRenderer;
//import com.BeeCreator.fruitypebblemod.manasystem.client.KeyBindings;
//import com.BeeCreator.fruitypebblemod.manasystem.client.KeyInputHandler;
//import com.BeeCreator.fruitypebblemod.manasystem.client.ManaOverlay;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = fruitypebblemod.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {

    public static void init(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(Registration.POWERGEN_CONTAINER.get(), FPPowerGeneratorScreen::new);
            //ItemBlockRenderTypes.setRenderLayer(Registration.POWERGEN.get(), RenderType.translucent());
            //PowergenRenderer.register();
        });
        //MinecraftForge.EVENT_BUS.addListener(KeyInputHandler::onKeyInput);
        //KeyBindings.init();
        //OverlayRegistry.registerOverlayAbove(HOTBAR_ELEMENT, "name", ManaOverlay.HUD_MANA);
    }
    /*

    @SubscribeEvent
    public static void onModelRegistryEvent(ModelRegistryEvent event) {
        ModelLoaderRegistry.registerLoader(GeneratorModelLoader.GENERATOR_LOADER, new GeneratorModelLoader());
    }

    @SubscribeEvent
    public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ThiefModel.THIEF_LAYER, ThiefModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void onRegisterRenderer(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(Registration.THIEF.get(), ThiefRenderer::new);
    }

    @SubscribeEvent
    public static void onTextureStitch(TextureStitchEvent.Pre event) {
        if (!event.getAtlas().location().equals(TextureAtlas.LOCATION_BLOCKS)) {
            return;
        }
        event.addSprite(PowergenRenderer.HALO);
    }
    */
}