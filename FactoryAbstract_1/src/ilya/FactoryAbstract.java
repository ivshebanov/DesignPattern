package ilya;

public class FactoryAbstract {
    public Factory getFactory(String type){
        switch (type){
            case "Car" : return new FactoryCar();
            case "Tank" : return new FactoryTank();
            default: return null;
        }
    }
}
