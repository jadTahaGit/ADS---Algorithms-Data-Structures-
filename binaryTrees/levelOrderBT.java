package binaryTrees;

class Main{
    public static void main(String[] args) {
        Node node1 = new Node(5); 
        Node node2 = new Node(3); 
        Node node3 = new Node(7);
        
        levelOrderBT tree = new levelOrderBT();
        // tree.root = node1;
        // tree.root.left = node2;
        // tree.root.right = node3;

        
        tree.print(node1);
   

    }
}

class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}

class levelOrderBT{
    Node root;

    public levelOrderBT(){root = null;}
      
    public void print(Node node){
        if(root == null)return;
        else{
            System.out.print(root.data);
            print(root.left);
            print(root.right);
        }
    }

}
