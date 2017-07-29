package ilya.factory;

import ilya.car.*;

public class SimpleFactory {

    public Car getCar(String type) {
        Car car = new Car();

        if (type.equals("Golf")) {
            car = new Golf();
        } else if (type.equals("Passat")) {
            car = new Passat();
        } else if (type.equals("Tiguan")) {
            car = new Tiguan();
        } else if (type.equals("Tuareg")) {
            car = new Tuareg();
        }

        car.assemblyBody();
        car.installEngine();
        car.paint();
        car.installWheels();

        return car;
    }
}
