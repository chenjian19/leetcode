package easy;

import java.util.Arrays;

public class SolutionMianshi0102 {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        int length = s1.length();
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean flag = true;
        for (int i = 0; i < length; i++) {
            if (arr1[i] != arr2[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
