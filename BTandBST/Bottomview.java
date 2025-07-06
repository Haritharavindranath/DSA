import java.util.*;
class TreeNode
{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val)
	{
	this.val=val;
	}
	TreeNode(int val,TreeNode left,TreeNode right)
	{
	this.val=val;	
	this.left=left;
	this.right=right;
	}
}

public class Bottomview
{
public static void main(String args[])
{
	TreeNode root=new TreeNode(5);
	root.left=new TreeNode(4);
	root.right=new TreeNode(6);
	root.right.right=new TreeNode(7);
	root.right.left=new TreeNode(9);
	List<Integer> a=new ArrayList<>();
	List<Integer> ans=new ArrayList<>();
	ans=traverse(root,a);
	System.out.println(ans);
}
public static List<Integer> traverse(TreeNode node,List<Integer> a)
{
	if(node!=null)
	{
	traverse(node.left,a);
	if(node.left==null && node.right==null) a.add(node.val);
	traverse(node.right,a);
	}
	return a;
}
}