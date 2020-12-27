package easy;

public class Solution415 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int n1 = 0, n2 = 0;
            if (i >= 0) {
                n1 = new Integer(num1.charAt(i)-48);
            }
            if (j >= 0) {
                n2 = new Integer(num2.charAt(j)-48);
            }
            int result = n1 + n2 + carry;
            carry = result / 10;
            sb.append(result % 10);
            i--;
            j--;
        }
        if(carry != 0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
