package ilya;

import ilya.duck.*;
import ilya.iFlyDuck.Fly;
import ilya.iQuackDuck.ExoticQuack;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<DuckBase> duck = new ArrayList<DuckBase>();
        duck.add(new SimpleDuck());
        duck.add(new ExoticDuck());
        duck.add(new RubberDuck());
        duck.add(new WoodenDuck());

        for (DuckBase dB : duck) {
            dB.dysplay();
            dB.swim();
            dB.fly();
            dB.quack();
            System.out.println("");
        }

        DuckBase ubgrDuck = new UpgradableDuck();
        ubgrDuck.dysplay();
        ubgrDuck.swim();
        ubgrDuck.quack();
        ubgrDuck.fly();

        ubgrDuck.setFly(new Fly());
        ubgrDuck.setQuack(new ExoticQuack());
        ubgrDuck.fly();
        ubgrDuck.quack();
    }
}
