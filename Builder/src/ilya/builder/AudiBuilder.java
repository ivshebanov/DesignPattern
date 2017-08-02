package ilya.builder;

import ilya.Car;

public class AudiBuilder extends CarBuilderBase {

    public AudiBuilder(){
        car = new Car();
    }
    public AudiBuilder(Car car) {
        super(car);
    }

    @Override
    public void buildEngine() {
        car.setEngine("Двигатель ауди");
    }

    @Override
    public void buildFrame() {
        car.setFrame("Кузов ауди");
    }

    @Override
    public void buildWheels() {
        car.setWheels("Колеса ауди");
    }

    @Override
    public void buildLuxury() {
        car.setLuxury("Лакшери ауди");
    }

    @Override
    public void buildMultimedia() {
        car.setMultimedia("Мультимедия ауди");
    }

    @Override
    public void buildSafety() {
        car.setSafety("Ассистент ауди");
    }
}
