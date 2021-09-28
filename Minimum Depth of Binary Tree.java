// Given a binary tree, find its minimum depth.

// The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

// Note: A leaf is a node with no children.

class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int left=minDepth(root.left);
        int right=minDepth(root.right);
        
        if(root.left==null||root.right==null) return (1+Math.max(left,right));
        
        return (1+Math.min(left,right));
        
    }
    
}
