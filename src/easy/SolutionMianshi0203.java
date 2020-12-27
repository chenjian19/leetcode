package easy;

import utils.ListNode;

public class SolutionMianshi0203 {
    public void deleteNode(ListNode node) {
        ListNode temp = node.next;
        node.val = temp.val;
        node.next = temp.next;
    }
}
