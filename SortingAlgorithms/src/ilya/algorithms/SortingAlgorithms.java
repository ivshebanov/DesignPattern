package ilya.algorithms;

import java.util.Arrays;

public abstract class SortingAlgorithms {

    public void timeMeasurement(int[] array) {
        long start = System.nanoTime();
        int[] arr = this.sort(array);
        long stop = System.nanoTime();
        System.out.println(Arrays.toString(arr));

        long res = stop - start;
        // 1 сек = 10^9 наносек, 10^6 микросек, 10^3 милисек
        System.out.println(this.getClass().getName() + " - " + res / 1000000);
    }

    public abstract int[] sort(int[] array);
}
