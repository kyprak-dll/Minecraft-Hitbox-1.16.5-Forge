package az.kyprak_dll.noscoreboard;

import net.minecraft.client.Minecraft;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("noscoreboard")
public class AC {

    private static final boolean II = false;
    public AC() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new AB());

    }

    private void setup(final FMLCommonSetupEvent event) {
        AA.AAC();
    }

    public static void KK() {
        final Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) return;
        mc.player.playSound(SoundEvents.ENTITY_VILLAGER_CELEBRATE, 5f, 1f);
    }

    public static void KP() {
        final Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) return;
        mc.player.playSound(SoundEvents.ENTITY_VILLAGER_DEATH, 5f, 1f);
    }

    public static boolean II() {
        return II;
    }
}
