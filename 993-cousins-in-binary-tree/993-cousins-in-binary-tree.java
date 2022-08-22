/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public boolean isCousins(TreeNode root, int x, int y) {
        int a = getDepth(root,x,1);
        int b = getDepth(root,y,1);
        
        int c = getParent(root,x,0);
        int d = getParent(root,y,0);
        // System.out.print(c+" "+d);
        
        if(a==b && c!=d) return true;
        return false;
        
        
    }
    public int getDepth(TreeNode node, int data, int level){
        
        if (node == null) return 0;
        if (node.val == data) return level;
        int downlevel = getDepth(node.left, data, level+1);
        if (downlevel!=0) return downlevel;
        downlevel = getDepth(node.right,data,level+1);
        return downlevel;
    
    }
     public int getParent(TreeNode root, int target, int parentVal) {
        if(root == null) {
            return 0; 
        }
        
        if(root.val == target) {
            return parentVal; 
        }
        
        int parent = getParent(root.left, target, root.val); 
        int parent2 = getParent(root.right, target, root.val); 
        
        return Math.max(parent, parent2); 
        
    }

    
}




