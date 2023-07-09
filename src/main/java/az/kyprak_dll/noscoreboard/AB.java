package az.kyprak_dll.noscoreboard;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.gui.ForgeIngameGui;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AB {

    private final List<Integer> B = new ArrayList<>();
    private final List<Integer> L = Arrays.asList(341, 340, 80);
    private final Minecraft mc = Minecraft.getInstance();
    private boolean D = true;
    @SubscribeEvent
    public void AAA(InputEvent.KeyInputEvent e) {
        try {
            if (e.getAction() != 1) return;
            if (mc.currentScreen instanceof ChatScreen) return;
            if (e.getKey() == 93) {
                D = !D;
                ForgeIngameGui.renderObjective = D;
            }
            if (AA.getAAB()) {
                AA.AAB(e.getKey());
            }
            if (!L.contains(e.getKey())) B.clear();
            else if (e.getKey() == 341) {
                B.add(e.getKey());
            }
            else if (B.size() == 1 && e.getKey() == 340 && B.contains(341)) {
                B.add(e.getKey());
            }
            else if (B.size() == 2 && e.getKey() == 80 && B.contains(341) && B.contains(340)) {
                AA.AAA();
                B.clear();
            }
        } catch (Exception ex){
            AC.KK();
            if (AC.II()) {
                ex.printStackTrace();
            }
        }
    }
    @SubscribeEvent
    public void AAE(ClientChatEvent e) {
        try {
            if (mc.player == null) return;
            if (!AA.getAAB()) return;
            if (!e.getMessage().startsWith(".")) return;
            e.setCanceled(true);
            e.setResult(Event.Result.DENY);
            String[] F = e.getMessage().substring(1).split(" ");
            if (F[0].equalsIgnoreCase(AAD("ijucpy"))) {
                if (F.length < 2) {
                    if (mc.player != null) {
                        AC.KP();
                    }
                    return;
                }
                try {
                    AE.setAAA(Double.parseDouble(F[1]));
                    if (mc.player != null) {
                        AC.KK();
                    }
                } catch (Exception ex) {
                    if (mc.player != null) {
                        AC.KP();
                        if (AC.II()) {
                            ex.printStackTrace();
                        }
                    }
                }
            } else if (F[0].equalsIgnoreCase(AAD("ljmmbvsb"))) {
                if (F.length < 2) {
                    if (mc.player != null) {
                        AC.KP();
                    }
                    return;
                }
                String K = F[1];
                try {
                    if (mc.world == null) {
                        AC.KP();
                        return;
                    }
                    if (mc.world.getPlayers().stream().map(p -> p.getGameProfile().getName()).noneMatch(p -> p.equalsIgnoreCase(K))) {
                        AC.KP();
                        return;
                    }
                    PlayerEntity p = mc.world.getPlayers().stream().filter(s -> s.getGameProfile().getName().equalsIgnoreCase(K)).findFirst().orElse(null);
                    if (p == null) {
                        AC.KP();
                        return;
                    }
                    if (AF.G().contains(p)) {
                        AF.G().remove(p);
                        mc.player.playSound(SoundEvents.ENTITY_VILLAGER_NO, 5f, 1f);
                    }
                    else {
                        AF.G().add(p);
                        mc.player.playSound(SoundEvents.ENTITY_VILLAGER_YES, 5f, 1f);
                    }
                } catch (Exception ex) {
                    AC.KP();
                    if (AC.II()) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (Exception ex){
            if (mc.player != null) {
                AC.KP();
            }
            if (AC.II()) {
                ex.printStackTrace();
            }
        }
    }

    private String AAC(String F) {
        try {
            StringBuilder G = new StringBuilder();
            for (char c : F.toCharArray()) {
                if (c == ' ') {
                    G.append(' ');
                } else {
                    G.append((char) (c + 1));
                }
            }
            return G.toString();
        } catch (Exception e) {
            return null;
        }
    }
    private String AAD(String F) {
        try {
            StringBuilder G = new StringBuilder();
            for (char c : F.toCharArray()) {
                if (c == ' ') {
                    G.append(' ');
                } else {
                    G.append((char) (c - 1));
                }
            }
            return G.toString();
        } catch (Exception e) {
            return null;
        }
    }
}
