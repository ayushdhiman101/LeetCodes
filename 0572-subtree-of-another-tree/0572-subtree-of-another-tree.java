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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        if(root.val == subRoot.val && isSubTreeImpl(root, subRoot)) return true;  
        boolean left = isSubtree(root.left, subRoot);
        boolean right = isSubtree(root.right, subRoot);
        return left || right;
    }
    public boolean isSubTreeImpl(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null) return root == subRoot;
        boolean left = isSubTreeImpl(root.left, subRoot.left);
        boolean right = isSubTreeImpl(root.right, subRoot.right);
        return left && right && root.val == subRoot.val;  
    }
}