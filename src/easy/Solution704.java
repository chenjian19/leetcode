package easy;

public class Solution704 {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public int binarySearch(int[] arr, int left, int right, int target) {
        int mid = (left + right) / 2;
        int midVal = arr[mid];
        if (left > right || target < arr[0] || target > arr[arr.length - 1]) {
            return -1;
        }
        if (midVal < target) {
            return binarySearch(arr, mid + 1, right, target);
        } else if (midVal > target) {
            return binarySearch(arr, left, right - 1, target);
        } else {
            return mid;
        }
    }
}
