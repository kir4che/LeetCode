package Array;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0], sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            max = Math.max(max, sum);
        }
        return max;
    }
}
