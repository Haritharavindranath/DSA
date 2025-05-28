import java.util.*;
import java.io.*;

class ArrayDuplicate{
public static void main(String []args)
{
int[] nums={1,3,4,2,2};
Solution sol=new Solution();
int y=sol.findDuplicate(nums);
System.out.println(y);
}
}
class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<Integer,Integer>();
        int x=0;
        for (int i=0;i<nums.length;i++)
        {
            if(a.containsKey(nums[i])==false){
                a.put(nums[i],0);
            }
            else{
                a.put(nums[i],a.get(nums[i])+1);
            }
        }
        for(int i: a.keySet())
        {
            if(a.get(i)>0)
            {
                x=i;
            }
        }
        return x;
    }
}