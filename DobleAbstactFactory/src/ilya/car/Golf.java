package ilya.car;

import ilya.partFactory.CarPartFactory;

public class Golf extends Car {
    public Golf(CarPartFactory carPartFactory) {
        name = "Golf";
        body = "Хечбэк";
        engine = carPartFactory.getEngine();
        wheels = carPartFactory.getWheels();
        paint = carPartFactory.getPaint();
    }
}
