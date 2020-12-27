package easy;

import org.junit.Test;
import utils.ListNode;

public class SolutionMianshi24 {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = new ListNode(0);
        ListNode current = head;
        ListNode temp = head;
        while (true) {
            if (current == null) {
                break;
            }
            current = current.next;
            temp.next = newHead.next;
            newHead.next = temp;
            temp = current;
        }
        return newHead.next;
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

        ListNode newHead = reverseList(head);
        while (true) {
            if (newHead == null) {
                break;
            }
            System.out.println(newHead.val);
            newHead = newHead.next;
        }

    }
}
