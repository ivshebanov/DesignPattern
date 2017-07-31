package ilya.factory;

import ilya.car.Car;
import ilya.car.russianCar.RussianGolf;
import ilya.car.russianCar.RussianPassat;
import ilya.car.russianCar.RussianTiguan;
import ilya.car.russianCar.RussianTuareg;

public class RussianVolkswagen extends Volkswagen {

    @Override
    public Car createCar(String type) {
        Car car = new Car();

        if (type.equals("Golf")) {
            car = new RussianGolf();
        } else if (type.equals("Passat")) {
            car = new RussianPassat();
        } else if (type.equals("Tiguan")) {
            car = new RussianTiguan();
        } else if (type.equals("Tuareg")) {
            car = new RussianTuareg();
        }
        return car;
    }
}
