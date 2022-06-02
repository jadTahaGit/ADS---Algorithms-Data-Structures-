# Binary Tree Data Structure

A tree whose elements have at most 2 children is called a binary tree. Since each element in a binary tree can have only 2 children, we typically name them the left and right child.

# Trees are hierarchical

Unlike Arrays, Linked Lists, Stack and queues, which are linear data structures, trees are hierarchical data structures.

# Tree Vocabulary:

The topmost node is called root of the tree. The elements that are directly under an element are called its children. The element directly above something is called its parent. For example, ‘a’ is a child of ‘f’, and ‘f’ is the parent of ‘a’. Finally, elements with no children are called leaves.

# Why Trees?

1. One reason to use trees might be because you want to store information that naturally forms a hierarchy. For example, the file system on a computer:

   file system

---

     /    <-- root

/ \
... home
/ \
 ugrad course
/ / | \
 ... cs101 cs112 cs113

2. Trees (with some ordering e.g., BST) provide moderate access/search (quicker than Linked List and slower than arrays).
3. Trees provide moderate insertion/deletion (quicker than Arrays and slower than Unordered Linked Lists).
4. Like Linked Lists and unlike Arrays, Trees don’t have an upper limit on number of nodes as nodes are linked using pointers.

# Main applications of trees include:

1. Manipulate hierarchical data.
2. Make information easy to search (see tree traversal).
3. Manipulate sorted lists of data.
4. As a workflow for compositing digital images for visual effects.
5. Router algorithms
6. Form of a multi-stage decision-making (see business chess).

# Binary Tree:

A tree whose elements have at most 2 children is called a binary tree. Since each element in a binary tree can have only 2 children, we typically name them the left and right child.

# Binary Tree Representation in C:

A tree is represented by a pointer to the topmost node in tree. If the tree is empty, then value of root is NULL.

# Some Usefull Rules

1. The maximum number of nodes at level ‘L’ of a binary tree is 2^L.
2. The Maximum number of nodes in a binary tree of height ‘h’ is 2^(h+1) – 1.
3. Formula for minimum possible height becomes | Log2(N+1) | – 1
4. A Binary tree has the maximum number of leaves (and a minimum number of levels) when all levels are fully filled. Let all leaves be at level l, then below is true for the number of leaves L.
5. In Binary tree where every node has 0 or 2 children, the number of leaf nodes is always one more than nodes with two children.

# Full Binary Tree

A Binary Tree is a full binary tree if every node has 0 or 2 children. The following are the examples of a full binary tree. We can also say a full binary tree is a binary tree in which all nodes except leaf nodes have two children.

             18                            18                       18
           /    \                         /  \                    /     \
         15       30                     15   20                40       30
        /  \      /  \                  /  \                            /  \
      40    50  100   40              40    50                        100   40
                                     /  \
                                    30   50

# Complete Binary Tree:

A Binary Tree is a Complete Binary Tree if all the levels are completely filled except possibly the last level and the last level has all keys as left as possible

The following are examples of Complete Binary Trees:

               18
           /       \
         15         30
        /  \        /  \
      40    50    100   40


               18
           /       \
         15         30
        /  \        /  \
      40    50    100   40
     /  \   /
    8   7  9

# Perfect Binary Tree:

A Binary tree is a Perfect Binary Tree in which all the internal nodes have two children and all leaf nodes are at the same level.
The following are the examples of Perfect Binary Trees.

             18
           /    \
         15      30
        /  \     /  \
      40    50 100   40

            18
           /   \
         15     30

# Balanced Binary Tree

A binary tree is balanced if the height of the tree is O(Log n) where n is the number of nodes. For Example, the AVL tree maintains O(Log n) height by making sure that the difference between the heights of the left and right subtrees is at most 1. Red-Black trees maintain O(Log n) height by making sure that the number of Black nodes on every root to leaf paths is the same and there are no adjacent red nodes. Balanced Binary Search trees are performance-wise good as they provide O(log n) time for search, insert and delete.

A degenerate (or pathological) tree A Tree where every internal node has one child. Such trees are performance-wise same as linked list.

      10
      /
    20
     \
     30
      \
      40

# Some Lemas & Trees Properties:

https://www.geeksforgeeks.org/handshaking-lemma-and-interesting-tree-properties/

# Traverse Types(pre, in ,suf)

(a) Inorder (Left, Root, Right) : 4 2 5 1 3
(b) Preorder (Root, Left, Right) : 1 2 4 5 3
(c) Postorder (Left, Right, Root) : 4 5 2 3 1
