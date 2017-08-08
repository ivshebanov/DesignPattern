package ilya;

import ilya.Car.Car;

public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory();
        Car audi = factory.getCar("Audi");
        Car toyota = factory.getCar("Toyota");
        audi.drive();
        toyota.drive();
    }
}
