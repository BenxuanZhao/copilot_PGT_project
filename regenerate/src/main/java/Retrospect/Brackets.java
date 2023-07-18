package Retrospect;

import java.util.ArrayList;
import java.util.List;

public class Brackets {
    /* Here is the explanation for the code above:
1. As we can see the recursion tree, we can think about the base case. In this case, it is when the length of the string is equal to 2*n.
2. Then we can think about the recursion rule. In this case, it is when to add "(" or ")".
3. Then we can think about the condition to add "(". In this case, it is when the number of "(" is smaller than n.
4. Then we can think about the condition to add ")". In this case, it is when the number of "(" is larger than the number of ")". */
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        if (open < max) {
            backtrack(ans, cur + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(ans, cur + ")", open, close + 1, max);
        }
    }
}
