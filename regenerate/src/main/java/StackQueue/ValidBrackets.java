package StackQueue;

public class ValidBrackets {
    /* Here is the explanation for the code above:
1. Push character into stack if it's open parentheses.
2. If it's close parentheses, pop from stack and compare with it.
3. If not same, return false.
4. If stack is empty, return true.
5. Else return false. */
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack[++top] = c;
            } else {
                if (top == -1) {
                    return false;
                }
                if (c == ')') {
                    if (stack[top--] != '(') {
                        return false;
                    }
                } else if (c == ']') {
                    if (stack[top--] != '[') {
                        return false;
                    }
                } else {
                    if (stack[top--] != '{') {
                        return false;
                    }
                }
            }
        }
        return top == -1;
    }
}
