package easy;

import utils.ListNode;

public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            if (head.val == val) {
                head = null;
            }
            return head;
        }
        ListNode temp = new ListNode(0);
        ListNode temp2 = new ListNode(0);
        temp.next = head;
        temp2.next = head;
        ListNode current = head;
        while (true) {
            if (current == null) {
                break;
            }
            if (current.val == val) {
                current = current.next;
                temp.next = current;
            } else {
                current = current.next;
                temp = temp.next;
            }
        }
        return temp2.next;
    }
}


