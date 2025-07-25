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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return traverse(root,targetSum);
    }
    public boolean traverse(TreeNode node,int t)
    {
        if(node==null) return false;
        if(node.left==null && node.right==null)
        {
            if(node.val==t) return true;
        }
        return traverse(node.left,t-node.val) || traverse(node.right,t-node.val);
    }
}