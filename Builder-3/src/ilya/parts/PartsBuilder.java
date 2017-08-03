package ilya.parts;

import ilya.parts.body.Body;
import ilya.parts.engine.Engine;
import ilya.parts.print.Print;
import ilya.parts.wheels.Wheels;

public class PartsBuilder {
    protected Engine engine;
    protected Print print;
    protected Wheels wheels;
    protected Body body;

    private PartsBuilder() {}

    public static PartsBuilder getPartsBuilder(){
        return new PartsBuilder();
    }

    public Parts getParts() {
        return new Parts(this);
    }

    public PartsBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public PartsBuilder setPrint(Print print) {
        this.print = print;
        return this;
    }

    public PartsBuilder setWheels(Wheels wheels) {
        this.wheels = wheels;
        return this;
    }


    public PartsBuilder setBody(Body body) {
        this.body = body;
        return this;
    }
}
