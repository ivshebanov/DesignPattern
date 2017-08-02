package ilya.Factory;

import ilya.Car;
import ilya.builder.CarBuilderBase;

public class LuxuryCarFactory extends CarFactoryBase {

    public LuxuryCarFactory(CarBuilderBase carBuilderBase) {
        super(carBuilderBase);
    }

    @Override
    public Car construct() {
        carBuilderBase.buildFrame();
        carBuilderBase.buildWheels();
        carBuilderBase.buildEngine();
        carBuilderBase.buildSafety();
        carBuilderBase.buildMultimedia();
        carBuilderBase.buildLuxury();
        return carBuilderBase.getCar();
    }
}
