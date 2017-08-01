package ilya.carFactory;

import ilya.car.*;
import ilya.partsFactory.CarPartFactory;
import ilya.partsFactory.DeutchCarPartFactory;

public class DeutchVolkswagen extends Volkswagen {
    @Override
    public Car getCar(String type) {
        CarPartFactory carPartFactory = new DeutchCarPartFactory();
        Car car = null;
        if (type.equals("Golf")) {
            car = new Golf(carPartFactory);
        } else if (type.equals("Passat")) {
            car = new Passat(carPartFactory);
        } else if (type.equals("Tiguan")) {
            car =  new Tiguan(carPartFactory);
        } else if (type.equals("Touareg")) {
            car =  new Touareg(carPartFactory);
        }
        car.configure();
        return car;
    }
}
