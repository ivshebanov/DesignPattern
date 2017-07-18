package ilya.duck;

import ilya.iFlyDuck.NotFly;
import ilya.iQuackDuck.NotQuack;

public class WoodenDuck extends DuckBase {

    public WoodenDuck() {
        fly = new NotFly();
        quack = new NotQuack();
    }

    @Override
    public void dysplay() {
        System.out.println("Я WoodenDuck");
    }
}
