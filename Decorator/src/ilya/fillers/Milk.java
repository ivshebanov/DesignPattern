package ilya.fillers;

import ilya.baseBaverage.BaverageBase;

public class Milk extends FillersBaverageBase {
    BaverageBase baverageBase;

    public Milk(BaverageBase baverageBase) {
        this.baverageBase = baverageBase;
    }

    @Override
    public String getDiscription() {
        return baverageBase.getDiscription() + " Молоко";
    }

    @Override
    public int getPrice() {
        return baverageBase.getPrice() + 30;
    }
}
