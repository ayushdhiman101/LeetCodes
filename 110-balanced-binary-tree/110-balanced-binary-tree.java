class Solution {
    boolean flag=true;
    public boolean isBalanced(TreeNode root) {
        check(root);
        return flag;
    }
    
    int check(TreeNode root){
        if(root==null) return 0;
        int left=check(root.left);
        int right=check(root.right);

        if(Math.abs(left-right)>1) flag=false;
        
        return 1+Math.max(left,right);
    }
}