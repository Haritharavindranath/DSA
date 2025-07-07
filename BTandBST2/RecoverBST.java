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
    public void recoverTree(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        traverse(root,a);
        Collections.sort(a);
        int[] i={0};
        change(root,a,i);
    }
    public void traverse(TreeNode node,List<Integer> a)
    {
        if(node!=null)
        {
        traverse(node.left,a);
        a.add(node.val);
        traverse(node.right,a);
        }
    }
    public void change(TreeNode root,List<Integer> a,int[] i)
    {
        if(root!=null)
        {
        change(root.left,a,i);
        if(i[0]<a.size())
        {
            root.val=a.get(i[0]);
            i[0]++;
        }
        change(root.right,a,i);
        }
    }
}