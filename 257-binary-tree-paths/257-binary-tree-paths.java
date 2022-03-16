class Solution {
    List<String> l = new ArrayList<String>();
    
    public List<String> binaryTreePaths(TreeNode root) {
        binary(root,"");
        return l;
     }
    
    public void binary(TreeNode root ,String str){
        if(root == null) return;
        if(root.left  == null  && root.right == null){
               l.add(str+root.val); 
               return;
         }
         str = str + root.val ;
         binary(root.left,str+"->");
         binary(root.right,str+"->");
    }
    
    
}