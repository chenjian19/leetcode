package easy;

import java.util.HashSet;

public class Solution287 {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int val = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                val = nums[i];
                break;
            }
            set.add(nums[i]);
        }
        return val;
    }
}
