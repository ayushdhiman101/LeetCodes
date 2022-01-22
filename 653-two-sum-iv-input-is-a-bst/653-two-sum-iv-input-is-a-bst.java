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
    boolean flag=false;
    public boolean findTarget(TreeNode root, int k) {
        ArrayList <Integer> list=new ArrayList<>();
        return solve(root, k, list);
    }
    public boolean solve(TreeNode root, int k, ArrayList<Integer> list){
        if(root==null) return false;
        if(list.contains(root.val)) return true;
        list.add(k-root.val);
        return solve(root.left,k,list) || solve(root.right,k,list);
        
    }
}