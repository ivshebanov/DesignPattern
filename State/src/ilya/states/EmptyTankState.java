package ilya.states;

import ilya.Car;

public class EmptyTankState implements iState {

    private Car car;

    public EmptyTankState(Car car) {
        this.car = car;
    }

    @Override
    public void driver() {
        System.out.println("не могу поехать без бензина");
    }

    @Override
    public void stop() {
        System.out.println("стою, нет бензина");
    }

    @Override
    public void fullTank() {
        System.out.println("заправил полный бак");
        car.setState(car.getFullTankState());
    }

    @Override
    public void turnKey() {
        System.out.println("нет бензина, завестись нельзя");
    }
}
