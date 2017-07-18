package ilya.duck;

import ilya.iQuackDuck.ExoticQuack;

public class ExoticDuck extends DuckBase {

    public ExoticDuck() {
        quack = new ExoticQuack();
    }

    @Override
    public void dysplay() {
        System.out.println("Я ExoticDuck");
    }
}
