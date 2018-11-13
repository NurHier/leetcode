package algorithm.stack;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    /**
     * initialize your data structure here.
     */
    private int min;
    private List<Integer> stack;

    public MinStack() {
        this.stack = new ArrayList<Integer>();
    }

    public void push(int x) {
        if (stack.isEmpty() || min > x) {
            min = x;
        }
        this.stack.add(x);
        this.stack.add(min);
    }

    public void pop() {
        if (stack.size() > 1) {
            this.stack.remove(stack.size() - 1);
            this.stack.remove(stack.size() - 1);
            int top = this.stack.get(stack.size() - 1);
            if (top != min) {
                min = top;
            }
        }
    }

    public int top() {
        return this.stack.get(stack.size() - 2);
    }

    public int getMin() {
        return this.min;
    }

    public static void main(String[] args) {

        MinStack obj = new MinStack();
        obj.push(-10);
        obj.push(14);
        System.out.println(obj.getMin());
        System.out.println(obj.getMin());
        obj.push(-20);
        System.out.println(obj.getMin());
        System.out.println(obj.getMin());
        System.out.println(obj.top());
        System.out.println(obj.getMin());
        obj.pop();
        obj.push(10);
        obj.push(-7);
        System.out.println(obj.getMin());
        obj.push(-7);
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
        obj.pop();
    }
}
