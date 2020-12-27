package easy;

public class Solution58 {
    public int lengthOfLastWord(String s) {
        int index=0;
        String[] strs = s.split(" ");
        if(strs.length>0){
            index=strs[strs.length-1].length();
        }
        return index;
    }
}
