package arrays;

import java.util.Arrays;
/*
Time complexity : O(n * d) 
Auxiliary Space : O(1)
*/
public class arrayRotations {

    public static int[] rotate(int deg ,int[] array){

        int maxDegree = (array.length/2)-1;
        if(deg == 0) return array;
        else if (deg > maxDegree  && deg < 0) {
        System.out.println("The Rotation Degree must be between 0 and " + maxDegree);
            return array;
        }
        else {
            for(int i = 0; i < deg; i++){
                int tempBox = array[array.length-1-i];
                array[array.length -1-i] =  array[i];
                array[i] = tempBox;     
            }
            return array;

        }

}



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
    
        System.out.println(Arrays.toString(arr));
    // Call The Rotation Function
    rotate( 1 , arr);
    System.out.println(Arrays.toString(arr));
    rotate( 2 , arr);
    System.out.println(Arrays.toString(arr));
    }
    



    
}



/*

METHOD 2 (Using temp array) 

Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
1) Store the first d elements in a temp array
   temp[] = [1, 2]
2) Shift rest of the arr[]
   arr[] = [3, 4, 5, 6, 7, 6, 7]
3) Store back the d elements
   arr[] = [3, 4, 5, 6, 7, 1, 2]

Time complexity : O(n) 
Auxiliary Space : O(d)

*/


