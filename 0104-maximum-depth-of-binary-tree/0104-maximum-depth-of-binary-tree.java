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
    int max = 0;
    public int maxDepth(TreeNode root) {
        return maxDepthSolution(root, 0);
    }
    public int maxDepthSolution(TreeNode root, int depth) {
    if(root == null) return depth;
    int depthLeft = maxDepthSolution(root.left, depth+1);
    int depthRight = maxDepthSolution(root.right, depth+1);
    return Math.max(depthRight, depthLeft);
    }


}