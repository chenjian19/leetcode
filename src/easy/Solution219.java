package easy;

public class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean flag = false;
        for(int i = 0; i< nums.length; i++){
            for(int j = i+1 ; j < i+1+k; j++){
                if(j == nums.length){
                    break;
                }
                if(nums[i] == nums[j]){
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        return flag;
    }
}
