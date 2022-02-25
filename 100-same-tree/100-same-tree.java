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
    boolean flag=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        tree(p,q);
        return flag;
    }

public boolean tree(TreeNode p, TreeNode q) {
        if (p==null && q==null) return true;
        
        if (p==null||q==null) {
            flag=false;
            return false;
        }
        if (p.val!=q.val && p!=q) {
            flag=false;
            return false;
        }
        
        tree(p.left,q.left);
        tree(p.right,q.right);
        

        return true;
    }}