package ilya.carFactory;

import ilya.car.*;
import ilya.partsFactory.CarPartFactory;
import ilya.partsFactory.RussianCarPartFactory;

public class RussianVolkswagen extends Volkswagen {

    @Override
    public Car getCar(String type) {
        CarPartFactory carPartFactory = new RussianCarPartFactory();

        Car car = new Car() {
            @Override
            public void configure() {
                super.configure();
            }
        };
        if (type.equals("Golf")) {
            car = new Golf(carPartFactory);
        } else if (type.equals("Passat")) {
            car = new Passat(carPartFactory);
        } else if (type.equals("Tiguan")) {
            car = new Tiguan(carPartFactory);
        } else if (type.equals("Touareg")) {
            car = new Touareg(carPartFactory);
        }
        car.configure();
        return car;
    }
}
