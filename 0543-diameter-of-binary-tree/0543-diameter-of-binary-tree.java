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
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameterOfBinaryTree2(root);
        return ans;
    }
    public int diameterOfBinaryTree2(TreeNode root) {
        if(root == null) return 0;
        int leftHt = diameterOfBinaryTree2(root.left);
        int rightHt = diameterOfBinaryTree2(root.right);
        ans = Math.max(ans, leftHt + rightHt);
        return Math.max( leftHt, rightHt) + 1;
    }
}