package ilya;

import ilya.tank.T34;
import ilya.tank.T35;
import ilya.tank.Tank;

public class FactoryTank implements Factory {
    @Override
    public Tank getMas(String type) {
        switch (type){
            case "T34" : return new T34();
            case "T35" : return new T35();
            default: return null;
        }
    }
}
