package ilya.factory;

import ilya.car.Car;

public abstract class Volkswagen {
    private Car car;

    public Car getCar(String type){
        car = createCar(type);
        car.installWheels();
        car.installEngine();
        car.paint();
        car.assemblyBody();
        System.out.println("");
        car.configure();
        return car;
    }


    public abstract Car createCar(String type);
}
