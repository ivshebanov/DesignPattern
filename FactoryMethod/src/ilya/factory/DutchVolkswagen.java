package ilya.factory;

import ilya.car.Car;
import ilya.car.dutchCar.DutchGolf;
import ilya.car.dutchCar.DutchPassat;
import ilya.car.dutchCar.DutchTiguan;
import ilya.car.dutchCar.DutchTuareg;

public class DutchVolkswagen extends Volkswagen {

    private DutchVolkswagen() {
    }

    public static DutchVolkswagen getDutchVolkswagen() {
        return new DutchVolkswagen();
    }

    @Override
    protected Car createCar(String type) {
        switch (type) {
            case "Golf":
                return new DutchGolf();
            case "Passat":
                return new DutchPassat();
            case "Tiguan":
                return new DutchTiguan();
            case "Tuareg":
                return new DutchTuareg();
            default:
                return null;
        }
    }
}
