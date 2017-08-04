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
        return PartsBuilder.getPartsBuilder().setBody(new SedanBody()).setEngine(new LowVolumeEngine()).setWheels(new BigWheels()).setPrint(new RadPrint()).getParts();
    }
}
