package xyz.phanta.thaumiconeprobe;

import net.minecraftforge.common.config.Config;

@Config(modid = ThaumicOneProbeMod.MOD_ID)
public class ThaumicOneProbeConfig {

    @Config.Comment("Should the goggles of revealing be required to see Thaumcraft information?")
    public static boolean requireGoggles = true;

}
