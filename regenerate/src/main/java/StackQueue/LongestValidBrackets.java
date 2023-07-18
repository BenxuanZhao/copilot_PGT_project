package StackQueue;

public class LongestValidBrackets {
    /* Here is the explanation for the code above:
1. Push -1 into the stack to mark the end of the previous valid substring.
2. Iterate over the string, if current character is '(', push index into stack.
3. If current character is ')', pop from stack. If stack is not empty, then update the max length, current index minus top of stack.
4. If stack is empty, push current index into stack to mark the end of the current valid substring. */
    public int longestValidParentheses(String s) {
        int[] stack = new int[s.length()];
        int top = -1;
        int max = 0;
        stack[++top] = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack[++top] = i;
            } else {
                top--;
                if (top != -1) {
                    max = Math.max(max, i - stack[top]);
                } else {
                    stack[++top] = i;
                }
            }
        }
        return max;
    }
}
