package searchingAlgorithms;

public class binarySearch {

    public static void binarySearch(int[] array, int target){
        boolean found = false;
        int first = array[0];
        int last = array[array.length - 1];
        while(first < last){
            // Be sure round down.
            int midpoint = (first + last)/2;

            if(midpoint == target ) found = true;
            if(midpoint < target )                 
                first = midpoint + 1;
            else last = midpoint - 1;
        }
        System.out.println(found);
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        binarySearch(array, 8);
        binarySearch(array, 10);
    }
}
