package ilya.carFactory;

import ilya.car.*;
import ilya.partsFactory.CarPartFactory;
import ilya.partsFactory.RussianCarPartFactory;

public class RussianVolkswagen extends Volkswagen {

    @Override
    public Car getCar(String type) {
        CarPartFactory carPartFactory = new RussianCarPartFactory();
        Car car = getTypeCar(type, carPartFactory);
        car.configure();
        return car;
    }
}
