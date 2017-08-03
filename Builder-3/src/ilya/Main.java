package ilya;

import ilya.parts.Parts;
import ilya.parts.partBasic.TerritoriallyParts;

public class Main {

    public static void main(String[] args) {
        Parts Rparts = TerritoriallyParts.getJeepCarPart();
        Rparts.getBody();
        Rparts.getPrint();
        Rparts.getEngine();
        Rparts.getWheels();


        Parts Dparts = TerritoriallyParts.getSportCarPart();
        Dparts.getBody();
        Dparts.getPrint();
        Dparts.getEngine();
        Dparts.getWheels();
    }
}
