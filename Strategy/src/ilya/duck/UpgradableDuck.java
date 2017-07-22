package ilya.duck;

import ilya.iFlyDuck.NotFly;
import ilya.iQuackDuck.NotQuack;

public class UpgradableDuck extends DuckBase {

    public UpgradableDuck() {
        this.setQuack(new NotQuack());
        this.setFly(new NotFly());
    }

    @Override
    public void dysplay() {
        System.out.println("Я UpgradableDuck");
    }
}
