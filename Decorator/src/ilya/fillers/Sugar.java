package ilya.fillers;

import ilya.baseBaverage.BaverageBase;

public class Sugar extends FillersBaverageBase {
    BaverageBase baverageBase;

    public Sugar(BaverageBase baverageBase) {
        this.baverageBase = baverageBase;
    }

    @Override
    public String getDiscription() {
        return baverageBase.getDiscription() + " Сахар";
    }

    @Override
    public int getPrice() {
        return baverageBase.getPrice() + 5;
    }
}
