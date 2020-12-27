package easy;

import utils.ListNode;

public class SolutionMianshi0202 {
    public int kthToLast(ListNode head, int k) {
        ListNode temp1 = head;
        int length = 1;
        while (true) {
            if (temp1.next == null) {
                break;
            }
            temp1 = temp1.next;
            length++;
        }
        if (length == k) {
            return head.val;
        }
        ListNode temp2 = head;
        for (int i = 0; i < length - k; i++) {
            temp2 = temp2.next;
        }
        return temp2.val;
    }
}
