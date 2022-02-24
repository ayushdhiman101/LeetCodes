class Solution {
    
    public boolean isBalanced(TreeNode root) {
    int res=check(root);
    if(res==-1) return false;
    return true;
    }
    
    int check(TreeNode root){
        if(root==null) return 0;
        int left=check(root.left);
        int right=check(root.right);

        if(left==-1 || right==-1) return -1;
        if(Math.abs(left-right)>1) return -1;
        else return Math.max(left,right)+1;

    }
}