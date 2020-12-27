package easy;

import java.util.Arrays;

public class Solution628 {
    public int maximumProduct(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        int length = nums.length ;
        int temp1 = nums[length-1]*nums[length-2]*nums[length-3];
        int temp2 = nums[0]*nums[1]*nums[length-1];
        result = temp1 > temp2 ? temp1 : temp2;
        return result;
    }
}
