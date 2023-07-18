package StackQueue;

import java.util.Stack;

public class Calculator {
    /* Here is the explanation for the code above:
1. It uses two stack to store the numbers and operations, respectively.
2. It uses a variable temp to store the number which is not splited by space.
3. It uses a variable n to store the length of the input string.
4. For the for loop, it checks if the current character is a space. If it is, continue the loop. Otherwise, it checks if the current character is a number. If it is, it use the variable temp to store the number. Otherwise, it checks if the current character is an operation. If it is, it checks the top operation of the operation stack. If the top operation is a left parenthesis, it will push the current operation into the operation stack. Otherwise, it will pop the top operation of the operation stack, and pop two number from the number stack, and calculate the result and push the result into the number stack. It will do the operation until the top operation of the operation stack is a left parenthesis. Then it will push the current operation into the operation stack. Otherwise, it checks if the current character is a left parenthesis. If it is, it will push the current operation into the operation stack. Otherwise, it will pop the top operation of the operation stack. If the operation is a left parenthesis, it will stop popping. Otherwise, it will pop two number from the number stack, and calculate the result and push the result into the number stack. It will do the operation until the top operation of the operation stack is a left parenthesis. Then it will pop the top operation of the operation stack.
5. After the for loop, it will check if the variable temp is not -1. If it is not -1, it will push the temp into the number stack.
6. After that, it will check if the operation stack is not empty. If it is not empty, it will pop the top operation of the operation stack. Then it will pop two number from the number stack, and calculate the result and push the result into the number stack. It will do the operation until the operation stack is empty.
7. Finally, it will return the top element of the number stack. */
    public int calculate(String s) {
        int temp = -1;
        int n = s.length();
        Stack<Integer> number = new Stack<>();
        Stack<Character> operation = new Stack<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                continue;
            } else if (Character.isDigit(c)) {
                if (temp == -1) {
                    temp = c - '0';
                } else {
                    temp = temp * 10 + c - '0';
                }
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                if (operation.isEmpty() || operation.peek() == '(') {
                    operation.push(c);
                } else {
                    char op = operation.pop();
                    int num2 = number.pop();
                    int num1 = number.pop();
                    int result = 0;
                    if (op == '+') {
                        result = num1 + num2;
                    } else if (op == '-') {
                        result = num1 - num2;
                    } else if (op == '*') {
                        result = num1 * num2;
                    } else {
                        result = num1 / num2;
                    }
                    number.push(result);
                    operation.push(c);
                }
                temp = -1;
            } else if (c == '(') {
                operation.push(c);
                temp = -1;
            } else {
                while (operation.peek() != '(') {
                    char op = operation.pop();
                    int num2 = number.pop();
                    int num1 = number.pop();
                    int result = 0;
                    if (op == '+') {
                        result = num1 + num2;
                    } else if (op == '-') {
                        result = num1 - num2;
                    } else if (op == '*') {
                        result = num1 * num2;
                    } else {
                        result = num1 / num2;
                    }
                    number.push(result);
                }
                operation.pop();
                temp = -1;
            }
        }
        if (temp != -1) {
            number.push(temp);
        }
        while (!operation.isEmpty()) {
            char op = operation.pop();
            int num2 = number.pop();
            int num1 = number.pop();
            int result = 0;
            if (op == '+') {
                result = num1 + num2;
            } else if (op == '-') {
                result = num1 - num2;
            } else if (op == '*') {
                result = num1 * num2;
            } else {
                result = num1 / num2;
            }
            number.push(result);
        }
        return number.peek();
    }
}
//没生成完全 后面继续生成了

