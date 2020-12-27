package easy;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Solution387 {
    public int firstUniqChar(String s) {

        if(s.length()==0){
            return -1;
        }
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);

            if(map.containsKey(ch)){
                int count=map.get(ch);
                map.put(ch,++count);
            }else{
                map.put(ch,1);
            }
        }
        int index=0;
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        for (Map.Entry<Character, Integer> entry : set) {
            int n=entry.getValue();
            if(n==1){
                break;
            }
            if(index==s.length()-1&&(n!=1)){
                index=-1;
                break;
            }
            index++;
        }

        return index;
    }
}
