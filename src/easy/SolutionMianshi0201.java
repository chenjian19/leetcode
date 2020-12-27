package easy;

import utils.ListNode;

import java.util.ArrayList;

public class SolutionMianshi0201 {
    public ListNode removeDuplicateNodes(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode current = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            if (current == null) {
                break;
            }
            int value = current.val;
            if (list.contains(value)) {
                current = current.next;
                temp.next = current;
            } else {
                list.add(value);
                temp = temp.next;
                current = current.next;
            }
        }
        return head;
    }
}
