package ilya;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //мой итератор
        Container<Integer> aC = new ArrayContaner<Integer>();
        aC.addArr(1);
        aC.addArr(2);
        aC.addArr(3);
        Iterator iterator = aC.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //стандартный итератор
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("1q");
        arrayList.add("1q");
        arrayList.add("1q");
        arrayList.add("1q");
        java.util.Iterator<String> it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

interface Iterator<T> {
    boolean hasNext();

    T next();
}

interface Container<T> {
    Iterator getIterator();

    void addArr(T arr);

}

class ArrayContaner<T> implements Container<T> {

    private ArrayList<T> array = new ArrayList<T>();

    @Override
    public Iterator getIterator() {
        return new ArrayIterator();
    }

    @Override
    public void addArr(T arr) {
        array.add(arr);
    }

    class ArrayIterator implements Iterator<T> {
        private int index;

        @Override
        public boolean hasNext() {
            return array.size() > index;
        }

        @Override
        public T next() {
            if (hasNext()) {
                return array.get(index++);
            }
            return null;
        }
    }
}

