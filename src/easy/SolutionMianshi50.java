package easy;

import java.util.LinkedHashMap;
import java.util.Set;

public class SolutionMianshi50 {
    public char firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : arr) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                Integer count = map.get(c);
                map.put(c, ++count);
            }
        }
        char result = ' ';
        Set<Character> set = map.keySet();
        for (Character c : set) {
            if (map.get(c) == 1) {
                result = c;
                break;
            }
        }
        return result;
    }
}
