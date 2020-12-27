package easy;

import org.junit.Test;

import java.util.Stack;

import org.junit.Test;

public class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push('?');
        char[] array = s.toCharArray();
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            char ch = array[i];
            char top = stack.peek();
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if(stack.size()==1){
                    return false;
                }
                if ((ch == ')' && top == '(') || (ch == ']' && top == '[') || (ch == '}' && top == '{')) {
                    stack.pop();
                } else {
                    break;
                }
            }
        }
        if (stack.size()==1) {
            flag = true;
        }
        return flag;
    }

    @Test
    public void test() {
        boolean flag = isValid("]");
        System.out.println(flag);
    }

}
