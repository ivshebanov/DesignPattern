package ilya.cat;

import ilya.iCat.IWildCats;

public class TigerCat implements IWildCats {
    @Override
    public void growl() {
        System.out.println("РРРР");
    }

    @Override
    public void scratch() {
        System.out.println("Царапаюсь до смерти");
    }
}
