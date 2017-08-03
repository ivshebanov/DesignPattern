package ilya;

public class Main {

    public static void main(String[] args) {
        Car car = new Car.BuilderCar().setEngine("Мощный двиг").setName("ауди").setPaint("красный").setWheels("19").build();
        System.out.println(car.getEngine());
    }
}
