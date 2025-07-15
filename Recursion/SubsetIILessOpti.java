import java.util.*;
class SubsetIILessOpti {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> a=new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        traverse(nums,a,b,0);
        for(List<Integer> i:a)
        {
            ans.add(i);
        }
        return ans;
    }
    public void traverse(int[] nums,Set<List<Integer>> a,List<Integer> b,int i)
    {
        if(i==nums.length)
        { 
            a.add(new ArrayList<>(b));
            return;
        }
        b.add(nums[i]);
        traverse(nums,a,b,i+1);
        b.remove(b.size()-1);
        traverse(nums,a,b,i+1);
    }
}
