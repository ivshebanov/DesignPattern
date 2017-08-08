package ilya;

public class Main {

    public static void main(String[] args) {
        ArrayCoteiner arrayCoteiner = new ArrayCoteiner();
        Iterator iterator = arrayCoteiner.getIterator();
        while (iterator.hasNaxt()){
            System.out.println(iterator.naxt());
        }
    }
}

interface Iterator {
    boolean hasNaxt();
    Object naxt();
}

interface Coteiner {
    Iterator getIterator();
}

class ArrayCoteiner implements Coteiner {

    String[] arr = {"masha", "mariya", "misha"};

    @Override
    public Iterator getIterator() {
        return new ArrayIterator();
    }

    class ArrayIterator implements Iterator {
        int index;

        @Override
        public boolean hasNaxt() {
            return (arr.length > index) ? true : false;
        }

        @Override
        public Object naxt() {
            if (hasNaxt()){
                return arr[index++];
            }
            return null;
        }
    }
}
