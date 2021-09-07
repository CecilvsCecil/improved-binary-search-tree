public class TestCustomBST{
    
    public static void main(String[] args){
        
        CustomBST<Integer> tree = new CustomBST<>();
        
        tree.insert(10);
        tree.insert(5);
        tree.insert(16);
        tree.insert(2);
        tree.insert(7);
        tree.insert(14);
        tree.insert(19);
        
        
        System.out.println("******ORIGINAL TREE*******");
        System.out.println(tree);
        
        System.out.println("******MIRRORED TREE*******");
        System.out.println(tree.mirror());
        
        System.out.println("HEIGHT: " + tree.height());
        
        System.out.println("IMBALANCED NODE: " + tree.imbalance());
        
        System.out.print("LEVEL ORDER TRAVERSAL: ");
        for(BinarySearchTree.BinaryNode<Integer> n : tree.levelOrderTraversal()){
            
            System.out.print(n.data + " ");
            
        }
        System.out.println();
        
        int j = 1;
        System.out.println("SMALLEST GREATER THAN " + j + ": " + tree.smallestGreaterThan(j));
        
    }
    
}