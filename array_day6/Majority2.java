import java.util.*;
public class Majority2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,2};
        System.out.println("Majority Element: " + sol.majorityElement(nums));  
    }
}

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        int n=(int)nums.length/3;
        ArrayList<Integer> b=new ArrayList<>();
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
                b.add(i);
            }
        }
        return b;
    }
}