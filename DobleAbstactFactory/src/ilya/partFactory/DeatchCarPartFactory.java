package ilya.partFactory;

import ilya.part.engine.Engine;
import ilya.part.engine.SmallEngine;
import ilya.part.paint.Paint;
import ilya.part.paint.RadPaint;
import ilya.part.wheels.BigWheels;
import ilya.part.wheels.Wheels;

public class DeatchCarPartFactory extends CarPartFactory {
    @Override
    public Engine getEngine() {
        return new SmallEngine();
    }

    @Override
    public Wheels getWheels() {
        return new BigWheels();
    }

    @Override
    public Paint getPaint() {
        return new RadPaint();
    }
}
