package az.kyprak_dll.noscoreboard;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class AE extends AD{


    private static double AAA = 0.5;
    private final double AAB = 0.3;
    public AE(int AB) {
        super(AB);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static void setAAA(double AAA) {
        AE.AAA = AAA;
    }


    @Override
    public void AA() {
        this.AC = true;
    }

    @Override
    public void AB() {
        this.AC = false;
    }

    @SubscribeEvent
    public void AAE(RenderPlayerEvent e) {
        Entity AAB = e.getEntity();
        if (e.getEntity() instanceof PlayerEntity && e.getEntity() != mc.player) {
            if (AA.AAA.get(0).isAC()) {
                AAB.setBoundingBox(new AxisAlignedBB(
                        AAB.getPosX() - AAA,
                        AAB.getBoundingBox().minY,
                        AAB.getPosZ() - AAA,
                        AAB.getPosX() + AAA,
                        AAB.getBoundingBox().maxY,
                        AAB.getPosZ() + AAA
                ));
            }
            else {
                AAB.setBoundingBox(new AxisAlignedBB(
                        AAB.getPosX() - this.AAB,
                        AAB.getBoundingBox().minY,
                        AAB.getPosZ() - this.AAB,
                        AAB.getPosX() + this.AAB,
                        AAB.getBoundingBox().maxY,
                        AAB.getPosZ() + this.AAB
                ));
            }
        }
    }
}
