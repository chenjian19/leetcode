package easy;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
