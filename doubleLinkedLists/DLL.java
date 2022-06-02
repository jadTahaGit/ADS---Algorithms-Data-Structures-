package doubleLinkedLists;

 class Main {
    public static void main(String[] args) {
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        DLL dll = new DLL();
        dll.head = node1;
        dll.head.next = node2;
        dll.head.next.next = node3;
        dll.print();

        dll.push(1);
        System.out.println("");
        dll.print();    
        
        dll.insertAfter(77,2);
        System.out.println("");
        dll.print();


        dll.insertBefore(55,2);
        System.out.println(
            // dll.find(2).data

        );
        dll.print();
        
        dll.append(133);
        System.out.println("");
        dll.print();   
        
        dll.delete(3);
        System.out.println("");
        dll.print();
    }
}

 class Node {
    int data;
    Node previous;
    Node next; 
    public Node (int data){
        this.data = data;
        this.previous = null;
        this.next = null;
    }

}


 class DLL {
    Node head;

    public void print(){
        if(head != null){
            Node current = head;            
            while(current != null){
                System.out.print(current.data + " ");       
                if(current.next != null) current = current.next;
                else break;
            }
        } else System.out.println("List is Empty!");

        }

    public Node find (int data){
        if (head != null){
            Node current = head;
            while (current.data != data ){
                if(current.next == null){
                    System.out.println("Node not found!"); 
                    return null; 
                } else current = current.next;
            }
            return current;
        } else {
            System.out.println("List is Empty!");
            return null;
        }
    }

    public void push(int data){
        Node current = head;
        if(head == null) head = current;
        else {
            Node next = head;
            head = new Node(data);
            head.next = next;
            next.previous = head;
                }

    }
   
    public void insertAfter(int data, int previousData){
            Node current = find(previousData);
            Node toInsert = new Node(data);
            toInsert.next = current.next;
            toInsert.previous = current;
            current.next.previous = toInsert;
            current.next = toInsert;
    }

    public void insertBefore(int data, int nextData){
        Node current = find(nextData);
        Node toInsert = new Node(data);
            toInsert.next = current;
            toInsert.previous = current.previous;
            current.previous.next = toInsert;
            current.previous = toInsert;
    }

    public void append(int data){
        if(head != null){
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            Node toPush = new Node(data);
            current.next = toPush;
            toPush.previous = current;
        } else System.out.println("List is Empty!");
    }

    public void delete(int data){
        Node current = find(data);
        current.previous.next = current.next;
        current.next.previous = current.previous;
        current = null;
    }

}
