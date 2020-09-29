public class InsertionSort {
        public static void main(String[] args) {
            int array[]={4,3,6,2,1,8,1,2,9};
            printArray(array);
            array = insertionSort(array);
            System.out.println("Array after sorting using InsertionSort : ");
            printArray(array);
        }

    private static int[] insertionSort(int[] array) {
        int n = array.length;
        for(int i=1;i<n;i++){
            int elem = array[i];
            int j= i-1;

            /** move elements that are greater than the element one position ahead. */

            while(j>=0 && array[j]>elem ){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=elem;
            System.out.println("After iteration "+(i));
            printArray(array);
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
