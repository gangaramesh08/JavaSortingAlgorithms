import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int array[]={4,3,6,2,1,8,1,2,9};
        printArray(array);
        System.out.println("Which algorithm do you want to use to sort the array? ");
        System.out.println("1.BubbleSort(B)\n2.InsertionSort(I)\n3. SelectionSort(S)\n4.QuickSort(Q)\n5.MergeSort(M)");
        String sortType = "N";
        try {
            sortType=bufferedReader.readLine();
        } catch (IOException e){
            System.out.println("Error  in reading input");
        }
        MySort sort = SortFactory.createSortObject(sortType);
        if(sort!=null){
            sort.sort(array);
        }
        else{
            System.out.println("You made a wrong choice!!!");
        }
    }
    private static void printArray(int[] array) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
}
