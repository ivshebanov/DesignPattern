package ilya.partFactory;

import ilya.part.engine.Engine;
import ilya.part.paint.Paint;
import ilya.part.wheels.Wheels;


public abstract class CarPartFactory {
    abstract public Engine getEngine();
    abstract public Wheels getWheels();
    abstract public Paint getPaint();
}
