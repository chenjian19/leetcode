package easy;

public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int[] arr = new int[length1];
        int length2 = nums2.length;
        for (int i = 0; i < length1; i++) {
            int next = -1;
            int j = 0;
            while (nums1[i] != nums2[j]) {
                j++;
            }
            for (int k = j + 1; k < length2; k++) {
                if (nums2[k] > nums1[i]) {
                    next = nums2[k];
                    break;
                }
            }
            arr[i] = next;
        }
        return arr;
    }
}
