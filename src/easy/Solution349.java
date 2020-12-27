package easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

public class Solution349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        shellSort(nums1);
        shellSort(nums2);
        int index1 = 0;
        int index2 = 0;
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            if (index1 >= nums1.length || index2 >= nums2.length) {
                break;
            }
            if (nums1[index1] == nums2[index2]) {
                set.add(nums1[index1]);
                index1++;
                index2++;
            } else if (nums1[index1] < nums2[index2]) {
                index1++;
            } else {
                index2++;
            }
        }
        int[] arr = new int[set.size()];
        int i = 0;
        for (Integer val : set) {
            arr[i] = val;
            i++;
        }

        return arr;
    }

    public void shellSort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int insertVal = arr[i];
                int insertIndex = i;
                while (insertIndex - gap >= 0 && insertVal < arr[insertIndex - gap]) {
                    arr[insertIndex] = arr[insertIndex - gap];
                    insertIndex -= gap;
                }
                arr[insertIndex] = insertVal;
            }
        }
    }

    @Test
    public void test() {
        int[] arr = {5, 3, 7, 4, 2};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
