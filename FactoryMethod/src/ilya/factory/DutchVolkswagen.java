package ilya.factory;

import ilya.car.Car;
import ilya.car.dutchCar.DutchGolf;
import ilya.car.dutchCar.DutchPassat;
import ilya.car.dutchCar.DutchTiguan;
import ilya.car.dutchCar.DutchTuareg;

public class DutchVolkswagen extends Volkswagen{

    @Override
    public Car createCar(String type) {
        Car car = new Car();

        if (type.equals("Golf")) {
            car = new DutchGolf();
        } else if (type.equals("Passat")) {
            car = new DutchPassat();
        } else if (type.equals("Tiguan")) {
            car = new DutchTiguan();
        } else if (type.equals("Tuareg")) {
            car = new DutchTuareg();
        }
        return car;
    }
}
