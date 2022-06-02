import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}

class Solution{
    public static void main(String[] args) {
       Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        
    }
}


/*
        1    ---->1
      2   3  ---->2
            6 --->3

      PreOrder(Root, Left, Right)
*/
