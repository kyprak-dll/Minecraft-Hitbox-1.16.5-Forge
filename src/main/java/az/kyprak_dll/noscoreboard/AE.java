package az.kyprak_dll.noscoreboard;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class AE extends AD{


    private static double AAA = 0.5;
    private static final double AAB = 0.3;
    public AE(int AB) {
        super(AB);
    }

    public static void setAAA(double AAA) {
        AE.AAA = AAA;
    }

    @SubscribeEvent
    public void AAE(RenderPlayerEvent e) {
        Entity AAB = e.getEntity();
        if (e.getEntity() instanceof PlayerEntity && e.getEntity() != mc.player) {
            AxisAlignedBB bb = AAB.getBoundingBox();
            if (this.AC) {
                AAB.setBoundingBox(new AxisAlignedBB(
                        AAB.getPosX() - AAA,
                        bb.minY,
                        AAB.getPosZ() - AAA,
                        AAB.getPosX() + AAA,
                        bb.maxY,
                        AAB.getPosZ() + AAA
                ));
            }
            else {
                AAB.setBoundingBox(new AxisAlignedBB(
                        AAB.getPosX() - AE.AAB,
                        bb.minY,
                        AAB.getPosZ() - AE.AAB,
                        AAB.getPosX() + AE.AAB,
                        bb.maxY,
                        AAB.getPosZ() + AE.AAB
                ));
            }
        }
    }

    @Override
    public void AB() {
    }
}
