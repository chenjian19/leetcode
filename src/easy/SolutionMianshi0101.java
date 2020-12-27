package easy;

import java.util.HashSet;

public class SolutionMianshi0101 {
    public boolean isUnique(String astr) {
        char[] array = astr.toCharArray();
        HashSet<Character> set = new HashSet<>();
        boolean flag = true;
        for (char c : array) {
            if (set.contains(c)) {
                flag = false;
                break;
            } else {
                set.add(c);
            }
        }
        return flag;
    }
}
