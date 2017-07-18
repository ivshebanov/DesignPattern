package ilya.iQuackDuck;

public class NotQuack implements iQuack {

    @Override
    public void Quack() {
        System.out.println("Я не квакаю!");
    }
}
