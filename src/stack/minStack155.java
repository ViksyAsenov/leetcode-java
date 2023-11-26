package stack;

import java.util.Objects;
import java.util.Stack;

public class minStack155 {
    static class MinStack {
        private final Stack<Integer> stack = new Stack<>();
        private final Stack<Integer> minStack = new Stack<>();

        public void push(int val) {
            if(minStack.isEmpty() || val <= minStack.peek()) {
                minStack.push((val));
            }

            stack.push(val);
        }

        public void pop() {
            if(Objects.equals(stack.peek(), minStack.peek())) {
                minStack.pop();
            }

            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
    }
}
