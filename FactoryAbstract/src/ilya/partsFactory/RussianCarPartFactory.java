package ilya.partsFactory;

import ilya.parts.engine.Engine;
import ilya.parts.engine.LargeVolumeEngine;
import ilya.parts.print.BluePrint;
import ilya.parts.print.Print;
import ilya.parts.wheels.SmallWheels;
import ilya.parts.wheels.Wheels;

public class RussianCarPartFactory extends CarPartFactory{

    @Override
    public Engine getEngine() {
        return new LargeVolumeEngine();
    }

    @Override
    public Print getPrint() {
        return new BluePrint();
    }

    @Override
    public Wheels getWheels() {
        return new SmallWheels();
    }
}
