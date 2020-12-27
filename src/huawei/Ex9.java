package huawei;

import java.util.HashSet;

public class Ex9 {

}

class Queen{
    private HashSet<Integer> col;
    private HashSet<Integer> diag45;
    private HashSet<Integer> diag135;
    private int totalQueen;
    private int[] arr;
    private boolean flag=false;


    public Queen(int totalQueen) {
        this.totalQueen = totalQueen;
        arr = new int[totalQueen];
        col = new HashSet<>();
        diag45 = new HashSet<>();
        diag135 = new HashSet<>();
    }
}
