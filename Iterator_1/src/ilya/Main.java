package ilya;

public class Main {

    public static void main(String[] args) {
        ArrayContaner aC = new ArrayContaner();
        Iterator iterator = aC.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

interface Iterator {
    boolean hasNext();

    Object next();
}

interface Container {
    Iterator getIterator();
}

class ArrayContaner implements Container {

    String[] arr = {"Masha", "Mariya", "Максим"};

    @Override
    public Iterator getIterator() {
        return new ArrayIterator();
    }

    class ArrayIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return arr.length > index;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return arr[index++];
            }
            return null;
        }
    }
}

