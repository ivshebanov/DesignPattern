package ilya.car;

import ilya.partsFactory.CarPartFactory;

public class Touareg extends Car{

    public Touareg(CarPartFactory carPartFactory) {
        name = "Touareg";
        body = "Внедорожник";
        engine = carPartFactory.getEngine();
        print = carPartFactory.getPrint();
        wheels = carPartFactory.getWheels();
    }
}
