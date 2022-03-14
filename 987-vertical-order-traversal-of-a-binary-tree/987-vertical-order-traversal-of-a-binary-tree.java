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
 */class Tuple {
    TreeNode node; 
    int row;
    int col; 
    public Tuple(TreeNode _node, int _row, int _col) {
        node = _node; 
        row = _row; 
        col = _col; 
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>(); 
        Queue<Tuple> q = new LinkedList<Tuple>();
        q.offer(new Tuple(root, 0, 0)); 
        while(!q.isEmpty()) {
            Tuple tuple = q.poll(); 
            TreeNode node = tuple.node; 
            int x = tuple.row; 
            int y = tuple.col; 
            
            
            if (!map.containsKey(x)) {
                map.put(x, new TreeMap<>());
            }
            if (!map.get(x).containsKey(y)) {
                map.get(x).put(y, new PriorityQueue<>());
            }
            map.get(x).get(y).offer(node.val);
            
            if(node.left != null) {
                q.offer(new Tuple(node.left, x - 1, y + 1)); 
            } 
            if(node.right != null) {
                q.offer(new Tuple(node.right, x + 1, y + 1)); 
            }
        }
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





















// import java.util.Collection;
// class Solution {
//     HashMap <Integer,Integer> map = new HashMap<>();
//     List<List<Integer>> ans = new ArrayList <>();
//     int max=-1,min=1;
    
//     public List<List<Integer>> verticalTraversal(TreeNode root) {
//         int left=0,right=0;
//         inorder(root,left,right);
//         print();
//         return ans;
//     }
    
//      public void inorder(TreeNode root, int left, int right) {
//          if(root==null) return;
//          inorder(root.left,left-1,right);
//          map.put(root.val,left+right);
//          max=Math.max(left+right,max);
//          min=Math.min(left+right,min);
//          inorder(root.right,left,right+1);
//      }
    
//     public void print() {
//         for(int i=min;i<=max;i++){ 
//             ArrayList <Integer> list = new ArrayList <>();
    
//             for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//                 Integer k = entry.getKey();
//                 Integer v = entry.getValue();
//                 if(v==i)
//                     list.add(k);
//         }
//          ans.add(list);  
//     }
// }
// }

