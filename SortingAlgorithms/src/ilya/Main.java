package ilya;

import ilya.algorithms.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<SortingAlgorithms> list = new ArrayList<>();
        list.add(new BubbleSort());
        list.add(new BubbleSort1());
        list.add(new SampleSort());
        list.add(new InsertSort());
        list.add(new QuickSort());

        list.forEach(e -> e.timeMeasurement(getArray()));
//        list.forEach(e -> e.sort(getArray()));
//        System.out.println(Arrays.toString(list.get(0).sort(getArray())));
    }

    private static int[] getArray() {
//        return new int[]{1, 9, 5, 0, 7, 2, 9, 4, 8, 10};
//        return new int[]{1, 3, 4, 6, 7, 2, 8, 5, 9};
//        return new int[]{1, 2, 3, 4, 5, 6, 7, 2, 5};
//        return new int[]{2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3};
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        return array;
    }
}
