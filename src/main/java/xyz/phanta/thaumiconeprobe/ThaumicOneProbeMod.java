package xyz.phanta.thaumiconeprobe;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ThaumicOneProbeMod.MOD_ID, version = ThaumicOneProbeMod.VERSION, useMetadata = true)
public class ThaumicOneProbeMod {

    public static final String MOD_ID = "thaumiconeprobe";
    public static final String VERSION = "1.0.0";

    @Mod.Instance(MOD_ID)
    public static ThaumicOneProbeMod INSTANCE;

    @SidedProxy(
            clientSide = "xyz.phanta.thaumiconeprobe.client.ClientProxy",
            serverSide = "xyz.phanta.thaumiconeprobe.CommonProxy")
    public static CommonProxy PROXY;

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        PROXY.onPreInit(event);
    }

    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        PROXY.onInit(event);
    }

    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent event) {
        PROXY.onPostInit(event);
    }

}
