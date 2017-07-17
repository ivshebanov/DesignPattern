package ilya.cat;

import ilya.iCat.ICat;

public class HomeCat implements ICat {

    @Override
    public void meow() {
        System.out.println("Муррррр");
    }

    @Override
    public void scratch() {
        System.out.println("Я не царапаюсь");
    }
}
