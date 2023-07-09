package az.kyprak_dll.noscoreboard;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

public class AD {


    protected int AB;
    protected boolean AC = false;
    protected Minecraft mc = Minecraft.getInstance();
    public AD(int AB) {
        this.AB = AB;
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
                az.kyprak_dll.noscoreboard.AC.KK();
            }
            AA();
        }
        else {
            if (mc.player != null) {
                az.kyprak_dll.noscoreboard.AC.KP();
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
