package easy;

public class SolutionMianshi1001 {
    public void merge(int[] A, int m, int[] B, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        int index3 = m + n - 1;
        while (index1 >= 0 && index2 >= 0) {
            if (A[index1] < B[index2]) {
                A[index3] = B[index2];
                index3--;
                index2--;
            } else {
                A[index3] = A[index1];
                index1--;
                index3--;
            }
        }
        if (index2 >= 0) {
            for (int i = 0; i <= index2; i++) {
                A[i] = B[i];
            }
        }
    }
}
