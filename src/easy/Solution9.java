package easy;

public class Solution9 {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        char[] array = str.toCharArray();
        boolean flag = true;
        for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
            if (array[i] != array[j]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
