package ilya.car;

import ilya.partsFactory.CarPartFactory;

public class Passat extends Car{

    public Passat(CarPartFactory carPartFactory) {
        name = "Passat";
        body = "Сидан";
        engine = carPartFactory.getEngine();
        print = carPartFactory.getPrint();
        wheels = carPartFactory.getWheels();
    }
}
