package ilya.algorithms;

public class InsertSort extends SortingAlgorithms {
    @Override
    public int[] sort(int[] array) {
        int leng = array.length;
        for (int i = 1; i < leng; i++) {
            int element = array[i];
            int indexEle = i - 1;
            while (indexEle >= 0 && element < array[indexEle]) {
                array[indexEle + 1] = array[indexEle];
                indexEle--;
                array[indexEle + 1] = element;
            }
        }
        return array;
    }
}
