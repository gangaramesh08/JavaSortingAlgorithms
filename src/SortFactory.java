public class SortFactory {
    public static MySort createSortObject(String sortType){
        if(sortType.equalsIgnoreCase("B")){
            return new BubbleSort();
        }
        else if(sortType.equalsIgnoreCase("I")){
            return new InsertionSort();
        }
        else if(sortType.equalsIgnoreCase("S")){
            return new SelectionSort();
        }
        return null;
    }
}
