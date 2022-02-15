package Array;

import java.util.Arrays;

public class ArrayPartitionI {
    public static int Solution(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++)
            sum += nums[i++];
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        System.out.println(Solution(arr));
    }
}
