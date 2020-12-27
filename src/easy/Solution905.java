package easy;

public class Solution905 {
    public int[] sortArrayByParity(int[] A) {
        int length = A.length;
        int[] arr = new int[length];
        int index1 = 0;
        int index2 = length - 1;
        for (int i = 0; i < length; i++) {
            if (A[i] % 2 == 0) {
                arr[index1] = A[i];
                index1++;
            } else {
                arr[index2] = A[i];
                index2--;
            }
        }
        return arr;
    }
}
