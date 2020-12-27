package easy;

public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        if (target <= nums[0]) {
            return 0;
        }
        if (target == nums[length - 1]) {
            return length - 1;
        }
        if (target > nums[length - 1]) {
            return length;
        }
        int insertIndex = 0;
        for (int i = 1; i < length; i++) {
            if (nums[i] >= target) {
                insertIndex = i;
                break;
            }
        }
        return insertIndex;
    }
}
