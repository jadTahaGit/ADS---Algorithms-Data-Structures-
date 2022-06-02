package binaryTrees;

class Main{
    public static void main(String[] args) {
        binaryTree bt = new binaryTree();
        Node node1 = new Node(5);        
        Node node2 = new Node(4);        
        Node node3 = new Node(6);
        node1.left =  node2;
        node1.right = node3;
        bt.print(node1);        
    }
}


class Node {
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}


public class binaryTree {
    Node root;

    public binaryTree(){
        
    }

    public void print(Node node){
        if(root == null)return;
        else{
            System.out.print(root.data);
            // print left 
            print(root.left);
            // print right 
            print(root.right);

        }
    }


    public void addNode(int data){
        if(root== null) root = new Node(data);
        else {
            if (root.left == null)root.left = new Node(data);
            else if(root.right == null)root.right = new Node(data);
            else {
                root.left.left = new Node(data);
                root.left.right = new Node(data);
            }
        }

    }

}
