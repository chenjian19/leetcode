package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution977 {
    public int[] sortedSquares(int[] A) {
        int length = A.length;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = A[i] * A[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
