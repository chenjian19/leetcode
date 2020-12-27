package easy;

public class Solution1118 {
    public int numberOfDays(int Y, int M) {
        int day = 0;
        switch (M) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                if (Y % 400 == 0 || (Y % 4 == 0 && Y % 100 != 0)) {
                    day = 29;
                } else {
                    day = 28;
                }
                break;
        }
        return day;
    }
}
