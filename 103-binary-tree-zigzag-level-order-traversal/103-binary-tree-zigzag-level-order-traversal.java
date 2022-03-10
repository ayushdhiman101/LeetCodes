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

// true == L -> R
// false == R -> L
class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return list;
        zig(root);
        return list;
        
    }
     public void zig(TreeNode root) {
         Queue <TreeNode> que = new LinkedList <>();
         que.add(root);
         boolean flag=true;
         while(!que.isEmpty()){
             int size=que.size();
             List<Integer> nodelist = new ArrayList<>();

             for(int i=0;i<size;i++){
                 TreeNode node=que.poll();
                 
                 nodelist.add(node.val);
                 
                 
                 if(node.left!=null)
                     que.add(node.left);
                 if(node.right!=null)
                     que.add(node.right);
             }
             if(!flag) Collections.reverse(nodelist);
                 list.add(nodelist);
                       

                 
             
             flag=!flag;
             
         }
         
     }
}