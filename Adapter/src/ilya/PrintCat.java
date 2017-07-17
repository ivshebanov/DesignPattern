package ilya;

import ilya.iCat.ICat;

public class PrintCat {
    public static void printCat(ICat cat){
        System.out.println("Кошачье досье");
        System.out.print("Вид мяуканья: ");
        cat.meow();
        System.out.print("Вид царапанья: ");
        cat.scratch();
        System.out.println("");
    }
}
