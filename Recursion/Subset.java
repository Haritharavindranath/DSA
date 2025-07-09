import java.util.*;
public class Subset
{
    public static void main(String[] args)
    {
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        int[] arr={1,2,2};
        subset(arr,0,a,b);
        System.out.println(a);
    }
    public static void subset(int[] arr,int i,List<List<Integer>> a,List<Integer> b)
    {
        if(i==arr.length)
        {
            a.add(new ArrayList<>(b));
            return;
        }
        b.add(arr[i]);
        subset(arr,i+1,a,b);
        b.remove(b.size() - 1);
        subset(arr,i+1,a,b);
    }
}