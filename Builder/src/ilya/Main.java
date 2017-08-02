package ilya;

import ilya.Factory.CarFactoryBase;
import ilya.Factory.CheapCarFactory;
import ilya.Factory.LuxuryCarFactory;
import ilya.builder.AudiBuilder;
import ilya.builder.VolksvagenBuilder;

public class Main {

    public static void main(String[] args) {
        CarFactoryBase carFactoryBase = new CheapCarFactory(new VolksvagenBuilder());
        System.out.println(carFactoryBase.construct() + "\n");

        CarFactoryBase carFactoryBase1 = new LuxuryCarFactory(new VolksvagenBuilder());
        System.out.println(carFactoryBase1.construct() + "\n");

        CarFactoryBase carFactoryBase2 = new CheapCarFactory(new AudiBuilder());
        System.out.println(carFactoryBase2.construct() + "\n");

        CarFactoryBase carFactoryBase3 = new LuxuryCarFactory(new AudiBuilder());
        System.out.println(carFactoryBase3.construct() + "\n");
    }
}
