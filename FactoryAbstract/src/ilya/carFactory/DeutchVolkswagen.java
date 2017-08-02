package ilya.carFactory;

import ilya.car.*;
import ilya.partsFactory.CarPartFactory;
import ilya.partsFactory.DeutchCarPartFactory;

public class DeutchVolkswagen extends Volkswagen {
    @Override
    public Car getCar(String type) {
        CarPartFactory carPartFactory = new DeutchCarPartFactory();
        Car car = getTypeCar(type, carPartFactory);
        car.configure();
        return car;
    }
}
