package easy;

import org.junit.Test;
import utils.ListNode;

import java.util.Stack;

public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (true) {
            if (temp == null) {
                break;
            }
            stack.push(temp.val);
            temp = temp.next;
        }
        ListNode temp2 = head;
        boolean flag = true;
        while (true) {
            if (temp2 == null) {
                break;
            }
            if (temp2.val != stack.pop()) {
                flag = false;
                break;
            }
            temp2 = temp2.next;
        }
        return flag;
    }

    @Test
    public void test() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        boolean flag = isPalindrome(node1);
        System.out.println(flag);
    }
}
