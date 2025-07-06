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

public class Preorder
{
public static void main(String args[])
{
	TreeNode root=new TreeNode(5);
	root.left=new TreeNode(4);
	root.right=new TreeNode(6);
	root.left.left=new TreeNode(3);
	root.right.right=new TreeNode(7);
	List<Integer> a=new ArrayList<>();
	List<Integer> ans=new ArrayList<>();
	ans=traverse(root,a);
	System.out.println(ans);
}
public static List<Integer> traverse(TreeNode node,List<Integer> a)
{
	if(node!=null)
	{
	a.add(node.val);
	traverse(node.left,a);
	traverse(node.right,a);
	}
	return a;
}
}