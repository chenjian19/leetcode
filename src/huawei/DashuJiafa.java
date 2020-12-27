package huawei;

import java.util.Scanner;

public class DashuJiafa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String[] s1 = str1.split("\"");
        String[] s2 = str2.split("\"");
        Integer num1 = Integer.valueOf(s1[0]);
        Integer num2 = Integer.valueOf(s2[0]);
        Integer num = num1 + num2;
        StringBuilder sb = new StringBuilder();
        sb.append("\"");
        sb.append(num);
        sb.append("\"");
        System.out.println(sb);
    }
}
