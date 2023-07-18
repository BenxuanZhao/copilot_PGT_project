package StackQueue;

import java.util.Stack;

public class MinStack {
    /* Here is the explanation for the code above:
1. If the stack is empty, push the number into the stack, and push the number again into the stack.
2. If the stack is not empty, compare the number with the top of the stack, if it is greater than the top, push the top again into the stack. If it is smaller, push the number into the stack.
3. When pop the element, pop twice. The first pop is to pop the top of the stack, the second one is to pop the min element.
4. When peek the element, the second top element is the top element in the stack. */
    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            stack.push(x);
        } else {
            int tmp = stack.peek();
            stack.push(x);
            if (tmp < x) {
                stack.push(tmp);
            } else {
                stack.push(x);
            }
        }
    }

    public void pop() {
        stack.pop();
        stack.pop();
    }

    public int top() {
        return stack.get(stack.size() - 2);
    }

    public int getMin() {
        return stack.peek();
    }
}
