package patterns.factory.cars;

import patterns.factory.partsFactory.CarPartsFactory;

/**
 * Created by iliashebanov on 13.10.16.
 */
public class Golf extends Car
{
    private CarPartsFactory factory;
    public Golf(CarPartsFactory factory){
        this.factory = factory;
        name = "Golf";
        body = "Hatchback";
    }

    @Override
    public void configure()
    {
        System.out.println("Configuring " + name);
        System.out.println("Body is: " + body);

        factory.CreateEngine();
        factory.CreatePaint();
        factory.CreateWheels();
    }
}
