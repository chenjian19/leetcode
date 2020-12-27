package easy;

public class Solution283 {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return;
        }
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < length; i++) {
            nums[i] = 0;
        }
    }
}
