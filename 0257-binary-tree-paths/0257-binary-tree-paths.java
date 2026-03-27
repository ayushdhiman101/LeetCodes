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
    List<String> ans = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        binaryTreePaths2(root, "");
        return ans;
    }
    public void binaryTreePaths2(TreeNode root, String path) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            ans.add(path + root.val);
            path = "";
        }
        path += root.val + "->";

        binaryTreePaths2(root.left, path);
        binaryTreePaths2(root.right, path);

        return;

    }

}