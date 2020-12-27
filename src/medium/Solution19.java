package medium;

import org.junit.Test;
import utils.ListNode;

public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length = 0;
        while (true) {
            if (temp == null) {
                break;
            }
            temp = temp.next;
            length++;
        }
        if (n == length) {
            head = head.next;
            return head;
        }
        ListNode current = head;
        for (int i = 1; i < length - n ; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }

    @Test
    public void test() {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode newHead = removeNthFromEnd(head, 1);

        while (true) {
            if (newHead == null) {
                break;
            }
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }
}


