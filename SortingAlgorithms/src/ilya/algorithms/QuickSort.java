package ilya.algorithms;

public class QuickSort extends SortingAlgorithms {
    @Override
    public int[] sort(int[] array) {
        return quickSort(array, 0, array.length - 1);
    }

    private int[] quickSort(int[] array, int start, int stop) {
        if (start >= stop) return array;
        int i = start, j = stop;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && array[i] <= array[cur]) i++;
            while (j > cur && array[cur] <= array[j]) j--;
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur) cur = j;
                else if (j == cur) cur = i;
            }
        }
        quickSort(array, start, cur);
        quickSort(array, cur + 1, stop);
        return array;
    }
}
