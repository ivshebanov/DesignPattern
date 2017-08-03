package ilya.car;

import ilya.parts.Parts;

public class Volksvagen extends Car {

    public Volksvagen(Parts parts){
        name = "Audi";
        body = parts.getBody();
        print = parts.getPrint();
        engine = parts.getEngine();
        wheels = parts.getWheels();
    }
    @Override
    public void getCar() {
        System.out.println("Фольксваген создан");
    }
}
