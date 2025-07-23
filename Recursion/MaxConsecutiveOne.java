import java.util.*;
public class MaxConsecutiveOne {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int i=0;
        int j=1;
        List<List<Integer>> a=new ArrayList<>();
        while(i<nums.length && j<nums.length)
        {
            if(nums[j-1]==1 && nums[j]==1)
            {
                j++;
            }
            else{
                List<Integer> b=new ArrayList<>();
                for(int x=i;x<j;x++)
                {
                    b.add(nums[x]);
                }
                a.add(new ArrayList<>(b));
                i=j;
                j++;
            }
        }
        System.out.println(a);
    }
}
