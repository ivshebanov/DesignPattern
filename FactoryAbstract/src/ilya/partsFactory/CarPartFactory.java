package ilya.partsFactory;

import ilya.parts.engine.Engine;
import ilya.parts.print.Print;
import ilya.parts.wheels.Wheels;

public abstract class CarPartFactory {
    public abstract Engine getEngine();
    public abstract Print getPrint();
    public abstract Wheels getWheels();
}
