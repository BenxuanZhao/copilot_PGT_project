package DoublePointerConvenience;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumSum {
    /* Here is the explanation for the code above:
1. Sort the array, so that we can use two pointers to scan the array.
2. We need to skip the duplicates to avoid duplicate triplets.
3. For each element, we use two pointers to scan the rest of the array. If the sum of three elements is 0, then add it to the result. Otherwise, if the sum is bigger than 0, then move the right pointer to left; if the sum is smaller than 0, then move the left pointer to right. */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();

        if (nums.length < 3) {
            return rs;
        }

        Arrays.sort(nums);
        if (nums[0] > 0) {
            return rs;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) { // skip the duplicates
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) { // two pointers
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    rs.add(temp);
                    while (left < right && nums[left] == nums[left + 1]) { // skip the duplicates
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) { // skip the duplicates
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return rs;
    }
}
