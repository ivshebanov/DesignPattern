package ilya;

import ilya.carFactory.DeutchVolkswagen;
import ilya.carFactory.RussianVolkswagen;
import ilya.carFactory.Volkswagen;

public class Main {

    public static void main(String[] args) {
        Volkswagen volkswagen = new RussianVolkswagen();
        volkswagen.getCar("Golf").configure();
        volkswagen.getCar("Passat").configure();
        volkswagen.getCar("Tiguan").configure();
        volkswagen.getCar("Touareg").configure();

        Volkswagen volkswagen1 = new DeutchVolkswagen();
        volkswagen1.getCar("Golf").configure();
        volkswagen1.getCar("Passat").configure();
        volkswagen1.getCar("Tiguan").configure();
        volkswagen1 .getCar("Touareg").configure();
    }
}
