import java.util.*;
class TwoSum
{
public static void main(String [] args)
{
int[] nums={1,3,9,2,7};
int target=9;
int[] result=two(nums,target);
System.out.println(Arrays.toString(result));
}
static int[] two(int[] nums,int target)
{
HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<nums.length;i++)
{
int c=target-nums[i];
if(map.containsKey(c))
{
return new int[]{map.get(c),i};
}
else{
map.put(nums[i],i);
}
}
return new int[]{};
}
}