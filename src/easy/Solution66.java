package easy;

import java.util.ArrayList;

public class Solution66 {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for(int i=length-1;i>=0;i--){
            digits[i]++;
            if((digits[i]%=10)!=0){
                return digits;
            }
        }
        digits=new int[length+1];
        digits[0]=1;
        return digits;
    }
}
