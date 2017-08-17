package ilya.algorithms;

import java.util.Arrays;

public class QuickSort extends SortingAlgorithms {
    private static int[] array;

    @Override
    public int[] sort(int[] array) {
        QuickSort.array = Arrays.copyOf(array, array.length);
        quickSort(0, QuickSort.array.length - 1);
        return QuickSort.array;
    }

    private void quickSort(int start, int stop) {
        if (start >= stop) return;
        int i = start, j = stop;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && array[i] <= array[cur]) {
                i++;
            }
            while (j > cur && array[cur] <= array[j]) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur) {
                    cur = j;
                } else if (j == cur) {
                    cur = i;
                }
            }
        }
        quickSort(start, cur);
        quickSort(cur + 1, stop);
    }
}
