package ArrayOperation;

import java.util.ArrayList;
import java.util.List;

public class AddSubset {
/* Here is the explanation for the code above:
1. The result of subset of an empty set is an empty set, so we add an empty set to the result.
2. For every element in the array, we add it to the end of every subset in the result.
3. The subset we already have is not affected by the element we just added. So no need to add the new subset to the result. */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int size = result.size();
            for (int j = 0; j < size; j++) {
                List<Integer> temp = new ArrayList<>(result.get(j));
                temp.add(nums[i]);
                result.add(temp);
            }
        }
        return result;
    }
}
