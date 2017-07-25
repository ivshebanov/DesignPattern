package ilya.states;

import ilya.Car;

public class FullTankState implements iState {

    private Car car;

    public FullTankState(Car car) {
        this.car = car;
    }

    @Override
    public void driver() {
        System.out.println("вначале надо завестись");
    }

    @Override
    public void stop() {
        System.out.println("мы даже не ехали");
    }

    @Override
    public void fullTank() {
        System.out.print("бак почти полон: ");
        System.out.println(car.getGasoline());
    }

    @Override
    public void turnKey() {
//        car.setState(car.getEngingStartedState());
        car.setState(new EngingStartedState(car));
        System.out.println("Двигатель запущен, дрын дын дын дын");
    }
}
