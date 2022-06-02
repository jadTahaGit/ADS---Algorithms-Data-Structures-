package linkedLists;

import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(123);
        ll.append(60);
        ll.append(62);
        ll.print();
        System.out.println(ll.findNode(60)!= null);
        System.out.println(ll.findNextNode(62) != null);
        ll.insertNodeAfter(55,123);
        ll.insertNodeAfter(56,60);
        ll.print();
        ll.push(3);
        ll.push(300);
        ll.print();
        // ll.deleteNode(3);
        ll.deleteNode(300);
        ll.print();

    }
}


class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class LinkedList {
    Node head;

    public void print(){
        Node current = head;
            while(current != null){
                System.out.print(current.data + "  ");
                if(current.next == null){
                    System.out.println();
                }
                current = current.next;
            }
            
    }


    // Push an element to the list (head):
    public void push(int data){
            Node oldHead = head;
            Node newHead = new Node(data);
            head = newHead;
            head.next = oldHead;


    }


    // At the end
    public void append(int data){
        if (head == null) {
            head = new Node(data);
        }
    else{
        Node current = head;
        Node node = new Node(data);
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
    }
    }

    // returns the Found Node
    public Node findNode(int data){
        Node current = head;
        while(current.data != data){
            // end of the list:
            if(current.next == null) return null;
            else
                current = current.next;
        }
        return current;
        
        
    }
    
    // returns the Found next Node
    public Node findNextNode(int data){
        Node current = head;
        // end of the list:
        while(current.next != null ){
            if (current.next.data == data) return current;
            else
                current = current.next;
        } 
        return null;
    }
    

    public void insertNodeAfter(int data, int dataBefore){
        Node toInsert = new Node(data); 
        Node current = findNode(dataBefore);
        if(current == null) return;
        else{
            toInsert.next = current.next;
            current.next = toInsert;
        }    
    }


    public void deleteNode(int data){
        Node current = findNextNode(data);
        if(head.data == data)  head = head.next;  
        else if(current == null) System.out.println("Can not delete a Node with Null as a value!");
        else {
            Node nodeAfter = current.next.next;
            current.next =   nodeAfter;          
        }
    }
}


