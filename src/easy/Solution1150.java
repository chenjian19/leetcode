package easy;

import org.junit.Test;

public class Solution1150 {
    public boolean isMajorityElement(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target) > nums.length / 2;
    }

    public int binarySearch(int[] arr, int left, int right, int target) {
        int mid = (left + right) / 2;
        int midVal = arr[mid];
        int count = 1;
        if (left > right || target < arr[0] || target > arr[arr.length - 1]) {
            return 0;
        }
        if (midVal < target) {
            return binarySearch(arr, mid + 1, right, target);
        } else if (midVal > target) {
            return binarySearch(arr, left, right - 1, target);
        } else {
            int temp = mid - 1;
            while (temp >= 0 && arr[temp] == target) {
                temp--;
                count++;
            }
            temp = mid + 1;
            while (temp <= arr.length - 1 && arr[temp] == target) {
                temp++;
                count++;
            }
            return count;
        }
    }

    @Test
    public void test() {
        int[] arr = {2, 4, 5, 5, 5, 5, 5, 6, 6};
        int num = binarySearch(arr, 0, 8, 5);
        System.out.println(num);
    }
}
