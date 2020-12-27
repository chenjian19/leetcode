package easy;

import org.junit.Test;
import utils.ListNode;

import java.util.List;

public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        ListNode current = head.next;
        while (true) {
            if (current.next == null) {
                if (temp.val == current.val) {
                    temp.next = null;
                }
                break;
            }
            if (temp.val == current.val) {
                current = current.next;
                temp.next = current;
            } else {
                temp = temp.next;
                current = current.next;
            }
        }
        return head;
    }

    @Test
    public void test() {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode newHead = deleteDuplicates(null);
        while (true) {
            if (newHead == null) {
                break;
            }
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }
}


