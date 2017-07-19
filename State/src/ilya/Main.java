package ilya;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.fullTank();
        car.turnKey();
        car.driver();
        car.driver();
        car.driver();
        car.driver();
        car.driver();
        car.driver();
        car.driver();
        car.driver();
        car.driver();
        car.stop();
        car.turnKey();
        car.fullTank();
        System.out.println(car.getGasolin());
    }
}
  