package ilya;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.fullTank();
        car.turnKey();
        car.turnKey();
        car.turnKey();
        car.driver();
        car.turnKey();
        car.stop();
        car.turnKey();
        car.turnKey();
        car.driver();
        car.stop();
        car.turnKey();
        car.setGasoline(0);
        car.turnKey();
        car.driver();
    }
}
