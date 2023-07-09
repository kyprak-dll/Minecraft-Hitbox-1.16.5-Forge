package az.kyprak_dll.noscoreboard;

import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AF extends AD{
    public AF(int AB) {
        super(AB);
    }

    private static final List<PlayerEntity> G = new ArrayList<>();

    public static List<PlayerEntity> G() {
        return G;
    }
    @SubscribeEvent
    public void onRender(RenderWorldLastEvent e) {
        if (!this.AC) return;
        if (mc.player == null) return;
        if (mc.world == null) return;
        mc.world.getPlayers().stream().filter(playerEntity -> playerEntity != mc.player).filter(playerEntity -> mc.player.getDistance(playerEntity) <= 30).forEach(QP -> {
            if (!G.contains(QP)) return;
            AbstractClientPlayerEntity GF = mc.world.getPlayers().stream().filter(s -> s != QP).filter(s -> s.getDistance(QP) <= 5).min(Comparator.comparing(s -> s.getDistance(QP))).orElse(null);
            if (GF == null) return;
            float[] RR = AAL(GF, QP);
            QP.rotationYawHead = RR[0];
            QP.rotationYaw = RR[0];
            QP.rotationPitch = RR[1];
            if (QP.getCooledAttackStrength(0) != 1) return;
            QP.swingArm(Hand.MAIN_HAND);
            QP.resetCooldown();
            if (QP.isSprinting()) {
                mc.player.playSound(SoundEvents.ENTITY_PLAYER_ATTACK_KNOCKBACK, 1f, 1f);
            }
            else {
                mc.player.playSound(SoundEvents.ENTITY_PLAYER_ATTACK_NODAMAGE, 1f, 1f);
            }
        });

    }
    private float UU(double OQW) {
        return (float) Math.toDegrees(OQW);
    }

    private Vector3d YT(PlayerEntity AHF) {
        return AHF.getPositionVec();

    }
    public float[] AAL(PlayerEntity p, PlayerEntity t) {
        Vector3d O = YT(t).subtract(YT(p)).normalize();
        double x = O.getX();
        double y = O.getY();
        double z = O.getZ();
        return new float[] {180 - UU(Math.atan2(x, z)), 90 - UU(Math.acos(y))};
    }
}
