package ilya;

import ilya.facilities.Volkswagen;
import ilya.factory.SimpleFactory;

public class Main {

    public static void main(String[] args) {
        Volkswagen volkswagen = new Volkswagen(new SimpleFactory());
        volkswagen.getCar("Golf");
        volkswagen.getCar("Passat");
        volkswagen.getCar("Tiguan");
        volkswagen.getCar("Tuareg");
    }
}
