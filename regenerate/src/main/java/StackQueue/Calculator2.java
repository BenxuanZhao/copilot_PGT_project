package StackQueue;

import java.util.Stack;

public class Calculator2 {
    /* Here is the explanation for the code above:
1. The variable n stores the number of consecutive digits.
2.  The variable operand stores the operand that is being built from consecutive digits.
3.  The stack stores the operands and the signs. It is a stack of Objects.
    When we see a number, we keep pushing it to the stack.
    When we see a sign, we pop one number from the stack and do the calculation.
    Therefore, when we see a sign, the top of the stack is always a number.
4.  The function evaluateExpr evaluates the expression value until the next closing bracket.
    The idea is as follows:
    - We keep a stack of numbers (integer) and signs (character) for each opening bracket.
    - When we see a closing bracket, we start popping the numbers and signs from the stack,
      until we reach the corresponding opening bracket.
      We then get the sum of the popped numbers, update the stack with the new sum,
      and continue to calculate the rest of the expression.
5.  We use a while loop to iterate over the expression.
    For each character, there are two cases:
    - The character is a digit:
      We update the operand: operand = operand * 10 + (int) ch - '0'.
    - The character is a sign (‘+’ or ‘-‘) or a closing bracket ‘)’:
      We evaluate the expression to the next closing bracket,
      by calling the function evaluateExpr.
      We then update the result and the sign:
      - res += sign * operand, where sign = 1 if the sign is ‘+’ and sign = -1 if the sign is ‘-‘.
      - If the character is ‘)’, we break the while loop.
6.  Finally, we return the result. */
    public int calculate(String s) {
        int operand = 0;
        int n = 0;
        int result = 0;
        int sign = 1;
        Stack<Object> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                operand = operand * 10 + (int) c - '0';
                n++;
            } else if (c == '+' || c == '-') {
                result += sign * operand;
                sign = c == '+' ? 1 : -1;
                operand = 0;
                n = 0;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;
            } else if (c == ')') {
                result += sign * operand;
                result *= (int) stack.pop();
                result += (int) stack.pop();
                operand = 0;
                n = 0;
            }
        }
        return result + (sign * operand);
    }
}
