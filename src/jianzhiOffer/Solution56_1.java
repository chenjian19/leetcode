package jianzhiOffer;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution56_1 {
    public int[] singleNumbers(int[] nums) {
        int[] arr = new int[2];
        //ArrayList<Integer> list = new ArrayList<>();

        int length = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        int index = 0;
        for (Integer num : set) {
            arr[index] = num;
            index++;
        }


        /*for (int i = 0; i < length; i++) {
            if (list.contains(nums[i])) {
                list.remove(new Integer(nums[i]));
            } else {
                list.add(nums[i]);
            }
        }
        arr[0] = list.get(0);
        arr[1] = list.get(1);*/
        return arr;
    }
}
