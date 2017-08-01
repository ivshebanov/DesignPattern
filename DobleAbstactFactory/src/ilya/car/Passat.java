package ilya.car;

import ilya.partFactory.CarPartFactory;

public class Passat extends Car{
    public Passat(CarPartFactory carPartFactory) {
        name = "Passat";
        body = "Сидан";
        engine = carPartFactory.getEngine();
        wheels = carPartFactory.getWheels();
        paint = carPartFactory.getPaint();
    }
}
