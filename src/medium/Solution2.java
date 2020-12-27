package medium;

import org.junit.Test;
import utils.ListNode;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        String s1 = "";
        String s2 = "";
        while (true) {
            if (temp1 == null) {
                break;
            }
            s1 = temp1.val + s1;
            temp1 = temp1.next;
        }
        while (true) {
            if (temp2 == null) {
                break;
            }
            s2 = temp2.val + s2;
            temp2 = temp2.next;
        }

        long  num1 = Long.parseLong(s1);
        long  num2 = Long.parseLong(s2);

        long sum = num1 + num2;
        String str = String.valueOf(sum);
        char[] array = str.toCharArray();
        int length = array.length;
        ListNode head = new ListNode(array[length - 1] - 48);
        ListNode temp = head;
        for (int i = length - 2; i >= 0; i--) {
            ListNode node = new ListNode(array[i] - 48);
            temp.next = node;
            temp = node;
        }
        return head;
    }

    @Test
    public void test() {
        ListNode head1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        ListNode head2 = new ListNode(1);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(3);

        head1.next = node2;
        node2.next = node3;

        head2.next = node4;
        node4.next = node5;

        ListNode listNode = addTwoNumbers(head1, head2);

    }
}
