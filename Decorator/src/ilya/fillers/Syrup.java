package ilya.fillers;

import ilya.baseBaverage.BaverageBase;

public class Syrup extends FillersBaverageBase {

    BaverageBase baverageBase;

    public Syrup(BaverageBase baverageBase) {
        this.baverageBase = baverageBase;
    }

    @Override
    public String getDiscription() {
        return baverageBase.getDiscription() + " Сироп";
    }

    @Override
    public int getPrice() {
        return baverageBase.getPrice() + 20;
    }
}
