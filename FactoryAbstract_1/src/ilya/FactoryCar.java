package ilya;

import ilya.car.Audi;
import ilya.car.Car;
import ilya.car.Toyota;


public class FactoryCar implements Factory {

    @Override
    public Car getMas(String type) {
        switch (type){
            case "Audi" : return new Audi();
            case "Toyota" : return new Toyota();
            default: return null;
        }
    }
}
