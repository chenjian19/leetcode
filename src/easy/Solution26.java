package easy;

public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;++j){
            if(nums[i]!=nums[j]){
                i++;
            }
        }
        return i;
    }
}
