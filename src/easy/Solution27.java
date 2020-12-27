package easy;

import org.junit.Test;

public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int length=nums.length;
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==val){
                length--;
            }else{
                nums[count]=nums[i];
                count++;
            }
        }
        return length;
    }

    @Test
    public void test(){
        int[] nums={3,2,2,3};
        int a = removeElement(nums, 3);
        System.out.println(a);
    }
}
