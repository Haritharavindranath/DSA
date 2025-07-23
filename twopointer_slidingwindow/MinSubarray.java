
import java.util.*;
public class MinSubarray {
    public static void main(String[] args) {
        int target = 11;
        int[] nums = {1, 2, 3, 4, 5};

        int result = minSubArrayLen(target, nums);
        System.out.println("Minimum length of subarray: " + result);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int right =0, left=0, sum=0;
        int start=0,end=0;
        int min=Integer.MAX_VALUE;
        while(right<nums.length)
        {
            sum+=nums[right];
            while(sum>=target)
            {
                if(min>right-left+1) 
                {
                    min=right-left+1;
                    start=left;
                    end=right;
                }
                sum-=nums[left];
                left++;
            }
            right++;
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums,start,end+1)));
        return min==Integer.MAX_VALUE?0:min;
    }
}
