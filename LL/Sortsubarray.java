import java.util.*;
public class Sortsubarray
{
	public static void main(String[] args)
	{
	int[] arr={10,15,20,30,25,40,35,45,50,60};
	List<Integer> a=new ArrayList<>();
	a=sort(arr);
	System.out.println(a);
	}

	public static List<Integer> sort(int[] arr)
	{
	int k=arr[1]-arr[0];
	List<Integer> a=new ArrayList<>();
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]>arr[i+1])
		{
			a.add(arr[i+1]);
		}
	}
	Collections.sort(a);
	return a;
	}
}