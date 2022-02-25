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
    int max=-1;
    public int maxPathSum(TreeNode root) {
        max=root.val;
        sum(root);
        return max;
        
    }
    public int sum(TreeNode root) {
        if(root==null) return 0;
        int left=sum(root.left);
        int right=sum(root.right);
        if(left<0) left=0;
        if(right<0) right=0;
        max=Math.max(left+right+root.val,max);
        return root.val+Math.max(left,right);
        
    }
}