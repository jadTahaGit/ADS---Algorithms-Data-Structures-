package sortingAlgorithms;

class qickSort{

    static void quickSort(int[] array,int low, int high){
        if(low < high){
            int pi = partition(array,low, high);
            quickSort( array,low, pi-1);
            quickSort( array,pi+1, high);
        }
    }

    static int partition(int[] array,int low, int high){    
        int pivot = array[high]; 
        int i = (low - 1); 

        // loop through the array:
        for(int j = low; j <= high - 1; j++){
            // If current element is smaller than the pivot
            if (array[j] < pivot){       
                i++; 
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return (i + 1);   
    }

    static void swap(int[] array,int a, int b){
        System.out.println("Hey I am in swap Function!");
        int tempBox = array[a];
        array[a] = array[b];
        array[b] = tempBox;
        printArray(array);
        System.out.println("Swaped:  " + array[a] + " " + array[b]);
        System.out.println("");
    }
    
    static void printArray(int[] array){
        String toPrint = ""; 
        for(int i = 0; i < array.length; i++){
            if (i == 0) toPrint+="{" + array[i] + ", ";
            else if (i == array.length-1) toPrint+= array[i] + "}";
            else toPrint += array[i]+ ", ";
        }System.out.println(toPrint);

    }

    public static void main(String[] args) {
        int[] array = {7,2,4,6,1,3,2,5};
        
        System.out.println("Before Sorting:");
        printArray(array);
        System.out.println("");
        System.out.println("After Sorting:");
        quickSort(array, 0, array.length-1);
        printArray(array);

         

    }
    
}
