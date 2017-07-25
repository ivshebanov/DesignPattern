package ilya.states;

import ilya.Car;

public class DrivingState implements iState {

    private Car car;

    public DrivingState(Car car) {
        this.car = car;
    }

    @Override
    public void driver() {
        tryDrive();
    }

    @Override
    public void stop() {
//        car.setState(car.getEngingStartedState());
        car.setState(new EngingStartedState(car));
        System.out.println("остновился");
    }

    @Override
    public void fullTank() {
        System.out.print("нельзя заправляться во время движения, уровень бензина: ");
        System.out.println(car.getGasoline());
    }

    @Override
    public void turnKey() {
        System.out.println("машина уже едет! нельзя ни заглушить, ни завести");
    }

    private void tryDrive() {
        if (car.getGasoline() >= 10) {
            System.out.println("поехали");
        } else {
//            car.setState(car.getEmptyTankState());
            car.setState(new EmptyTankState(car));
            System.out.println("бензин закончился");
        }
    }
}
