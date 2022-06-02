package sortingAlgorithms;

import java.util.Arrays;

public class bubbleSort {
    
    
    public static int[] simpleSort(int[] array){


        int temp;
        // Not Empty:
        for(int i = 0 ; i<=array.length-2; i++){
            for(int j = i+1; j<=array.length-1; j++){
                if(array[j]<array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(
            Arrays.toString(array)    
        );
        System.out.println("sorted");
        return array;
    }
    
    
    public static void main(String[] args) {
        // int[] arr = {};   
        // int[] arr = {2, 3, 9,1, 5};   
        int[] arr = {100, 300, 50, 8, 19 ,1030, 1 , 10, 7, 99};   
    

        simpleSort(arr);
    }    
}
