package ilya.car;

import ilya.partFactory.CarPartFactory;

public class Toureg extends Car{
    public Toureg(CarPartFactory carPartFactory) {
        name = "Toureg";
        body = "Внедорожник";
        engine = carPartFactory.getEngine();
        wheels = carPartFactory.getWheels();
        paint = carPartFactory.getPaint();
    }
}
