package Array;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static int[] Solution(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            ans[i] = nums[nums[i]];
        return ans;
    }
    public static void main(String[] args) {
        int[] data = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(Solution(data)));
    }
}
