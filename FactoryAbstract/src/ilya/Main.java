package ilya;

import ilya.car.Car;
import ilya.carFactory.DeutchVolkswagen;
import ilya.carFactory.RussianVolkswagen;
import ilya.carFactory.Volkswagen;

public class Main {

    public static void main(String[] args) {
        Volkswagen volkswagen = new RussianVolkswagen();
        Car car = volkswagen.getCar("Golf");
        volkswagen.getCar("Passat");
        volkswagen.getCar("Tiguan");
        volkswagen.getCar("Touareg");

        Volkswagen volkswagen1 = new DeutchVolkswagen();
        volkswagen1.getCar("Golf");
        volkswagen1.getCar("Passat");
        volkswagen1.getCar("Tiguan");
        volkswagen1 .getCar("Touareg");
    }
}
