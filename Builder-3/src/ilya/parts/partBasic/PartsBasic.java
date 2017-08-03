package ilya.parts.partBasic;

import ilya.parts.Parts;

public abstract class PartsBasic {

    public static Parts getJeepCarPart() {
        return JeepCarPart.getJeepPart().createPart();
    }

    public static Parts getSportCarPart() {
        return SportCarPart.getSportPart().createPart();
    }

    protected abstract Parts createPart();
}
