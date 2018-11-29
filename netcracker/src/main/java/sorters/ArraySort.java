package sorters;

import java.util.Arrays;

public class ArraySort extends Sorters {

    public ArraySort(int [] array){super(array);}
    @Override
    public int[] sort() {
        if(array == null)
            throw new NullPointerException();
        Arrays.sort(array);
        return array;
    }
}