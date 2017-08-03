package ilya.parts.partBasic;

import ilya.parts.Parts;
import ilya.parts.PartsBuilder;
import ilya.parts.body.SedanBody;
import ilya.parts.engine.LowVolumeEngine;
import ilya.parts.print.RadPrint;
import ilya.parts.wheels.BigWheels;

public class SportCarPart extends PartsBasic {

    private SportCarPart() {}

    protected static PartsBasic getSportPart() {
        return new SportCarPart();
    }

    @Override
    protected Parts createPart() {
        PartsBuilder patrsBuilder = PartsBuilder.getPartsBuilder();
        patrsBuilder.setBody(new SedanBody());
        patrsBuilder.setEngine(new LowVolumeEngine());
        patrsBuilder.setWheels(new BigWheels());
        patrsBuilder.setPrint(new RadPrint());
        return patrsBuilder.getParts();
    }
}
