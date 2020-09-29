public class BubbleSort {
    public static void main(String[] args) {
        int array[]={4,3,6,2,1,8,1,2,9};
        printArray(array);
        array = bubbleSort(array);
        System.out.println("Array after sorting using BubbleSort : ");
        printArray(array);
    }

    private static int[] bubbleSort(int[] array) {
        int n = array.length;
        for(int i=0;i<n;i++){
            System.out.println("After iteration "+(i+1));
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
            printArray(array);
        }
        return array;
    }

    private static void swap(int[] array, int j, int i) {
        int temp = array[j];
        array[j]=array[j+1];
        array[j+1]=temp;
    }

    private static void printArray(int[] array) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
}
