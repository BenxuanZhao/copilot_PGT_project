package hash;

import java.util.HashMap;
import java.util.Map;

public class SumOf2Num {
    //This code first creates an empty HashMap. Then, it iterates over the elements of the array using a for loop. For each element of the array, it checks if the element is already present in the HashMap. If the element is present, it means that we have found a pair of elements whose sum is equal to the target value. If the element is not present, we put the element of the array in the HashMap. The time complexity of this approach is O(n) because we are iterating the array only once.
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        //key: num, value: index
        for (int i = 0; i < nums.length; i++) {
            //if target - nums[i] is in the map, return the index of target - nums[i] and i
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            //if target - nums[i] is not in the map, put nums[i] into the map
            map.put(nums[i], i);
        }
        return null;
    }
}
