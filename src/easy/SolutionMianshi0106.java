package easy;

import java.util.HashMap;

public class SolutionMianshi0106 {
    public String compressString(String S) {
        if(S.length()==0){
            return S;
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char[] arr = S.toCharArray();
        sb.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                if (i == arr.length - 1) {
                    sb.append(count);
                }
            } else {
                if (i != arr.length - 1) {
                    sb.append(count);
                    sb.append(arr[i]);
                    count = 1;
                } else {
                    sb.append(count);
                    sb.append(arr[i]);
                    sb.append(1);
                }
            }
        }
        String newStr = sb.toString();
        return newStr.length() >= S.length() ? S : newStr;
    }
}
