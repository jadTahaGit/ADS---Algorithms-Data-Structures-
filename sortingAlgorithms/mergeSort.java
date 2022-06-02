package sortingAlgorithms;

import java.util.Arrays;

public class mergeSort {

    public static void mergeSort(int[] array){
        int midIndex = array.length/2 ;

        int[] leftSide = new int[midIndex];
        int[] rightSide = new int[array.length - midIndex];
        
        // Termination Case:
        if(array.length < 2) {return;}
        
        // Fill the left side array:
        for(int i = 0; i < midIndex ; i++){
            leftSide[i] = array[i];
        }   
        
        
        // Fill the right side array:
        for(int i = midIndex; i <  array.length; i++){
            rightSide[i-midIndex] = array[i];
        }
        
        //Recursion
        mergeSort(leftSide); 
        mergeSort(rightSide); 

        // Merge:
        int i = 0 , j = 0 , k = 0;
        while( i < leftSide.length && j < rightSide.length){
            if(leftSide[i] < rightSide[j]){
                array[k] = leftSide[i];
                i++;
            }else{
                array[k] = rightSide[j];
                j++;
            }
            k++;
        }

        while(i < leftSide.length){
            array[k] = leftSide[i];
            i++;
            k++;
        }

        while(j < rightSide.length){
            array[k] = rightSide[j];
            j++;
            k++;
        }
        
    }
    public static void main(String[] args) {
        int[] array = {3,5,8,7,1,9,2,6,4,10};
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
