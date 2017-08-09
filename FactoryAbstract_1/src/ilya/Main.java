package ilya;

public class Main {

    public static void main(String[] args) {
        FactoryAbstract factoryAbstract = new FactoryAbstract();

        Factory factoyCar = factoryAbstract.getFactory("Car");
        CarTank audi = factoyCar.getMas("Audi");
        CarTank toyota = factoyCar.getMas("Toyota");
        audi.drive();
        toyota.drive();


        Factory factoyTank= factoryAbstract.getFactory("Tank");
        CarTank t34 = factoyTank.getMas("T34");
        CarTank t35 = factoyTank.getMas("T35");
        t34.drive();
        t35.drive();
    }
}