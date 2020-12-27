package easy;

import java.util.HashMap;

public class Solution169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int middleSize = nums.length / 2;
        int majorNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                count = map.get(nums[i]);
                count++;
                if (count > middleSize) {
                    majorNum = nums[i];
                    break;
                }
                map.put(nums[i], count);
            } else {
                map.put(nums[i], 1);
            }
        }
        return majorNum;
    }
}
