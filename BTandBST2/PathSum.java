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
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        traverse(root,a,b);
        for(List<Integer> i:a)
        {
            int val=0;
            for(int j:i)
            {
                val+=j;
            }
            if(val==targetSum) return true;
        }
        return false;
    }
    public void traverse(TreeNode node,List<List<Integer>> a ,List<Integer> b)
    {
        if(node==null) return ;
        b.add(node.val);
        if(node.left==null && node.right==null)
        {
            a.add(new ArrayList<>(b));
        }
        traverse(node.left,a,b);
        traverse(node.right,a,b);
        b.remove(b.size()-1);
    }
}