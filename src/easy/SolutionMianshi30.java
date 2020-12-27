package easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SolutionMianshi30 {

    private LinkedList<Integer> list;

    public SolutionMianshi30() {
        this.list=new LinkedList<>();
    }

    public void push(int x) {
        list.push(x);
    }

    public void pop() {
        list.pop();
    }

    public int top() {
        LinkedList<Integer> list1=list;
        Collections.sort(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        return list1.pop();
    }

    public int min() {
        LinkedList<Integer> list1=list;
        Collections.sort(list1);
        return list1.pop();
    }

    @Test
    public void test(){
//        LinkedList<Integer> list=new LinkedList<>();
//        list.push(3);
//        list.push(8);
//        list.push(5);
//        list.pop();
//        System.out.println(list);

        SolutionMianshi30 s=new SolutionMianshi30();
        s.push(5);
        s.push(3);
        s.push(6);
        //s.pop();
        System.out.println(s.top());
        System.out.println(s.min());
    }
}
