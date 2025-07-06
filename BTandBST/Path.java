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

public class Path
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
	List<List<Integer>> a=new ArrayList<>();
	List<Integer> b=new ArrayList<>();
	traverse(root,a,b);
	System.out.println(a);
	
}
public static void traverse(TreeNode node,List<List<Integer>> a,List<Integer> b)
{
	if(node!=null)
	{
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
}