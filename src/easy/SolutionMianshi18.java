package easy;

import utils.ListNode;

public class SolutionMianshi18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode temp = head;
        while (true) {
            if (head.val == val) {
                head = head.next;
                break;
            }
            if (temp.next == null) {
                break;
            }
            if (temp.next.val == val) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}
