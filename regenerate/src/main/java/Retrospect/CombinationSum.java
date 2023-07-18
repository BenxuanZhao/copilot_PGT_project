package Retrospect;

import java.util.*;

public class CombinationSum {
        /* Here is the explanation for the code above:
1. Sort the candidates;
2. Use HashSet to avoid duplicate result;
3. Use start to avoid duplicate result;
4. Use target < 0 to avoid unnecessary computation. */
public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates.length == 0) {
            return res;
        }
        Arrays.sort(candidates);
        helper(candidates, target, 0, new LinkedList<>(), res);
        return res;
    }

    public void helper(int[] candidates, int target, int start, LinkedList<Integer> stack, List<List<Integer>> res) {
        if (start > candidates.length) {
            return;
        }
        if (target == 0 && !stack.isEmpty()) {
            List<Integer> item = new ArrayList<>(stack);
            res.add(item);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = start; i < candidates.length; ++i) {
            if (!set.contains(candidates[i]) && target >= candidates[i]) {
                stack.push(candidates[i]);
                helper(candidates, target - candidates[i], i + 1, stack, res);
                stack.pop();
                set.add(candidates[i]);
            }
        }
    }

}
