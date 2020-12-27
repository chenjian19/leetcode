package easy;

public class Solution389 {
    public char findTheDifference(String s, String t) {
        char[] array = t.toCharArray();
        char ch='0';
        for (char c : array) {
            if(!s.contains(c+"")){
                ch=c;
                break;
            }
        }
        return ch;
    }
}
