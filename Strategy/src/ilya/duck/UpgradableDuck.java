package ilya.duck;

import ilya.iFlyDuck.NotFly;
import ilya.iQuackDuck.NotQuack;

public class UpgradableDuck extends DuckBase {

    public UpgradableDuck() {
        fly = new NotFly();
        quack = new NotQuack();
    }

    @Override
    public void dysplay() {
        System.out.println("Я UpgradableDuck");
    }
}
