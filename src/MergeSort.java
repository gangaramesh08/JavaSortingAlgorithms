public class MergeSort implements MySort{
    @Override
    public int[] sort(int[] array) {
        array = mergeSort(array,0,array.length-1);
        return array;
    }

    private int[] mergeSort(int[] array, int low, int high) {
        if(low<high) {
            int mid = (low + high) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
        return array;
    }

    private void merge(int[] array, int low, int mid, int high) {
        int n1= mid-low+1;
        int n2 = high-mid;
        int[] temp1 = new int[n1];
        int [] temp2 = new int[n2];
        for(int i=0;i<n1;i++){
            temp1[i]=array[low+i];
        }
        for (int j=0;j<n2;j++){
            temp2[j]=array[mid+1+j];
        }
        int i=0, j=0;
        int k=low;
        while(i<n1 && j<n2){
            if(temp1[i]<temp2[j]){
                array[k++]=temp1[i++];
            }
            else{
                array[k++]=temp2[j++];
            }
        }
        while(i<n1){
            array[k++]=temp1[i++];
        }
        while(j<n2){
            array[k++]=temp2[j++];
        }
        printArray(array);
    }
}
