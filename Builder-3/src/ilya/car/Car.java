package ilya.car;

import ilya.parts.body.Body;
import ilya.parts.engine.Engine;
import ilya.parts.print.Print;
import ilya.parts.wheels.Wheels;

public abstract class Car {
    protected String name;
    protected Body body;
    protected Print print;
    protected Engine engine;
    protected Wheels wheels;

    public abstract void getCar();
}
