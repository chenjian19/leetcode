package easy;

import java.util.HashSet;

public class SolutionMianshi03 {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int length = nums.length;
        int value=0;
        for (int i = 0; i < length; i++) {
            value=nums[i];
            if (set.contains(value)) {
                break;
            }else{
                set.add(value);
            }
        }
        return value;
    }
}
