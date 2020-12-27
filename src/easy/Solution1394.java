package easy;

import java.util.HashMap;
import java.util.Set;

public class Solution1394 {
    public int findLucky(int[] arr) {
        int luckyNum = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int key : arr) {
            if (map.containsKey(key)) {
                int count = map.get(key);
                count++;
                map.put(key, count);
            } else {
                map.put(key, 1);
            }
        }
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            if (key == map.get(key)) {
                if (key > luckyNum) {
                    luckyNum = key;
                }
            }
        }
        return luckyNum;
    }
}
