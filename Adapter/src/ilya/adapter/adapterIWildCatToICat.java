package ilya.adapter;

import ilya.iCat.ICat;
import ilya.iCat.IWildCats;

public class adapterIWildCatToICat implements ICat{

    private IWildCats iWildCats;

    public adapterIWildCatToICat(IWildCats iWildCats) {
        this.iWildCats = iWildCats;
    }

    @Override
    public void meow() {
        iWildCats.growl();
    }

    @Override
    public void scratch() {
        iWildCats.scratch();
    }
}
