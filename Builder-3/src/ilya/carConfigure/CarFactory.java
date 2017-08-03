package ilya.carConfigure;

import ilya.car.Audi;
import ilya.car.Car;
import ilya.car.Volksvagen;
import ilya.parts.Parts;

public class CarFactory {

    public Car getCar(String type, Parts parts) {
        Car car = null;
        switch (type) {
            case "Audi":
                car = new Audi(parts);
                break;
            case "Volksvagen":
                car = new Volksvagen(parts);
                break;
        }
        assert car != null;
        car.getCar();
        System.out.println("");
        return car;
    }
}
