package ilya.Factory;

import ilya.Car;
import ilya.builder.CarBuilderBase;

public abstract class CarFactoryBase {
    protected CarBuilderBase carBuilderBase;

    public CarFactoryBase(CarBuilderBase carBuilderBase) {
        this.carBuilderBase = carBuilderBase;
    }

    public abstract Car construct();
}
