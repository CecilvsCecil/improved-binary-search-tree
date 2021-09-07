import java.util.LinkedList;
public class CustomBST<T extends Comparable<? super T>> extends BinarySearchTree<T>{
    
    public CustomBST(){
        
        super();
        
    }
    
    public int height(){
        
        return height(root);
        
    }
    
    private int height(BinaryNode<T> n){
        
        if(n == null){
            
            return -1;
             
        }
        
        return Math.max(height(n.left), height(n.right)) + 1;
        
    }
    
    public T imbalance(){
        
        return imbalance(root);
        
    }
    
    private T imbalance(BinaryNode<T> n){
        
        if(n == null){
            
            return null;
            
        }
        
        T leftImbalance = imbalance(n.left);
        T rightImbalance = imbalance(n.right);
        
        if(leftImbalance != null){
            
            return leftImbalance;
            
        }
        
        if(rightImbalance != null){
            
            return rightImbalance;
            
        }
        
        if(Math.abs(height(n.left) - height(n.right)) <= 1){
            
            return null;
            
        }
        
        return n.data;
        
    }
    
    public T smallestGreaterThan(T t){
        
        return smallestGreaterThan(t, root);
        
    }
    
    private T smallestGreaterThan(T t, BinaryNode<T> n){
        
        if(n == null){
            
            return null;
            
        }
        
        if(t.compareTo(n.data) >= 0){
                           
                return smallestGreaterThan(t, n.right);
            
        }
        
        T leftSGT = smallestGreaterThan(t, n.left);
        
        if(leftSGT != null){
            
            return leftSGT;
            
        }
            
        return n.data;
        
    }
    
    public BinarySearchTree<T> mirror(){
        
        BinarySearchTree<T> reversed = new BetterBST<T>();
        
        reversed.root = new BinaryNode<T>(this.root.data);
        mirror(this.root, reversed.root);
        
        return reversed;
        
    }
    
    private void mirror(BinaryNode<T> original, BinaryNode<T> reversed){
        
        if(original.left == null && original.right == null){
            
            return;
            
        }
        
        if(original.left != null){
            
            reversed.right = new BinaryNode<T>(original.left.data);
            mirror(original.left, reversed.right);
            
        }
        
        if(original.right != null){
            
            reversed.left = new BinaryNode<T>(original.right.data);
            mirror(original.right, reversed.left);
            
        }
        
    }
    
    public LinkedList<BinaryNode<T>> levelOrderTraversal(){
        
        LinkedList<BinaryNode<T>> result = new LinkedList<>();
        LinkedList<BinaryNode<T>> queue = new LinkedList<>();
        queue.addLast(root);
        
        while(queue.size() != 0){
            
            BinaryNode<T> currentNode = queue.removeFirst();
            result.addLast(currentNode);
            
            if(!(currentNode.left == null)){
                
                queue.addLast(currentNode.left);
                
            }
            
            if(!(currentNode.right == null)){
                
                queue.addLast(currentNode.right);
                
            }
            
        }
        
        return result;
        
    }
    
    public String toString(){
        
        StringBuilder out = new StringBuilder();
        toString(root, out, 0);
        return out.toString();
        
    }
    
    private void toString(BinaryNode<T> n, StringBuilder s, int depth){
        
        if(n == null){
            
            return;
            
        }
        
        toString(n.right, s, depth + 1);
        
        for(int i = 0; i < depth; i++){
            
            s.append("   ");
            
        }
        
        s.append(n.data);
        s.append("\n");
        
        toString(n.left, s, depth + 1);
        
    }
    
}
