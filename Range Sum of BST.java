// Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].


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
   public int count=0;
   public int rangeSumBST(TreeNode root, int low, int high){
        inorder( root,  low,  high);
        return count;
        
    }
    public void inorder(TreeNode root, int low, int high){
        if(root==null)
            return;
        inorder(root.left,low,high);
        if(root.val >=low && root.val<=high) count+=root.val;
        inorder(root.right,low,high);
        
            return;
        
    }
}
