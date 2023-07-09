package az.kyprak_dll.noscoreboard;

import net.minecraft.client.Minecraft;

import java.util.concurrent.CopyOnWriteArrayList;

public class AA {

    private static boolean AAB = false;


    public static CopyOnWriteArrayList<AD> AAA = new CopyOnWriteArrayList<>();
    private static final Minecraft mc = Minecraft.getInstance();

    public static void AAC() {
        AAA.add(new AE(76));
        AAA.add(new AF(44));
    }
    public static boolean getAAB() {
        return AAB;
    }

    public static void AAA() {
        AAB = !AAB;
        if (AAB){
            if (mc.player != null) {
                AC.KK();
            }
        }
        else {
            if (mc.player != null) {
                AC.KP();
            }
            AAA.forEach(AD::AB);
            AF.G().clear();
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
