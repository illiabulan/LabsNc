package sorters;

public class MergeSortArray extends Sorters {

    public MergeSortArray(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        if(array==null)
            throw new NullPointerException();
        array = sortMergeArray(array);
        return array;
    }

    private int [] sortMergeArray(int [] array){
        int [] part1 = new int[array.length/2];
        int [] part2 = new int[array.length/2];

        System.arraycopy(array, 0, part1, 0, array.length/2);
        System.arraycopy(array, array.length/2, part2, 0, array.length/2);

        ArraySort arraySort_part1 = new ArraySort(part1);
        arraySort_part1.sort();
        ArraySort arraySort_part2 = new ArraySort(part2);
        arraySort_part2.sort();

        array = new int[part1.length + part2.length];
        int lc = 0;
        int rc = 0;
        int ac = 0;
        while (lc < part1.length && rc < part2.length) {
            if (part1[lc] <= part2[rc]) {
                array[ac++] = part1[lc++];
            } else {
                array[ac++] = part2[rc++];
            }
        }
        while (lc < part1.length) {
            array[ac++] = part1[lc++];
        }

        while (rc < part2.length) {
            array[ac++] = part2[rc++];
        }
        return array;
    }
}
