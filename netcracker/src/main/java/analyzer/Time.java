package analyzer;

import fillers.GeneratorsArrays;
import sorters.*;

public class Time {


    public static long sort_bubbleMax() {
        long start = System.nanoTime();
        BubbleSortMax bubbleSortMax = new BubbleSortMax(GeneratorsArrays.SortArray(20));
        bubbleSortMax.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long sort_bubbleMin() {
        long start = System.nanoTime();
        BubbleSortMin bubbleSortMin = new BubbleSortMin(GeneratorsArrays.SortArray(20));
        bubbleSortMin.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long sort_mergeQuick(){
        long start = System.nanoTime();
        MergeSortQuick mergeSortQuick = new MergeSortQuick(GeneratorsArrays.SortArray(20));
        mergeSortQuick.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long sort_quick(){
        long start = System.nanoTime();
        QuickSort quickSort = new QuickSort(GeneratorsArrays.SortArray(20));
        quickSort.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long sort_array(){
        long start = System.nanoTime();
        ArraySort arraySort = new ArraySort(GeneratorsArrays.SortArray(20));
        arraySort.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long sort_mergeBubbleMax(){
        long start = System.nanoTime();
        MergeSortBubbleMax mergeSortBubbleMax = new MergeSortBubbleMax(GeneratorsArrays.SortArray(20));
        mergeSortBubbleMax.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long sort_mergeBubbleMin(){
        long start = System.nanoTime();
        MergeSortBubbleMin mergeSortBubbleMin = new MergeSortBubbleMin(GeneratorsArrays.SortArray(20));
        mergeSortBubbleMin.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long sort_mergeArray(){
        long start = System.nanoTime();
        MergeSortArray mergeSortArray = new MergeSortArray(GeneratorsArrays.SortArray(20));
        long finish = System.nanoTime();
        return finish - start;
    }


    public static long randomSort_bubbleMax() {
        long start = System.nanoTime();
        BubbleSortMax bubbleSortMax1 = new BubbleSortMax(GeneratorsArrays.RandomArray(20));
        bubbleSortMax1.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long randomSort_bubbleMin() {
        long start = System.nanoTime();
        BubbleSortMin bubbleSortMin1 = new BubbleSortMin(GeneratorsArrays.RandomArray(20));
        bubbleSortMin1.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long randomSort_mergeQuick(){
        long start = System.nanoTime();
        MergeSortQuick mergeSortQuick1 = new MergeSortQuick(GeneratorsArrays.RandomArray(20));
        mergeSortQuick1.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long randomSort_quick(){
        long start = System.nanoTime();
        QuickSort quickSort1 = new QuickSort(GeneratorsArrays.RandomArray(20));
        quickSort1.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long randomSort_array(){
        long start = System.nanoTime();
        ArraySort arraySort1 = new ArraySort(GeneratorsArrays.RandomArray(20));
        arraySort1.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long randomSort_mergeBubbleMax(){
        long start = System.nanoTime();
        MergeSortBubbleMax mergeSortBubbleMax = new MergeSortBubbleMax(GeneratorsArrays.RandomArray(20));
        mergeSortBubbleMax.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long randomSort_mergeBubbleMin(){
        long start = System.nanoTime();
        MergeSortBubbleMin mergeSortBubbleMin = new MergeSortBubbleMin(GeneratorsArrays.RandomArray(20));
        mergeSortBubbleMin.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long randomSort_mergeArray(){
        long start = System.nanoTime();
        MergeSortArray mergeSortArray = new MergeSortArray(GeneratorsArrays.RandomArray(20));
        mergeSortArray.sort();
        long finish = System.nanoTime();
        return finish - start;
    }


    public static long notSort_bubbleMax() {
        long start = System.nanoTime();
        BubbleSortMax bubbleSortMax1 = new BubbleSortMax(GeneratorsArrays.NotSortArray(20));
        bubbleSortMax1.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long notSort_bubbleMin() {
        long start = System.nanoTime();
        BubbleSortMin bubbleSortMin = new BubbleSortMin(GeneratorsArrays.NotSortArray(20));
        bubbleSortMin.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long notSort_mergeQuick(){
        long start = System.nanoTime();
        MergeSortQuick mergeSortQuick = new MergeSortQuick(GeneratorsArrays.NotSortArray(20));
        mergeSortQuick.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long notSort_quick(){
        long start = System.nanoTime();
        QuickSort quickSort = new QuickSort(GeneratorsArrays.NotSortArray(20));
        quickSort.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long notSort_array(){
        long start = System.nanoTime();
        ArraySort arraySort = new ArraySort(GeneratorsArrays.NotSortArray(20));
        arraySort.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long notSort_mergeBubbleMax(){
        long start = System.nanoTime();
        MergeSortBubbleMax mergeSortBubbleMax = new MergeSortBubbleMax(GeneratorsArrays.NotSortArray(20));
        mergeSortBubbleMax.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long notSort_mergeBubbleMin(){
        long start = System.nanoTime();
        MergeSortBubbleMin mergeSortBubbleMin = new MergeSortBubbleMin(GeneratorsArrays.NotSortArray(20));
        mergeSortBubbleMin.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long notSort_mergeArray(){
        long start = System.nanoTime();
        MergeSortArray mergeSortArray = new MergeSortArray(GeneratorsArrays.NotSortArray(20));
        mergeSortArray.sort();
        long finish = System.nanoTime();
        return finish - start;
    }


    public static long revSort_bubbleMax() {
        long start = System.nanoTime();
        BubbleSortMax bubbleSortMax1 = new BubbleSortMax(GeneratorsArrays.RevSortArray(20));
        bubbleSortMax1.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long revSort_bubbleMin() {
        long start = System.nanoTime();
        BubbleSortMin bubbleSortMin = new BubbleSortMin(GeneratorsArrays.RevSortArray(20));
        bubbleSortMin.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long revSort_mergeQuick(){
        long start = System.nanoTime();
        MergeSortQuick mergeSortQuick = new MergeSortQuick(GeneratorsArrays.RevSortArray(20));
        mergeSortQuick.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long revSort_quick(){
        long start = System.nanoTime();
        QuickSort quickSort = new QuickSort(GeneratorsArrays.RevSortArray(20));
        quickSort.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long revSort_array(){
        long start = System.nanoTime();
        ArraySort arraySort = new ArraySort(GeneratorsArrays.RevSortArray(20));
        arraySort.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long revSort_mergeBubbleMax(){
        long start = System.nanoTime();
        MergeSortBubbleMax mergeSortBubbleMax = new MergeSortBubbleMax(GeneratorsArrays.RevSortArray(20));
        mergeSortBubbleMax.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long revSort_mergeBubbleMin(){
        long start = System.nanoTime();
        MergeSortBubbleMin mergeSortBubbleMin = new MergeSortBubbleMin(GeneratorsArrays.RevSortArray(20));
        mergeSortBubbleMin.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
    public static long revSort_mergeArray(){
        long start = System.nanoTime();
        MergeSortArray mergeSortArray = new MergeSortArray(GeneratorsArrays.RevSortArray(20));
        mergeSortArray.sort();
        long finish = System.nanoTime();
        return finish - start;
    }
}
