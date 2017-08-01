package ilya.partsFactory;

import ilya.parts.engine.Engine;
import ilya.parts.engine.LowVolumeEngine;
import ilya.parts.print.Print;
import ilya.parts.print.RadPrint;
import ilya.parts.wheels.BigWheels;
import ilya.parts.wheels.Wheels;

public class DeutchCarPartFactory extends CarPartFactory {

    @Override
    public Engine getEngine() {
        return new LowVolumeEngine();
    }

    @Override
    public Print getPrint() {
        return new RadPrint();
    }

    @Override
    public Wheels getWheels() {
        return new BigWheels();
    }
}
