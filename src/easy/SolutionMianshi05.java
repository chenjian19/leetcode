package easy;

import org.junit.Test;

public class SolutionMianshi05 {
    public String replaceSpace(String s) {
        String replace = s.replace(" ", "%20");
        return replace;
    }

    @Test
    public void test(){
        String s = replaceSpace("We are happy.");
        System.out.println(s);
    }
}
