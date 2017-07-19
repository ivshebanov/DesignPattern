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
        System.out.println(car.getGasolin());
    }

    @Override
    public void turnKey() {
        car.setState(car.getFullTankState());
        System.out.println("заглушил");
    }

    private void tryDrive() {
        if (car.getGasolin() >= 10) {
            car.setState(car.getDrivingState());
            System.out.println("поехали");
        } else {
            car.setState(car.getEmptyTankState());
            System.out.println("бензин закончился");
        }
    }
}
