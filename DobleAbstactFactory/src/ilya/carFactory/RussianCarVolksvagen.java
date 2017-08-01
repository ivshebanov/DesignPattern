package ilya.carFactory;

import ilya.car.*;
import ilya.partFactory.CarPartFactory;
import ilya.partFactory.RussianCarPartFactory;

public class RussianCarVolksvagen extends Volksvagen {
    @Override
    public Car getCar(String type) {
        CarPartFactory deatchCarVolksvagen = new RussianCarPartFactory();
        Car car = new Car() {
            @Override
            public void configure() {
                super.configure();
            }
        };
        if (type.equals("Golf")) {
            return car = new Golf(deatchCarVolksvagen);
        } else if (type.equals("Passat")) {
            return car = new Passat(deatchCarVolksvagen);
        } else if (type.equals("Tiguan")) {
            return car = new Tiguan(deatchCarVolksvagen);
        } else if (type.equals("Toureg")) {
            return car = new Toureg(deatchCarVolksvagen);
        }
        return car;
    }
}
