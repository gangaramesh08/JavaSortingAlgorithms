public class QuickSort implements MySort{
    @Override
    public int[] sort(int[] array) {
        //50 23 9 18 61 32
        array = quicksort(array,0,array.length-1);
        return array;
    }

    private int[] quicksort(int[] array, int low, int high) {
        if(low<high){
            int pivot_index = partition(array,low,high);
            quicksort(array,low,pivot_index-1);
            quicksort(array,pivot_index+1,high);
        }
        return array;
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(array[j]<pivot){
                i++;
                swap(array,i,j);
            }
        }
        swap(array,(i+1),high);
        System.out.println("Iteration ");
        printArray(array);
        return (i+1);
    }

    private void swap(int[] array, int i, int high) {
        int temp = array[i];
        array[i] = array[high];
        array[high] = temp;
    }
}
