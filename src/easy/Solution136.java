package easy;

import java.util.HashMap;
import java.util.Set;

public class Solution136 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                int count=map.get(num);
                map.put(num,++count);
            }
        }
        Set<Integer> set = map.keySet();
        for (Integer integer : set) {
            if(map.get(integer)==1){
                return integer;
            }
        }
        return 0;
    }
}
