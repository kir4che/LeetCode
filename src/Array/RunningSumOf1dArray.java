package Array;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static int[] Solution(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            ans[i] = nums[i] + ans[i-1];
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString((Solution(arr))));
    }

}
