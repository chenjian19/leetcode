package easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

public class SolutionMianshi0302 {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;


    public SolutionMianshi0302() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        if (stack2.size() == 0) {
            stack2.push(x);
            stack1.push(x);
        } else if (x <= stack2.peek()) {
            stack2.push(x);
            stack1.push(x);
        } else {
            stack1.push(x);
        }
    }

    public void pop() {
        if (stack1.peek().equals(stack2.peek())) {
            stack2.pop();
            stack1.pop();
        } else {
            stack1.pop();
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return stack2.peek();
    }

    @Test
    public void test() {
        SolutionMianshi0302 stack = new SolutionMianshi0302();
        stack.push(512);
        stack.push(-1024);
        stack.push(-1024);
        stack.push(512);
        stack.pop();
        stack.pop();
        stack.pop();
        int min = stack.getMin();
        System.out.println(min);
    }
}
