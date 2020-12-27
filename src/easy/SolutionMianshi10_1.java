package easy;

public class SolutionMianshi10_1 {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int fib_pre = 0;
        int fib_after = 1;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = fib_pre + fib_after;
            fib_pre = fib_after;
            fib_after = result % (1000000007);
        }
        return result % 1000000007;
    }
}
