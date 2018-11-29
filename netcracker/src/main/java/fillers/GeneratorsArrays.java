package fillers;

import java.util.Random;

public class GeneratorsArrays {

    public static int[] SortArray(int length){

        int [] array = new int[length];
        for(int i = 0; i<array.length; i++){
            array[i]=(int) (Math.random() * 4 + (1 + i) * 4);
        }
        return array;
    }

    public static int[] NotSortArray(int length){

        int [] array = new int[length];
        Random random = new Random();
        for(int i = 0; i<array.length-1; i++){
            array[i]=(int) (Math.random() * 4 + (1 + i) * 4);
        }
        array[length - 1] = (int) (Math.random() * length + 4);
        return array;
    }

    public static int[] RandomArray(int length){

        int [] array = new int[length];
        for(int i = 0; i<array.length; i++){
            array[i]=(int) (Math.random()* 50);
        }
        return array;
    }

    public static int[] RevSortArray(int length){
        int [] array = new int[length];
        for (int i = array.length - 1; i>=0; i--){
            array[i]=(int) (Math.random() * 4 + (array.length - i) * 4);
        }
        return array;
    }
}
