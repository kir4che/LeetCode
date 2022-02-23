package Array;

public class MaxConsecutiveOnes {
    public static int Solution(int[] nums) {
        int cnt = 0, longest = 0;
        for (int i = 0; i < nums.length; i++) {
            cnt += nums[i];
            if(cnt > longest) longest = cnt;
            if(nums[i] == 0) cnt = 0;
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1};
        System.out.println(Solution(arr));
    }
}
