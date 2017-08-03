package ilya.parts.partBasic;

import ilya.parts.Parts;

public abstract class TerritoriallyParts {

    public static Parts getJeepCarPart() {
        return JeepCarPart.getObj().createPart();
    }

    public static Parts getSportCarPart() {
        return JeepCarPart.getObj().createPart();
    }

    public Parts getParts(){
        return createPart();
    }
    protected abstract Parts createPart();
}
