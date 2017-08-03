package ilya.carConfigure;

import ilya.car.Car;

public abstract class CarTerritorially {

    public Car getCar(){
        return createCar();
    }

    protected abstract Car createCar();
}
