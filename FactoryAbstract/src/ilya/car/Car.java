package ilya.car;

import ilya.parts.engine.Engine;
import ilya.parts.print.Print;
import ilya.parts.wheels.Wheels;

public abstract class Car {
    protected String name = "";
    protected String body = "";
    protected Engine engine;
    protected Print print;
    protected Wheels wheels;

    public void configure(){
        System.out.format("Автомобиль %s \n", this.name);
        System.out.format("Тип кузова %s \n", this.body);
        engine.getEngine();
        print.getPrint();
        wheels.getWheels();
        System.out.println("---------------------------");
    }
}
