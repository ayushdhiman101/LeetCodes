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
class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode root, int l){
        node=root;
        level=l;
    }
}
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList <Integer> list = new ArrayList <>();
        if(root==null) return list;
        Map <Integer,Integer> map = new TreeMap<>();
        Queue <Pair> q= new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
              Pair it = q.poll();
              TreeNode node= it.node;
              int level = it.level;
              map.put(level,node.val);
              if(node.left!=null)
                q.add(new Pair(node.left,level+1));
              if(node.right!=null)
                q.add(new Pair(node.right,level+1))  ;          
        }
        for (int key: map.keySet()) 
            list.add(map.get(key));
      
        return list;
    }
}