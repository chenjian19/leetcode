package easy;

import java.util.Arrays;

public class Solution268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0) {
            return 0;
        }
        if (nums[nums.length - 1] != nums.length) {
            return nums.length;
        }
        int missNum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] + 1) != nums[i + 1]) {
                missNum = nums[i] + 1;
                break;
            }
        }
        return missNum;
    }
}
