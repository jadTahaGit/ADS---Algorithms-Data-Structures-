package Heap;

import static java.lang.Math.log;

public class heap {
    static int[] heap = {0,50,30,20,15,10,8,16,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
                    //         50
                 //    30        20
                    // 15   10    8   16

    static void print(){
        int j=0;
        int endOfHeap = check0();
        for(int i=1; i< endOfHeap; i++){
            if(i == 2*j+1){
                System.out.println(heap[i]);
                j=2*j+1;
            }
            else{
                System.out.print(heap[i]+"  ");
            }
        }
      /*
        System.out.println( "       " +  heap[1]);
       System.out.print("     " + "/" + "    ");
       System.out.println("\\");
       
       System.out.print("   " + heap[2]+ "      ");
       System.out.println(heap[3]);
       System.out.print("  " + "/" + "  ");
       System.out.print("\\");
       System.out.print("  ");
       System.out.print("  " + "/" + "  ");
       System.out.println("\\");
       
       System.out.print(" " + heap[4]+ "  ");
       System.out.print(heap[5]);
       System.out.print("");
       System.out.print("  " + heap[6]+ "   ");
       System.out.println(heap[7]);
       */
    }


    static void simplePrint(){
        for (int i = 0; i <heap.length; i++){
            System.out.print(heap[i]+"  ");
        }
    }

    static void swap(int x, int y){
        if(x==0 || y == 0 )return; // Don't touch the first elemnt of the array;
        int tempBox = heap[x];
        heap[x] = heap[y];
        heap[y] = tempBox; 
    }
    
static int check0(){
    for(int i=heap.length-1;i>0;i--){
        if(heap[i] != 0) return i+1;
    }
    return -1;
}

    static void addElement(int data){
        int freePlace = check0();
        heap[freePlace] = data;
        int i=2;
        int j = 1;
        while(heap[(freePlace)/i] <  heap[(freePlace)/j]) {
            swap((freePlace)/i,(freePlace)/j);
            i*=2;
            j*=2;
        }


    }



    public static void main(String[] args) {
        System.out.println("");
        System.out.print("-------------------------------------------------------------------------------------------------------------------------------------");
    
        System.out.println("");
       
        simplePrint();
        System.out.println("");
        System.out.println("-------------------");

        print();
        System.out.println("");
        System.out.println("-------------------");
        addElement(100);
        print();
        
        System.out.println("");
        System.out.println("-------------------");
        addElement(23);
        addElement(70);
        addElement(73);
        addElement(80);
        addElement(6);
        addElement(1);
        print();      

        System.out.println("");
        System.out.println("-------------------");
        addElement(60);
        print();
        
        System.out.print("-------------------------------------------------------------------------------------------------------------------------------------");
    }

}
