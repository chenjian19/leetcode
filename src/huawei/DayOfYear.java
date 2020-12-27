package huawei;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy MM dd");
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        Date date = sdf.parse(str);

    }
}
