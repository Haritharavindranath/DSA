public class Sortsubarray
{
	public static void main(String[] args)
	{
	int[] arr={-1,0,4,3,2,1};
	List<Integer> a=new ArrayList<>();
	a=sort(arr);
	System.out.println(arr);
	}

	public List<Integer> sort(int[] arr)
	{
	List<Integer> a=new ArrayList<>();
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]+1!=arr[i+1])
		{
			a.add(arr[i]);
		}
	}
	return Collections.sort(a);
	}
}