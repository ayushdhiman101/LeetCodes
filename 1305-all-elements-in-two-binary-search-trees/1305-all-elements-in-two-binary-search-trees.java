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
    ArrayList <Integer> list=new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        solve(root1);
        solve(root2);
        Collections.sort(list);
        return list;
    }
    void solve(TreeNode root){
        if(root==null) return;
        list.add(root.val);
        solve(root.left);
        solve(root.right);
        return;
    }
}