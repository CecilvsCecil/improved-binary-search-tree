 The *CustomBST* class can then be treated just like a regular *BinarySearchTree*, just with some additional functionality.

METHODS
* ```public int height()``` - return the height of the BST
* ```public T imbalance()``` - check whether the tree is balanced. A balanced tree is one where every node's left and right subtrees differ in height by _no more than 1_. Return the value at first node you find which has a height imbalance *greater than 1* between its subtrees, or ```null``` if no such node exists (i.e. the tree is balanced).
* ```public T smallestGreaterThan(T t)``` - given some generic comparable value _t_, find the smallest value in the BST that is larger than _t_. For example, if a binary search tree contains the values 1, 3, and 5, and the function is called with _t = 2_, it should return 3.
* ```public BinarySearchTree<T> mirror()``` - return a mirrored version of the BST instance to satisfy a reversed BST condition. In a reversed BST condition, for every node, _X_, in the tree, the values of all the items in its right subtree are smaller than the item in _X_, and the values of all the items in its left subtree are larger than the item in _X_.  In the mirrored tree, any node that is a left child becomes a right child and vice versa. 
* ```public LinkedList<BinaryNode<T>> levelOrderTraversal``` - return a LinkedList<BinaryNode<T>> of a level order traversal of the binary tree. For example, given the tree below, the method should return: {3, 1, 5, 4}
```
     3
 1       5
       4
```