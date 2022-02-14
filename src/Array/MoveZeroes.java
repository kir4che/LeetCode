package Array;

import java.util.Arrays;

public class MoveZeroes {
    public static int[] Solution(int[] nums) {
        int i = 0, j = 0;
        while(i != nums.length){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
            i++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        System.out.println(Arrays.toString(Solution(arr)));
    }
}
