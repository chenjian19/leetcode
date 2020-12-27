package easy;

import utils.ListNode;

public class Solution876 {
    public ListNode middleNode(ListNode head) {
        ListNode temp1 = head;
        int length = 1;
        while (true) {
            if (temp1.next == null) {
                break;
            }
            temp1 = temp1.next;
            length++;
        }
        int mid = length / 2 + 1;
        ListNode temp2 = head;
        for (int i = 0; i < mid - 1; i++) {
            temp2 = temp2.next;
        }
        return temp2;
    }
}
