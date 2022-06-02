class Node {
  constructor(data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

// const n1 = new Node(4);
// console.log(n1);

class BinarySearchTree {
  constructor() {
    this.root = null;
  }

  insert(data) {
    const newNode = new Node(data);

    if (this.root === null) {
      this.root = newNode;
    } else {
      this.insertNode(this.root, newNode);
    }
  }

  insertNode(node, newNode) {
    //   Left side
    if (newNode.data < node.data) {
      // Recursive:
      if (node.left === null) {
        node.left = newNode;
      } else {
        this.insertNode(node.left, newNode);
      }
    }
    // right Side (newNode.data > node.data)
    else {
      // recursion
      if (node.right === null) node.right = newNode;
      else this.insertNode(node.right, newNode);
    }
  }

  // helper method that calls the
  // removeNode with a given data
  remove(data) {
    // root is re-initialized with
    // root of a modified tree.
    this.root = this.removeNode(this.root, data);
  }

  // Method to remove node with a
  // given data
  // it recur over the tree to find the
  // data and removes it
  removeNode(node, key) {
    // if the root is null then tree is
    // empty
    if (node === null) return null;
    // if data to be delete is less than
    // roots data then move to left subtree
    else if (key < node.data) {
      node.left = this.removeNode(node.left, key);
      return node;
    }

    // if data to be delete is greater than
    // roots data then move to right subtree
    else if (key > node.data) {
      node.right = this.removeNode(node.right, key);
      return node;
    }

    // if data is similar to the root's data
    // then delete this node
    else {
      // deleting node with no children
      if (node.left === null && node.right === null) {
        node = null;
        return node;
      }

      // deleting node with one children
      if (node.left === null) {
        node = node.right;
        return node;
      } else if (node.right === null) {
        node = node.left;
        return node;
      }

      // Deleting node with two children
      // minimum node of the right subtree
      // is stored in aux
      var aux = this.findMinNode(node.right);
      node.data = aux.data;

      node.right = this.removeNode(node.right, aux.data);
      return node;
    }
  }

  print() {
    this.printAllNodes(this.left, this.root, this.right);
  }

  printAllNodes(left, node, right) {}
}

const bt1 = new BinarySearchTree();
const bt2 = new BinarySearchTree();
// console.log(bt1);
bt1.insert(5);
bt1.insert(1);
bt1.insert(2);
bt1.insert(3);
bt1.insert(4);
bt1.insert(6);
bt1.insert(7);
bt1.insert(8);
bt1.insert(9);
bt1.insert(10);
// console.log(bt1);
// bt1.remove(7);
// console.log(bt1);
// bt1.remove(6);
// console.log(bt1);
// bt2.print();
bt1.print();

// While thinking about any BinaryTree Problem start thinking about in Pre Post!
