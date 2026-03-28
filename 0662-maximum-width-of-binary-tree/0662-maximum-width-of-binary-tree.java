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
    public int widthOfBinaryTree(TreeNode root) {
        Deque <Object[]> q = new ArrayDeque<>();
        q.addFirst(new Object[]{root, 0});
        int ans = 0;
        int currLevel = 0;
        
        while(!q.isEmpty()){
            int len = q.size();
            int startIdx = (int) q.peekFirst()[1];
            int endIdx = (int) q.peekLast()[1];
            ans = Math.max(ans, startIdx - endIdx + 1);
            for(int i = 0; i < len; i ++) {
                Object[] obj = q.pollFirst();
                TreeNode node = (TreeNode) obj[0];
                int idx =  (int) obj[1];
                if(node.right != null) q.addLast(new Object[]{node.right, 2*idx + 2});
                                if(node.left != null) q.addLast(new Object[]{node.left, 2*idx + 1});

             }
             currLevel ++;
        }
      return ans;  
    }
}