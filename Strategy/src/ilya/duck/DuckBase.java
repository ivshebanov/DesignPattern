package ilya.duck;

import ilya.iFlyDuck.Fly;
import ilya.iFlyDuck.iFly;
import ilya.iQuackDuck.Quack;
import ilya.iQuackDuck.iQuack;

public abstract class DuckBase {
    private iFly fly;
    private iQuack quack;

    DuckBase() {
        this.fly = new Fly();
        this.quack = new Quack();
    }

    public abstract void dysplay();

    public void swim() {
        System.out.println("Я умею плавать");
    }

    public void fly() {
        fly.fly();
    }

    public void quack() {
        quack.Quack();
    }

    public iFly getFly() {
        return fly;
    }

    public void setFly(iFly fly) {
        this.fly = fly;
    }

    public iQuack getQuack() {
        return quack;
    }

    public void setQuack(iQuack quack) {
        this.quack = quack;
    }
}
