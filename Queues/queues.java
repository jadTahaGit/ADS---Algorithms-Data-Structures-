package Queues;

class Main{
public static void main(String[] args) {
    Queue queue = new Queue(5);
    queue.enqueue(113);
    queue.enqueue(33);
    queue.enqueue(20);
    queue.enqueue(4);
    queue.enqueue(2000);
    // queue.enqueue(6);
    queue.println();    
    
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.enqueue(113);
    queue.enqueue(33);
    queue.enqueue(20);
    queue.println();   
    
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.enqueue(113);
    queue.enqueue(33);
    queue.enqueue(20);
    // queue.dequeue();
    // queue.dequeue();
    queue.println();   
    
    // queue.peekFront();
    // queue.peekRear();
}
}

 class Queue {
    int front, rear, size;
    int capacity;
    int[] array;

    public Queue(int capacity){
        this.capacity = capacity;
        this.array = new int[capacity];
        this.front = this.rear = 0;
        this.size = 0;
    }

    public void println(){
        if(isEmpty()) {
            System.out.println("The Queue Is Empty!");
            return;
        }
        for(int i = 0; i < size; i++){
            int j = (front+i) % capacity;
            System.out.print(array[j] + " ");
        }
        System.out.println("");
    }

    
    public boolean isFull(){
        boolean isFull = false;
        if(size == capacity){
            System.out.println("Queue is Full!");
            isFull = true;
        }
        return isFull;
    } 

    public boolean isEmpty(){
        return size == 0; 
    }

    public void enqueue(int data){
        if (isFull()) return;
        else if (isEmpty()){
            front = rear = 0;
        } else {            
                rear = (rear +1) % capacity; 
        }
        array[rear] = data;
        size++;   
    }

    public void dequeue(){
        if(isEmpty())
            return;
        else 
             front++;
        size--;     
    }

     // Method to get front of queue
     public int peekFront()
     {
         if (isEmpty())
             return -1;
        System.out.println(array[front]);
        return array[front];
    }
    
    // Method to get rear of queue
    public int peekRear()
    {
        if (isEmpty())
        return -1;
        System.out.println(array[rear]);
         return array[rear];
     }


}
