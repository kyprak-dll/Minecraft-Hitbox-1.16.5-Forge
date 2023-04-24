package az.kyprak_dll.noscoreboard;

import net.minecraft.client.Minecraft;
import net.minecraft.util.SoundEvents;

import java.util.concurrent.CopyOnWriteArrayList;

public class AA {

    private static boolean AAB = false;


    public static CopyOnWriteArrayList<AD> AAA = new CopyOnWriteArrayList<>();
    private static Minecraft mc = Minecraft.getInstance();

    public static void AAC() {
        AAA.add(new AE(76));
    }
    public static boolean getAAB() {
        return AAB;
    }

    public static void AAA() {
        AAB = !AAB;
        if (AAB){
            if (mc.player != null) {
                mc.player.playSound(SoundEvents.ENTITY_VILLAGER_CELEBRATE, 1f, 1f);
            }
        }
        else {
            if (mc.player != null) {
                mc.player.playSound(SoundEvents.ENTITY_VILLAGER_HURT, 1f, 1f);
            }
            AAA.forEach(AD::AB);
        }
    }

    public static void AAB(int AAB) {
        for (AD K : AAA) {
            if (K.getAB() == AAB) {
                K.AC();
            }
        }
    }
}
