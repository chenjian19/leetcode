package easy;

public class Solution53_1 {
    public int search(int[] nums, int target) {
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == target) {
                count++;
            }
            if (nums[i] > target) {
                break;
            }
        }
        return count;
    }
}
