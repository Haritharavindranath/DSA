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

public class Leftview
{
public static void main(String args[])
{
	TreeNode root=new TreeNode(5);
	root.left=new TreeNode(4);
	root.left.right=new TreeNode(1);
	root.right=new TreeNode(6);
	root.left.left=new TreeNode(3);
	root.right.right=new TreeNode(7);
	root.right.left=new TreeNode(9);
	List<Integer> a=new ArrayList<>();
	List<Integer> ans=new ArrayList<>();
	ans=traverse(root,a,0);
	System.out.println(ans);
}
public static List<Integer> traverse(TreeNode node,List<Integer> a,int i)
{
	if(node!=null)
	{
	if(a.size()==i) a.add(node.val);
	traverse(node.left,a,i+1);
	traverse(node.right,a,i+1);
	}
	return a;
}
}