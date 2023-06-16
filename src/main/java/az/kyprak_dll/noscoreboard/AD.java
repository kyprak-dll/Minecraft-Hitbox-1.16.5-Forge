package az.kyprak_dll.noscoreboard;

import net.minecraft.client.Minecraft;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.MinecraftForge;

public class AD {


    protected int AB;
    protected boolean AC;
    protected Minecraft mc = Minecraft.getInstance();
    public AD(int AB) {
        this.AB = AB;
        AC = false;
    }

    public int getAB() {
        return AB;
    }

    public boolean isAC() {
        return AC;
    }

    public void AC() {
        AC = !AC;
        if (AC){
            if (mc.player != null) {
                mc.player.playSound(SoundEvents.ENTITY_VILLAGER_CELEBRATE, 1f, 1f);
            }
            AA();
        }
        else {
            if (mc.player != null) {
                mc.player.playSound(SoundEvents.ENTITY_VILLAGER_HURT, 1f, 1f);
            }
            AB();
        }
    }
    public void AA() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void AB() {
        MinecraftForge.EVENT_BUS.unregister(this);
    }
}
