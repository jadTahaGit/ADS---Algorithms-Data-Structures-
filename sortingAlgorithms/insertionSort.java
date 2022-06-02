package sortingAlgorithms;

import java.util.Arrays;

public class insertionSort {

    public static int[] insertionSort(int[] array){
        
        for(int i = 1; i < array.length; i++){
            
            int j = i;
            while( (j > 0) && (array[j-1] > array[j])){
                int tempBox = array[j-1];
                array[j-1] = array[j];
                array[j] = tempBox;
                j--;
            }
        }
        
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,4,2,6,9,4,5,1,0};
        
        insertionSort(arr);
    }
    
}
