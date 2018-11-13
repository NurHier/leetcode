package algorithm.stack;

import java.util.Stack;

public class BaseballPointRecorder {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int top = 0;
        int topNext = 0;
        int count = 0;
        for (String op : ops) {
            if ("+".equals(op)) {
                stack.push(top + topNext);
                int temp = topNext;
                topNext = top;
                top = top + temp;
            } else if ("D".equals(op)) {
                topNext = top;
                top = top * 2;
                stack.push(top);
            } else if ("C".equals(op)) {
                stack.pop();
                if (!stack.empty()) {
                    top = stack.pop();
                    if (!stack.empty()) {
                        topNext = stack.peek();
                    } else {
                        topNext = 0;
                    }
                    stack.push(top);
                } else {
                    top = 0;
                }
            } else {
                topNext = top;
                top = Integer.valueOf(op);
                stack.push(Integer.valueOf(op));
            }
        }
        for (Integer data : stack) {
            count = data + count;
        }
        return count;
    }
}
