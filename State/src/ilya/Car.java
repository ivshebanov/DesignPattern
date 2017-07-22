package ilya;

import ilya.states.*;

public class Car {

    private EmptyTankState emptyTankState;
    private EngingStartedState engingStartedState;
    private DrivingState drivingState;
    private FullTankState fullTankState;
    private int gasoline;
    private iState state;

    public Car() {
        this.emptyTankState = new EmptyTankState(this);
        this.engingStartedState = new EngingStartedState(this);
        this.drivingState = new DrivingState(this);
        this.fullTankState = new FullTankState(this);
        this.state = emptyTankState;
        this.gasoline = 0;
    }

    public void fullTank() {
        gasoline = 50;
        state.fullTank();
    }

    public void turnKey() {
        state.turnKey();
    }

    public void driver() {
        state.driver();
        gasoline -= 10;
    }

    public void stop() {
        state.stop();
    }

    public EmptyTankState getEmptyTankState() {
        return emptyTankState;
    }

    private void setEmptyTankState(EmptyTankState emptyTankState) {
        this.emptyTankState = emptyTankState;
    }

    public EngingStartedState getEngingStartedState() {
        return engingStartedState;
    }

    private void setEngingStartedState(EngingStartedState engingStartedState) {
        this.engingStartedState = engingStartedState;
    }

    public DrivingState getDrivingState() {
        return drivingState;
    }

    private void setDrivingState(DrivingState drivingState) {
        this.drivingState = drivingState;
    }

    public FullTankState getFullTankState() {
        return fullTankState;
    }

    private void setFullTankState(FullTankState fullTankState) {
        this.fullTankState = fullTankState;
    }

    public int getGasoline() {
        return gasoline;
    }

    public void setGasoline(int gasoline) {
        this.gasoline = gasoline;
    }

    public iState getState() {
        return state;
    }

    public void setState(iState state) {
        this.state = state;
    }
}
