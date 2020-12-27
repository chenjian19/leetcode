package easy;

public class Solution191 {

    public  static int hammingWeight(int n) {
        int count=0;
        String s=""+n;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='1'){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n=hammingWeight(001101);
        System.out.println(n);

    }
}
