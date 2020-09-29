public class InsertionSort implements MySort {

    @Override
    public int[] sort(int[] array) {
        System.out.println("InsertionSort :");
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int elem = array[i];
            int j = i - 1;

            /** move elements that are greater than the element one position ahead. */

            while (j >= 0 && array[j] > elem) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = elem;
            System.out.println("After iteration " + (i));
            printArray(array);
        }
        return array;
    }
}
