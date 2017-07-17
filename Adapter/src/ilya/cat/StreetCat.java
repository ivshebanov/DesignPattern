package ilya.cat;

import ilya.iCat.ICat;

public class StreetCat implements ICat {
    private String name = "Василий";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void meow() {
        System.out.println("МЯУ МЯУ");
    }

    @Override
    public void scratch() {
        System.out.println("Я не сильно царапаюсь!");
    }
}
