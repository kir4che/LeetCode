package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean Solution1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++)
            if (nums[i] == nums[i+1]) return true;
        return false;
    }

    public static boolean Solution2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] data = {1,2,3,1};
        System.out.println(Solution1(data));
        System.out.println(Solution2(data));
    }
}
