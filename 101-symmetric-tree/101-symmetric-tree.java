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
    public boolean isSymmetric(TreeNode root) {
        return solve(root.left,root.right);
    }
    public boolean solve(TreeNode left, TreeNode right) {
        if(left==null && right==null) return true;
        if((left == null && right!=null) || (left!=null &&right==null) || left.val!=right.val) return false;
        
        boolean l= solve(left.left,right.right);
        boolean r = solve(left.right,right.left);
        
        return l && r;
        
    }
}