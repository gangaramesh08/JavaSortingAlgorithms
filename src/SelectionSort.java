public class SelectionSort implements MySort{
    @Override
    public int[] sort(int[] array) {
        System.out.println("SelectionSort :");
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int smallIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[smallIndex]) {
                    smallIndex = j;
                }
            }
            int temp = array[smallIndex];
            array[smallIndex] = array[i];
            array[i] = temp;
            System.out.println("After iteration " + (i + 1));
            printArray(array);
        }
        return array;
    }
}
