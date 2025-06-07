import java.util.*;
class LongConsecutiveSequence
{
public static void main(String [] args)
{
int[] nums={0,3,7,2,5,8,4,6,0,1};
Solution ob=new Solution();
int result=ob.longestConsecutive(nums);
System.out.println(result);
}
}

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int maxLen = 1;
        int currLen = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            } else if (nums[i] == nums[i - 1] + 1) {
                currLen++;
            } else {
                currLen = 1;
            }
            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }
}
