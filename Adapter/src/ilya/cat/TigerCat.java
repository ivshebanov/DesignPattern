package ilya.cat;

import ilya.iCat.IWildCats;

public class TigerCat implements IWildCats {
    private String name = "Рэкс";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void growl() {
        System.out.println("РРРР");
    }

    @Override
    public void scratch() {
        System.out.println("Царапаюсь до смерти");
    }
}
