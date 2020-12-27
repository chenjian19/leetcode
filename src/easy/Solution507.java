package easy;

public class Solution507 {
    public boolean checkPerfectNumber(int num) {
        if (num == 0) {
            return false;
        }
        return num == getSum(num);
    }

    public int getSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
