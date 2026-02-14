package me.lquifi;

import me.lquifi.idk.Sprint;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "lqfibloat", useMetadata=true)
public class lquifibloat {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new Sprint());
    }
}
