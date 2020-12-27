package easy;

import java.net.URLEncoder;

public class Solution896 {
    public boolean isMonotonic(int[] A) {
        int length = A.length;
        if (length == 1 || length == 2) {
            return true;
        }
        int up = 0;
        int down = 0;
        boolean flag = true;
        for (int i = 0; i < length-1; i++) {
            if (A[i] < A[i + 1]) {
                if (down != 0) {
                    flag = false;
                    break;
                }
                up++;
            }
            if (A[i] > A[i + 1]) {
                if (up != 0) {
                    flag = false;
                    break;
                }
                down++;
            }
        }
        return flag;
    }
}
