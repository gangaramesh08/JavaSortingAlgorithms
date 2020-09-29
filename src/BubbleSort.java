public class BubbleSort implements MySort {

    @Override
    public int[] sort(int[] array) {
        System.out.println("Bubble Sort :");
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.println("After iteration " + (i + 1));
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
            printArray(array);
        }
        return array;
    }

    private static void swap(int[] array, int j, int i) {
        int temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
    }
}
