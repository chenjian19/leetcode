package easy;

import java.util.Arrays;

public class SolutionMianshi1704 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int k = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != i) {
                k = i + 1;
                break;
            }
        }
        return k;
    }

}
