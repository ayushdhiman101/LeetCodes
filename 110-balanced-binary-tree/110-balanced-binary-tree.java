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
    boolean x= true;
    public boolean isBalanced(TreeNode root) {
        solve(root);
        return x;
    }
    public int solve(TreeNode root) {
        if(root == null) return 0;
        int left =solve(root.left);
        int right =solve(root.right);
        if(Math.abs(left-right)>1) x=false;
        return 1+Math.max(left,right);
    }
}