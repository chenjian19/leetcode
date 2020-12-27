package easy;

import utils.ListNode;

public class SolutionMianshi22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        int length = 0;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
            length++;
        }

        ListNode temp2 = new ListNode(0);
        temp2.next = head;
        for (int i = 0; i < length - k + 1; i++) {
            temp2 = temp2.next;
        }
        return temp2;
    }
}
