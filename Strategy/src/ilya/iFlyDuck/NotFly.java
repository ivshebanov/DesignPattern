package ilya.iFlyDuck;

public class NotFly implements iFly {
    @Override
    public void fly() {
        System.out.println("Я не летаю!");
    }
}
