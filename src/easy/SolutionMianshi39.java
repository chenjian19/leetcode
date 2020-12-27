package easy;

import java.util.HashMap;

public class SolutionMianshi39 {
    public int majorityElement(int[] nums) {
        int a=0;
        int length=nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if(!map.containsKey(num)){
                map.put(num,1);
            }else if(map.get(num)>length){
                a=num;
                break;
            }else{
                int count=map.get(num);
                map.put(num,++count);
            }
        }
        return a;
    }


}
