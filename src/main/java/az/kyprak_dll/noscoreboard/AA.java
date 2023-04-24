package az.kyprak_dll.noscoreboard;

import java.util.concurrent.CopyOnWriteArrayList;

public class AA {

    private static boolean AAB = false;


    public static CopyOnWriteArrayList<AD> AAA = new CopyOnWriteArrayList<>();

    public static void AAC() {
        AAA.add(new AE(76));
    }
    public static boolean getAAB() {
        return AAB;
    }

    public static void AAA() {
        AAB = !AAB;
        if (!AAB) {
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
