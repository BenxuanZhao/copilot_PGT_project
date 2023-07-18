package StackQueue;

import java.util.Stack;

public class ValidBrackets {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            if (t == '(' || t == '[' || t == '{') {
                stack.push(t);
            } else {
                if (stack.empty()) {
                    return false;
                }
                if (t == ')') {
                    if (stack.pop() != '(') {
                        return false;
                    }
                } else if (t == ']') {
                    if (stack.pop() != '[') {
                        return false;
                    }
                } else {
                    if (stack.pop() != '{') {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }
}
