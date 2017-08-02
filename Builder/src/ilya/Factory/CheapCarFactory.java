package ilya.Factory;

import ilya.Car;
import ilya.builder.CarBuilderBase;

public class CheapCarFactory extends CarFactoryBase {

    public CheapCarFactory(CarBuilderBase carBuilderBase) {
        super(carBuilderBase);
    }

    @Override
    public Car construct() {
        carBuilderBase.buildFrame();
        carBuilderBase.buildWheels();
        carBuilderBase.buildEngine();
        carBuilderBase.buildSafety();
        return carBuilderBase.getCar();
    }
}
