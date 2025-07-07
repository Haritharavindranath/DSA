import java.util.*;
class NMeetings
{
static int count=1;
    public static void main(String [] args)
    {
        int[] strt={0,3,1,5,5,8};
        int[] end={5,4,2,9,7,9};
        int a=maxmeet(strt,end);
        System.out.println(a);
    }
    public static int maxmeet(int[] strt,int[] end)
    {
        List<List<Integer>> a=new ArrayList<>();
        for(int i=0;i<strt.length;i++)
        {
            List<Integer> b=new ArrayList<>();
            b.add(strt[i]);
            b.add(end[i]);
            a.add(b);
        }
        a.sort((x,y)->x.get(1)-y.get(1));
System.out.println(a);
        
        int count = 1;
        int lastEnd = a.get(0).get(1);

        for (int i = 1; i < a.size(); i++) {
            if (a.get(i).get(0) >= lastEnd) {
                count++;
                lastEnd = a.get(i).get(1);
            }
        }
        return count;

    }
}