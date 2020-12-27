package easy;

import java.util.HashSet;

public class Solution1119 {
    public String removeVowels(String S) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (!set.contains(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
