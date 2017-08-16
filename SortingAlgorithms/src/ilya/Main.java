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
        list.add(new FastSort());

        list.forEach(e -> e.timeMeasurement(getArray()));
    }

    private static int[] getArray() {
//        return new int[]{1, 3, 4, 6, 7, 2, 8, 5, 9};
//        return new int[]{1, 2, 3, 4, 5, 6, 7, 2, 5};
        return new int[]{2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3, 2, 1, 4, 8, 7, 5, 6, 3};

    }
}
