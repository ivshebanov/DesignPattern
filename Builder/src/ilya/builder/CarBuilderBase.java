package ilya.builder;

import ilya.Car;

public abstract class CarBuilderBase {
    protected Car car;

    public CarBuilderBase(){
        car = new Car();
    }
    public CarBuilderBase(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public abstract void buildEngine();
    public abstract void buildFrame();
    public abstract void buildWheels();
    public abstract void buildLuxury();
    public abstract void buildMultimedia();
    public abstract void buildSafety();
}
