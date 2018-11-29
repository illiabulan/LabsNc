package sorters;

public class BubbleSortMin extends Sorters{

    public BubbleSortMin(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        if(array==null)
            throw new NullPointerException();
        for (int i =0; i<array.length; i++){
            for (int j = array.length-1; j>0; j--){
                if (array[j]<array[j-1]) {
                    int swap = array[j];
                    array[j] = array[j-1];
                    array[j-1] = swap;
                }
            }
        }
        return array;
    }
}