package ilya.states;

import ilya.Car;

public class EngingStartedState implements iState {

    private Car car;

    public EngingStartedState(Car car) {
        this.car = car;
    }

    @Override
    public void driver() {
        tryDrive();
    }

    @Override
    public void stop() {
        System.out.println("еще стоим");
    }

    @Override
    public void fullTank() {
        System.out.print("нельзя заправдяться с работающим двигателем, бак заполнен на: ");
        System.out.println(car.getGasoline());
    }

    @Override
    public void turnKey() {
//        car.setState(car.getFullTankState());
        car.setState(new FullTankState(car));
        System.out.println("заглушил");
    }

    private void tryDrive() {
        if (car.getGasoline() >= 10) {
//            car.setState(car.getDrivingState());
            car.setState(new DrivingState(car));
            System.out.println("поехали");
        } else {
//            car.setState(car.getEmptyTankState());
            car.setState(new EmptyTankState(car));
            System.out.println("бензин закончился");
        }
    }
}
