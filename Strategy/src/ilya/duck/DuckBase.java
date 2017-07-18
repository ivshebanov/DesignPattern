package ilya.duck;

import ilya.iFlyDuck.Fly;
import ilya.iFlyDuck.iFly;
import ilya.iQuackDuck.Quack;
import ilya.iQuackDuck.iQuack;

public abstract class DuckBase {
    iFly fly;
    iQuack quack;

    DuckBase() {
        this.fly = new Fly();
        this.quack = new Quack();
    }

    public void setFly(iFly fly) {
        this.fly = fly;
    }

    public void setQuack(iQuack quack) {
        this.quack = quack;
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
}
