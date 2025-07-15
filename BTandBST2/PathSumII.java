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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        traverse(root,targetSum,a,b);
        return a;
    }
    public void traverse(TreeNode node,int t,List<List<Integer>> a,List<Integer> b)
    {
        if(node==null) return;
        b.add(node.val);
        if(node.left==null && node.right==null)
        {
            if(node.val==t)
            {
                a.add(new ArrayList<>(b));
            }
        }
        traverse(node.left,t-node.val,a,b);
        traverse(node.right,t-node.val,a,b);
        b.remove(b.size()-1);
    }
}