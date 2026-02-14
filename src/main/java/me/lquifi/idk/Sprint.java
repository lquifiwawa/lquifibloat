package me.lquifi.idk;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class Sprint {
    
    private static final Minecraft mc = Minecraft.getMinecraft();

    @SubscribeEvent
    public void onPreUpdate(TickEvent.ClientTickEvent event) {
        if (mc.thePlayer != null) {KeyBinding.setKeyBindState(mc.gameSettings.keyBindSprint.getKeyCode(), true);}
    }
}
