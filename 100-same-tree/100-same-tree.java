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

public void tree(TreeNode p, TreeNode q) {
        if (p==null && q==null) return ;
        
        if ((p==null||q==null)||(p.val!=q.val && p!=q)) {
            flag=false;
            return ;
        }
    
        tree(p.left,q.left);
        tree(p.right,q.right);
        
        return;
    }}