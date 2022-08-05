package com.BeeCreator.fruitypebblemod;

import com.BeeCreator.fruitypebblemod.setup.ClientSetup;
import com.BeeCreator.fruitypebblemod.setup.Config;
import com.BeeCreator.fruitypebblemod.setup.ModSetup;
import com.BeeCreator.fruitypebblemod.setup.Registration;
import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(fruitypebblemod.MODID)
public class fruitypebblemod
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "fruitypebblemod";

    public fruitypebblemod()
    {

        // Register the deferred registry
        ModSetup.setup();
        Registration.init();
        Config.register();

        // Register the setup method for modloading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register 'ModSetup::init' to be called at mod setup time (server and client)
        modbus.addListener(ModSetup::init);
        // Register 'ClientSetup::init' to be called at mod setup time (client only)
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
    }
}