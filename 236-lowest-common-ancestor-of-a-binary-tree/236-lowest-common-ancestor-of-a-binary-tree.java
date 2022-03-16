/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList <TreeNode> list = new ArrayList<>();
        ArrayList <TreeNode> list2 = new ArrayList<>();
        rootToNode(root,p,list);
        rootToNode(root,q,list2);
        print(list,list2);
        return solve(list,list2);
    }
    public boolean rootToNode(TreeNode root,TreeNode p,List <TreeNode> arr){
        if(root == null) return false; 
        
        arr.add(root);
        if(root == p) return true; 
        
        if(rootToNode(root.left, p, arr) || rootToNode(root.right, p, arr)) return true; 
        
        arr.remove(arr.size() - 1); 
        
        return false; 
    }
    public void print(List <TreeNode> list,List <TreeNode> list2){
        for(TreeNode i : list)
            System.out.print(i.val + " ");
        System.out.println( " ");
        for(TreeNode i : list2)
            System.out.print(i.val + " ");
        
    }
    public TreeNode solve(List <TreeNode> list,List <TreeNode> list2) {
        int i=0,j=0;
        while(list.get(i)==list2.get(j)){
            
            if(i<list.size()-1 && j<list2.size()-1){
                i++;j++;
            }
            else
                return list.get(i);
        }
        return list.get(i-1);
    }
}