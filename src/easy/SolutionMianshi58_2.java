package easy;

public class SolutionMianshi58_2 {
    public String reverseLeftWords(String s, int n) {
        String substring = s.substring(0, n);
        String substring1 = s.substring(n);
        substring1 += substring;
        return substring1;
    }
}
