    public class SelectionSort {
            public static void main (String[]args){
                int array[] = {4, 3, 6, 2, 1, 8, 1, 2, 9};
                printArray(array);
                array = selectionSort(array);
                System.out.println("Array after sorting using SelectionSort : ");
                printArray(array);
            }
            private static int[] selectionSort ( int[] array){
                int n = array.length;
                for(int i=0;i<n;i++){
                    int smallIndex = i;
                    for(int j=i+1;j<n;j++){
                        if(array[j]<array[smallIndex]){
                            smallIndex = j;
                        }
                    }
                    int temp = array[smallIndex];
                    array[smallIndex] = array[i];
                    array[i]=temp;
                    System.out.println("After iteration "+(i+1));
                    printArray(array);
                }
                return array;
            }
            private static void printArray ( int[] array){
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
}
