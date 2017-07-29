package ilya.facilities;

import ilya.car.Car;
import ilya.factory.SimpleFactory;

public class Volkswagen {
    private SimpleFactory simpleFactory;
    private Car car;

    public Volkswagen(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public void getCar(String type) {
        this.car = simpleFactory.getCar(type);
        System.out.println("");
        this.car.configure();
        System.out.println("");
    }
}
