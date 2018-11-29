package output;

import analyzer.Time;

public class Output {
    public static void main(String [] args) {
        System.out.println("Час сортування для відсортованого масиву чисел: \n");
        System.out.println("Array sort: " + Time.sort_array() + "\n" +
                "Bubble sort for max: " + Time.sort_bubbleMax() + "\n" +
                "Bubble sort for min: " + Time.sort_bubbleMin() + "\n" +
                "Quick sort: " + Time.sort_quick() + "\n" +
                "Merge sort with quick: " + Time.sort_mergeQuick() + "\n" +
                "Merge sort with bubbleMax: " + Time.sort_bubbleMax() + "\n"+
                "Merge sort with bubbleMin: " + Time.sort_bubbleMin() + "\n" +
                "Merge sort with Arrays.sort: " + Time.sort_array() + "\n");

        System.out.println("Час сортування для рандомного масиву чисел: \n");
        System.out.println("Array sort: " + Time.randomSort_array() + "\n" +
                "Bubble sort for max: " + Time.randomSort_bubbleMax() + "\n" +
                "Bubble sort for min: " + Time.randomSort_bubbleMin() + "\n" +
                "Quick sort: " + Time.randomSort_quick() + "\n" +
                "Merge sort with quick: " + Time.randomSort_mergeQuick() + "\n" +
                "Merge sort with bubbleMax: " + Time.randomSort_bubbleMax() + "\n"+
                "Merge sort with bubbleMin: " + Time.randomSort_bubbleMin() + "\n" +
                "Merge sort with Arrays.sort: " + Time.randomSort_array() + "\n");
        System.out.println("Час сортування для відсортованого масиву по спаданню чисел: \n");
        System.out.println("Array sort: " + Time.revSort_array() + "\n" +
                "Bubble sort for max: " + Time.revSort_bubbleMax() + "\n" +
                "Bubble sort for min: " + Time.revSort_bubbleMin() + "\n" +
                "Quick sort: " + Time.revSort_quick() + "\n" +
                "Merge sort with quick: " + Time.revSort_mergeQuick() + "\n" +
                "Merge sort with bubbleMax: " + Time.revSort_bubbleMax() + "\n" +
                "Merge sort with bubbleMin: " + Time.revSort_bubbleMin() + "\n" +
                "Merge sort with Arrays.sort: " + Time.revSort_array() + "\n");
        System.out.println("Час сортування для відсортованого масиву з будь-яким числом в кінці: \n");
        System.out.println("Array sort: " + Time.notSort_array() + "\n" +
                "Bubble sort for max: " + Time.notSort_bubbleMax() + "\n" +
                "Bubble sort for min: " + Time.notSort_bubbleMin() + "\n" +
                "Quick sort: " + Time.notSort_quick() + "\n" +
                "Merge sort with quick: " + Time.notSort_mergeQuick() + "\n" +
                "Merge sort with bubbleMax: " + Time.notSort_bubbleMax() + "\n"+
                "Merge sort with bubbleMin: " + Time.notSort_mergeQuick() + "\n" +
                "Merge sort with Arrays.sort: " + Time.notSort_array() + "\n");
    }
}
