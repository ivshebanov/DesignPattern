package ilya.car;

import ilya.partsFactory.CarPartFactory;

public class Tiguan extends Car{

    public Tiguan(CarPartFactory carPartFactory) {
        name = "Tiguan";
        body = "Кроссовер";
        engine = carPartFactory.getEngine();
        print = carPartFactory.getPrint();
        wheels = carPartFactory.getWheels();
    }
}
