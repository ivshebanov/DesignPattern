package ilya.car;

import ilya.partFactory.CarPartFactory;

public class Tiguan extends Car{
    public Tiguan(CarPartFactory carPartFactory) {
        name = "Tiguan";
        body = "Кросовер";
        engine = carPartFactory.getEngine();
        wheels = carPartFactory.getWheels();
        paint = carPartFactory.getPaint();
    }
}
