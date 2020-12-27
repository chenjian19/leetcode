package easy;

public class Solution1295 {

    public int findNumbers(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if((1<=(nums[i]/10)&&(nums[i]/10)<=9)||(1<=(nums[i]/1000)&&(nums[i]/1000)<=9)||(1<=(nums[i]/100000)&&(nums[i]/100000)<=9)){
                count++;
            }
        }
        return count;
    }
}
