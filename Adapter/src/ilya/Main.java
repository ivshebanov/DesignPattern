package ilya;

import ilya.adapter.adapterIWildCatToICat;
import ilya.cat.HomeCat;
import ilya.cat.StreetCat;
import ilya.cat.TigerCat;
import ilya.iCat.ICat;

public class Main {

    public static void main(String[] args) {
        ICat homeCat = new HomeCat();
        PrintCat.printCat(homeCat);

        ICat streetCat = new StreetCat();
        PrintCat.printCat(streetCat);

        ICat tiger = new adapterIWildCatToICat(new TigerCat());
        PrintCat.printCat(tiger);
    }
}
