package easy;

public class Solution867 {
    public int[][] transpose(int[][] A) {
        int column = A.length;
        int row = A[0].length;
        int[][] result = new int[row][column];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                result[i][j] = A[j][i];
            }
        }
        return result;
    }
}
