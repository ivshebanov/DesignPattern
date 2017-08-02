package ilya.builder;

import ilya.Car;

public class VolksvagenBuilder extends CarBuilderBase {

    public VolksvagenBuilder(){
        car = new Car();
    }
    public VolksvagenBuilder(Car car) {
        super(car);
    }

    @Override
    public void buildEngine() {
        car.setEngine("Двигатель фольксваген");
    }

    @Override
    public void buildFrame() {
        car.setFrame("Кузов фольксваген");
    }

    @Override
    public void buildWheels() {
        car.setWheels("Колеса фольксваген");
    }

    @Override
    public void buildLuxury() {
        car.setLuxury("Лакшери фольксваген");
    }

    @Override
    public void buildMultimedia() {
        car.setMultimedia("Мультимедия фольксваген");
    }

    @Override
    public void buildSafety() {
        car.setSafety("Ассистент фольксваген");
    }
}
