package ilya.factory;

import ilya.car.Car;

public abstract class Volkswagen {

    public Car getCar(String type){
        Car car = createCar(type);
        car.installWheels();
        car.installEngine();
        car.paint();
        car.assemblyBody();
        System.out.println("");
        car.configure();
        return car;
    }


    protected abstract Car createCar(String type);
}
