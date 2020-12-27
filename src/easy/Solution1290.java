package easy;

import utils.ListNode;

public class Solution1290 {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int length = 1;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
            length++;
        }
        ListNode temp2 = head;
        int sum = 0;
        for (int i = length - 1; i >= 0; i--) {
            int num = temp2.val;
            double result = num * Math.pow(2, i);
            sum += result;
            temp2 = temp2.next;
        }
        return sum;
    }
}
