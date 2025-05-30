import java.util.*;
public class Majority1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + sol.majorityElement(nums)); 
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        int n=(int)nums.length/2;
        int temp=0;
        for(int i=0;i<nums.length;i++)
        {
            if(a.containsKey(nums[i])==false)
            {
                a.put(nums[i],1);
            }
            else{
                a.put(nums[i],a.get(nums[i])+1);
            }
        }
        for(int i:a.keySet())
        {
            if(a.get(i)>n)
            {
                temp=i;
            }
        }
        return temp;
    }
}