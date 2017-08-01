package ilya.fillers;

import ilya.baseBaverage.BaverageBase;

public class Cinnamon extends FillersBaverageBase {
    BaverageBase baverageBase;

    public Cinnamon(BaverageBase baverageBase) {
        this.baverageBase = baverageBase;
    }

    @Override
    public String getDiscription() {
        return baverageBase.getDiscription() + " Кардамон";
    }

    @Override
    public int getPrice() {
        return baverageBase.getPrice() + 10;
    }
}
