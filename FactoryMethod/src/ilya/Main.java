package ilya;

import ilya.factory.DutchVolkswagen;
import ilya.factory.RussianVolkswagen;
import ilya.factory.Volkswagen;

public class Main {

    public static void main(String[] args) {
        Volkswagen volkswagen = new DutchVolkswagen();
        volkswagen.getCar("Golf");
        volkswagen.getCar("Passat");
        volkswagen.getCar("Tiguan");
        volkswagen.getCar("Tuareg");

        Volkswagen volkswagen1 = new RussianVolkswagen();
        volkswagen1.getCar("Golf");
        volkswagen1.getCar("Passat");
        volkswagen1.getCar("Tiguan");
        volkswagen1.getCar("Tuareg");
    }
}
