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
        maxPathSum2(root);
        return max;
    }
    public int maxPathSum2(TreeNode root) {
        if(root == null) return  0;

        int left = maxPathSum2(root.left);
        int right = maxPathSum2(root.right);

        int temp =  Math.max(Math.max(left, right) + root.val, root.val);
        int temp2 =  Math.max(temp, left + right + root.val);
        max = Math.max(max, temp2);
        return temp;
    }
    
}