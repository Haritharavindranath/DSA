import java.util.*;
class MissingNumber
{
public static void main(String [] args)
{
int[] nums={0,1};
Solution sol=new Solution();
int a=sol.missingNumber(nums);
System.out.println(a);
}
}
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int nums_sum=0;
        for (int i:nums)
        {
            nums_sum+=i;
        }
        return (sum-nums_sum);
    }
}