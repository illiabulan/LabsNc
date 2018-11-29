package sorters;

public class MergeSortBubbleMin extends Sorters {
    public MergeSortBubbleMin(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        if(array==null)
            throw new NullPointerException();
        array = sortMergeBubbleMin(array);
        return array;
    }

    private int [] sortMergeBubbleMin(int [] array){
        int [] part1 = new int[array.length/2];
        int [] part2 = new int[array.length/2];

        System.arraycopy(array, 0, part1, 0, array.length/2);
        System.arraycopy(array, array.length/2, part2, 0, array.length/2);

        BubbleSortMin bubbleSortMin_part1 = new BubbleSortMin(part1);
        bubbleSortMin_part1.sort();
        BubbleSortMin bubbleSortMin_part2 = new BubbleSortMin(part2);
        bubbleSortMin_part2.sort();

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
