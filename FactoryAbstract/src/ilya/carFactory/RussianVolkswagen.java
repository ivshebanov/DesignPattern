package ilya.carFactory;

import ilya.car.*;
import ilya.partsFactory.CarPartFactory;
import ilya.partsFactory.RussianCarPartFactory;

public class RussianVolkswagen extends Volkswagen {

    @Override
    public Car getCar(String type) {
        CarPartFactory carPartFactory = new RussianCarPartFactory();

        if (type.equals("Golf")) {
            return new Golf(carPartFactory);
        } else if (type.equals("Passat")) {
            return new Passat(carPartFactory);
        } else if (type.equals("Tiguan")) {
            return new Tiguan(carPartFactory);
        } else if (type.equals("Touareg")) {
            return new Touareg(carPartFactory);
        }
        return null;
    }
}
