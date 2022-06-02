package searchingAlgorithms;

public class linearSerach {

public static void linearSearch(int number, int[] array){
    boolean found = false;
    for(int i=0; i<array.length; i++){
       if(array[i] == number) found = true;
    }
    
    System.out.println(found);
}

    public static void main(String[] args) {
        int[] array = {10,8,15,3,8,7,4,6,16,54,649,1,2};

        linearSearch(10, array);
        linearSearch(104, array);
    }
}
