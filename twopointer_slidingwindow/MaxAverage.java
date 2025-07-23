class MaxAverage{
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0.00;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double max = sum;

        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            max = Math.max(max, sum);
        }

        return max / k;
    }

    public static void main(String[] args) {
        MaxAverage sol=new MaxAverage();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result = sol.findMaxAverage(nums, k);
        System.out.println("Maximum average of subarray of length " + k + " is: " + result);
    }
}
