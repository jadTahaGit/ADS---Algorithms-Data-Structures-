package Queues;

class Main{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.enQueue(55);
        ll.enQueue(44);
        ll.enQueue(33);
        ll.enQueue(22);
        // ll.enQueue(22);
        ll.print();  
        
        ll.printFront();
        ll.printRear();   
        
        System.out.println("-------------------------------------------");
        
        ll.deQueue();
        ll.deQueue();
        ll.deQueue();
        ll.deQueue();
        ll.deQueue();
        ll.print();
        ll.printFront();
        ll.printRear();

    }
}

class Node{
    int data;
    Node next;
    public Node(int data) {this.data = data;}
}


class LinkedList {
    Node front, rear;

    public LinkedList() {
        front = rear;
    }

    public void print(){
        Node current = front;
            while(current != null){
                System.out.print(current.data + "  ");
                if(current.next == null){
                    System.out.println();
                }
                current = current.next;
            }
            
    }

    public void printFront(){
        if (front != null) System.out.println("The Front is: " + front.data);
    }  
    public void printRear(){
          if (rear != null) System.out.println("The Rear is:  " + rear.data);
        
    }

    // Push an element to the list (front):
    public void deQueue(){
        if(front == null) System.out.println("Queue is already Empty!")  ;
        else if(front == rear) rear = rear.next;  // For The last deQueue
        else front = front.next;

    }

    // At the end
    public void enQueue(int data){
        Node node = new Node(data);
        if (front == null && rear == null) {
            front = rear = node;
            // front.next = rear; 
        }
         else {
            rear.next = node;
            rear = rear.next;
        }
    }
}







