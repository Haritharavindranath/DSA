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
    public TreeNode sortedArrayToBST(int[] nums) {
      
      return traverse(nums,0,nums.length-1);  

    }
    public TreeNode traverse(int[] nums,int i,int j)
    {
       if(i>j) return null;
       
       int k=(i+j)/2;
       TreeNode n=new TreeNode(nums[k]);
       n.left=traverse(nums,i,k-1);
       n.right=traverse(nums,k+1,j);
       
       return n;
    }
}