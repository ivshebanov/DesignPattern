package ilya.cat;

import ilya.iCat.ICat;

public class HomeCat implements ICat {
    private String name = "Мурзик";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void meow() {
        System.out.println("Муррррр");
    }

    @Override
    public void scratch() {
        System.out.println("Я не царапаюсь");
    }
}
