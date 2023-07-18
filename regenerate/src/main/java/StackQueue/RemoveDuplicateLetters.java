package StackQueue;

public class RemoveDuplicateLetters {
    /* Here is the explanation for the code above:
1. scan the string from left to right, use stack to store the characters,
2. for each character, if it is already in the stack, skip it;
3. if the current character is smaller than the top character of the stack,
and the top character of the stack exists in the rest of the string,
pop the stack to remove the top character,
4. push the current character to the stack.
5. after scanning, pop the stack to form the result string. */
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        boolean[] visited = new boolean[26];
        char[] stack = new char[s.length()];
        int top = -1;
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            count[c - 'a']--;
            if (visited[c - 'a']) {
                continue;
            }
            while (top != -1 && c < stack[top] && count[stack[top] - 'a'] != 0) {
                visited[stack[top--] - 'a'] = false;
            }
            stack[++top] = c;
            visited[c - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.append(stack[i]);
        }
        return sb.toString();
    }
}
