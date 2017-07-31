package ilya.facilities;

import ilya.car.Car;
import ilya.factory.SimpleFactory;

public class Volkswagen {
    private SimpleFactory simpleFactory;

    public Volkswagen(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public void getCar(String type) {
        Car car = simpleFactory.getCar(type);
        System.out.println("");
        car.configure();
        System.out.println("");
    }
}
