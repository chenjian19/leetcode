package easy;

public class SolutionMianshi17 {
    public int[] printNumbers(int n) {
        int max = (int) (Math.pow(10, n));
        int[] arr = new int[max - 1];
        for (int i = 0; i < max - 1; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
