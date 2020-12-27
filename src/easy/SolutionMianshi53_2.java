package easy;

public class SolutionMianshi53_2 {
    public int missingNumber(int[] nums) {
        if (nums[0] != 0) {
            return 0;
        }
        int missNum = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                missNum = nums[i] - 1;
                break;
            }
        }
        return missNum;
    }
}
