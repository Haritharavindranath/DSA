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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> a=new ArrayList<>();
        traverse(root,k,a);
        return a.get(k-1);
    }
    public void traverse(TreeNode n,int k,List<Integer> a)
    {
        if(n!=null)
        {
        traverse(n.left,k,a);
        a.add(n.val);
        traverse(n.right,k,a);
    }
    }
}