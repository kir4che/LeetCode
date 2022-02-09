package Array;

import java.util.Arrays;

public class MaximumSubarray {
    public static int Solution(int[] nums) {
        int max = nums[0], sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println((Solution(arr)));
    }
}