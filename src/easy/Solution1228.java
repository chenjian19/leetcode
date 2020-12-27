package easy;

import java.util.Collections;

public class Solution1228 {
    public int missingNumber(int[] arr) {
        int length = arr.length;
        int gap = 0;
        if (arr[1] - arr[0] > 0) {
            gap = Math.min(arr[1] - arr[0], arr[2] - arr[1]);
        } else {
            gap = Math.max(arr[1] - arr[0], arr[2] - arr[1]);
        }
        int missNum = 0;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] + gap != arr[i + 1]) {
                missNum = arr[i] + gap;
                break;
            }
        }
        return missNum;
    }
}
