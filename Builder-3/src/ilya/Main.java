package ilya;

import ilya.car.Car;
import ilya.carConfigure.CarFactory;
import ilya.parts.Parts;
import ilya.parts.PartsBuilder;
import ilya.parts.body.CrossoverBody;
import ilya.parts.engine.LargeVolumeEngine;
import ilya.parts.partBasic.PartsBasic;
import ilya.parts.print.BluePrint;
import ilya.parts.wheels.BigWheels;

public class Main {

    public static void main(String[] args) {
        Parts Rparts = PartsBasic.getJeepCarPart();
        Parts Dparts = PartsBasic.getSportCarPart();
        Parts Parts = PartsBuilder.getPartsBuilder().setBody(new CrossoverBody()).setPrint(new BluePrint()).setEngine(new LargeVolumeEngine()).setWheels(new BigWheels()).getParts();


        Car audi1 = new CarFactory().getCar("Audi", Rparts);
        Car audi2 = new CarFactory().getCar("Audi", Dparts);
        Car audi3 = new CarFactory().getCar("Audi", Parts);

        Car audi4 = new CarFactory().getCar("Volksvagen", Rparts);
        Car audi5 = new CarFactory().getCar("Volksvagen", Dparts);
        Car audi6 = new CarFactory().getCar("Volksvagen", Parts);



    }
}
