import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        traverse(nums, a, b, 0);
        return a;
    }

    public void traverse(int[] nums, List<List<Integer>> a, List<Integer> b, int i) {
        a.add(new ArrayList<>(b));
        for (int l = i; l < nums.length; l++) {
            if (l > i && nums[l] == nums[l - 1]) continue;
            b.add(nums[l]);
            traverse(nums, a, b, l + 1);
            b.remove(b.size() - 1);
        }
    }

    // Main function to test the code
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 2};
        List<List<Integer>> result = sol.subsetsWithDup(nums);

        System.out.println("Subsets with duplicates removed:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
