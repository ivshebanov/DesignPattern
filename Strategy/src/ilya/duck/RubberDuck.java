package ilya.duck;

import ilya.iFlyDuck.NotFly;

public class RubberDuck extends DuckBase {

    public RubberDuck() {
        this.setFly(new NotFly());
    }

    @Override
    public void dysplay() {
        System.out.println("Я RubberDuck");
    }
}
