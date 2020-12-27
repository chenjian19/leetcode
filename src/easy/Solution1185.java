package easy;

import java.util.Calendar;

public class Solution1185 {

    public static String dayOfTheWeek(int day, int month, int year)  {

        Calendar calendar = Calendar.getInstance();

        /*System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));*/
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month-1);
        calendar.set(Calendar.DAY_OF_MONTH,day);
        String s=null;

        int n = calendar.get(Calendar.DAY_OF_WEEK);
        switch (n){
            case 1:
                s="Sunday";
                break;
            case 2:
                s="Monday";
                break;
            case 3:
                s="Tuesday";
                break;
            case 4:
                s="Wednesday";
                break;
            case 5:
                s="Thursday";
                break;
            case 6:
                s="Friday";
                break;
            case 7:
                s="Saturday";
                break;
        }

        return s;
    }

    /*public static void main(String[] args)  {
        System.out.println(dayOfTheWeek(4,1,2020));
    }*/
}
