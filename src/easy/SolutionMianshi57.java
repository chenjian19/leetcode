package easy;

public class SolutionMianshi57 {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                arr[0] = nums[left];
                arr[1] = nums[right];
                break;
            } else if (nums[left] + nums[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return arr;
    }
}
