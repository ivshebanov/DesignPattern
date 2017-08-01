package ilya.car;

import ilya.partsFactory.CarPartFactory;

public class Golf extends Car{

    public Golf(CarPartFactory carPartFactory) {
        name = "Golf";
        body = "хечбэк";
        engine = carPartFactory.getEngine();
        print = carPartFactory.getPrint();
        wheels = carPartFactory.getWheels();
    }
}
