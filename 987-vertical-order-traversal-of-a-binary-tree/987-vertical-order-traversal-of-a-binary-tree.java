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


import java.util.Collection;
class Solution {
    TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>(); 
    //List<List<Integer>> ans = new ArrayList <>();
    int max=-1,min=1;
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        int left=0,right=0;
        inorder(root,left,right);
        return print();
        //return ans;
    }
    
     public void inorder(TreeNode root, int width, int level) {
         if(root==null) return;
         
         inorder(root.left,width-1,level+1);
         if (!map.containsKey(width)) 
                map.put(width, new TreeMap<>());
         if (!map.get(width).containsKey(level)) 
                map.get(width).put(level, new PriorityQueue<>());
         
          map.get(width).get(level).offer(root.val);
            
          
         inorder(root.right,width+1,level+1);
     }
    
    public List<List<Integer>> print() {
         List<List<Integer>> list = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            list.add(new ArrayList<>());
            for (PriorityQueue<Integer> nodes : ys.values()) {
                while (!nodes.isEmpty()) {
                    list.get(list.size() - 1).add(nodes.poll());
                }
            }
        }
        return list;
}
}

