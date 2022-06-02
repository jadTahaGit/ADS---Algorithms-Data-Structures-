package binaryTrees;

public class BT_02_preOrder {
    
    
    
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    static class BT{
        Node root;
        BT(){
            root = null;
        }
    }
   
    static void print(Node node){
        if(node == null)return;
        else{
            System.out.print(node.data + " ");
            print(node.left);
            print(node.right);
        }
    }



    public static void main(String[] args) {
        Node node1 = new Node(5);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        // Connect the nodes:
        node1.left = node2;
        node1.right = node3;

        print(node1);
    }












}
