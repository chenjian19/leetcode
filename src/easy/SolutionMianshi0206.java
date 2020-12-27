package easy;

import utils.ListNode;

import java.util.Stack;

public class SolutionMianshi0206 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        if (head.next == null) {
            return true;
        }
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
            int value = temp2.val;
            if (value != stack.pop()) {
                flag = false;
                break;
            } else {
                temp2 = temp2.next;
            }
        }
        return flag;
    }
}
