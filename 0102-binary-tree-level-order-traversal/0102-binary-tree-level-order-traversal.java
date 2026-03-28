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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue <TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        q.offer(root);
        int currLevel = 0;
        while(!q.isEmpty()){
            list.add(new ArrayList<>());
            int len = q.size();
            for(int i = 0; i < len; i++){
                TreeNode node = q.poll();
                list.get(currLevel).add(node.val);
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            currLevel++;
        }
    return list;    
    }
}