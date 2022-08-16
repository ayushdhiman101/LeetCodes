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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return max;
        
    }
    public int solve(TreeNode root) {
        if(root==null) return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        if(left<0) left=0;
        if(right<0) right =0;
        max=Math.max(max,left+right+root.val);
        return Math.max(left,right)+root.val;
        
    }
}