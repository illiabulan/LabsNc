package sorters;

public class QuickSort extends Sorters {

    public QuickSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        if(array==null)
            throw new NullPointerException();
        int left =0;
        int right = array.length -1;
        quicksort(array, left, right);
        return array;
    }

    public static void quicksort(int [] array, int low, int high){

        int left = low;
        int right = high;

        if (left>=right)
            return;
        int index = (left + right)/2;
        int middle = array[index];

        while (left < right) {
            while (left < index && array[left] <= middle) {
                left++;
            }
            while (right > index && (array[right] >= middle)) {
                right--;
            }
            int a = array[right];
            array[right] = array[left];
            array[left] = a;
            if (left == index) {
                index = right;
            } else if (right == index) {
                index = left;
            }
        }
        quicksort(array, low, index);
        quicksort(array, index + 1, high);

    }
}