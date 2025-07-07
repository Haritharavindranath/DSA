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
    public boolean isSymmetric(TreeNode root) {
        boolean a;
        a=traverse(root.right,root.left);
        return a;
    }
    public boolean traverse(TreeNode right, TreeNode left)
    {
        if(right==null && left==null)
        {
            return true;
        }
        if(right!=null && left!=null)
        {
        if(right.val!=left.val)
        {
            return false;
        }
        return traverse(right.left,left.right) && traverse(right.right,left.left);
        }
        return false;
        
    }
}