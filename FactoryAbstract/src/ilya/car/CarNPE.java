package ilya.car;

import ilya.parts.engine.Engine;
import ilya.parts.print.Print;
import ilya.parts.wheels.Wheels;

public class CarNPE extends Car {
    public CarNPE() {
        name = "";
        body = "";
        engine = new Engine() {
            @Override
            public void getEngine() {

            }
        };
        print = new Print() {
            @Override
            public void getPrint() {

            }
        };
        wheels = new Wheels() {
            @Override
            public void getWheels() {

            }
        };
    }
}
