package huawei;

import java.util.Scanner;

public class NumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int result = 0;
        for (int i = 1; ; i++) {
            sum += i;
            if (sum >= num) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
