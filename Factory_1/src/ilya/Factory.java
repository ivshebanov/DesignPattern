package ilya;

import ilya.Car.Audi;
import ilya.Car.Car;
import ilya.Car.Toyota;

public class Factory {

    private Factory(){}
    //FactoryMethod
    public static Factory getFactory(){
        return new Factory();
    }

    //Factory
    public Car getCar(String type){
        switch (type){
            case "Audi" : return new Audi();
            case "Toyota" : return new Toyota();
            default: return null;
        }
    }
}
