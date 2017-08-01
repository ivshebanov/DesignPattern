package ilya.car;

import ilya.part.engine.Engine;
import ilya.part.paint.Paint;
import ilya.part.wheels.Wheels;

public abstract class Car {
    protected String name;
    protected String body;
    protected Engine engine;
    protected Wheels wheels;
    protected Paint paint;

    public void configure() {
        System.out.println("Автомобиль " + name);
        System.out.println("Тип кузова " + body);
        engine.getEngine();
        wheels.getWheels();
        paint.getPaint();
        System.out.println("_____________________");
    }

}
