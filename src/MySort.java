public interface MySort {
    int[] sort(int array[]);

    default void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
