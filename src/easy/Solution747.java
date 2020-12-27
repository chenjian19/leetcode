package easy;

public class Solution747 {
    public int dominantIndex(int[] nums) {
        int index=0;
        int max=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0&&(max/nums[i]<2)){
                if(i!=index) {
                    index=-1;
                    break;
                }
            }
        }
        return index;
    }
}
