package ilya.partFactory;

import ilya.part.engine.BigEngine;
import ilya.part.engine.Engine;
import ilya.part.paint.BluePaint;
import ilya.part.paint.Paint;
import ilya.part.wheels.SmallWheels;
import ilya.part.wheels.Wheels;

public class RussianCarPartFactory extends CarPartFactory {
    @Override
    public Engine getEngine() {
        return new BigEngine();
    }

    @Override
    public Wheels getWheels() {
        return new SmallWheels();
    }

    @Override
    public Paint getPaint() {
        return new BluePaint();
    }
}
