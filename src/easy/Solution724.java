package easy;

import org.junit.Test;

public class Solution724 {
    public int pivotIndex(int[] nums) {
        int total=0;
        int sum=0;
        for (int num : nums) {
            total+=num;
        }
        for (int i = 0; i < nums.length; i++) {
            if(sum==total-sum-nums[i]){
                return i;
            }
            sum+=nums[i];
        }
        return -1;
    }

    @Test
    public void test(){
        int[] arr1={1,7,3,6,5,6};
        System.out.println(pivotIndex(arr1));
    }
}
