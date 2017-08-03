package ilya;

import ilya.car.Car;
import ilya.factory.DutchVolkswagen;
import ilya.factory.RussianVolkswagen;
import ilya.factory.Volkswagen;

public class Main {

    public static void main(String[] args) {
        Volkswagen volkswagen = RussianVolkswagen.getRussianVolkswagen();
        Car golf = volkswagen.getCar("Golf");
        Car passat = volkswagen.getCar("Passat");
        Car Tiguan = volkswagen.getCar("Tiguan");
        Car tuareg = volkswagen.getCar("Tuareg");

        Volkswagen volkswagen1 = DutchVolkswagen.getDutchVolkswagen();
        Car golf1 = volkswagen1.getCar("Golf");
        Car passat1 = volkswagen1.getCar("Passat");
        Car Tiguan1 = volkswagen1.getCar("Tiguan");
        Car tuareg1 = volkswagen1.getCar("Tuareg");
    }
}
