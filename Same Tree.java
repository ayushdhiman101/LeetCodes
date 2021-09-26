// Given the roots of two binary trees p and q, write a function to check if they are the same or not.

// Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.


public class Solution {
    
       public boolean isSameTree(TreeNode treeA, TreeNode treeB) {
        if(treeA == null && treeB == null){
            return true;
        }
        
        else if(treeA == null || treeB == null ){
            return false;
        }
        else if( treeA.val != treeB.val) {
            return false;  
        }
        
        else 
            return (isSameTree(treeA.left, treeB.left) && isSameTree(treeA.right, treeB.right));
    }
}
