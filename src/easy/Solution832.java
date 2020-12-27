package easy;

public class Solution832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int row = A.length;
        int column = A[0].length;
        int[][] result = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++){
                result[i][j] = A[i][column-1-j];
                if(result[i][j] == 1){
                    result[i][j] = 0;
                }else{
                    result[i][j] = 1;
                }
            }
        }
        return result;
    }
}
