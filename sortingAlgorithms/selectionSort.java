package sortingAlgorithms;

import java.util.Arrays;

public class selectionSort {
    
public static int[] swap (int a, int b, int[] array) {
    int tempbox = array[a];
    array[a] = array[b];
    array[b] = tempbox;

    return array;

}

    public static int[] selectionSort(int[] array){

for(int i = 0; i < array.length; i++){
    int minValue = array[i];
    int minValueIndex = i;
    for(int j = i+1; j < array.length; j++){
        if(array[j] < minValue) {
            minValue = array[j];
            minValueIndex = j;
        }
    }
    swap(minValueIndex, i, array);
}
        System.out.println(Arrays.toString(array));
        return array;

    }



    public static void main(String[] args) {
        int[] arr = {7,8,5,4,9,2,100,50,25,75,12};

        selectionSort(arr);
    }
}
