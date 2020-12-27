package easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

public class SolutionMianshi1710 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int k = 1;
        for (int i = 0; i < length; i++) {
            if (nums[i] != i) {
                k = i + 1;
                break;
            }
        }
        return k;
    }

    @Test
    public void test() {
        int[] nums = {3, 2, 3};
        int i = majorityElement(nums);
        System.out.println(i);
    }
}
