class MaxSumCircularSubarray{
    public int maxSubarraySumCircular(int[] nums) {
        int currMax = nums[0], max = nums[0];
        int currMin = nums[0], min = nums[0];
        int total = nums[0];

        for (int i = 1; i < nums.length; i++) {
            total += nums[i];

            currMax = Math.max(nums[i], currMax + nums[i]);
            max = Math.max(max, currMax);

            currMin = Math.min(nums[i], currMin + nums[i]);
            min = Math.min(min, currMin);
        }

        if (max < 0) return max;

        return Math.max(max, total - min);
    }

    public static void main(String[] args) {
    MaxSumCircularSubarray sol = new MaxSumCircularSubarray();

        // Example 1
        int[] nums1 = {1, -2, 3, -2};
        System.out.println("Max circular subarray sum: " + sol.maxSubarraySumCircular(nums1));

        // Example 2
        int[] nums2 = {5, -3, 5};
        System.out.println("Max circular subarray sum: " + sol.maxSubarraySumCircular(nums2));

        // Example 3 (All negatives)
        int[] nums3 = {-3, -2, -3};
        System.out.println("Max circular subarray sum: " + sol.maxSubarraySumCircular(nums3));
    }
}
