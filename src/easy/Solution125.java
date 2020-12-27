package easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution125 {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char c : chars) {
            if(c>='a'&&c<='z'||c>='0'&&c<='9'){
                list.add(c);
            }
            if(c>='A'&&c<='Z'){
                list.add((char)(c+32));
            }
        }
        int length = list.size();
        for(int i=0,j=length-1;i<j;i++,j--){
            char c1=list.get(i);
            char c2=list.get(j);
            if(c1!=c2){
                return false;
            }
        }
        return true;
    }

    @Test
    public void test(){
        boolean op = isPalindrome("0P");
        System.out.println(op);
    }
}
