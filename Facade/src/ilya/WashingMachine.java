package ilya;

import ilya.actions.Drying;
import ilya.actions.PourWater;
import ilya.actions.Rotation;
import ilya.actions.WarmUp;

public class WashingMachine {
    private Drying drying;
    private PourWater pourWater;
    private Rotation rotation;
    private WarmUp warmUp;

    public WashingMachine() {
        this.drying = new Drying();
        this.pourWater = new PourWater();
        this.rotation = new Rotation();
        this.warmUp = new WarmUp();
    }

    public void wash(){
        pourWater.pourWater();
        warmUp.warmUp();
        rotation.rotation(800);
        pourWater.drain();
        pourWater.pourWater();
        warmUp.warmUp();
        rotation.rotation(1200);
        pourWater.drain();
        rotation.rotation(500);
        pourWater.drain();
        drying.drying();
    }
}
