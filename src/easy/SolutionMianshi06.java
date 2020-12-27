package easy;

import utils.ListNode;

public class SolutionMianshi06 {
    public int[] reversePrint(ListNode head) {
        ListNode newHead = new ListNode(0);
        ListNode temp = head;
        ListNode current = head;
        int count = 0;
        while (true) {
            if (temp == null) {
                break;
            }
            temp = temp.next;
            current.next = newHead.next;
            newHead.next = current;
            current = temp;
            count++;
        }
        int[] arr = new int[count];
        ListNode newTemp = newHead.next;
        for (int i = 0; i < count; i++) {
            arr[i] = newTemp.val;
            newTemp = newTemp.next;
        }
        return arr;
    }
}
