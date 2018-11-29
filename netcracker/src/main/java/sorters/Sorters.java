package sorters;

import java.util.Arrays;

public abstract class Sorters {
    protected int [] array;

    public Sorters(int[] array) {
        this.array = array.clone();
    }

    public abstract int [] sort();


}
