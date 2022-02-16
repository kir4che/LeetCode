package Array;

public class MajorityElement {
    public static int Solution(int[] nums) {
        int count = 1, most = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(most==nums[i]) ++count;
            else --count;
            if(count==0) {
                most = nums[i];
                count = 1;
            }
        }
        return most;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,2,1,1,4};
        System.out.println(Solution(arr));
    }
}
