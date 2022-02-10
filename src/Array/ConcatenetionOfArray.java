package Array;

import java.util.Arrays;

public class ConcatenetionOfArray {
    public static int[] Solution(int[] nums) {
        int[] ans = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] data = {1,2,1};
        System.out.println(Arrays.toString(Solution(data)));
    }
}
