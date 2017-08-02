package ilya.carFactory;

import ilya.car.*;
import ilya.partsFactory.CarPartFactory;

public abstract class Volkswagen {
    abstract public Car getCar(String type);

    Car getTypeCar(String type, CarPartFactory carPartFactory){
        if (type.equals("Golf")) {
            return new Golf(carPartFactory);
        } else if (type.equals("Passat")) {
            return new Passat(carPartFactory);
        } else if (type.equals("Tiguan")) {
            return new Tiguan(carPartFactory);
        } else if (type.equals("Touareg")) {
            return new Touareg(carPartFactory);
        }
        return new CarNPE();
    }
}
