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
        if(root == null || subRoot == null) return root == subRoot;
        if(root.val == subRoot.val && isIdentical(root, subRoot)) return true; 
        boolean left = isSubtree (root.left, subRoot);
        boolean right = isSubtree (root.right, subRoot);
        return left || right;

    }
    public boolean isIdentical(TreeNode p, TreeNode q) {
        if(p == null || q == null) return p == q;
        boolean left = isIdentical (p.left, q.left);
        boolean right = isIdentical (p.right, q.right);
        return left && right && p.val == q.val;
    }
}