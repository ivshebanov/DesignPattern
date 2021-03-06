package ilya.parts.partBasic;

import ilya.parts.Parts;
import ilya.parts.PartsBuilder;
import ilya.parts.body.SuvBody;
import ilya.parts.engine.LargeVolumeEngine;
import ilya.parts.print.BluePrint;
import ilya.parts.wheels.SmallWheels;

public class JeepCarPart extends PartsBasic {

    private JeepCarPart() {}

    protected static PartsBasic getJeepPart() {
        return new JeepCarPart();
    }

    @Override
    protected Parts createPart() {
        PartsBuilder patrsBuilder = PartsBuilder.getPartsBuilder();
        patrsBuilder.setBody(new SuvBody());
        patrsBuilder.setEngine(new LargeVolumeEngine());
        patrsBuilder.setWheels(new SmallWheels());
        patrsBuilder.setPrint(new BluePrint());
        return patrsBuilder.getParts();
    }
}
