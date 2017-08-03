package ilya.factory;

import ilya.car.Car;
import ilya.car.russianCar.RussianGolf;
import ilya.car.russianCar.RussianPassat;
import ilya.car.russianCar.RussianTiguan;
import ilya.car.russianCar.RussianTuareg;

public class RussianVolkswagen extends Volkswagen {

    private RussianVolkswagen() {
    }

    public static RussianVolkswagen getRussianVolkswagen() {
        return new RussianVolkswagen();
    }

    @Override
    protected Car createCar(String type) {
        switch (type) {
            case "Golf":
                return new RussianGolf();
            case "Passat":
                return new RussianPassat();
            case "Tiguan":
                return new RussianTiguan();
            case "Tuareg":
                return new RussianTuareg();
            default:
                return null;
        }
    }
}
