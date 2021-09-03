package xyz.phanta.thaumiconeprobe;

import mcjty.theoneprobe.TheOneProbe;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import xyz.phanta.thaumiconeprobe.element.AspectElement;
import xyz.phanta.thaumiconeprobe.provider.ThaumHighlightInfoProvider;

public class CommonProxy {

    private int ELEM_ID_ASPECT = -1;

    public int getAspectElementId() {
        if (ELEM_ID_ASPECT == -1) {
            throw new IllegalStateException("Aspect element is not yet registered!");
        }
        return ELEM_ID_ASPECT;
    }

    public void onPreInit(FMLPreInitializationEvent event) {
        // NO-OP
    }

    public void onInit(FMLInitializationEvent event) {
        // NO-OP
    }

    public void onPostInit(FMLPostInitializationEvent event) {
        ELEM_ID_ASPECT = TheOneProbe.theOneProbeImp.registerElementFactory(new AspectElement.Factory());
        TheOneProbe.theOneProbeImp.registerProvider(new ThaumHighlightInfoProvider());
    }

}
