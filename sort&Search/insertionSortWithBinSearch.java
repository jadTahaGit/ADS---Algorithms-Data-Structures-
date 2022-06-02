import java.util.Arrays;

public class insertionSortWithBinSearch {

    public static void insertionSort(int[] array){
        
        for(int targetIndex= 1; targetIndex < array.length; targetIndex++ ){   
        //   Binary Search:
        int target = array[targetIndex];
        int first = array[0];
        int firstIndex = 0;
        int last = array[targetIndex-1];
        int lastIndex = targetIndex-1;

        while(first < last){
            int midpoint = (first+last)/2;            
            int midpointIndex = (firstIndex+lastIndex)/2;            
            if(midpoint < target) first = midpoint + 1;
            else {
                last = midpoint-1;
                lastIndex = midpointIndex-1;
            }
        // Add instead of last and Shift the others:
        int tempBox = last; //last
        last = target;
        for(int j = targetIndex; j > lastIndex; j--){
            array[j] = array[j-1];
        }
        array[lastIndex+1] = tempBox;

        }
  
        }
    }
    public static void main(String[] args) {
        int[] array = {5,7,9,1,13,16,11,2,0,6,3};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
    
}
