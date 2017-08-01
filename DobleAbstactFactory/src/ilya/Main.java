package ilya;

import ilya.carFactory.DeatchCarVolksvagen;
import ilya.carFactory.RussianCarVolksvagen;
import ilya.carFactory.Volksvagen;

public class Main {

    public static void main(String[] args) {
        Volksvagen volksvagenR = new RussianCarVolksvagen();
        volksvagenR.getCar("Golf").configure();
        volksvagenR.getCar("Passat").configure();
        volksvagenR.getCar("Tiguan").configure();
        volksvagenR.getCar("Toureg").configure();

        System.out.println("");

        Volksvagen volksvagenD = new DeatchCarVolksvagen();
        volksvagenD.getCar("Golf").configure();
        volksvagenD.getCar("Passat").configure();
        volksvagenD.getCar("Tiguan").configure();
        volksvagenD.getCar("Toureg").configure();
    }
}
