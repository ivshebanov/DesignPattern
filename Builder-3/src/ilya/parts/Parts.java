package ilya.parts;

import ilya.parts.body.Body;
import ilya.parts.engine.Engine;
import ilya.parts.print.Print;
import ilya.parts.wheels.Wheels;

public class Parts {
    private Engine engine;
    private Print print;
    private Wheels wheels;
    private Body body;

    protected Parts(PartsBuilder patrsBuilder) {
        this.engine = patrsBuilder.engine;
        this.print = patrsBuilder.print;
        this.wheels = patrsBuilder.wheels;
        this.body = patrsBuilder.body;
    }

    public Engine getEngine() {
        engine.getEngine();
        return engine;
    }

    public Print getPrint() {
        print.getPrint();
        return print;
    }

    public Wheels getWheels() {
        wheels.getWheels();
        return wheels;
    }

    public Body getBody() {
        body.getBody();
        return body;
    }
}
