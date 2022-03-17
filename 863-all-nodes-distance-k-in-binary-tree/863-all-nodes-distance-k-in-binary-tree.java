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
    HashMap <TreeNode, TreeNode> map = new HashMap <>();
    List <Integer> list = new ArrayList <>();
    boolean flag= false;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        parent(root);
        //solve(root,target,k,flag);
        traversal (target , k);
        return list;
        
    }
    public void parent(TreeNode root){
        Queue <TreeNode> q = new LinkedList <>();
        q.add(root);
        
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            
            if(node.left != null){
                q.add(node.left);
                map.put(node.left,node);
            }
            if(node.right != null){
                q.add(node.right);
                map.put(node.right , node);
            }
        }
    }
    
     // public void solve(TreeNode root, TreeNode target, int k ,boolean flag){
     //     if(root == null || flag == true) return;
     //     if(root == target) {
     //         traversal(root,  target,  k);
     //         flag = true;
     //         return;
     //     }
     //     solve(root.left , target , k, flag);
     //     solve(root.right , target , k, flag);
     //     return ;
     // }
    
    public void traversal(TreeNode target, int k){
        
        Queue <TreeNode> q = new LinkedList <>(); 
        List <TreeNode> visited = new ArrayList <>();
        q.add(target);
        visited.add(target);
        while(k!=0){
            int size=q.size();
            for(int i =0;i<size;i++){
                TreeNode node = q.poll();
                if(!visited.contains(node))
                    visited.add(node);
                

                if(node.left != null && !visited.contains(node.left)){
                    q.add(node.left);
                    visited.add(node.left);
                }
                if(node.right != null && !visited.contains(node.right)){
                    q.add(node.right);
                    visited.add(node.right);
                }
                if(map.containsKey(node) && !visited.contains(map.get(node))){
                    q.add(map.get(node));
                    visited.add(node);
                }
            }
            k--;
        }
        
        while(!q.isEmpty()){
            list.add(q.poll().val);
        }
    }
}








