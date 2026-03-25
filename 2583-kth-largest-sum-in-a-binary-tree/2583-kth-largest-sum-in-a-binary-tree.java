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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List <Long> list = new ArrayList<>();
        Queue <TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            long sum = 0;
            long len = q. size();
            for(int i = 0; i < len; i++) {
                TreeNode node = q.poll();
                sum+=node.val;
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            list.add(sum);
        }
        Collections.sort(list);
        
        return k > list.size() ? -1 :list.get(list.size() - k);
    }
}