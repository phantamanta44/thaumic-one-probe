package xyz.phanta.thaumiconeprobe.client;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import xyz.phanta.thaumiconeprobe.CommonProxy;
import xyz.phanta.thaumiconeprobe.ThaumicOneProbeMod;

public class ClientProxy extends CommonProxy {

    @Override
    public void onPreInit(FMLPreInitializationEvent event) {
        super.onPreInit(event);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equals(ThaumicOneProbeMod.MOD_ID)) {
            ConfigManager.sync(ThaumicOneProbeMod.MOD_ID, Config.Type.INSTANCE);
        }
    }

}
