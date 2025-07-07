import java.util.*;
class Minplatform
{
    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        int result = findPlatforms(arrival, departure);
        System.out.println("Minimum number of platforms required: " + result);
    }
    public static int findPlatforms(int[] arr, int[] dep)
    {
        List<List<Integer>> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            List<Integer> b=new ArrayList<>();
            b.add(arr[i]);
            b.add(dep[i]);
            a.add(b);
        }
        a.sort((x,y)->x.get(0)-y.get(0));
        int max=0;
        for(int i=0;i<a.size();i++)
        {
            int l=1;
            for(int j=i+1;j<a.size();j++)
            {
            if (a.get(i).get(0) < a.get(j).get(1) && a.get(j).get(0) < a.get(i).get(1))
            {
                l++;
            }
            }
            max=Math.max(max,l);
        }
        return max;
    }
}