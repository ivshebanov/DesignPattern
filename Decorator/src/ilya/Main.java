package ilya;

import ilya.baseBaverage.BaverageBase;
import ilya.baseBaverage.Coffe;
import ilya.baseBaverage.Tee;
import ilya.fillers.Cinnamon;
import ilya.fillers.Milk;
import ilya.fillers.Sugar;
import ilya.fillers.Syrup;

public class Main {

    public static void main(String[] args) {
        BaverageBase baverageBase = new Sugar(new Cinnamon(new Milk(new Coffe())));
        System.out.format("Ваш заказ: %s %nЦена: %d %n", baverageBase.getDiscription(), baverageBase.getPrice());

        BaverageBase baverageBase1 = new Sugar(new Syrup(new Tee()));
        System.out.format("Ваш заказ: %s %nЦена: %d %n", baverageBase1.getDiscription(), baverageBase1.getPrice());
    }
}
